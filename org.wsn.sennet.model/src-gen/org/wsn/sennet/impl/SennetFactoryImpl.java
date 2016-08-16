/**
 */
package org.wsn.sennet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.wsn.sennet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SennetFactoryImpl extends EFactoryImpl implements SennetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SennetFactory init() {
		try {
			SennetFactory theSennetFactory = (SennetFactory)EPackage.Registry.INSTANCE.getEFactory(SennetPackage.eNS_URI);
			if (theSennetFactory != null) {
				return theSennetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SennetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SennetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SennetPackage.SE_NET_APP: return createSeNetApp();
			case SennetPackage.SENSOR_NODE: return createSensorNode();
			case SennetPackage.CLUSTER_HEAD_NODE: return createClusterHeadNode();
			case SennetPackage.SINK_NODE: return createSinkNode();
			case SennetPackage.COMPUTATION_NODE: return createComputationNode();
			case SennetPackage.FLAT_NETWORK: return createFlatNetwork();
			case SennetPackage.CLUSTERED_NETWORK: return createClusteredNetwork();
			case SennetPackage.CLUSTER: return createCluster();
			case SennetPackage.NODE_LEVEL_JOB: return createNodeLevelJob();
			case SennetPackage.SENSE_NOW_JOB: return createSenseNowJob();
			case SennetPackage.SINK_JOB: return createSinkJob();
			case SennetPackage.SENSE_JOB: return createSenseJob();
			case SennetPackage.RECEIVE_MESSAGE_TRIGGER: return createReceiveMessageTrigger();
			case SennetPackage.RECIEVE_SERIAL_MSG_TRIGGER: return createRecieveSerialMsgTrigger();
			case SennetPackage.START_JOB_TRIGGER: return createStartJobTrigger();
			case SennetPackage.STOP_JOB_TRIGGER: return createStopJobTrigger();
			case SennetPackage.PUSH_BUTTOM_TRIGGER: return createPushButtomTrigger();
			case SennetPackage.CONDITIONAL_ACTION: return createConditionalAction();
			case SennetPackage.READ_NODE_MEMORY_ACTION: return createReadNodeMemoryAction();
			case SennetPackage.WRITE_NODE_MEMORY_ACTION: return createWriteNodeMemoryAction();
			case SennetPackage.SEND_MESSAGE_ACTION: return createSendMessageAction();
			case SennetPackage.BLINK_ACTION: return createBlinkAction();
			case SennetPackage.SEND_SERIAL_PORT_MSG_ACTION: return createSendSerialPortMsgAction();
			case SennetPackage.ACCELEROMETER_SENSOR: return createAccelerometerSensor();
			case SennetPackage.LIGHT_SENSOR: return createLightSensor();
			case SennetPackage.LOCATION_SENSOR: return createLocationSensor();
			case SennetPackage.MICROPHONE_SENSOR: return createMicrophoneSensor();
			case SennetPackage.TEMPERATURE_SENSOR: return createTemperatureSensor();
			case SennetPackage.PRESSURE_SENSOR: return createPressureSensor();
			case SennetPackage.HUMIDITY_SENSOR: return createHumiditySensor();
			case SennetPackage.VOLTAGE_SENSOR: return createVoltageSensor();
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM: return createNetworkLevelSpecialAlgorithm();
			case SennetPackage.NETWORK_DATA_PROCESSING: return createNetworkDataProcessing();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeNetApp createSeNetApp() {
		SeNetAppImpl seNetApp = new SeNetAppImpl();
		return seNetApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorNode createSensorNode() {
		SensorNodeImpl sensorNode = new SensorNodeImpl();
		return sensorNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterHeadNode createClusterHeadNode() {
		ClusterHeadNodeImpl clusterHeadNode = new ClusterHeadNodeImpl();
		return clusterHeadNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkNode createSinkNode() {
		SinkNodeImpl sinkNode = new SinkNodeImpl();
		return sinkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputationNode createComputationNode() {
		ComputationNodeImpl computationNode = new ComputationNodeImpl();
		return computationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatNetwork createFlatNetwork() {
		FlatNetworkImpl flatNetwork = new FlatNetworkImpl();
		return flatNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusteredNetwork createClusteredNetwork() {
		ClusteredNetworkImpl clusteredNetwork = new ClusteredNetworkImpl();
		return clusteredNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster createCluster() {
		ClusterImpl cluster = new ClusterImpl();
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeLevelJob createNodeLevelJob() {
		NodeLevelJobImpl nodeLevelJob = new NodeLevelJobImpl();
		return nodeLevelJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenseNowJob createSenseNowJob() {
		SenseNowJobImpl senseNowJob = new SenseNowJobImpl();
		return senseNowJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkJob createSinkJob() {
		SinkJobImpl sinkJob = new SinkJobImpl();
		return sinkJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenseJob createSenseJob() {
		SenseJobImpl senseJob = new SenseJobImpl();
		return senseJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMessageTrigger createReceiveMessageTrigger() {
		ReceiveMessageTriggerImpl receiveMessageTrigger = new ReceiveMessageTriggerImpl();
		return receiveMessageTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecieveSerialMsgTrigger createRecieveSerialMsgTrigger() {
		RecieveSerialMsgTriggerImpl recieveSerialMsgTrigger = new RecieveSerialMsgTriggerImpl();
		return recieveSerialMsgTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartJobTrigger createStartJobTrigger() {
		StartJobTriggerImpl startJobTrigger = new StartJobTriggerImpl();
		return startJobTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopJobTrigger createStopJobTrigger() {
		StopJobTriggerImpl stopJobTrigger = new StopJobTriggerImpl();
		return stopJobTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushButtomTrigger createPushButtomTrigger() {
		PushButtomTriggerImpl pushButtomTrigger = new PushButtomTriggerImpl();
		return pushButtomTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalAction createConditionalAction() {
		ConditionalActionImpl conditionalAction = new ConditionalActionImpl();
		return conditionalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadNodeMemoryAction createReadNodeMemoryAction() {
		ReadNodeMemoryActionImpl readNodeMemoryAction = new ReadNodeMemoryActionImpl();
		return readNodeMemoryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteNodeMemoryAction createWriteNodeMemoryAction() {
		WriteNodeMemoryActionImpl writeNodeMemoryAction = new WriteNodeMemoryActionImpl();
		return writeNodeMemoryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMessageAction createSendMessageAction() {
		SendMessageActionImpl sendMessageAction = new SendMessageActionImpl();
		return sendMessageAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlinkAction createBlinkAction() {
		BlinkActionImpl blinkAction = new BlinkActionImpl();
		return blinkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendSerialPortMsgAction createSendSerialPortMsgAction() {
		SendSerialPortMsgActionImpl sendSerialPortMsgAction = new SendSerialPortMsgActionImpl();
		return sendSerialPortMsgAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccelerometerSensor createAccelerometerSensor() {
		AccelerometerSensorImpl accelerometerSensor = new AccelerometerSensorImpl();
		return accelerometerSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightSensor createLightSensor() {
		LightSensorImpl lightSensor = new LightSensorImpl();
		return lightSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationSensor createLocationSensor() {
		LocationSensorImpl locationSensor = new LocationSensorImpl();
		return locationSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrophoneSensor createMicrophoneSensor() {
		MicrophoneSensorImpl microphoneSensor = new MicrophoneSensorImpl();
		return microphoneSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemperatureSensor createTemperatureSensor() {
		TemperatureSensorImpl temperatureSensor = new TemperatureSensorImpl();
		return temperatureSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureSensor createPressureSensor() {
		PressureSensorImpl pressureSensor = new PressureSensorImpl();
		return pressureSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumiditySensor createHumiditySensor() {
		HumiditySensorImpl humiditySensor = new HumiditySensorImpl();
		return humiditySensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageSensor createVoltageSensor() {
		VoltageSensorImpl voltageSensor = new VoltageSensorImpl();
		return voltageSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkLevelSpecialAlgorithm createNetworkLevelSpecialAlgorithm() {
		NetworkLevelSpecialAlgorithmImpl networkLevelSpecialAlgorithm = new NetworkLevelSpecialAlgorithmImpl();
		return networkLevelSpecialAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDataProcessing createNetworkDataProcessing() {
		NetworkDataProcessingImpl networkDataProcessing = new NetworkDataProcessingImpl();
		return networkDataProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SennetPackage getSennetPackage() {
		return (SennetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SennetPackage getPackage() {
		return SennetPackage.eINSTANCE;
	}

} //SennetFactoryImpl
