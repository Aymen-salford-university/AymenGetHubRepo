/**
 */
package org.wsn.sennet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.wsn.sennet.SennetPackage
 * @generated
 */
public interface SennetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SennetFactory eINSTANCE = org.wsn.sennet.impl.SennetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Se Net App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Se Net App</em>'.
	 * @generated
	 */
	SeNetApp createSeNetApp();

	/**
	 * Returns a new object of class '<em>Sensor Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Node</em>'.
	 * @generated
	 */
	SensorNode createSensorNode();

	/**
	 * Returns a new object of class '<em>Cluster Head Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster Head Node</em>'.
	 * @generated
	 */
	ClusterHeadNode createClusterHeadNode();

	/**
	 * Returns a new object of class '<em>Sink Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sink Node</em>'.
	 * @generated
	 */
	SinkNode createSinkNode();

	/**
	 * Returns a new object of class '<em>Computation Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computation Node</em>'.
	 * @generated
	 */
	ComputationNode createComputationNode();

	/**
	 * Returns a new object of class '<em>Flat Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flat Network</em>'.
	 * @generated
	 */
	FlatNetwork createFlatNetwork();

	/**
	 * Returns a new object of class '<em>Clustered Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clustered Network</em>'.
	 * @generated
	 */
	ClusteredNetwork createClusteredNetwork();

	/**
	 * Returns a new object of class '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster</em>'.
	 * @generated
	 */
	Cluster createCluster();

	/**
	 * Returns a new object of class '<em>Node Level Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Level Job</em>'.
	 * @generated
	 */
	NodeLevelJob createNodeLevelJob();

	/**
	 * Returns a new object of class '<em>Sense Now Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sense Now Job</em>'.
	 * @generated
	 */
	SenseNowJob createSenseNowJob();

	/**
	 * Returns a new object of class '<em>Sink Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sink Job</em>'.
	 * @generated
	 */
	SinkJob createSinkJob();

	/**
	 * Returns a new object of class '<em>Sense Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sense Job</em>'.
	 * @generated
	 */
	SenseJob createSenseJob();

	/**
	 * Returns a new object of class '<em>Receive Message Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Message Trigger</em>'.
	 * @generated
	 */
	ReceiveMessageTrigger createReceiveMessageTrigger();

	/**
	 * Returns a new object of class '<em>Recieve Serial Msg Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recieve Serial Msg Trigger</em>'.
	 * @generated
	 */
	RecieveSerialMsgTrigger createRecieveSerialMsgTrigger();

	/**
	 * Returns a new object of class '<em>Start Job Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Job Trigger</em>'.
	 * @generated
	 */
	StartJobTrigger createStartJobTrigger();

	/**
	 * Returns a new object of class '<em>Stop Job Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Job Trigger</em>'.
	 * @generated
	 */
	StopJobTrigger createStopJobTrigger();

	/**
	 * Returns a new object of class '<em>Push Buttom Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Push Buttom Trigger</em>'.
	 * @generated
	 */
	PushButtomTrigger createPushButtomTrigger();

	/**
	 * Returns a new object of class '<em>Conditional Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Action</em>'.
	 * @generated
	 */
	ConditionalAction createConditionalAction();

	/**
	 * Returns a new object of class '<em>Read Node Memory Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Node Memory Action</em>'.
	 * @generated
	 */
	ReadNodeMemoryAction createReadNodeMemoryAction();

	/**
	 * Returns a new object of class '<em>Write Node Memory Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write Node Memory Action</em>'.
	 * @generated
	 */
	WriteNodeMemoryAction createWriteNodeMemoryAction();

	/**
	 * Returns a new object of class '<em>Send Message Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Message Action</em>'.
	 * @generated
	 */
	SendMessageAction createSendMessageAction();

	/**
	 * Returns a new object of class '<em>Blink Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blink Action</em>'.
	 * @generated
	 */
	BlinkAction createBlinkAction();

	/**
	 * Returns a new object of class '<em>Send Serial Port Msg Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Serial Port Msg Action</em>'.
	 * @generated
	 */
	SendSerialPortMsgAction createSendSerialPortMsgAction();

	/**
	 * Returns a new object of class '<em>Accelerometer Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accelerometer Sensor</em>'.
	 * @generated
	 */
	AccelerometerSensor createAccelerometerSensor();

	/**
	 * Returns a new object of class '<em>Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light Sensor</em>'.
	 * @generated
	 */
	LightSensor createLightSensor();

	/**
	 * Returns a new object of class '<em>Location Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Sensor</em>'.
	 * @generated
	 */
	LocationSensor createLocationSensor();

	/**
	 * Returns a new object of class '<em>Microphone Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microphone Sensor</em>'.
	 * @generated
	 */
	MicrophoneSensor createMicrophoneSensor();

	/**
	 * Returns a new object of class '<em>Temperature Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temperature Sensor</em>'.
	 * @generated
	 */
	TemperatureSensor createTemperatureSensor();

	/**
	 * Returns a new object of class '<em>Pressure Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pressure Sensor</em>'.
	 * @generated
	 */
	PressureSensor createPressureSensor();

	/**
	 * Returns a new object of class '<em>Humidity Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Humidity Sensor</em>'.
	 * @generated
	 */
	HumiditySensor createHumiditySensor();

	/**
	 * Returns a new object of class '<em>Voltage Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voltage Sensor</em>'.
	 * @generated
	 */
	VoltageSensor createVoltageSensor();

	/**
	 * Returns a new object of class '<em>Network Level Special Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Level Special Algorithm</em>'.
	 * @generated
	 */
	NetworkLevelSpecialAlgorithm createNetworkLevelSpecialAlgorithm();

	/**
	 * Returns a new object of class '<em>Network Data Processing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Data Processing</em>'.
	 * @generated
	 */
	NetworkDataProcessing createNetworkDataProcessing();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SennetPackage getSennetPackage();

} //SennetFactory
