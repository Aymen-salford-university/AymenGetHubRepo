package org.wsn.sennet.xtext.generator

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.wsn.sennet.AbstractJob
import org.wsn.sennet.AbstratAction 
import org.wsn.sennet.SeNetApp
import org.wsn.sennet.SendMessageAction
import org.wsn.sennet.SenseJob
import org.wsn.sennet.ConditionalAction
import org.wsn.sennet.enums.LogicalSymbol

/**
 * Generates XXXC.nc files
 */
class CGenerator implements IGenerator {
  
  override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    resource.contents.filter(typeof(SeNetApp)).forEach[
      fsa.generateFile(name + "C", generateAppCSenNetpp(it))
    ]
  }
  
  def generateAppCSenNetpp(SeNetApp app) '''
    «FOR job : app.jobs»
      «generateJobInclude(job)»
    «ENDFOR»
    
    module «app.name»C
    {
      uses {
        interface Boot;
        interface SplitControl;
        «FOR job : app.jobs»
          «generateJobUsage(job)»
        «ENDFOR»
      }
    }
    
    Implementation {
      «FOR job : app.jobs»
        «generateJobImplementation(job)»
      «ENDFOR»
      
      event void Boot.booted()
      {
        «FOR job : app.jobs»
          «generateJobBoot(job)»
        «ENDFOR»
      }
      
      «FOR job : app.jobs»
        «generateJob(job)»
      «ENDFOR»
      
      «FOR job : app.jobs»
        «generateJobEvent(job)»
      «ENDFOR»
    }
  '''
  
  def dispatch generateJob(SenseJob job) '''
    event void Timer.fired() 
    {
    }
    
    event void Read.readDone(error_t result, uint16_t data) 
    {
      «FOR action: job.jobaction»
        «generateActionWithCondition(action)»
      «ENDFOR»
    }
    
    event void SplitControl.startDone(error_t error)
    {
      if (error != SUCCESS)
      {
        call SplitControl.start();
      }
    }
    
    event void SplitControl.stopDone(error_t error)
    {
    }
  '''
  
  def dispatch generateJob(AbstractJob job) {
    throw new UnsupportedOperationException("Yet to be implemented")
  }
  
  def dispatch generateJobUsage(SenseJob job) '''
    interface Read<uint16_t>;
    interface Timer<TMilli>;
    «FOR action : job.jobaction»
      «generateActionUsage(action)»
    «ENDFOR»
  '''
  
  def dispatch generateJobUsage(AbstractJob job) {
    throw new UnsupportedOperationException("Yet to be implemented")
  }
  
  def dispatch generateJobImplementation(SenseJob job) '''
    «FOR action : job.jobaction»
      «generateActionImplementation(action)»
    «ENDFOR»
  '''
  
  def dispatch generateJobImplementation(AbstractJob job) {
    throw new UnsupportedOperationException("Yet to be implemented")
  }
  
  def dispatch generateJobBoot(SenseJob job) '''
    call Timer.startPeriodic(«job.sensingSamplingRate»);
    call SplitControl.start();
  '''
  
  def dispatch generateJobBoot(AbstractJob job) {
    throw new UnsupportedOperationException("Yet to be implemented")
  }
  
  def dispatch generateJobInclude(SenseJob job) '''
    #include "Timer.h"
    «FOR action : job.jobaction»
      «generateActionInclude(action)»
    «ENDFOR»
  '''
  
  def dispatch generateJobInclude(AbstractJob job) {
    throw new UnsupportedOperationException("Yet to be implemented")
  }
  
  def dispatch generateJobEvent(SenseJob job) '''
    event void AMSend.sendDone(message_t *msg, error_t error)
    {
      if (msg == & messagePacket)
      {
        radioBusy = FALSE;
      }
    }
    
    event message_t * Receive.receive(message_t *msg, void *payload, uint8_t len)
    {
      return msg;
    }
  '''
  
  def dispatch generateJobEvent(AbstractJob job) {
    throw new UnsupportedOperationException("Yet to be implemented")
  }
  
  def generateActionWithCondition(AbstratAction action) '''
    «IF action.condition != null»
      if («generateCondition(action.condition).toString.trim»)
      {
        «generateAction(action)»
      }
    «ELSE»
      «generateAction(action)»
    «ENDIF»
  '''
  
  def generateCondition(ConditionalAction condition) '''
    «condition.sensorTerm» «condition.logicalSymbol.toOperator» «condition.value»
  '''
  
  def toOperator(LogicalSymbol symbol) {
    switch(symbol) {
      case EQUAL: "=="
      case GREATER_OR_EQUAL_THAN: ">="
      case GREATER_THAN: ">"
      case LESS_OR_EQUAL_THAN: "<="
      case LESS_THAN: "<"
      case NOT_EQUAL: "!="
    }
  }
  
  def dispatch generateAction(SendMessageAction job) '''
    if (radioBusy == FALSE)
    {
      ActiveMessage_t* msg = call Packet.getPayload(&messagePacket,sizeof(ActiveMessage_t));
      msg -> NodeID = TOS_NODE_ID;
      msg -> TData = data;
      if ( call AMSend.send(1,&messagePacket,sizeof(ActiveMessage_t)))
      {
        radioBusy = TRUE;
      }
    }
  '''
  
  def dispatch generateAction(AbstratAction job) {
    throw new UnsupportedOperationException("Yet to be implemented")
  }
  
  def dispatch generateActionInclude(SendMessageAction job) '''
    #include "AMsg.h"
  '''
  
  def dispatch generateActionInclude(AbstratAction job) {
    throw new UnsupportedOperationException("Yet to be implemented")
  }
  
  def dispatch generateActionImplementation(SendMessageAction job) '''
    bool radioBusy;
    message_t messagePacket;
  '''
  
  def dispatch generateActionImplementation(AbstratAction job) {
    throw new UnsupportedOperationException("Yet to be implemented")
  }
  
  def dispatch generateActionUsage(SendMessageAction job) '''
    interface Read<uint16_t>;
    interface Packet;
    interface AMPacket;
    interface AMSend;
    interface Receive;
  '''
  
  def dispatch generateActionUsage(AbstratAction job) {
    throw new UnsupportedOperationException("Yet to be implemented")
  }
  
  def getApp(EObject eObject) {
    EcoreUtil.getRootContainer(eObject) as SeNetApp
  }
}