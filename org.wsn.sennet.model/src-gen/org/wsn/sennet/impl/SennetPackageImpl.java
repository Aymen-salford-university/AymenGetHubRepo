/**
 */
package org.wsn.sennet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.wsn.sennet.AbstractClusterNode;
import org.wsn.sennet.AbstractFlatNode;
import org.wsn.sennet.AbstractJob;
import org.wsn.sennet.AbstractNetwork;
import org.wsn.sennet.AbstractNode;
import org.wsn.sennet.AbstractNodeMemoryAction;
import org.wsn.sennet.AbstractRecieveTrigger;
import org.wsn.sennet.AbstractResponceAction;
import org.wsn.sennet.AbstractSensor;
import org.wsn.sennet.AbstractStartEndingJobTrigger;
import org.wsn.sennet.AbstratAction;
import org.wsn.sennet.AccelerometerSensor;
import org.wsn.sennet.BlinkAction;
import org.wsn.sennet.Cluster;
import org.wsn.sennet.ClusterHeadNode;
import org.wsn.sennet.ClusteredNetwork;
import org.wsn.sennet.ComputationNode;
import org.wsn.sennet.ConditionalAction;
import org.wsn.sennet.DataProcessingJob;
import org.wsn.sennet.FlatNetwork;
import org.wsn.sennet.HumiditySensor;
import org.wsn.sennet.Identifiable;
import org.wsn.sennet.LightSensor;
import org.wsn.sennet.LocationSensor;
import org.wsn.sennet.MicrophoneSensor;
import org.wsn.sennet.NamedElement;
import org.wsn.sennet.NetworkDataProcessing;
import org.wsn.sennet.NetworkLevelJob;
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
import org.wsn.sennet.SennetFactory;
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

import org.wsn.sennet.enums.EnumsPackage;

