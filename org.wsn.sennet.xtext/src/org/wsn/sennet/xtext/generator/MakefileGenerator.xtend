package org.wsn.sennet.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * Generates Makefile
 */
class MakefileGenerator extends AbstractSeNetGenerator {
  
  override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    resource.forEachNode[nodeId, nodeJob |
      var makefileName = "Makefile";
      if (nodeId > 0) {
        makefileName += nodeId
      }
      fsa.generateFile(makefileName, '''
        COMPONENT=«nodeName»AppC
        Include $(MAKERULES)
      ''')
    ]
  }
}