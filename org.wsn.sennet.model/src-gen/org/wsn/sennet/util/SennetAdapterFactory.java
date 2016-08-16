/**
 */
package org.wsn.sennet.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.wsn.sennet.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.wsn.sennet.SennetPackage
 * @generated
 */
public class SennetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SennetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SennetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SennetPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SennetSwitch<Adapter> modelSwitch =
		new SennetSwitch<Adapter>() {
			@Override
			public Adapter caseSeNetApp(SeNetApp object) {
				return createSeNetAppAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseAbstractNode(AbstractNode object) {
				return createAbstractNodeAdapter();
			}
			@Override
			public Adapter caseAbstractFlatNode(AbstractFlatNode object) {
				return createAbstractFlatNodeAdapter();
			}
			@Override
			public Adapter caseAbstractClusterNode(AbstractClusterNode object) {
				return createAbstractClusterNodeAdapter();
			}
			@Override
			public Adapter caseSensorNode(SensorNode object) {
				return createSensorNodeAdapter();
			}
			@Override
			public Adapter caseClusterHeadNode(ClusterHeadNode object) {
				return createClusterHeadNodeAdapter();
			}
			@Override
			public Adapter caseSinkNode(SinkNode object) {
				return createSinkNodeAdapter();
			}
			@Override
			public Adapter caseComputationNode(ComputationNode object) {
				return createComputationNodeAdapter();
			}
			@Override
			public Adapter caseAbstractNetwork(AbstractNetwork object) {
				return createAbstractNetworkAdapter();
			}
			@Override
			public Adapter caseFlatNetwork(FlatNetwork object) {
				return createFlatNetworkAdapter();
			}
			@Override
			public Adapter caseClusteredNetwork(ClusteredNetwork object) {
				return createClusteredNetworkAdapter();
			}
			@Override
			public Adapter caseCluster(Cluster object) {
				return createClusterAdapter();
			}
			@Override
			public Adapter caseAbstractJob(AbstractJob object) {
				return createAbstractJobAdapter();
			}
			@Override
			public Adapter caseNodeLevelJob(NodeLevelJob object) {
				return createNodeLevelJobAdapter();
			}
			@Override
			public Adapter caseNetworkLevelJob(NetworkLevelJob object) {
				return createNetworkLevelJobAdapter();
			}
			@Override
			public Adapter caseSenseNowJob(SenseNowJob object) {
				return createSenseNowJobAdapter();
			}
			@Override
			public Adapter caseSinkJob(SinkJob object) {
				return createSinkJobAdapter();
			}
			@Override
			public Adapter caseSenseJob(SenseJob object) {
				return createSenseJobAdapter();
			}
			@Override
			public Adapter caseReceiveMessageTrigger(ReceiveMessageTrigger object) {
				return createReceiveMessageTriggerAdapter();
			}
			@Override
			public Adapter caseRecieveSerialMsgTrigger(RecieveSerialMsgTrigger object) {
				return createRecieveSerialMsgTriggerAdapter();
			}
			@Override
			public Adapter caseStartJobTrigger(StartJobTrigger object) {
				return createStartJobTriggerAdapter();
			}
			@Override
			public Adapter caseStopJobTrigger(StopJobTrigger object) {
				return createStopJobTriggerAdapter();
			}
			@Override
			public Adapter casePushButtomTrigger(PushButtomTrigger object) {
				return createPushButtomTriggerAdapter();
			}
			@Override
			public Adapter caseAbstractRecieveTrigger(AbstractRecieveTrigger object) {
				return createAbstractRecieveTriggerAdapter();
			}
			@Override
			public Adapter caseAbstractStartEndingJobTrigger(AbstractStartEndingJobTrigger object) {
				return createAbstractStartEndingJobTriggerAdapter();
			}
			@Override
			public Adapter caseAbstratAction(AbstratAction object) {
				return createAbstratActionAdapter();
			}
			@Override
			public Adapter caseConditionalAction(ConditionalAction object) {
				return createConditionalActionAdapter();
			}
			@Override
			public Adapter caseAbstractNodeMemoryAction(AbstractNodeMemoryAction object) {
				return createAbstractNodeMemoryActionAdapter();
			}
			@Override
			public Adapter caseReadNodeMemoryAction(ReadNodeMemoryAction object) {
				return createReadNodeMemoryActionAdapter();
			}
			@Override
			public Adapter caseWriteNodeMemoryAction(WriteNodeMemoryAction object) {
				return createWriteNodeMemoryActionAdapter();
			}
			@Override
			public Adapter caseSendMessageAction(SendMessageAction object) {
				return createSendMessageActionAdapter();
			}
			@Override
			public Adapter caseBlinkAction(BlinkAction object) {
				return createBlinkActionAdapter();
			}
			@Override
			public Adapter caseAbstractResponceAction(AbstractResponceAction object) {
				return createAbstractResponceActionAdapter();
			}
			@Override
			public Adapter caseSendSerialPortMsgAction(SendSerialPortMsgAction object) {
				return createSendSerialPortMsgActionAdapter();
			}
			@Override
			public Adapter caseAbstractSensor(AbstractSensor object) {
				return createAbstractSensorAdapter();
			}
			@Override
			public Adapter caseAccelerometerSensor(AccelerometerSensor object) {
				return createAccelerometerSensorAdapter();
			}
			@Override
			public Adapter caseLightSensor(LightSensor object) {
				return createLightSensorAdapter();
			}
			@Override
			public Adapter caseLocationSensor(LocationSensor object) {
				return createLocationSensorAdapter();
			}
			@Override
			public Adapter caseMicrophoneSensor(MicrophoneSensor object) {
				return createMicrophoneSensorAdapter();
			}
			@Override
			public Adapter caseTemperatureSensor(TemperatureSensor object) {
				return createTemperatureSensorAdapter();
			}
			@Override
			public Adapter casePressureSensor(PressureSensor object) {
				return createPressureSensorAdapter();
			}
			@Override
			public Adapter caseHumiditySensor(HumiditySensor object) {
				return createHumiditySensorAdapter();
			}
			@Override
			public Adapter caseVoltageSensor(VoltageSensor object) {
				return createVoltageSensorAdapter();
			}
			@Override
			public Adapter caseDataProcessingJob(DataProcessingJob object) {
				return createDataProcessingJobAdapter();
			}
			@Override
			public Adapter caseNetworkLevelSpecialAlgorithm(NetworkLevelSpecialAlgorithm object) {
				return createNetworkLevelSpecialAlgorithmAdapter();
			}
			@Override
			public Adapter caseNetworkDataProcessing(NetworkDataProcessing object) {
				return createNetworkDataProcessingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.SeNetApp <em>Se Net App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.SeNetApp
	 * @generated
	 */
	public Adapter createSeNetAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.AbstractNode
	 * @generated
	 */
	public Adapter createAbstractNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.AbstractFlatNode <em>Abstract Flat Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.AbstractFlatNode
	 * @generated
	 */
	public Adapter createAbstractFlatNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.AbstractClusterNode <em>Abstract Cluster Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.AbstractClusterNode
	 * @generated
	 */
	public Adapter createAbstractClusterNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.SensorNode <em>Sensor Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.SensorNode
	 * @generated
	 */
	public Adapter createSensorNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.ClusterHeadNode <em>Cluster Head Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.ClusterHeadNode
	 * @generated
	 */
	public Adapter createClusterHeadNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.SinkNode <em>Sink Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.SinkNode
	 * @generated
	 */
	public Adapter createSinkNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.ComputationNode <em>Computation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.ComputationNode
	 * @generated
	 */
	public Adapter createComputationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.AbstractNetwork <em>Abstract Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.AbstractNetwork
	 * @generated
	 */
	public Adapter createAbstractNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.FlatNetwork <em>Flat Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.FlatNetwork
	 * @generated
	 */
	public Adapter createFlatNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.ClusteredNetwork <em>Clustered Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.ClusteredNetwork
	 * @generated
	 */
	public Adapter createClusteredNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.Cluster
	 * @generated
	 */
	public Adapter createClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.AbstractJob <em>Abstract Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.AbstractJob
	 * @generated
	 */
	public Adapter createAbstractJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.NodeLevelJob <em>Node Level Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.NodeLevelJob
	 * @generated
	 */
	public Adapter createNodeLevelJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.NetworkLevelJob <em>Network Level Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.NetworkLevelJob
	 * @generated
	 */
	public Adapter createNetworkLevelJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.SenseNowJob <em>Sense Now Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.SenseNowJob
	 * @generated
	 */
	public Adapter createSenseNowJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.SinkJob <em>Sink Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.SinkJob
	 * @generated
	 */
	public Adapter createSinkJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.SenseJob <em>Sense Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.SenseJob
	 * @generated
	 */
	public Adapter createSenseJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.ReceiveMessageTrigger <em>Receive Message Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.ReceiveMessageTrigger
	 * @generated
	 */
	public Adapter createReceiveMessageTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.RecieveSerialMsgTrigger <em>Recieve Serial Msg Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.RecieveSerialMsgTrigger
	 * @generated
	 */
	public Adapter createRecieveSerialMsgTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.StartJobTrigger <em>Start Job Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.StartJobTrigger
	 * @generated
	 */
	public Adapter createStartJobTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.StopJobTrigger <em>Stop Job Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.StopJobTrigger
	 * @generated
	 */
	public Adapter createStopJobTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.PushButtomTrigger <em>Push Buttom Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.PushButtomTrigger
	 * @generated
	 */
	public Adapter createPushButtomTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.AbstractRecieveTrigger <em>Abstract Recieve Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.AbstractRecieveTrigger
	 * @generated
	 */
	public Adapter createAbstractRecieveTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.AbstractStartEndingJobTrigger <em>Abstract Start Ending Job Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.AbstractStartEndingJobTrigger
	 * @generated
	 */
	public Adapter createAbstractStartEndingJobTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.AbstratAction <em>Abstrat Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.AbstratAction
	 * @generated
	 */
	public Adapter createAbstratActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.ConditionalAction <em>Conditional Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.ConditionalAction
	 * @generated
	 */
	public Adapter createConditionalActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.AbstractNodeMemoryAction <em>Abstract Node Memory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.AbstractNodeMemoryAction
	 * @generated
	 */
	public Adapter createAbstractNodeMemoryActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.ReadNodeMemoryAction <em>Read Node Memory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.ReadNodeMemoryAction
	 * @generated
	 */
	public Adapter createReadNodeMemoryActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.WriteNodeMemoryAction <em>Write Node Memory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.WriteNodeMemoryAction
	 * @generated
	 */
	public Adapter createWriteNodeMemoryActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.SendMessageAction <em>Send Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.SendMessageAction
	 * @generated
	 */
	public Adapter createSendMessageActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.BlinkAction <em>Blink Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.BlinkAction
	 * @generated
	 */
	public Adapter createBlinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.AbstractResponceAction <em>Abstract Responce Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.AbstractResponceAction
	 * @generated
	 */
	public Adapter createAbstractResponceActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.SendSerialPortMsgAction <em>Send Serial Port Msg Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.SendSerialPortMsgAction
	 * @generated
	 */
	public Adapter createSendSerialPortMsgActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.AbstractSensor <em>Abstract Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.AbstractSensor
	 * @generated
	 */
	public Adapter createAbstractSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.AccelerometerSensor <em>Accelerometer Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.AccelerometerSensor
	 * @generated
	 */
	public Adapter createAccelerometerSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.LightSensor
	 * @generated
	 */
	public Adapter createLightSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.LocationSensor <em>Location Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.LocationSensor
	 * @generated
	 */
	public Adapter createLocationSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.MicrophoneSensor <em>Microphone Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.MicrophoneSensor
	 * @generated
	 */
	public Adapter createMicrophoneSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.TemperatureSensor <em>Temperature Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.TemperatureSensor
	 * @generated
	 */
	public Adapter createTemperatureSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.PressureSensor <em>Pressure Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.PressureSensor
	 * @generated
	 */
	public Adapter createPressureSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.HumiditySensor <em>Humidity Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.HumiditySensor
	 * @generated
	 */
	public Adapter createHumiditySensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.VoltageSensor <em>Voltage Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.VoltageSensor
	 * @generated
	 */
	public Adapter createVoltageSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.DataProcessingJob <em>Data Processing Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.DataProcessingJob
	 * @generated
	 */
	public Adapter createDataProcessingJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.NetworkLevelSpecialAlgorithm <em>Network Level Special Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.NetworkLevelSpecialAlgorithm
	 * @generated
	 */
	public Adapter createNetworkLevelSpecialAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wsn.sennet.NetworkDataProcessing <em>Network Data Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wsn.sennet.NetworkDataProcessing
	 * @generated
	 */
	public Adapter createNetworkDataProcessingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SennetAdapterFactory
