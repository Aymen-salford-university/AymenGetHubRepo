package org.wsn.sennet.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.wsn.sennet.SeNetApp

/**
 * Generates Makefile
 */
class MakefileGenerator implements IGenerator {
  
  override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    fsa.generateFile("Makefile", '''
      COMPONENT=«resource.contents.filter(typeof(SeNetApp)).last.name»AppC
      Include $(MAKERULES)
    ''')
  }
}