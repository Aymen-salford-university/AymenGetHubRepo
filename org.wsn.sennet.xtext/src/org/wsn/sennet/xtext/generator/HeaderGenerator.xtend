package org.wsn.sennet.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * Generates header (AMsg.h) file
 */
class HeaderGenerator extends AbstractSeNetGenerator {
  
  override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    fsa.generateFile("AMsg.h", '''
      #ifndef AMSG_H
      #define AMSG_H
      typedef nx_struct ActiveMessage
      {
      nx_uint16_t NodeID;
      nx_uint16_t Data;
      } ActiveMessage_t;
      enum
      {
      AM_RADIO = 6  
      };
      #endif /* AMSG_H */
    ''')
  }
}