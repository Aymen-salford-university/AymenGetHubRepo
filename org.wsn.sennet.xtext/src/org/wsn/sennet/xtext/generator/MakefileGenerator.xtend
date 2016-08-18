package org.wsn.sennet.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * Generates Makefile
 */
class MakefileGenerator extends AbstractSeNetGenerator {
  
  override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    resource.forEachNode[nodeId, nodeJob |
      fsa.generateFile("Makefile" + nodeId, '''
        COMPONENT=«nodeName»AppC
        Include $(MAKERULES)
      ''')
    ]
  }
}