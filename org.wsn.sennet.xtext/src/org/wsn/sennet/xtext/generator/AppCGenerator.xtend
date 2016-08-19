package org.wsn.sennet.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.wsn.sennet.AbstractJob
import org.wsn.sennet.AbstractSensor
import org.wsn.sennet.AbstratAction
import org.wsn.sennet.SendMessageAction
import org.wsn.sennet.SenseJob
import org.wsn.sennet.TemperatureSensor
import org.wsn.sennet.BlinkAction

/**
 * Generates XXXAppC.nc files
 */
class AppCGenerator extends AbstractSeNetGenerator {
  
  override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    resource.forEachNode[nodeId, nodeJob |
      val fileName = nodeJob.app.name + nodeId + "AppC.nc";
      fsa.generateFile(fileName, generateAppCSenNetpp(nodeJob))
    ]
  }
  
  def generateAppCSenNetpp(AbstractJob job) '''
    configuration «nodeName»AppC
    {
      
    }
    
    implementation {
      components «nodeName»C;
      components MainC;
      «nodeName»C.Boot -> MainC;
      
      «generateJob(job)»
    }
  '''
  
  def dispatch generateJob(SenseJob job) '''
    components new TimerMilliC();
    «nodeName»C.Timer -> TimerMilliC;
    
    «FOR action : job.jobaction»
      «generateAction(action)»
    «ENDFOR»
    
    «IF job.jobTargetNode != null»
      «FOR sensor : job.jobTargetNode.nodeResources»
        «generateSensor(sensor)»
      «ENDFOR»
    «ENDIF»
    «IF job.jobTargetNetwork != null»
      «FOR sensor : job.jobTargetNetwork.resources»
        «generateSensor(sensor)»
      «ENDFOR»
    «ENDIF»
  '''
  
  def dispatch generateJob(AbstractJob job) {
    throw new UnsupportedOperationException("Yet to be implemented")
  }
  
  def dispatch generateAction(SendMessageAction action) '''
    components ActiveMessageC;
    components new AMSenderC(AM_RADIO);
    components new AMReceiverC(AM_RADIO);
    «nodeName»C.Packet -> AMSenderC;
    «nodeName»C.AMPacket -> AMSenderC;
    «nodeName»C.AMSend -> AMSenderC;
    «nodeName»C.SplitControl -> ActiveMessageC;
    «nodeName»C.Receive -> AMReceiverC;
  '''
  
  def dispatch generateAction(BlinkAction job) '''
    components LedsC;
    «nodeName»C.Leds -> LedsC;
  '''
  
  def dispatch generateAction(AbstratAction job) {
    throw new UnsupportedOperationException("Yet to be implemented ")
  }
  
  def dispatch generateSensor(TemperatureSensor sensor) '''
    components new SensirionSht11C() as Sensor;
    «nodeName»C.Read -> Sensor.Temperature;
  '''
  
  def dispatch generateSensor(AbstractSensor sensor) {
    throw new UnsupportedOperationException("Yet to be implemented")
  }
}