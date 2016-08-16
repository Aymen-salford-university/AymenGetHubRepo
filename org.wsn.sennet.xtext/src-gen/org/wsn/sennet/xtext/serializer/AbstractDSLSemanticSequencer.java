package org.wsn.sennet.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.wsn.sennet.AccelerometerSensor;
import org.wsn.sennet.BlinkAction;
import org.wsn.sennet.Cluster;
import org.wsn.sennet.ClusterHeadNode;
import org.wsn.sennet.ClusteredNetwork;
import org.wsn.sennet.ComputationNode;
import org.wsn.sennet.ConditionalAction;
import org.wsn.sennet.FlatNetwork;
import org.wsn.sennet.HumiditySensor;
import org.wsn.sennet.LightSensor;
import org.wsn.sennet.LocationSensor;
import org.wsn.sennet.MicrophoneSensor;
import org.wsn.sennet.NetworkDataProcessing;
import org.wsn.sennet.NetworkLevelSpecialAlgorithm;
import org.wsn.sennet.NodeLevelJob;
import org.wsn.sennet.PressureSensor;
import org.wsn.sennet.PushButtomTrigger;
import org.wsn.sennet.ReadNodeMemoryAction;
import org.wsn.sennet.ReceiveMessageTrigger;
import org.wsn.sennet.RecieveSerialMsgTrigger;
import org.wsn.sennet.SeNetApp;
import org.wsn.sennet.SendMessageAction;
import org.wsn.sennet.SendSerialPortMsgAction;
import org.wsn.sennet.SennetPackage;
import org.wsn.sennet.SenseJob;
import org.wsn.sennet.SenseNowJob;
import org.wsn.sennet.SensorNode;
import org.wsn.sennet.SinkJob;
import org.wsn.sennet.SinkNode;
import org.wsn.sennet.StartJobTrigger;
import org.wsn.sennet.StopJobTrigger;
import org.wsn.sennet.TemperatureSensor;
import org.wsn.sennet.VoltageSensor;
import org.wsn.sennet.WriteNodeMemoryAction;
import org.wsn.sennet.xtext.services.DSLGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SennetPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SennetPackage.ACCELEROMETER_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getAccelerometerSensorRule()) {
					sequence_AccelerometerSensor(context, (AccelerometerSensor) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.BLINK_ACTION:
				if(context == grammarAccess.getAbstratActionRule() ||
				   context == grammarAccess.getBlinkActionRule()) {
					sequence_BlinkAction(context, (BlinkAction) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.CLUSTER:
				if(context == grammarAccess.getClusterRule()) {
					sequence_Cluster(context, (Cluster) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.CLUSTER_HEAD_NODE:
				if(context == grammarAccess.getAbstractClusterNodeRule() ||
				   context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getClusterHeadNodeRule()) {
					sequence_ClusterHeadNode(context, (ClusterHeadNode) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.CLUSTERED_NETWORK:
				if(context == grammarAccess.getAbstractNetworkRule() ||
				   context == grammarAccess.getClusteredNetworkRule()) {
					sequence_ClusteredNetwork(context, (ClusteredNetwork) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.COMPUTATION_NODE:
				if(context == grammarAccess.getAbstractFlatNodeRule() ||
				   context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getComputationNodeRule()) {
					sequence_ComputationNode(context, (ComputationNode) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.CONDITIONAL_ACTION:
				if(context == grammarAccess.getConditionalActionRule()) {
					sequence_ConditionalAction(context, (ConditionalAction) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.FLAT_NETWORK:
				if(context == grammarAccess.getAbstractNetworkRule() ||
				   context == grammarAccess.getFlatNetworkRule()) {
					sequence_FlatNetwork(context, (FlatNetwork) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.HUMIDITY_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getHumiditySensorRule()) {
					sequence_HumiditySensor(context, (HumiditySensor) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.LIGHT_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getLightSensorRule()) {
					sequence_LightSensor(context, (LightSensor) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.LOCATION_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getLocationSensorRule()) {
					sequence_LocationSensor(context, (LocationSensor) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.MICROPHONE_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getMicrophoneSensorRule()) {
					sequence_MicrophoneSensor(context, (MicrophoneSensor) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.NETWORK_DATA_PROCESSING:
				if(context == grammarAccess.getAbstractJobRule() ||
				   context == grammarAccess.getNetworkDataProcessingRule()) {
					sequence_NetworkDataProcessing(context, (NetworkDataProcessing) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM:
				if(context == grammarAccess.getAbstractJobRule() ||
				   context == grammarAccess.getNetworkLevelSpecialAlgorithmRule()) {
					sequence_NetworkLevelSpecialAlgorithm(context, (NetworkLevelSpecialAlgorithm) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.NODE_LEVEL_JOB:
				if(context == grammarAccess.getAbstractJobRule() ||
				   context == grammarAccess.getNodeLevelJobRule()) {
					sequence_NodeLevelJob(context, (NodeLevelJob) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.PRESSURE_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getPressureSensorRule()) {
					sequence_PressureSensor(context, (PressureSensor) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.PUSH_BUTTOM_TRIGGER:
				if(context == grammarAccess.getAbstractStartEndingJobTriggerRule() ||
				   context == grammarAccess.getPushButtomTriggerRule()) {
					sequence_PushButtomTrigger(context, (PushButtomTrigger) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.READ_NODE_MEMORY_ACTION:
				if(context == grammarAccess.getAbstratActionRule() ||
				   context == grammarAccess.getReadNodeMemoryActionRule()) {
					sequence_ReadNodeMemoryAction(context, (ReadNodeMemoryAction) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.RECEIVE_MESSAGE_TRIGGER:
				if(context == grammarAccess.getAbstractStartEndingJobTriggerRule() ||
				   context == grammarAccess.getReceiveMessageTriggerRule()) {
					sequence_ReceiveMessageTrigger(context, (ReceiveMessageTrigger) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.RECIEVE_SERIAL_MSG_TRIGGER:
				if(context == grammarAccess.getAbstractStartEndingJobTriggerRule() ||
				   context == grammarAccess.getRecieveSerialMsgTriggerRule()) {
					sequence_RecieveSerialMsgTrigger(context, (RecieveSerialMsgTrigger) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.SE_NET_APP:
				if(context == grammarAccess.getSeNetAppRule()) {
					sequence_SeNetApp(context, (SeNetApp) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.SEND_MESSAGE_ACTION:
				if(context == grammarAccess.getAbstratActionRule() ||
				   context == grammarAccess.getSendMessageActionRule()) {
					sequence_SendMessageAction(context, (SendMessageAction) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.SEND_SERIAL_PORT_MSG_ACTION:
				if(context == grammarAccess.getAbstratActionRule() ||
				   context == grammarAccess.getSendSerialPortMsgActionRule()) {
					sequence_SendSerialPortMsgAction(context, (SendSerialPortMsgAction) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.SENSE_JOB:
				if(context == grammarAccess.getAbstractJobRule() ||
				   context == grammarAccess.getSenseJobRule()) {
					sequence_SenseJob(context, (SenseJob) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.SENSE_NOW_JOB:
				if(context == grammarAccess.getAbstractJobRule() ||
				   context == grammarAccess.getSenseNowJobRule()) {
					sequence_SenseNowJob(context, (SenseNowJob) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.SENSOR_NODE:
				if(context == grammarAccess.getAbstractClusterNodeRule() ||
				   context == grammarAccess.getAbstractFlatNodeRule() ||
				   context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getSensorNodeRule()) {
					sequence_SensorNode(context, (SensorNode) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.SINK_JOB:
				if(context == grammarAccess.getAbstractJobRule() ||
				   context == grammarAccess.getSinkJobRule()) {
					sequence_SinkJob(context, (SinkJob) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.SINK_NODE:
				if(context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getSinkNodeRule()) {
					sequence_SinkNode(context, (SinkNode) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.START_JOB_TRIGGER:
				if(context == grammarAccess.getAbstractStartEndingJobTriggerRule() ||
				   context == grammarAccess.getStartJobTrigger_ImplRule()) {
					sequence_StartJobTrigger_Impl(context, (StartJobTrigger) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.STOP_JOB_TRIGGER:
				if(context == grammarAccess.getAbstractStartEndingJobTriggerRule() ||
				   context == grammarAccess.getStopJobTrigger_ImplRule()) {
					sequence_StopJobTrigger_Impl(context, (StopJobTrigger) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.TEMPERATURE_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getTemperatureSensorRule()) {
					sequence_TemperatureSensor(context, (TemperatureSensor) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.VOLTAGE_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getVoltageSensorRule()) {
					sequence_VoltageSensor(context, (VoltageSensor) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.WRITE_NODE_MEMORY_ACTION:
				if(context == grammarAccess.getAbstratActionRule() ||
				   context == grammarAccess.getWriteNodeMemoryActionRule()) {
					sequence_WriteNodeMemoryAction(context, (WriteNodeMemoryAction) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     {AccelerometerSensor}
	 */
	protected void sequence_AccelerometerSensor(EObject context, AccelerometerSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (led=Leds? status=LedStatus? condition=ConditionalAction?)
	 */
	protected void sequence_BlinkAction(EObject context, BlinkAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EInt? position=Position? (nodeResources+=AbstractSensor nodeResources+=AbstractSensor*)?)
	 */
	protected void sequence_ClusterHeadNode(EObject context, ClusterHeadNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EInt? (resources+=[AbstractSensor|EString] resources+=[AbstractSensor|EString]*)? (nodes+=AbstractClusterNode nodes+=AbstractClusterNode*)?)
	 */
	protected void sequence_Cluster(EObject context, Cluster semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         nbOfNodes=EInt? 
	 *         interNodeComm=InterNodeComm? 
	 *         routingProtocol=RoutingProtocol? 
	 *         (resources+=AbstractSensor resources+=AbstractSensor*)? 
	 *         sink=SinkNode? 
	 *         (clusters+=Cluster clusters+=Cluster*)?
	 *     )
	 */
	protected void sequence_ClusteredNetwork(EObject context, ClusteredNetwork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EInt? position=Position? (nodeResources+=AbstractSensor nodeResources+=AbstractSensor*)?)
	 */
	protected void sequence_ComputationNode(EObject context, ComputationNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sensorTerm=EString? logicalSymbol=LogicalSymbol? value=ELong? unit=EString?)
	 */
	protected void sequence_ConditionalAction(EObject context, ConditionalAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         nbOfNodes=EInt? 
	 *         interNodeComm=InterNodeComm? 
	 *         routingProtocol=RoutingProtocol? 
	 *         (resources+=AbstractSensor resources+=AbstractSensor*)? 
	 *         sink=SinkNode? 
	 *         (nodes+=AbstractFlatNode nodes+=AbstractFlatNode*)?
	 *     )
	 */
	protected void sequence_FlatNetwork(EObject context, FlatNetwork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {HumiditySensor}
	 */
	protected void sequence_HumiditySensor(EObject context, HumiditySensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LightSensor}
	 */
	protected void sequence_LightSensor(EObject context, LightSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LocationSensor}
	 */
	protected void sequence_LocationSensor(EObject context, LocationSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {MicrophoneSensor}
	 */
	protected void sequence_MicrophoneSensor(EObject context, MicrophoneSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         networkDataProcessing=Aggregation? 
	 *         sensingSamplingRate=ELong? 
	 *         dataProcessingRate=ELong? 
	 *         (nodeIDList+=EInt nodeIDList+=EInt*)? 
	 *         JobTargetNode=AbstractNode? 
	 *         JobTargetNetwork=AbstractNetwork? 
	 *         (startEndTrigger+=AbstractStartEndingJobTrigger startEndTrigger+=AbstractStartEndingJobTrigger*)? 
	 *         (jobaction+=AbstratAction jobaction+=AbstratAction*)?
	 *     )
	 */
	protected void sequence_NetworkDataProcessing(EObject context, NetworkDataProcessing semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         specialAlgorithmJob=Fusion? 
	 *         sensingSamplingRate=ELong? 
	 *         algorithmSamplingRate=ELong? 
	 *         (nodeIDList+=EInt nodeIDList+=EInt*)? 
	 *         JobTargetNode=AbstractNode? 
	 *         JobTargetNetwork=AbstractNetwork? 
	 *         (startEndTrigger+=AbstractStartEndingJobTrigger startEndTrigger+=AbstractStartEndingJobTrigger*)? 
	 *         (jobaction+=AbstratAction jobaction+=AbstratAction*)?
	 *     )
	 */
	protected void sequence_NetworkLevelSpecialAlgorithm(EObject context, NetworkLevelSpecialAlgorithm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         nodeDataProcessing=Aggregation? 
	 *         sensingSamplingRate=ELong? 
	 *         dataProcessingRate=ELong? 
	 *         JobTargetNode=AbstractNode? 
	 *         JobTargetNetwork=AbstractNetwork? 
	 *         (startEndTrigger+=AbstractStartEndingJobTrigger startEndTrigger+=AbstractStartEndingJobTrigger*)? 
	 *         (jobaction+=AbstratAction jobaction+=AbstratAction*)?
	 *     )
	 */
	protected void sequence_NodeLevelJob(EObject context, NodeLevelJob semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {PressureSensor}
	 */
	protected void sequence_PressureSensor(EObject context, PressureSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {PushButtomTrigger}
	 */
	protected void sequence_PushButtomTrigger(EObject context, PushButtomTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=ConditionalAction?)
	 */
	protected void sequence_ReadNodeMemoryAction(EObject context, ReadNodeMemoryAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ReceiveMessageTrigger}
	 */
	protected void sequence_ReceiveMessageTrigger(EObject context, ReceiveMessageTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RecieveSerialMsgTrigger}
	 */
	protected void sequence_RecieveSerialMsgTrigger(EObject context, RecieveSerialMsgTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString id=EInt? (jobs+=AbstractJob jobs+=AbstractJob*)?)
	 */
	protected void sequence_SeNetApp(EObject context, SeNetApp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sendMessageTo=EInt? condition=ConditionalAction?)
	 */
	protected void sequence_SendMessageAction(EObject context, SendMessageAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=ConditionalAction?)
	 */
	protected void sequence_SendSerialPortMsgAction(EObject context, SendSerialPortMsgAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         sensingSamplingRate=ELong? 
	 *         JobTargetNode=AbstractNode? 
	 *         JobTargetNetwork=AbstractNetwork? 
	 *         (startEndTrigger+=AbstractStartEndingJobTrigger startEndTrigger+=AbstractStartEndingJobTrigger*)? 
	 *         (jobaction+=AbstratAction jobaction+=AbstratAction*)?
	 *     )
	 */
	protected void sequence_SenseJob(EObject context, SenseJob semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         JobTargetNode=AbstractNode? 
	 *         JobTargetNetwork=AbstractNetwork? 
	 *         (startEndTrigger+=AbstractStartEndingJobTrigger startEndTrigger+=AbstractStartEndingJobTrigger*)? 
	 *         (jobaction+=AbstratAction jobaction+=AbstratAction*)?
	 *     )
	 */
	protected void sequence_SenseNowJob(EObject context, SenseNowJob semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EInt? position=Position? (nodeResources+=AbstractSensor nodeResources+=AbstractSensor*)?)
	 */
	protected void sequence_SensorNode(EObject context, SensorNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         JobTargetNode=AbstractNode? 
	 *         JobTargetNetwork=AbstractNetwork? 
	 *         (startEndTrigger+=AbstractStartEndingJobTrigger startEndTrigger+=AbstractStartEndingJobTrigger*)? 
	 *         (jobaction+=AbstratAction jobaction+=AbstratAction*)?
	 *     )
	 */
	protected void sequence_SinkJob(EObject context, SinkJob semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EInt? position=Position? (nodeResources+=AbstractSensor nodeResources+=AbstractSensor*)?)
	 */
	protected void sequence_SinkNode(EObject context, SinkNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {StartJobTrigger}
	 */
	protected void sequence_StartJobTrigger_Impl(EObject context, StartJobTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {StopJobTrigger}
	 */
	protected void sequence_StopJobTrigger_Impl(EObject context, StopJobTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {TemperatureSensor}
	 */
	protected void sequence_TemperatureSensor(EObject context, TemperatureSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {VoltageSensor}
	 */
	protected void sequence_VoltageSensor(EObject context, VoltageSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=ConditionalAction?)
	 */
	protected void sequence_WriteNodeMemoryAction(EObject context, WriteNodeMemoryAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
