package org.wsn.sennet.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.wsn.sennet.AbstractJob
import org.wsn.sennet.AbstratAction
import org.wsn.sennet.BlinkAction
import org.wsn.sennet.ConditionalAction
import org.wsn.sennet.SendMessageAction
import org.wsn.sennet.SenseJob
import org.wsn.sennet.enums.LogicalSymbol

/**
 * Generates XXXC.nc files
 */
class CGenerator extends AbstractSeNetGenerator {
  
  override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    resource.forEachNode[nodeId, nodeJob |
      val fileName = nodeName + "C.nc";
      fsa.generateFile(fileName, generateAppCSenNetpp(nodeJob).toString.trim)
    ]
  }
  
  def generateAppCSenNetpp(AbstractJob job) '''
    «generateJobInclude(job)»
    
    module «nodeName»C
    {
      uses {
        interface Boot;
        interface SplitControl;
        «generateJobUsage(job)»
      }
    }
    
    Implementation {
      «generateJobImplementation(job)»
      
      event void Boot.booted()
      {
        «generateJobBoot(job)»
      }
      
      «generateJob(job)»
      
      «FOR action : job.jobaction»
        «generateActionEvent(action)»
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
  
  def dispatch generateJob(AbstractJob job) '''
    // Code generation not implemented for job: «job.eClass.name»
  '''
  
  def dispatch generateJobUsage(SenseJob job) '''
    interface Read<uint16_t>;
    interface Timer<TMilli>;
    «FOR action : job.jobaction»
      «generateActionUsage(action)»
    «ENDFOR»
  '''
  
  def dispatch generateJobUsage(AbstractJob job) { "" }
  
  def dispatch generateJobImplementation(SenseJob job) '''
    «FOR action : job.jobaction»
      «generateActionImplementation(action)»
    «ENDFOR»
  '''
  
  def dispatch generateJobImplementation(AbstractJob job) '''
    // Code generation not implemented for job: «job.eClass.name»
  '''
  
  def dispatch generateJobBoot(SenseJob job) '''
    call Timer.startPeriodic(«job.sensingSamplingRate»);
    call SplitControl.start();
  '''
  
  def dispatch generateJobBoot(AbstractJob job) '''
    // Code generation not implemented for job: «job.eClass.name»
  '''
  
  def dispatch generateJobInclude(SenseJob job) '''
    #include "Timer.h"
    «FOR action : job.jobaction»
      «generateActionInclude(action)»
    «ENDFOR»
  '''
  
  def dispatch generateJobInclude(AbstractJob job) { "" }
  
  def dispatch generateActionEvent(SendMessageAction job) '''
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
  
  def dispatch generateActionEvent(AbstratAction job) '''
  '''
  
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
  
  def dispatch generateAction(SendMessageAction action) '''
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
  
  def dispatch generateAction(BlinkAction action) '''
    call Leds.«action.led.toString.toFirstLower»«action.status.toString.toFirstUpper»();
  '''
  
  def dispatch generateAction(AbstratAction action) {
    throw new UnsupportedOperationException("Yet to be implemented")
  }
  
  def dispatch generateActionInclude(SendMessageAction action) '''
    #include "AMsg.h"
  '''
  
  def dispatch generateActionInclude(AbstratAction action) '''
  '''
  
  def dispatch generateActionImplementation(SendMessageAction action) '''
    bool radioBusy;
    message_t messagePacket;
  '''
  
  def dispatch generateActionImplementation(AbstratAction action) '''
  '''
  
  def dispatch generateActionUsage(SendMessageAction action) '''
    interface Packet;
    interface AMPacket;
    interface AMSend;
    interface Receive;
  '''
  
  def dispatch generateActionUsage(BlinkAction action) '''
    interface Leds;
  '''
  
  def dispatch generateActionUsage(AbstratAction action) { "" }
}