import org.wsn.sennet.enums.impl.EnumsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SennetPackageImpl extends EPackageImpl implements SennetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seNetAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFlatNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractClusterNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterHeadNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flatNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusteredNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeLevelJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkLevelJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senseNowJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senseJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveMessageTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recieveSerialMsgTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startJobTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopJobTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushButtomTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRecieveTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStartEndingJobTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstratActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeMemoryActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readNodeMemoryActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeNodeMemoryActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendMessageActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractResponceActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendSerialPortMsgActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accelerometerSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microphoneSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperatureSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressureSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humiditySensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voltageSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataProcessingJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkLevelSpecialAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkDataProcessingEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.wsn.sennet.SennetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SennetPackageImpl() {
		super(eNS_URI, SennetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SennetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SennetPackage init() {
		if (isInited) return (SennetPackage)EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI);

		// Obtain or create and register package
		SennetPackageImpl theSennetPackage = (SennetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SennetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SennetPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) instanceof EnumsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) : EnumsPackage.eINSTANCE);

		// Create package meta-data objects
		theSennetPackage.createPackageContents();
		theEnumsPackage.createPackageContents();

		// Initialize created meta-data
		theSennetPackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSennetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SennetPackage.eNS_URI, theSennetPackage);
		return theSennetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeNetApp() {
		return seNetAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeNetApp_Jobs() {
		return (EReference)seNetAppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Id() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNode() {
		return abstractNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_Position() {
		return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_NodeResources() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFlatNode() {
		return abstractFlatNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractClusterNode() {
		return abstractClusterNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorNode() {
		return sensorNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClusterHeadNode() {
		return clusterHeadNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinkNode() {
		return sinkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputationNode() {
		return computationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNetwork() {
		return abstractNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNetwork_NbOfNodes() {
		return (EAttribute)abstractNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNetwork_InterNodeComm() {
		return (EAttribute)abstractNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNetwork_RoutingProtocol() {
		return (EAttribute)abstractNetworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNetwork_Resources() {
		return (EReference)abstractNetworkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNetwork_Sink() {
		return (EReference)abstractNetworkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlatNetwork() {
		return flatNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlatNetwork_Nodes() {
		return (EReference)flatNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClusteredNetwork() {
		return clusteredNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClusteredNetwork_Clusters() {
		return (EReference)clusteredNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCluster() {
		return clusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCluster_Nodes() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCluster_Resources() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractJob() {
		return abstractJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractJob_JobTargetNode() {
		return (EReference)abstractJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractJob_JobTargetNetwork() {
		return (EReference)abstractJobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractJob_StartEndTrigger() {
		return (EReference)abstractJobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractJob_Jobaction() {
		return (EReference)abstractJobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeLevelJob() {
		return nodeLevelJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeLevelJob_NodeDataProcessing() {
		return (EAttribute)nodeLevelJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeLevelJob_SensingSamplingRate() {
		return (EAttribute)nodeLevelJobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeLevelJob_DataProcessingRate() {
		return (EAttribute)nodeLevelJobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkLevelJob() {
		return networkLevelJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenseNowJob() {
		return senseNowJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinkJob() {
		return sinkJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenseJob() {
		return senseJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenseJob_SensingSamplingRate() {
		return (EAttribute)senseJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveMessageTrigger() {
		return receiveMessageTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecieveSerialMsgTrigger() {
		return recieveSerialMsgTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartJobTrigger() {
		return startJobTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopJobTrigger() {
		return stopJobTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPushButtomTrigger() {
		return pushButtomTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRecieveTrigger() {
		return abstractRecieveTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStartEndingJobTrigger() {
		return abstractStartEndingJobTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstratAction() {
		return abstratActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstratAction_Condition() {
		return (EReference)abstratActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalAction() {
		return conditionalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalAction_SensorTerm() {
		return (EAttribute)conditionalActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalAction_LogicalSymbol() {
		return (EAttribute)conditionalActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalAction_Value() {
		return (EAttribute)conditionalActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalAction_Unit() {
		return (EAttribute)conditionalActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNodeMemoryAction() {
		return abstractNodeMemoryActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadNodeMemoryAction() {
		return readNodeMemoryActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteNodeMemoryAction() {
		return writeNodeMemoryActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendMessageAction() {
		return sendMessageActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendMessageAction_SendMessageTo() {
		return (EAttribute)sendMessageActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlinkAction() {
		return blinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlinkAction_Led() {
		return (EAttribute)blinkActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlinkAction_Status() {
		return (EAttribute)blinkActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractResponceAction() {
		return abstractResponceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendSerialPortMsgAction() {
		return sendSerialPortMsgActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSensor() {
		return abstractSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccelerometerSensor() {
		return accelerometerSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightSensor() {
		return lightSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationSensor() {
		return locationSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicrophoneSensor() {
		return microphoneSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemperatureSensor() {
		return temperatureSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressureSensor() {
		return pressureSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHumiditySensor() {
		return humiditySensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoltageSensor() {
		return voltageSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataProcessingJob() {
		return dataProcessingJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkLevelSpecialAlgorithm() {
		return networkLevelSpecialAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLevelSpecialAlgorithm_SpecialAlgorithmJob() {
		return (EAttribute)networkLevelSpecialAlgorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLevelSpecialAlgorithm_SensingSamplingRate() {
		return (EAttribute)networkLevelSpecialAlgorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLevelSpecialAlgorithm_AlgorithmSamplingRate() {
		return (EAttribute)networkLevelSpecialAlgorithmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLevelSpecialAlgorithm_NodeIDList() {
		return (EAttribute)networkLevelSpecialAlgorithmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkDataProcessing() {
		return networkDataProcessingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkDataProcessing_NetworkDataProcessing() {
		return (EAttribute)networkDataProcessingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkDataProcessing_SensingSamplingRate() {
		return (EAttribute)networkDataProcessingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkDataProcessing_DataProcessingRate() {
		return (EAttribute)networkDataProcessingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkDataProcessing_NodeIDList() {
		return (EAttribute)networkDataProcessingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SennetFactory getSennetFactory() {
		return (SennetFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		seNetAppEClass = createEClass(SE_NET_APP);
		createEReference(seNetAppEClass, SE_NET_APP__JOBS);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__ID);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		abstractNodeEClass = createEClass(ABSTRACT_NODE);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__POSITION);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__NODE_RESOURCES);

		abstractFlatNodeEClass = createEClass(ABSTRACT_FLAT_NODE);

		abstractClusterNodeEClass = createEClass(ABSTRACT_CLUSTER_NODE);

		sensorNodeEClass = createEClass(SENSOR_NODE);

		clusterHeadNodeEClass = createEClass(CLUSTER_HEAD_NODE);

		sinkNodeEClass = createEClass(SINK_NODE);

		computationNodeEClass = createEClass(COMPUTATION_NODE);

		abstractNetworkEClass = createEClass(ABSTRACT_NETWORK);
		createEAttribute(abstractNetworkEClass, ABSTRACT_NETWORK__NB_OF_NODES);
		createEAttribute(abstractNetworkEClass, ABSTRACT_NETWORK__INTER_NODE_COMM);
		createEAttribute(abstractNetworkEClass, ABSTRACT_NETWORK__ROUTING_PROTOCOL);
		createEReference(abstractNetworkEClass, ABSTRACT_NETWORK__RESOURCES);
		createEReference(abstractNetworkEClass, ABSTRACT_NETWORK__SINK);

		flatNetworkEClass = createEClass(FLAT_NETWORK);
		createEReference(flatNetworkEClass, FLAT_NETWORK__NODES);

		clusteredNetworkEClass = createEClass(CLUSTERED_NETWORK);
		createEReference(clusteredNetworkEClass, CLUSTERED_NETWORK__CLUSTERS);

		clusterEClass = createEClass(CLUSTER);
		createEReference(clusterEClass, CLUSTER__NODES);
		createEReference(clusterEClass, CLUSTER__RESOURCES);

		abstractJobEClass = createEClass(ABSTRACT_JOB);
		createEReference(abstractJobEClass, ABSTRACT_JOB__JOB_TARGET_NODE);
		createEReference(abstractJobEClass, ABSTRACT_JOB__JOB_TARGET_NETWORK);
		createEReference(abstractJobEClass, ABSTRACT_JOB__START_END_TRIGGER);
		createEReference(abstractJobEClass, ABSTRACT_JOB__JOBACTION);

		nodeLevelJobEClass = createEClass(NODE_LEVEL_JOB);
		createEAttribute(nodeLevelJobEClass, NODE_LEVEL_JOB__NODE_DATA_PROCESSING);
		createEAttribute(nodeLevelJobEClass, NODE_LEVEL_JOB__SENSING_SAMPLING_RATE);
		createEAttribute(nodeLevelJobEClass, NODE_LEVEL_JOB__DATA_PROCESSING_RATE);

		networkLevelJobEClass = createEClass(NETWORK_LEVEL_JOB);

		senseNowJobEClass = createEClass(SENSE_NOW_JOB);

		sinkJobEClass = createEClass(SINK_JOB);

		senseJobEClass = createEClass(SENSE_JOB);
		createEAttribute(senseJobEClass, SENSE_JOB__SENSING_SAMPLING_RATE);

		receiveMessageTriggerEClass = createEClass(RECEIVE_MESSAGE_TRIGGER);

		recieveSerialMsgTriggerEClass = createEClass(RECIEVE_SERIAL_MSG_TRIGGER);

		startJobTriggerEClass = createEClass(START_JOB_TRIGGER);

		stopJobTriggerEClass = createEClass(STOP_JOB_TRIGGER);

		pushButtomTriggerEClass = createEClass(PUSH_BUTTOM_TRIGGER);

		abstractRecieveTriggerEClass = createEClass(ABSTRACT_RECIEVE_TRIGGER);

		abstractStartEndingJobTriggerEClass = createEClass(ABSTRACT_START_ENDING_JOB_TRIGGER);

		abstratActionEClass = createEClass(ABSTRAT_ACTION);
		createEReference(abstratActionEClass, ABSTRAT_ACTION__CONDITION);

		conditionalActionEClass = createEClass(CONDITIONAL_ACTION);
		createEAttribute(conditionalActionEClass, CONDITIONAL_ACTION__SENSOR_TERM);
		createEAttribute(conditionalActionEClass, CONDITIONAL_ACTION__LOGICAL_SYMBOL);
		createEAttribute(conditionalActionEClass, CONDITIONAL_ACTION__VALUE);
		createEAttribute(conditionalActionEClass, CONDITIONAL_ACTION__UNIT);

		abstractNodeMemoryActionEClass = createEClass(ABSTRACT_NODE_MEMORY_ACTION);

		readNodeMemoryActionEClass = createEClass(READ_NODE_MEMORY_ACTION);

		writeNodeMemoryActionEClass = createEClass(WRITE_NODE_MEMORY_ACTION);

		sendMessageActionEClass = createEClass(SEND_MESSAGE_ACTION);
		createEAttribute(sendMessageActionEClass, SEND_MESSAGE_ACTION__SEND_MESSAGE_TO);

		blinkActionEClass = createEClass(BLINK_ACTION);
		createEAttribute(blinkActionEClass, BLINK_ACTION__LED);
		createEAttribute(blinkActionEClass, BLINK_ACTION__STATUS);

		abstractResponceActionEClass = createEClass(ABSTRACT_RESPONCE_ACTION);

		sendSerialPortMsgActionEClass = createEClass(SEND_SERIAL_PORT_MSG_ACTION);

		abstractSensorEClass = createEClass(ABSTRACT_SENSOR);

		accelerometerSensorEClass = createEClass(ACCELEROMETER_SENSOR);

		lightSensorEClass = createEClass(LIGHT_SENSOR);

		locationSensorEClass = createEClass(LOCATION_SENSOR);

		microphoneSensorEClass = createEClass(MICROPHONE_SENSOR);

		temperatureSensorEClass = createEClass(TEMPERATURE_SENSOR);

		pressureSensorEClass = createEClass(PRESSURE_SENSOR);

		humiditySensorEClass = createEClass(HUMIDITY_SENSOR);

		voltageSensorEClass = createEClass(VOLTAGE_SENSOR);

		dataProcessingJobEClass = createEClass(DATA_PROCESSING_JOB);

		networkLevelSpecialAlgorithmEClass = createEClass(NETWORK_LEVEL_SPECIAL_ALGORITHM);
		createEAttribute(networkLevelSpecialAlgorithmEClass, NETWORK_LEVEL_SPECIAL_ALGORITHM__SPECIAL_ALGORITHM_JOB);
		createEAttribute(networkLevelSpecialAlgorithmEClass, NETWORK_LEVEL_SPECIAL_ALGORITHM__SENSING_SAMPLING_RATE);
		createEAttribute(networkLevelSpecialAlgorithmEClass, NETWORK_LEVEL_SPECIAL_ALGORITHM__ALGORITHM_SAMPLING_RATE);
		createEAttribute(networkLevelSpecialAlgorithmEClass, NETWORK_LEVEL_SPECIAL_ALGORITHM__NODE_ID_LIST);

		networkDataProcessingEClass = createEClass(NETWORK_DATA_PROCESSING);
		createEAttribute(networkDataProcessingEClass, NETWORK_DATA_PROCESSING__NETWORK_DATA_PROCESSING);
		createEAttribute(networkDataProcessingEClass, NETWORK_DATA_PROCESSING__SENSING_SAMPLING_RATE);
		createEAttribute(networkDataProcessingEClass, NETWORK_DATA_PROCESSING__DATA_PROCESSING_RATE);
		createEAttribute(networkDataProcessingEClass, NETWORK_DATA_PROCESSING__NODE_ID_LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EnumsPackage theEnumsPackage = (EnumsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theEnumsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		seNetAppEClass.getESuperTypes().add(this.getNamedElement());
		namedElementEClass.getESuperTypes().add(this.getIdentifiable());
		abstractNodeEClass.getESuperTypes().add(this.getIdentifiable());
		abstractFlatNodeEClass.getESuperTypes().add(this.getAbstractNode());
		abstractClusterNodeEClass.getESuperTypes().add(this.getAbstractNode());
		sensorNodeEClass.getESuperTypes().add(this.getAbstractClusterNode());
		sensorNodeEClass.getESuperTypes().add(this.getAbstractFlatNode());
		clusterHeadNodeEClass.getESuperTypes().add(this.getAbstractClusterNode());
		sinkNodeEClass.getESuperTypes().add(this.getAbstractNode());
		computationNodeEClass.getESuperTypes().add(this.getAbstractFlatNode());
		abstractNetworkEClass.getESuperTypes().add(this.getIdentifiable());
		flatNetworkEClass.getESuperTypes().add(this.getAbstractNetwork());
		clusteredNetworkEClass.getESuperTypes().add(this.getAbstractNetwork());
		clusterEClass.getESuperTypes().add(this.getIdentifiable());
		abstractJobEClass.getESuperTypes().add(this.getIdentifiable());
		nodeLevelJobEClass.getESuperTypes().add(this.getDataProcessingJob());
		networkLevelJobEClass.getESuperTypes().add(this.getDataProcessingJob());
		senseNowJobEClass.getESuperTypes().add(this.getAbstractJob());
		sinkJobEClass.getESuperTypes().add(this.getAbstractJob());
		senseJobEClass.getESuperTypes().add(this.getAbstractJob());
		receiveMessageTriggerEClass.getESuperTypes().add(this.getAbstractRecieveTrigger());
		recieveSerialMsgTriggerEClass.getESuperTypes().add(this.getAbstractRecieveTrigger());
		startJobTriggerEClass.getESuperTypes().add(this.getAbstractStartEndingJobTrigger());
		stopJobTriggerEClass.getESuperTypes().add(this.getAbstractStartEndingJobTrigger());
		pushButtomTriggerEClass.getESuperTypes().add(this.getAbstractRecieveTrigger());
		abstractRecieveTriggerEClass.getESuperTypes().add(this.getStartJobTrigger());
		abstractRecieveTriggerEClass.getESuperTypes().add(this.getStopJobTrigger());
		abstractNodeMemoryActionEClass.getESuperTypes().add(this.getAbstratAction());
		readNodeMemoryActionEClass.getESuperTypes().add(this.getAbstractNodeMemoryAction());
		writeNodeMemoryActionEClass.getESuperTypes().add(this.getAbstractNodeMemoryAction());
		writeNodeMemoryActionEClass.getESuperTypes().add(this.getAbstractResponceAction());
		sendMessageActionEClass.getESuperTypes().add(this.getAbstractResponceAction());
		blinkActionEClass.getESuperTypes().add(this.getAbstractResponceAction());
		abstractResponceActionEClass.getESuperTypes().add(this.getAbstratAction());
		sendSerialPortMsgActionEClass.getESuperTypes().add(this.getAbstractResponceAction());
		accelerometerSensorEClass.getESuperTypes().add(this.getAbstractSensor());
		lightSensorEClass.getESuperTypes().add(this.getAbstractSensor());
		locationSensorEClass.getESuperTypes().add(this.getAbstractSensor());
		microphoneSensorEClass.getESuperTypes().add(this.getAbstractSensor());
		temperatureSensorEClass.getESuperTypes().add(this.getAbstractSensor());
		pressureSensorEClass.getESuperTypes().add(this.getAbstractSensor());
		humiditySensorEClass.getESuperTypes().add(this.getAbstractSensor());
		voltageSensorEClass.getESuperTypes().add(this.getAbstractSensor());
		dataProcessingJobEClass.getESuperTypes().add(this.getAbstractJob());
		networkLevelSpecialAlgorithmEClass.getESuperTypes().add(this.getNetworkLevelJob());
		networkDataProcessingEClass.getESuperTypes().add(this.getNetworkLevelJob());

		// Initialize classes, features, and operations; add parameters
		initEClass(seNetAppEClass, SeNetApp.class, "SeNetApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeNetApp_Jobs(), this.getAbstractJob(), null, "jobs", null, 0, -1, SeNetApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNodeEClass, AbstractNode.class, "AbstractNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractNode_Position(), theEnumsPackage.getPosition(), "position", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNode_NodeResources(), this.getAbstractSensor(), null, "nodeResources", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFlatNodeEClass, AbstractFlatNode.class, "AbstractFlatNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractClusterNodeEClass, AbstractClusterNode.class, "AbstractClusterNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorNodeEClass, SensorNode.class, "SensorNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clusterHeadNodeEClass, ClusterHeadNode.class, "ClusterHeadNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sinkNodeEClass, SinkNode.class, "SinkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(computationNodeEClass, ComputationNode.class, "ComputationNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractNetworkEClass, AbstractNetwork.class, "AbstractNetwork", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractNetwork_NbOfNodes(), ecorePackage.getEInt(), "nbOfNodes", null, 0, 1, AbstractNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractNetwork_InterNodeComm(), theEnumsPackage.getInterNodeComm(), "interNodeComm", null, 0, 1, AbstractNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractNetwork_RoutingProtocol(), theEnumsPackage.getRoutingProtocol(), "routingProtocol", null, 0, 1, AbstractNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNetwork_Resources(), this.getAbstractSensor(), null, "resources", null, 0, -1, AbstractNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNetwork_Sink(), this.getSinkNode(), null, "sink", null, 0, 1, AbstractNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flatNetworkEClass, FlatNetwork.class, "FlatNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlatNetwork_Nodes(), this.getAbstractFlatNode(), null, "nodes", null, 0, -1, FlatNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clusteredNetworkEClass, ClusteredNetwork.class, "ClusteredNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClusteredNetwork_Clusters(), this.getCluster(), null, "clusters", null, 0, -1, ClusteredNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCluster_Nodes(), this.getAbstractClusterNode(), null, "nodes", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCluster_Resources(), this.getAbstractSensor(), null, "resources", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractJobEClass, AbstractJob.class, "AbstractJob", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractJob_JobTargetNode(), this.getAbstractNode(), null, "JobTargetNode", null, 0, 1, AbstractJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractJob_JobTargetNetwork(), this.getAbstractNetwork(), null, "JobTargetNetwork", null, 0, 1, AbstractJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractJob_StartEndTrigger(), this.getAbstractStartEndingJobTrigger(), null, "startEndTrigger", null, 0, -1, AbstractJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractJob_Jobaction(), this.getAbstratAction(), null, "jobaction", null, 0, -1, AbstractJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeLevelJobEClass, NodeLevelJob.class, "NodeLevelJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeLevelJob_NodeDataProcessing(), theEnumsPackage.getAggregation(), "nodeDataProcessing", null, 0, 1, NodeLevelJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeLevelJob_SensingSamplingRate(), ecorePackage.getELong(), "sensingSamplingRate", null, 0, 1, NodeLevelJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeLevelJob_DataProcessingRate(), ecorePackage.getELong(), "dataProcessingRate", null, 0, 1, NodeLevelJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkLevelJobEClass, NetworkLevelJob.class, "NetworkLevelJob", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(senseNowJobEClass, SenseNowJob.class, "SenseNowJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sinkJobEClass, SinkJob.class, "SinkJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(senseJobEClass, SenseJob.class, "SenseJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSenseJob_SensingSamplingRate(), ecorePackage.getELong(), "sensingSamplingRate", null, 0, 1, SenseJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receiveMessageTriggerEClass, ReceiveMessageTrigger.class, "ReceiveMessageTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recieveSerialMsgTriggerEClass, RecieveSerialMsgTrigger.class, "RecieveSerialMsgTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startJobTriggerEClass, StartJobTrigger.class, "StartJobTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stopJobTriggerEClass, StopJobTrigger.class, "StopJobTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pushButtomTriggerEClass, PushButtomTrigger.class, "PushButtomTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractRecieveTriggerEClass, AbstractRecieveTrigger.class, "AbstractRecieveTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractStartEndingJobTriggerEClass, AbstractStartEndingJobTrigger.class, "AbstractStartEndingJobTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstratActionEClass, AbstratAction.class, "AbstratAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstratAction_Condition(), this.getConditionalAction(), null, "condition", null, 0, 1, AbstratAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalActionEClass, ConditionalAction.class, "ConditionalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionalAction_SensorTerm(), ecorePackage.getEString(), "sensorTerm", null, 0, 1, ConditionalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionalAction_LogicalSymbol(), theEnumsPackage.getLogicalSymbol(), "logicalSymbol", null, 0, 1, ConditionalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionalAction_Value(), ecorePackage.getELong(), "value", null, 0, 1, ConditionalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionalAction_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, ConditionalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNodeMemoryActionEClass, AbstractNodeMemoryAction.class, "AbstractNodeMemoryAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readNodeMemoryActionEClass, ReadNodeMemoryAction.class, "ReadNodeMemoryAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(writeNodeMemoryActionEClass, WriteNodeMemoryAction.class, "WriteNodeMemoryAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sendMessageActionEClass, SendMessageAction.class, "SendMessageAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSendMessageAction_SendMessageTo(), ecorePackage.getEInt(), "sendMessageTo", null, 0, 1, SendMessageAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blinkActionEClass, BlinkAction.class, "BlinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlinkAction_Led(), theEnumsPackage.getLeds(), "led", null, 0, 1, BlinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlinkAction_Status(), theEnumsPackage.getLedStatus(), "status", null, 0, 1, BlinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractResponceActionEClass, AbstractResponceAction.class, "AbstractResponceAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sendSerialPortMsgActionEClass, SendSerialPortMsgAction.class, "SendSerialPortMsgAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractSensorEClass, AbstractSensor.class, "AbstractSensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accelerometerSensorEClass, AccelerometerSensor.class, "AccelerometerSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lightSensorEClass, LightSensor.class, "LightSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationSensorEClass, LocationSensor.class, "LocationSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(microphoneSensorEClass, MicrophoneSensor.class, "MicrophoneSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temperatureSensorEClass, TemperatureSensor.class, "TemperatureSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pressureSensorEClass, PressureSensor.class, "PressureSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(humiditySensorEClass, HumiditySensor.class, "HumiditySensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(voltageSensorEClass, VoltageSensor.class, "VoltageSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataProcessingJobEClass, DataProcessingJob.class, "DataProcessingJob", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkLevelSpecialAlgorithmEClass, NetworkLevelSpecialAlgorithm.class, "NetworkLevelSpecialAlgorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkLevelSpecialAlgorithm_SpecialAlgorithmJob(), theEnumsPackage.getFusion(), "specialAlgorithmJob", null, 0, 1, NetworkLevelSpecialAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLevelSpecialAlgorithm_SensingSamplingRate(), ecorePackage.getELong(), "sensingSamplingRate", null, 0, 1, NetworkLevelSpecialAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLevelSpecialAlgorithm_AlgorithmSamplingRate(), ecorePackage.getELong(), "algorithmSamplingRate", null, 0, 1, NetworkLevelSpecialAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLevelSpecialAlgorithm_NodeIDList(), ecorePackage.getEInt(), "nodeIDList", null, 0, -1, NetworkLevelSpecialAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkDataProcessingEClass, NetworkDataProcessing.class, "NetworkDataProcessing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkDataProcessing_NetworkDataProcessing(), theEnumsPackage.getAggregation(), "networkDataProcessing", null, 0, 1, NetworkDataProcessing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkDataProcessing_SensingSamplingRate(), ecorePackage.getELong(), "sensingSamplingRate", null, 0, 1, NetworkDataProcessing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkDataProcessing_DataProcessingRate(), ecorePackage.getELong(), "dataProcessingRate", null, 0, 1, NetworkDataProcessing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkDataProcessing_NodeIDList(), ecorePackage.getEInt(), "nodeIDList", null, 0, -1, NetworkDataProcessing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SennetPackageImpl
