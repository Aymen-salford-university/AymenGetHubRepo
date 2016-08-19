package org.wsn.sennet.xtext.generator

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2
import org.wsn.sennet.AbstractJob
import org.wsn.sennet.SeNetApp

/**
 * Basic class for SeNet generators
 */
abstract class AbstractSeNetGenerator implements IGenerator {
  
  /**
   * By default node id's in network should start with 2
   */
  static val NETWORK_STARTING_NODE = 2;
  
  /**
   * Holds name of currently generating node
   */
  var nodeName = "";
  
  /**
   * Iterates over all contents of resources, returning objects of given class
   */
  def <T extends EObject> objectsOfType(Resource resource, Class<T> clazz) {
    resource
      .contents
      .map[eAllContents.toList]
      .flatten
      .filter(clazz)
  }
  
  /**
   * Returns root element (SeNetApp) of a SeNet model element
   */
  def getApp(EObject object) {
    EcoreUtil.getRootContainer(object) as SeNetApp
  }
  
  /**
   * Iterates over each node in resource.
   * 
   * Iterates over JobTargetNodes, and over every node in JobTargetNetwork.
   * For JobTargetNetwork generates node identifiers starting with 2
   * because 1 is reserved for central node (Sink)
   */
  def forEachNode(Resource resource, Procedure2<Integer, AbstractJob> handler) {
    resource.objectsOfType(typeof(AbstractJob)).forEach[
      if (jobTargetNode != null) {
        nodeName = app.name + jobTargetNode.id
        handler.apply(jobTargetNode.id, it)
      } else if (jobTargetNetwork != null) {
        val maximumNodeId = NETWORK_STARTING_NODE + jobTargetNetwork.nbOfNodes;
        for (var i = NETWORK_STARTING_NODE; i < maximumNodeId; i++) {
          nodeName = app.name + i
          handler.apply(i, it)
        }        
      } else {
        nodeName = app.name;
        handler.apply(0, it)
      }
    ]
  }
  
  /**
   * Returns name of currently generating node
   */
  def getNodeName() {
    nodeName
  }
}