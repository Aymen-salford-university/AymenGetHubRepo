/**
 */
package org.wsn.sennet.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.wsn.sennet.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.wsn.sennet.SennetPackage
 * @generated
 */
public class SennetSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SennetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SennetSwitch() {
		if (modelPackage == null) {
			modelPackage = SennetPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SennetPackage.SE_NET_APP: {
				SeNetApp seNetApp = (SeNetApp)theEObject;
				T result = caseSeNetApp(seNetApp);
				if (result == null) result = caseNamedElement(seNetApp);
				if (result == null) result = caseIdentifiable(seNetApp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.IDENTIFIABLE: {
				Identifiable identifiable = (Identifiable)theEObject;
				T result = caseIdentifiable(identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseIdentifiable(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.ABSTRACT_NODE: {
				AbstractNode abstractNode = (AbstractNode)theEObject;
				T result = caseAbstractNode(abstractNode);
				if (result == null) result = caseIdentifiable(abstractNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.ABSTRACT_FLAT_NODE: {
				AbstractFlatNode abstractFlatNode = (AbstractFlatNode)theEObject;
				T result = caseAbstractFlatNode(abstractFlatNode);
				if (result == null) result = caseAbstractNode(abstractFlatNode);
				if (result == null) result = caseIdentifiable(abstractFlatNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.ABSTRACT_CLUSTER_NODE: {
				AbstractClusterNode abstractClusterNode = (AbstractClusterNode)theEObject;
				T result = caseAbstractClusterNode(abstractClusterNode);
				if (result == null) result = caseAbstractNode(abstractClusterNode);
				if (result == null) result = caseIdentifiable(abstractClusterNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.SENSOR_NODE: {
				SensorNode sensorNode = (SensorNode)theEObject;
				T result = caseSensorNode(sensorNode);
				if (result == null) result = caseAbstractClusterNode(sensorNode);
				if (result == null) result = caseAbstractFlatNode(sensorNode);
				if (result == null) result = caseAbstractNode(sensorNode);
				if (result == null) result = caseIdentifiable(sensorNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.CLUSTER_HEAD_NODE: {
				ClusterHeadNode clusterHeadNode = (ClusterHeadNode)theEObject;
				T result = caseClusterHeadNode(clusterHeadNode);
				if (result == null) result = caseAbstractClusterNode(clusterHeadNode);
				if (result == null) result = caseAbstractNode(clusterHeadNode);
				if (result == null) result = caseIdentifiable(clusterHeadNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.SINK_NODE: {
				SinkNode sinkNode = (SinkNode)theEObject;
				T result = caseSinkNode(sinkNode);
				if (result == null) result = caseAbstractNode(sinkNode);
				if (result == null) result = caseIdentifiable(sinkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.COMPUTATION_NODE: {
				ComputationNode computationNode = (ComputationNode)theEObject;
				T result = caseComputationNode(computationNode);
				if (result == null) result = caseAbstractFlatNode(computationNode);
				if (result == null) result = caseAbstractNode(computationNode);
				if (result == null) result = caseIdentifiable(computationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.ABSTRACT_NETWORK: {
				AbstractNetwork abstractNetwork = (AbstractNetwork)theEObject;
				T result = caseAbstractNetwork(abstractNetwork);
				if (result == null) result = caseIdentifiable(abstractNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.FLAT_NETWORK: {
				FlatNetwork flatNetwork = (FlatNetwork)theEObject;
				T result = caseFlatNetwork(flatNetwork);
				if (result == null) result = caseAbstractNetwork(flatNetwork);
				if (result == null) result = caseIdentifiable(flatNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.CLUSTERED_NETWORK: {
				ClusteredNetwork clusteredNetwork = (ClusteredNetwork)theEObject;
				T result = caseClusteredNetwork(clusteredNetwork);
				if (result == null) result = caseAbstractNetwork(clusteredNetwork);
				if (result == null) result = caseIdentifiable(clusteredNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.CLUSTER: {
				Cluster cluster = (Cluster)theEObject;
				T result = caseCluster(cluster);
				if (result == null) result = caseIdentifiable(cluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.ABSTRACT_JOB: {
				AbstractJob abstractJob = (AbstractJob)theEObject;
				T result = caseAbstractJob(abstractJob);
				if (result == null) result = caseIdentifiable(abstractJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.NODE_LEVEL_JOB: {
				NodeLevelJob nodeLevelJob = (NodeLevelJob)theEObject;
				T result = caseNodeLevelJob(nodeLevelJob);
				if (result == null) result = caseDataProcessingJob(nodeLevelJob);
				if (result == null) result = caseAbstractJob(nodeLevelJob);
				if (result == null) result = caseIdentifiable(nodeLevelJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.NETWORK_LEVEL_JOB: {
				NetworkLevelJob networkLevelJob = (NetworkLevelJob)theEObject;
				T result = caseNetworkLevelJob(networkLevelJob);
				if (result == null) result = caseDataProcessingJob(networkLevelJob);
				if (result == null) result = caseAbstractJob(networkLevelJob);
				if (result == null) result = caseIdentifiable(networkLevelJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.SENSE_NOW_JOB: {
				SenseNowJob senseNowJob = (SenseNowJob)theEObject;
				T result = caseSenseNowJob(senseNowJob);
				if (result == null) result = caseAbstractJob(senseNowJob);
				if (result == null) result = caseIdentifiable(senseNowJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.SINK_JOB: {
				SinkJob sinkJob = (SinkJob)theEObject;
				T result = caseSinkJob(sinkJob);
				if (result == null) result = caseAbstractJob(sinkJob);
				if (result == null) result = caseIdentifiable(sinkJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.SENSE_JOB: {
				SenseJob senseJob = (SenseJob)theEObject;
				T result = caseSenseJob(senseJob);
				if (result == null) result = caseAbstractJob(senseJob);
				if (result == null) result = caseIdentifiable(senseJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.RECEIVE_MESSAGE_TRIGGER: {
				ReceiveMessageTrigger receiveMessageTrigger = (ReceiveMessageTrigger)theEObject;
				T result = caseReceiveMessageTrigger(receiveMessageTrigger);
				if (result == null) result = caseAbstractRecieveTrigger(receiveMessageTrigger);
				if (result == null) result = caseStartJobTrigger(receiveMessageTrigger);
				if (result == null) result = caseStopJobTrigger(receiveMessageTrigger);
				if (result == null) result = caseAbstractStartEndingJobTrigger(receiveMessageTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.RECIEVE_SERIAL_MSG_TRIGGER: {
				RecieveSerialMsgTrigger recieveSerialMsgTrigger = (RecieveSerialMsgTrigger)theEObject;
				T result = caseRecieveSerialMsgTrigger(recieveSerialMsgTrigger);
				if (result == null) result = caseAbstractRecieveTrigger(recieveSerialMsgTrigger);
				if (result == null) result = caseStartJobTrigger(recieveSerialMsgTrigger);
				if (result == null) result = caseStopJobTrigger(recieveSerialMsgTrigger);
				if (result == null) result = caseAbstractStartEndingJobTrigger(recieveSerialMsgTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.START_JOB_TRIGGER: {
				StartJobTrigger startJobTrigger = (StartJobTrigger)theEObject;
				T result = caseStartJobTrigger(startJobTrigger);
				if (result == null) result = caseAbstractStartEndingJobTrigger(startJobTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.STOP_JOB_TRIGGER: {
				StopJobTrigger stopJobTrigger = (StopJobTrigger)theEObject;
				T result = caseStopJobTrigger(stopJobTrigger);
				if (result == null) result = caseAbstractStartEndingJobTrigger(stopJobTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.PUSH_BUTTOM_TRIGGER: {
				PushButtomTrigger pushButtomTrigger = (PushButtomTrigger)theEObject;
				T result = casePushButtomTrigger(pushButtomTrigger);
				if (result == null) result = caseAbstractRecieveTrigger(pushButtomTrigger);
				if (result == null) result = caseStartJobTrigger(pushButtomTrigger);
				if (result == null) result = caseStopJobTrigger(pushButtomTrigger);
				if (result == null) result = caseAbstractStartEndingJobTrigger(pushButtomTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.ABSTRACT_RECIEVE_TRIGGER: {
				AbstractRecieveTrigger abstractRecieveTrigger = (AbstractRecieveTrigger)theEObject;
				T result = caseAbstractRecieveTrigger(abstractRecieveTrigger);
				if (result == null) result = caseStartJobTrigger(abstractRecieveTrigger);
				if (result == null) result = caseStopJobTrigger(abstractRecieveTrigger);
				if (result == null) result = caseAbstractStartEndingJobTrigger(abstractRecieveTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.ABSTRACT_START_ENDING_JOB_TRIGGER: {
				AbstractStartEndingJobTrigger abstractStartEndingJobTrigger = (AbstractStartEndingJobTrigger)theEObject;
				T result = caseAbstractStartEndingJobTrigger(abstractStartEndingJobTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.ABSTRAT_ACTION: {
				AbstratAction abstratAction = (AbstratAction)theEObject;
				T result = caseAbstratAction(abstratAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.CONDITIONAL_ACTION: {
				ConditionalAction conditionalAction = (ConditionalAction)theEObject;
				T result = caseConditionalAction(conditionalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.ABSTRACT_NODE_MEMORY_ACTION: {
				AbstractNodeMemoryAction abstractNodeMemoryAction = (AbstractNodeMemoryAction)theEObject;
				T result = caseAbstractNodeMemoryAction(abstractNodeMemoryAction);
				if (result == null) result = caseAbstratAction(abstractNodeMemoryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.READ_NODE_MEMORY_ACTION: {
				ReadNodeMemoryAction readNodeMemoryAction = (ReadNodeMemoryAction)theEObject;
				T result = caseReadNodeMemoryAction(readNodeMemoryAction);
				if (result == null) result = caseAbstractNodeMemoryAction(readNodeMemoryAction);
				if (result == null) result = caseAbstratAction(readNodeMemoryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.WRITE_NODE_MEMORY_ACTION: {
				WriteNodeMemoryAction writeNodeMemoryAction = (WriteNodeMemoryAction)theEObject;
				T result = caseWriteNodeMemoryAction(writeNodeMemoryAction);
				if (result == null) result = caseAbstractNodeMemoryAction(writeNodeMemoryAction);
				if (result == null) result = caseAbstractResponceAction(writeNodeMemoryAction);
				if (result == null) result = caseAbstratAction(writeNodeMemoryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.SEND_MESSAGE_ACTION: {
				SendMessageAction sendMessageAction = (SendMessageAction)theEObject;
				T result = caseSendMessageAction(sendMessageAction);
				if (result == null) result = caseAbstractResponceAction(sendMessageAction);
				if (result == null) result = caseAbstratAction(sendMessageAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.BLINK_ACTION: {
				BlinkAction blinkAction = (BlinkAction)theEObject;
				T result = caseBlinkAction(blinkAction);
				if (result == null) result = caseAbstractResponceAction(blinkAction);
				if (result == null) result = caseAbstratAction(blinkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.ABSTRACT_RESPONCE_ACTION: {
				AbstractResponceAction abstractResponceAction = (AbstractResponceAction)theEObject;
				T result = caseAbstractResponceAction(abstractResponceAction);
				if (result == null) result = caseAbstratAction(abstractResponceAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.SEND_SERIAL_PORT_MSG_ACTION: {
				SendSerialPortMsgAction sendSerialPortMsgAction = (SendSerialPortMsgAction)theEObject;
				T result = caseSendSerialPortMsgAction(sendSerialPortMsgAction);
				if (result == null) result = caseAbstractResponceAction(sendSerialPortMsgAction);
				if (result == null) result = caseAbstratAction(sendSerialPortMsgAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.ABSTRACT_SENSOR: {
				AbstractSensor abstractSensor = (AbstractSensor)theEObject;
				T result = caseAbstractSensor(abstractSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.ACCELEROMETER_SENSOR: {
				AccelerometerSensor accelerometerSensor = (AccelerometerSensor)theEObject;
				T result = caseAccelerometerSensor(accelerometerSensor);
				if (result == null) result = caseAbstractSensor(accelerometerSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.LIGHT_SENSOR: {
				LightSensor lightSensor = (LightSensor)theEObject;
				T result = caseLightSensor(lightSensor);
				if (result == null) result = caseAbstractSensor(lightSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.LOCATION_SENSOR: {
				LocationSensor locationSensor = (LocationSensor)theEObject;
				T result = caseLocationSensor(locationSensor);
				if (result == null) result = caseAbstractSensor(locationSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.MICROPHONE_SENSOR: {
				MicrophoneSensor microphoneSensor = (MicrophoneSensor)theEObject;
				T result = caseMicrophoneSensor(microphoneSensor);
				if (result == null) result = caseAbstractSensor(microphoneSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.TEMPERATURE_SENSOR: {
				TemperatureSensor temperatureSensor = (TemperatureSensor)theEObject;
				T result = caseTemperatureSensor(temperatureSensor);
				if (result == null) result = caseAbstractSensor(temperatureSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.PRESSURE_SENSOR: {
				PressureSensor pressureSensor = (PressureSensor)theEObject;
				T result = casePressureSensor(pressureSensor);
				if (result == null) result = caseAbstractSensor(pressureSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.HUMIDITY_SENSOR: {
				HumiditySensor humiditySensor = (HumiditySensor)theEObject;
				T result = caseHumiditySensor(humiditySensor);
				if (result == null) result = caseAbstractSensor(humiditySensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.VOLTAGE_SENSOR: {
				VoltageSensor voltageSensor = (VoltageSensor)theEObject;
				T result = caseVoltageSensor(voltageSensor);
				if (result == null) result = caseAbstractSensor(voltageSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.DATA_PROCESSING_JOB: {
				DataProcessingJob dataProcessingJob = (DataProcessingJob)theEObject;
				T result = caseDataProcessingJob(dataProcessingJob);
				if (result == null) result = caseAbstractJob(dataProcessingJob);
				if (result == null) result = caseIdentifiable(dataProcessingJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM: {
				NetworkLevelSpecialAlgorithm networkLevelSpecialAlgorithm = (NetworkLevelSpecialAlgorithm)theEObject;
				T result = caseNetworkLevelSpecialAlgorithm(networkLevelSpecialAlgorithm);
				if (result == null) result = caseNetworkLevelJob(networkLevelSpecialAlgorithm);
				if (result == null) result = caseDataProcessingJob(networkLevelSpecialAlgorithm);
				if (result == null) result = caseAbstractJob(networkLevelSpecialAlgorithm);
				if (result == null) result = caseIdentifiable(networkLevelSpecialAlgorithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SennetPackage.NETWORK_DATA_PROCESSING: {
				NetworkDataProcessing networkDataProcessing = (NetworkDataProcessing)theEObject;
				T result = caseNetworkDataProcessing(networkDataProcessing);
				if (result == null) result = caseNetworkLevelJob(networkDataProcessing);
				if (result == null) result = caseDataProcessingJob(networkDataProcessing);
				if (result == null) result = caseAbstractJob(networkDataProcessing);
				if (result == null) result = caseIdentifiable(networkDataProcessing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Se Net App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Se Net App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeNetApp(SeNetApp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNode(AbstractNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Flat Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Flat Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFlatNode(AbstractFlatNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Cluster Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Cluster Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractClusterNode(AbstractClusterNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorNode(SensorNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster Head Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster Head Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClusterHeadNode(ClusterHeadNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinkNode(SinkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computation Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computation Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputationNode(ComputationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNetwork(AbstractNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flat Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flat Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlatNetwork(FlatNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clustered Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clustered Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClusteredNetwork(ClusteredNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCluster(Cluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractJob(AbstractJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Level Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Level Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeLevelJob(NodeLevelJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Level Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Level Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkLevelJob(NetworkLevelJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sense Now Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sense Now Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenseNowJob(SenseNowJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinkJob(SinkJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sense Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sense Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenseJob(SenseJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Message Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Message Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveMessageTrigger(ReceiveMessageTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recieve Serial Msg Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recieve Serial Msg Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecieveSerialMsgTrigger(RecieveSerialMsgTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Job Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Job Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartJobTrigger(StartJobTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Job Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Job Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopJobTrigger(StopJobTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Buttom Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Buttom Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushButtomTrigger(PushButtomTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Recieve Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Recieve Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRecieveTrigger(AbstractRecieveTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Start Ending Job Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Start Ending Job Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractStartEndingJobTrigger(AbstractStartEndingJobTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstrat Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstrat Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstratAction(AbstratAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalAction(ConditionalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Node Memory Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Node Memory Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNodeMemoryAction(AbstractNodeMemoryAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Node Memory Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Node Memory Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadNodeMemoryAction(ReadNodeMemoryAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Node Memory Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Node Memory Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteNodeMemoryAction(WriteNodeMemoryAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Message Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Message Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendMessageAction(SendMessageAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blink Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blink Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlinkAction(BlinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Responce Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Responce Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractResponceAction(AbstractResponceAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Serial Port Msg Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Serial Port Msg Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendSerialPortMsgAction(SendSerialPortMsgAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSensor(AbstractSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accelerometer Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accelerometer Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccelerometerSensor(AccelerometerSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLightSensor(LightSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationSensor(LocationSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microphone Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microphone Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicrophoneSensor(MicrophoneSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temperature Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temperature Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemperatureSensor(TemperatureSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressure Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressure Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressureSensor(PressureSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Humidity Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Humidity Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumiditySensor(HumiditySensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voltage Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voltage Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoltageSensor(VoltageSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Processing Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Processing Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProcessingJob(DataProcessingJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Level Special Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Level Special Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkLevelSpecialAlgorithm(NetworkLevelSpecialAlgorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Data Processing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Data Processing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkDataProcessing(NetworkDataProcessing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SennetSwitch
