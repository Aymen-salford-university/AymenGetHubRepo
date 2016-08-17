package org.wsn.sennet.xtext.generator

import org.wsn.sennet.AbstratAction
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.wsn.sennet.AbstractJob
import org.wsn.sennet.SeNetApp
import org.wsn.sennet.SendMessageAction
import org.wsn.sennet.SenseJob
import org.wsn.sennet.TemperatureSensor
import org.wsn.sennet.AbstractSensor

/**
 * Generates XXXAppC.nc files
 */
class AppCGenerator implements IGenerator {
  
  override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    resource.contents.filter(typeof(SeNetApp)).forEach[
      fsa.generateFile(name + "AppC", generateAppCSenNetpp(it))
    ]
  }
  
  def generateAppCSenNetpp(SeNetApp app) '''
    configuration «app.name»AppC
    {
      
    }
    implementation {
      components «app.name»C;
      components MainC;
      «app.name»C.Boot -> MainC;
      
      «FOR job : app.jobs»
        «generateJob(job)»
      «ENDFOR»
    }
  '''
  
  def dispatch generateJob(SenseJob job) '''
    components new TimerMilliC();
    «job.app.name»C.Timer -> TimerMilliC;
    
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
  
  def dispatch generateAction(SendMessageAction job) '''
    components ActiveMessageC;
    components new AMSenderC(AM_RADIO);
    components new AMReceiverC(AM_RADIO);
    «job.app.name»C.Packet -> AMSenderC;
    «job.app.name»C.AMPacket -> AMSenderC;
    «job.app.name»C.AMSend -> AMSenderC;
    «job.app.name»C.SplitControl -> ActiveMessageC;
    «job.app.name»C.Receive -> AMReceiverC;
  '''
  
  def dispatch generateAction(AbstratAction job) {
    throw new UnsupportedOperationException("Yet to be implemented")
  }
  
  def dispatch generateSensor(TemperatureSensor sensor) '''
  components new SensirionSht11C() as Sensor;
  «sensor.app.name»C.Read -> Sensor.Temperature;
  '''
  
  def dispatch generateSensor(AbstractSensor sensor) {
    throw new UnsupportedOperationException("Yet to be implemented")
  }
  
  def getApp(EObject eObject) {
    EcoreUtil.getRootContainer(eObject) as SeNetApp
  }
}