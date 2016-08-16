/**
 */
package org.wsn.sennet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.wsn.sennet.SennetFactory
 * @model kind="package"
 * @generated
 */
public interface SennetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sennet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.wsn.org/sennet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SennetPackage eINSTANCE = org.wsn.sennet.impl.SennetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.IdentifiableImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.NamedElementImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.SeNetAppImpl <em>Se Net App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.SeNetAppImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getSeNetApp()
	 * @generated
	 */
	int SE_NET_APP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_NET_APP__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_NET_APP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_NET_APP__JOBS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Se Net App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_NET_APP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Se Net App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_NET_APP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.AbstractNodeImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__POSITION = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__NODE_RESOURCES = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.AbstractFlatNodeImpl <em>Abstract Flat Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.AbstractFlatNodeImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractFlatNode()
	 * @generated
	 */
	int ABSTRACT_FLAT_NODE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FLAT_NODE__ID = ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FLAT_NODE__POSITION = ABSTRACT_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Node Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FLAT_NODE__NODE_RESOURCES = ABSTRACT_NODE__NODE_RESOURCES;

	/**
	 * The number of structural features of the '<em>Abstract Flat Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FLAT_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Flat Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FLAT_NODE_OPERATION_COUNT = ABSTRACT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.AbstractClusterNodeImpl <em>Abstract Cluster Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.AbstractClusterNodeImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractClusterNode()
	 * @generated
	 */
	int ABSTRACT_CLUSTER_NODE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLUSTER_NODE__ID = ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLUSTER_NODE__POSITION = ABSTRACT_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Node Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLUSTER_NODE__NODE_RESOURCES = ABSTRACT_NODE__NODE_RESOURCES;

	/**
	 * The number of structural features of the '<em>Abstract Cluster Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLUSTER_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Cluster Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLUSTER_NODE_OPERATION_COUNT = ABSTRACT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.SensorNodeImpl <em>Sensor Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.SensorNodeImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getSensorNode()
	 * @generated
	 */
	int SENSOR_NODE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE__ID = ABSTRACT_CLUSTER_NODE__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE__POSITION = ABSTRACT_CLUSTER_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Node Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE__NODE_RESOURCES = ABSTRACT_CLUSTER_NODE__NODE_RESOURCES;

	/**
	 * The number of structural features of the '<em>Sensor Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE_FEATURE_COUNT = ABSTRACT_CLUSTER_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE_OPERATION_COUNT = ABSTRACT_CLUSTER_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.ClusterHeadNodeImpl <em>Cluster Head Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.ClusterHeadNodeImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getClusterHeadNode()
	 * @generated
	 */
	int CLUSTER_HEAD_NODE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_HEAD_NODE__ID = ABSTRACT_CLUSTER_NODE__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_HEAD_NODE__POSITION = ABSTRACT_CLUSTER_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Node Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_HEAD_NODE__NODE_RESOURCES = ABSTRACT_CLUSTER_NODE__NODE_RESOURCES;

	/**
	 * The number of structural features of the '<em>Cluster Head Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_HEAD_NODE_FEATURE_COUNT = ABSTRACT_CLUSTER_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cluster Head Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_HEAD_NODE_OPERATION_COUNT = ABSTRACT_CLUSTER_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.SinkNodeImpl <em>Sink Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.SinkNodeImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getSinkNode()
	 * @generated
	 */
	int SINK_NODE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE__ID = ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE__POSITION = ABSTRACT_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Node Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE__NODE_RESOURCES = ABSTRACT_NODE__NODE_RESOURCES;

	/**
	 * The number of structural features of the '<em>Sink Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sink Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE_OPERATION_COUNT = ABSTRACT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.ComputationNodeImpl <em>Computation Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.ComputationNodeImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getComputationNode()
	 * @generated
	 */
	int COMPUTATION_NODE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_NODE__ID = ABSTRACT_FLAT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_NODE__POSITION = ABSTRACT_FLAT_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Node Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_NODE__NODE_RESOURCES = ABSTRACT_FLAT_NODE__NODE_RESOURCES;

	/**
	 * The number of structural features of the '<em>Computation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_NODE_FEATURE_COUNT = ABSTRACT_FLAT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Computation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_NODE_OPERATION_COUNT = ABSTRACT_FLAT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.AbstractNetworkImpl <em>Abstract Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.AbstractNetworkImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractNetwork()
	 * @generated
	 */
	int ABSTRACT_NETWORK = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Nb Of Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK__NB_OF_NODES = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inter Node Comm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK__INTER_NODE_COMM = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Routing Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK__ROUTING_PROTOCOL = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK__RESOURCES = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK__SINK = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Abstract Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.FlatNetworkImpl <em>Flat Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.FlatNetworkImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getFlatNetwork()
	 * @generated
	 */
	int FLAT_NETWORK = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK__ID = ABSTRACT_NETWORK__ID;

	/**
	 * The feature id for the '<em><b>Nb Of Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK__NB_OF_NODES = ABSTRACT_NETWORK__NB_OF_NODES;

	/**
	 * The feature id for the '<em><b>Inter Node Comm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK__INTER_NODE_COMM = ABSTRACT_NETWORK__INTER_NODE_COMM;

	/**
	 * The feature id for the '<em><b>Routing Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK__ROUTING_PROTOCOL = ABSTRACT_NETWORK__ROUTING_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK__RESOURCES = ABSTRACT_NETWORK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK__SINK = ABSTRACT_NETWORK__SINK;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK__NODES = ABSTRACT_NETWORK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flat Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK_FEATURE_COUNT = ABSTRACT_NETWORK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Flat Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK_OPERATION_COUNT = ABSTRACT_NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.ClusteredNetworkImpl <em>Clustered Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.ClusteredNetworkImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getClusteredNetwork()
	 * @generated
	 */
	int CLUSTERED_NETWORK = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK__ID = ABSTRACT_NETWORK__ID;

	/**
	 * The feature id for the '<em><b>Nb Of Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK__NB_OF_NODES = ABSTRACT_NETWORK__NB_OF_NODES;

	/**
	 * The feature id for the '<em><b>Inter Node Comm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK__INTER_NODE_COMM = ABSTRACT_NETWORK__INTER_NODE_COMM;

	/**
	 * The feature id for the '<em><b>Routing Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK__ROUTING_PROTOCOL = ABSTRACT_NETWORK__ROUTING_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK__RESOURCES = ABSTRACT_NETWORK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK__SINK = ABSTRACT_NETWORK__SINK;

	/**
	 * The feature id for the '<em><b>Clusters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK__CLUSTERS = ABSTRACT_NETWORK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clustered Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK_FEATURE_COUNT = ABSTRACT_NETWORK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clustered Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK_OPERATION_COUNT = ABSTRACT_NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.ClusterImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NODES = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__RESOURCES = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.AbstractJobImpl <em>Abstract Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.AbstractJobImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractJob()
	 * @generated
	 */
	int ABSTRACT_JOB = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB__JOB_TARGET_NODE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB__JOB_TARGET_NETWORK = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB__START_END_TRIGGER = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jobaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB__JOBACTION = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Abstract Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.DataProcessingJobImpl <em>Data Processing Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.DataProcessingJobImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getDataProcessingJob()
	 * @generated
	 */
	int DATA_PROCESSING_JOB = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_JOB__ID = ABSTRACT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_JOB__JOB_TARGET_NODE = ABSTRACT_JOB__JOB_TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_JOB__JOB_TARGET_NETWORK = ABSTRACT_JOB__JOB_TARGET_NETWORK;

	/**
	 * The feature id for the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_JOB__START_END_TRIGGER = ABSTRACT_JOB__START_END_TRIGGER;

	/**
	 * The feature id for the '<em><b>Jobaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_JOB__JOBACTION = ABSTRACT_JOB__JOBACTION;

	/**
	 * The number of structural features of the '<em>Data Processing Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_JOB_FEATURE_COUNT = ABSTRACT_JOB_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Processing Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_JOB_OPERATION_COUNT = ABSTRACT_JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.NodeLevelJobImpl <em>Node Level Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.NodeLevelJobImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getNodeLevelJob()
	 * @generated
	 */
	int NODE_LEVEL_JOB = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LEVEL_JOB__ID = DATA_PROCESSING_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LEVEL_JOB__JOB_TARGET_NODE = DATA_PROCESSING_JOB__JOB_TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LEVEL_JOB__JOB_TARGET_NETWORK = DATA_PROCESSING_JOB__JOB_TARGET_NETWORK;

	/**
	 * The feature id for the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LEVEL_JOB__START_END_TRIGGER = DATA_PROCESSING_JOB__START_END_TRIGGER;

	/**
	 * The feature id for the '<em><b>Jobaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LEVEL_JOB__JOBACTION = DATA_PROCESSING_JOB__JOBACTION;

	/**
	 * The feature id for the '<em><b>Node Data Processing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LEVEL_JOB__NODE_DATA_PROCESSING = DATA_PROCESSING_JOB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensing Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LEVEL_JOB__SENSING_SAMPLING_RATE = DATA_PROCESSING_JOB_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Processing Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LEVEL_JOB__DATA_PROCESSING_RATE = DATA_PROCESSING_JOB_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node Level Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LEVEL_JOB_FEATURE_COUNT = DATA_PROCESSING_JOB_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Node Level Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LEVEL_JOB_OPERATION_COUNT = DATA_PROCESSING_JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.NetworkLevelJobImpl <em>Network Level Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.NetworkLevelJobImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getNetworkLevelJob()
	 * @generated
	 */
	int NETWORK_LEVEL_JOB = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_JOB__ID = DATA_PROCESSING_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_JOB__JOB_TARGET_NODE = DATA_PROCESSING_JOB__JOB_TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_JOB__JOB_TARGET_NETWORK = DATA_PROCESSING_JOB__JOB_TARGET_NETWORK;

	/**
	 * The feature id for the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_JOB__START_END_TRIGGER = DATA_PROCESSING_JOB__START_END_TRIGGER;

	/**
	 * The feature id for the '<em><b>Jobaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_JOB__JOBACTION = DATA_PROCESSING_JOB__JOBACTION;

	/**
	 * The number of structural features of the '<em>Network Level Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_JOB_FEATURE_COUNT = DATA_PROCESSING_JOB_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Level Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_JOB_OPERATION_COUNT = DATA_PROCESSING_JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.SenseNowJobImpl <em>Sense Now Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.SenseNowJobImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getSenseNowJob()
	 * @generated
	 */
	int SENSE_NOW_JOB = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_NOW_JOB__ID = ABSTRACT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_NOW_JOB__JOB_TARGET_NODE = ABSTRACT_JOB__JOB_TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_NOW_JOB__JOB_TARGET_NETWORK = ABSTRACT_JOB__JOB_TARGET_NETWORK;

	/**
	 * The feature id for the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_NOW_JOB__START_END_TRIGGER = ABSTRACT_JOB__START_END_TRIGGER;

	/**
	 * The feature id for the '<em><b>Jobaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_NOW_JOB__JOBACTION = ABSTRACT_JOB__JOBACTION;

	/**
	 * The number of structural features of the '<em>Sense Now Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_NOW_JOB_FEATURE_COUNT = ABSTRACT_JOB_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sense Now Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_NOW_JOB_OPERATION_COUNT = ABSTRACT_JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.SinkJobImpl <em>Sink Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.SinkJobImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getSinkJob()
	 * @generated
	 */
	int SINK_JOB = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_JOB__ID = ABSTRACT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_JOB__JOB_TARGET_NODE = ABSTRACT_JOB__JOB_TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_JOB__JOB_TARGET_NETWORK = ABSTRACT_JOB__JOB_TARGET_NETWORK;

	/**
	 * The feature id for the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_JOB__START_END_TRIGGER = ABSTRACT_JOB__START_END_TRIGGER;

	/**
	 * The feature id for the '<em><b>Jobaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_JOB__JOBACTION = ABSTRACT_JOB__JOBACTION;

	/**
	 * The number of structural features of the '<em>Sink Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_JOB_FEATURE_COUNT = ABSTRACT_JOB_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sink Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_JOB_OPERATION_COUNT = ABSTRACT_JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.SenseJobImpl <em>Sense Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.SenseJobImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getSenseJob()
	 * @generated
	 */
	int SENSE_JOB = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_JOB__ID = ABSTRACT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_JOB__JOB_TARGET_NODE = ABSTRACT_JOB__JOB_TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_JOB__JOB_TARGET_NETWORK = ABSTRACT_JOB__JOB_TARGET_NETWORK;

	/**
	 * The feature id for the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_JOB__START_END_TRIGGER = ABSTRACT_JOB__START_END_TRIGGER;

	/**
	 * The feature id for the '<em><b>Jobaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_JOB__JOBACTION = ABSTRACT_JOB__JOBACTION;

	/**
	 * The feature id for the '<em><b>Sensing Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_JOB__SENSING_SAMPLING_RATE = ABSTRACT_JOB_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sense Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_JOB_FEATURE_COUNT = ABSTRACT_JOB_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sense Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_JOB_OPERATION_COUNT = ABSTRACT_JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.AbstractStartEndingJobTriggerImpl <em>Abstract Start Ending Job Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.AbstractStartEndingJobTriggerImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractStartEndingJobTrigger()
	 * @generated
	 */
	int ABSTRACT_START_ENDING_JOB_TRIGGER = 26;

	/**
	 * The number of structural features of the '<em>Abstract Start Ending Job Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_START_ENDING_JOB_TRIGGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Start Ending Job Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_START_ENDING_JOB_TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.StartJobTriggerImpl <em>Start Job Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.StartJobTriggerImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getStartJobTrigger()
	 * @generated
	 */
	int START_JOB_TRIGGER = 22;

	/**
	 * The number of structural features of the '<em>Start Job Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_JOB_TRIGGER_FEATURE_COUNT = ABSTRACT_START_ENDING_JOB_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Job Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_JOB_TRIGGER_OPERATION_COUNT = ABSTRACT_START_ENDING_JOB_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.AbstractRecieveTriggerImpl <em>Abstract Recieve Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.AbstractRecieveTriggerImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractRecieveTrigger()
	 * @generated
	 */
	int ABSTRACT_RECIEVE_TRIGGER = 25;

	/**
	 * The number of structural features of the '<em>Abstract Recieve Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RECIEVE_TRIGGER_FEATURE_COUNT = START_JOB_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Recieve Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RECIEVE_TRIGGER_OPERATION_COUNT = START_JOB_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.ReceiveMessageTriggerImpl <em>Receive Message Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.ReceiveMessageTriggerImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getReceiveMessageTrigger()
	 * @generated
	 */
	int RECEIVE_MESSAGE_TRIGGER = 20;

	/**
	 * The number of structural features of the '<em>Receive Message Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_TRIGGER_FEATURE_COUNT = ABSTRACT_RECIEVE_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Receive Message Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_TRIGGER_OPERATION_COUNT = ABSTRACT_RECIEVE_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.RecieveSerialMsgTriggerImpl <em>Recieve Serial Msg Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.RecieveSerialMsgTriggerImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getRecieveSerialMsgTrigger()
	 * @generated
	 */
	int RECIEVE_SERIAL_MSG_TRIGGER = 21;

	/**
	 * The number of structural features of the '<em>Recieve Serial Msg Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIEVE_SERIAL_MSG_TRIGGER_FEATURE_COUNT = ABSTRACT_RECIEVE_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Recieve Serial Msg Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIEVE_SERIAL_MSG_TRIGGER_OPERATION_COUNT = ABSTRACT_RECIEVE_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.StopJobTriggerImpl <em>Stop Job Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.StopJobTriggerImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getStopJobTrigger()
	 * @generated
	 */
	int STOP_JOB_TRIGGER = 23;

	/**
	 * The number of structural features of the '<em>Stop Job Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_JOB_TRIGGER_FEATURE_COUNT = ABSTRACT_START_ENDING_JOB_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stop Job Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_JOB_TRIGGER_OPERATION_COUNT = ABSTRACT_START_ENDING_JOB_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.PushButtomTriggerImpl <em>Push Buttom Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.PushButtomTriggerImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getPushButtomTrigger()
	 * @generated
	 */
	int PUSH_BUTTOM_TRIGGER = 24;

	/**
	 * The number of structural features of the '<em>Push Buttom Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTOM_TRIGGER_FEATURE_COUNT = ABSTRACT_RECIEVE_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Push Buttom Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTOM_TRIGGER_OPERATION_COUNT = ABSTRACT_RECIEVE_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.AbstratActionImpl <em>Abstrat Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.AbstratActionImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstratAction()
	 * @generated
	 */
	int ABSTRAT_ACTION = 27;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRAT_ACTION__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Abstrat Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRAT_ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstrat Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRAT_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.ConditionalActionImpl <em>Conditional Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.ConditionalActionImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getConditionalAction()
	 * @generated
	 */
	int CONDITIONAL_ACTION = 28;

	/**
	 * The feature id for the '<em><b>Sensor Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION__SENSOR_TERM = 0;

	/**
	 * The feature id for the '<em><b>Logical Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION__LOGICAL_SYMBOL = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION__UNIT = 3;

	/**
	 * The number of structural features of the '<em>Conditional Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Conditional Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.AbstractNodeMemoryActionImpl <em>Abstract Node Memory Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.AbstractNodeMemoryActionImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractNodeMemoryAction()
	 * @generated
	 */
	int ABSTRACT_NODE_MEMORY_ACTION = 29;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MEMORY_ACTION__CONDITION = ABSTRAT_ACTION__CONDITION;

	/**
	 * The number of structural features of the '<em>Abstract Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MEMORY_ACTION_FEATURE_COUNT = ABSTRAT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MEMORY_ACTION_OPERATION_COUNT = ABSTRAT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.ReadNodeMemoryActionImpl <em>Read Node Memory Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.ReadNodeMemoryActionImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getReadNodeMemoryAction()
	 * @generated
	 */
	int READ_NODE_MEMORY_ACTION = 30;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_NODE_MEMORY_ACTION__CONDITION = ABSTRACT_NODE_MEMORY_ACTION__CONDITION;

	/**
	 * The number of structural features of the '<em>Read Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_NODE_MEMORY_ACTION_FEATURE_COUNT = ABSTRACT_NODE_MEMORY_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_NODE_MEMORY_ACTION_OPERATION_COUNT = ABSTRACT_NODE_MEMORY_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.WriteNodeMemoryActionImpl <em>Write Node Memory Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.WriteNodeMemoryActionImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getWriteNodeMemoryAction()
	 * @generated
	 */
	int WRITE_NODE_MEMORY_ACTION = 31;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_NODE_MEMORY_ACTION__CONDITION = ABSTRACT_NODE_MEMORY_ACTION__CONDITION;

	/**
	 * The number of structural features of the '<em>Write Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_NODE_MEMORY_ACTION_FEATURE_COUNT = ABSTRACT_NODE_MEMORY_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Write Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_NODE_MEMORY_ACTION_OPERATION_COUNT = ABSTRACT_NODE_MEMORY_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.AbstractResponceActionImpl <em>Abstract Responce Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.AbstractResponceActionImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractResponceAction()
	 * @generated
	 */
	int ABSTRACT_RESPONCE_ACTION = 34;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESPONCE_ACTION__CONDITION = ABSTRAT_ACTION__CONDITION;

	/**
	 * The number of structural features of the '<em>Abstract Responce Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESPONCE_ACTION_FEATURE_COUNT = ABSTRAT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Responce Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESPONCE_ACTION_OPERATION_COUNT = ABSTRAT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.SendMessageActionImpl <em>Send Message Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.SendMessageActionImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getSendMessageAction()
	 * @generated
	 */
	int SEND_MESSAGE_ACTION = 32;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__CONDITION = ABSTRACT_RESPONCE_ACTION__CONDITION;

	/**
	 * The feature id for the '<em><b>Send Message To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__SEND_MESSAGE_TO = ABSTRACT_RESPONCE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send Message Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION_FEATURE_COUNT = ABSTRACT_RESPONCE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Send Message Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION_OPERATION_COUNT = ABSTRACT_RESPONCE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.BlinkActionImpl <em>Blink Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.BlinkActionImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getBlinkAction()
	 * @generated
	 */
	int BLINK_ACTION = 33;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_ACTION__CONDITION = ABSTRACT_RESPONCE_ACTION__CONDITION;

	/**
	 * The feature id for the '<em><b>Led</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_ACTION__LED = ABSTRACT_RESPONCE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_ACTION__STATUS = ABSTRACT_RESPONCE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Blink Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_ACTION_FEATURE_COUNT = ABSTRACT_RESPONCE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Blink Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_ACTION_OPERATION_COUNT = ABSTRACT_RESPONCE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.SendSerialPortMsgActionImpl <em>Send Serial Port Msg Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.SendSerialPortMsgActionImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getSendSerialPortMsgAction()
	 * @generated
	 */
	int SEND_SERIAL_PORT_MSG_ACTION = 35;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SERIAL_PORT_MSG_ACTION__CONDITION = ABSTRACT_RESPONCE_ACTION__CONDITION;

	/**
	 * The number of structural features of the '<em>Send Serial Port Msg Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SERIAL_PORT_MSG_ACTION_FEATURE_COUNT = ABSTRACT_RESPONCE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Send Serial Port Msg Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SERIAL_PORT_MSG_ACTION_OPERATION_COUNT = ABSTRACT_RESPONCE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.AbstractSensorImpl <em>Abstract Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.AbstractSensorImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractSensor()
	 * @generated
	 */
	int ABSTRACT_SENSOR = 36;

	/**
	 * The number of structural features of the '<em>Abstract Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SENSOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.AccelerometerSensorImpl <em>Accelerometer Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.AccelerometerSensorImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getAccelerometerSensor()
	 * @generated
	 */
	int ACCELEROMETER_SENSOR = 37;

	/**
	 * The number of structural features of the '<em>Accelerometer Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Accelerometer Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.LightSensorImpl <em>Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.LightSensorImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getLightSensor()
	 * @generated
	 */
	int LIGHT_SENSOR = 38;

	/**
	 * The number of structural features of the '<em>Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.LocationSensorImpl <em>Location Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.LocationSensorImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getLocationSensor()
	 * @generated
	 */
	int LOCATION_SENSOR = 39;

	/**
	 * The number of structural features of the '<em>Location Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.MicrophoneSensorImpl <em>Microphone Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.MicrophoneSensorImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getMicrophoneSensor()
	 * @generated
	 */
	int MICROPHONE_SENSOR = 40;

	/**
	 * The number of structural features of the '<em>Microphone Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Microphone Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.TemperatureSensorImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getTemperatureSensor()
	 * @generated
	 */
	int TEMPERATURE_SENSOR = 41;

	/**
	 * The number of structural features of the '<em>Temperature Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temperature Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.PressureSensorImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getPressureSensor()
	 * @generated
	 */
	int PRESSURE_SENSOR = 42;

	/**
	 * The number of structural features of the '<em>Pressure Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pressure Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.HumiditySensorImpl <em>Humidity Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.HumiditySensorImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getHumiditySensor()
	 * @generated
	 */
	int HUMIDITY_SENSOR = 43;

	/**
	 * The number of structural features of the '<em>Humidity Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Humidity Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.VoltageSensorImpl <em>Voltage Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.VoltageSensorImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getVoltageSensor()
	 * @generated
	 */
	int VOLTAGE_SENSOR = 44;

	/**
	 * The number of structural features of the '<em>Voltage Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Voltage Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.NetworkLevelSpecialAlgorithmImpl <em>Network Level Special Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.NetworkLevelSpecialAlgorithmImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getNetworkLevelSpecialAlgorithm()
	 * @generated
	 */
	int NETWORK_LEVEL_SPECIAL_ALGORITHM = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_SPECIAL_ALGORITHM__ID = NETWORK_LEVEL_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_SPECIAL_ALGORITHM__JOB_TARGET_NODE = NETWORK_LEVEL_JOB__JOB_TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_SPECIAL_ALGORITHM__JOB_TARGET_NETWORK = NETWORK_LEVEL_JOB__JOB_TARGET_NETWORK;

	/**
	 * The feature id for the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_SPECIAL_ALGORITHM__START_END_TRIGGER = NETWORK_LEVEL_JOB__START_END_TRIGGER;

	/**
	 * The feature id for the '<em><b>Jobaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_SPECIAL_ALGORITHM__JOBACTION = NETWORK_LEVEL_JOB__JOBACTION;

	/**
	 * The feature id for the '<em><b>Special Algorithm Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_SPECIAL_ALGORITHM__SPECIAL_ALGORITHM_JOB = NETWORK_LEVEL_JOB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensing Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_SPECIAL_ALGORITHM__SENSING_SAMPLING_RATE = NETWORK_LEVEL_JOB_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Algorithm Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_SPECIAL_ALGORITHM__ALGORITHM_SAMPLING_RATE = NETWORK_LEVEL_JOB_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node ID List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_SPECIAL_ALGORITHM__NODE_ID_LIST = NETWORK_LEVEL_JOB_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Network Level Special Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_SPECIAL_ALGORITHM_FEATURE_COUNT = NETWORK_LEVEL_JOB_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Network Level Special Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LEVEL_SPECIAL_ALGORITHM_OPERATION_COUNT = NETWORK_LEVEL_JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.impl.NetworkDataProcessingImpl <em>Network Data Processing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.impl.NetworkDataProcessingImpl
	 * @see org.wsn.sennet.impl.SennetPackageImpl#getNetworkDataProcessing()
	 * @generated
	 */
	int NETWORK_DATA_PROCESSING = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_PROCESSING__ID = NETWORK_LEVEL_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_PROCESSING__JOB_TARGET_NODE = NETWORK_LEVEL_JOB__JOB_TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_PROCESSING__JOB_TARGET_NETWORK = NETWORK_LEVEL_JOB__JOB_TARGET_NETWORK;

	/**
	 * The feature id for the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_PROCESSING__START_END_TRIGGER = NETWORK_LEVEL_JOB__START_END_TRIGGER;

	/**
	 * The feature id for the '<em><b>Jobaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_PROCESSING__JOBACTION = NETWORK_LEVEL_JOB__JOBACTION;

	/**
	 * The feature id for the '<em><b>Network Data Processing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_PROCESSING__NETWORK_DATA_PROCESSING = NETWORK_LEVEL_JOB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensing Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_PROCESSING__SENSING_SAMPLING_RATE = NETWORK_LEVEL_JOB_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Processing Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_PROCESSING__DATA_PROCESSING_RATE = NETWORK_LEVEL_JOB_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node ID List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_PROCESSING__NODE_ID_LIST = NETWORK_LEVEL_JOB_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Network Data Processing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_PROCESSING_FEATURE_COUNT = NETWORK_LEVEL_JOB_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Network Data Processing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DATA_PROCESSING_OPERATION_COUNT = NETWORK_LEVEL_JOB_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.SeNetApp <em>Se Net App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Se Net App</em>'.
	 * @see org.wsn.sennet.SeNetApp
	 * @generated
	 */
	EClass getSeNetApp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wsn.sennet.SeNetApp#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see org.wsn.sennet.SeNetApp#getJobs()
	 * @see #getSeNetApp()
	 * @generated
	 */
	EReference getSeNetApp_Jobs();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see org.wsn.sennet.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.Identifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.wsn.sennet.Identifiable#getId()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Id();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.wsn.sennet.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wsn.sennet.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see org.wsn.sennet.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.AbstractNode#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.wsn.sennet.AbstractNode#getPosition()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EAttribute getAbstractNode_Position();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wsn.sennet.AbstractNode#getNodeResources <em>Node Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Resources</em>'.
	 * @see org.wsn.sennet.AbstractNode#getNodeResources()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_NodeResources();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.AbstractFlatNode <em>Abstract Flat Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Flat Node</em>'.
	 * @see org.wsn.sennet.AbstractFlatNode
	 * @generated
	 */
	EClass getAbstractFlatNode();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.AbstractClusterNode <em>Abstract Cluster Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Cluster Node</em>'.
	 * @see org.wsn.sennet.AbstractClusterNode
	 * @generated
	 */
	EClass getAbstractClusterNode();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.SensorNode <em>Sensor Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Node</em>'.
	 * @see org.wsn.sennet.SensorNode
	 * @generated
	 */
	EClass getSensorNode();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.ClusterHeadNode <em>Cluster Head Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster Head Node</em>'.
	 * @see org.wsn.sennet.ClusterHeadNode
	 * @generated
	 */
	EClass getClusterHeadNode();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.SinkNode <em>Sink Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Node</em>'.
	 * @see org.wsn.sennet.SinkNode
	 * @generated
	 */
	EClass getSinkNode();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.ComputationNode <em>Computation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computation Node</em>'.
	 * @see org.wsn.sennet.ComputationNode
	 * @generated
	 */
	EClass getComputationNode();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.AbstractNetwork <em>Abstract Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Network</em>'.
	 * @see org.wsn.sennet.AbstractNetwork
	 * @generated
	 */
	EClass getAbstractNetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.AbstractNetwork#getNbOfNodes <em>Nb Of Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Of Nodes</em>'.
	 * @see org.wsn.sennet.AbstractNetwork#getNbOfNodes()
	 * @see #getAbstractNetwork()
	 * @generated
	 */
	EAttribute getAbstractNetwork_NbOfNodes();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.AbstractNetwork#getInterNodeComm <em>Inter Node Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inter Node Comm</em>'.
	 * @see org.wsn.sennet.AbstractNetwork#getInterNodeComm()
	 * @see #getAbstractNetwork()
	 * @generated
	 */
	EAttribute getAbstractNetwork_InterNodeComm();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.AbstractNetwork#getRoutingProtocol <em>Routing Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing Protocol</em>'.
	 * @see org.wsn.sennet.AbstractNetwork#getRoutingProtocol()
	 * @see #getAbstractNetwork()
	 * @generated
	 */
	EAttribute getAbstractNetwork_RoutingProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wsn.sennet.AbstractNetwork#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.wsn.sennet.AbstractNetwork#getResources()
	 * @see #getAbstractNetwork()
	 * @generated
	 */
	EReference getAbstractNetwork_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link org.wsn.sennet.AbstractNetwork#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sink</em>'.
	 * @see org.wsn.sennet.AbstractNetwork#getSink()
	 * @see #getAbstractNetwork()
	 * @generated
	 */
	EReference getAbstractNetwork_Sink();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.FlatNetwork <em>Flat Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flat Network</em>'.
	 * @see org.wsn.sennet.FlatNetwork
	 * @generated
	 */
	EClass getFlatNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wsn.sennet.FlatNetwork#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.wsn.sennet.FlatNetwork#getNodes()
	 * @see #getFlatNetwork()
	 * @generated
	 */
	EReference getFlatNetwork_Nodes();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.ClusteredNetwork <em>Clustered Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clustered Network</em>'.
	 * @see org.wsn.sennet.ClusteredNetwork
	 * @generated
	 */
	EClass getClusteredNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wsn.sennet.ClusteredNetwork#getClusters <em>Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clusters</em>'.
	 * @see org.wsn.sennet.ClusteredNetwork#getClusters()
	 * @see #getClusteredNetwork()
	 * @generated
	 */
	EReference getClusteredNetwork_Clusters();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see org.wsn.sennet.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wsn.sennet.Cluster#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.wsn.sennet.Cluster#getNodes()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Nodes();

	/**
	 * Returns the meta object for the reference list '{@link org.wsn.sennet.Cluster#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see org.wsn.sennet.Cluster#getResources()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Resources();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.AbstractJob <em>Abstract Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Job</em>'.
	 * @see org.wsn.sennet.AbstractJob
	 * @generated
	 */
	EClass getAbstractJob();

	/**
	 * Returns the meta object for the containment reference '{@link org.wsn.sennet.AbstractJob#getJobTargetNode <em>Job Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Job Target Node</em>'.
	 * @see org.wsn.sennet.AbstractJob#getJobTargetNode()
	 * @see #getAbstractJob()
	 * @generated
	 */
	EReference getAbstractJob_JobTargetNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.wsn.sennet.AbstractJob#getJobTargetNetwork <em>Job Target Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Job Target Network</em>'.
	 * @see org.wsn.sennet.AbstractJob#getJobTargetNetwork()
	 * @see #getAbstractJob()
	 * @generated
	 */
	EReference getAbstractJob_JobTargetNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wsn.sennet.AbstractJob#getStartEndTrigger <em>Start End Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Start End Trigger</em>'.
	 * @see org.wsn.sennet.AbstractJob#getStartEndTrigger()
	 * @see #getAbstractJob()
	 * @generated
	 */
	EReference getAbstractJob_StartEndTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wsn.sennet.AbstractJob#getJobaction <em>Jobaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobaction</em>'.
	 * @see org.wsn.sennet.AbstractJob#getJobaction()
	 * @see #getAbstractJob()
	 * @generated
	 */
	EReference getAbstractJob_Jobaction();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.NodeLevelJob <em>Node Level Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Level Job</em>'.
	 * @see org.wsn.sennet.NodeLevelJob
	 * @generated
	 */
	EClass getNodeLevelJob();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.NodeLevelJob#getNodeDataProcessing <em>Node Data Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Data Processing</em>'.
	 * @see org.wsn.sennet.NodeLevelJob#getNodeDataProcessing()
	 * @see #getNodeLevelJob()
	 * @generated
	 */
	EAttribute getNodeLevelJob_NodeDataProcessing();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.NodeLevelJob#getSensingSamplingRate <em>Sensing Sampling Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensing Sampling Rate</em>'.
	 * @see org.wsn.sennet.NodeLevelJob#getSensingSamplingRate()
	 * @see #getNodeLevelJob()
	 * @generated
	 */
	EAttribute getNodeLevelJob_SensingSamplingRate();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.NodeLevelJob#getDataProcessingRate <em>Data Processing Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Processing Rate</em>'.
	 * @see org.wsn.sennet.NodeLevelJob#getDataProcessingRate()
	 * @see #getNodeLevelJob()
	 * @generated
	 */
	EAttribute getNodeLevelJob_DataProcessingRate();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.NetworkLevelJob <em>Network Level Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Level Job</em>'.
	 * @see org.wsn.sennet.NetworkLevelJob
	 * @generated
	 */
	EClass getNetworkLevelJob();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.SenseNowJob <em>Sense Now Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense Now Job</em>'.
	 * @see org.wsn.sennet.SenseNowJob
	 * @generated
	 */
	EClass getSenseNowJob();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.SinkJob <em>Sink Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Job</em>'.
	 * @see org.wsn.sennet.SinkJob
	 * @generated
	 */
	EClass getSinkJob();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.SenseJob <em>Sense Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense Job</em>'.
	 * @see org.wsn.sennet.SenseJob
	 * @generated
	 */
	EClass getSenseJob();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.SenseJob#getSensingSamplingRate <em>Sensing Sampling Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensing Sampling Rate</em>'.
	 * @see org.wsn.sennet.SenseJob#getSensingSamplingRate()
	 * @see #getSenseJob()
	 * @generated
	 */
	EAttribute getSenseJob_SensingSamplingRate();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.ReceiveMessageTrigger <em>Receive Message Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Message Trigger</em>'.
	 * @see org.wsn.sennet.ReceiveMessageTrigger
	 * @generated
	 */
	EClass getReceiveMessageTrigger();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.RecieveSerialMsgTrigger <em>Recieve Serial Msg Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recieve Serial Msg Trigger</em>'.
	 * @see org.wsn.sennet.RecieveSerialMsgTrigger
	 * @generated
	 */
	EClass getRecieveSerialMsgTrigger();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.StartJobTrigger <em>Start Job Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Job Trigger</em>'.
	 * @see org.wsn.sennet.StartJobTrigger
	 * @generated
	 */
	EClass getStartJobTrigger();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.StopJobTrigger <em>Stop Job Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Job Trigger</em>'.
	 * @see org.wsn.sennet.StopJobTrigger
	 * @generated
	 */
	EClass getStopJobTrigger();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.PushButtomTrigger <em>Push Buttom Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Buttom Trigger</em>'.
	 * @see org.wsn.sennet.PushButtomTrigger
	 * @generated
	 */
	EClass getPushButtomTrigger();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.AbstractRecieveTrigger <em>Abstract Recieve Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Recieve Trigger</em>'.
	 * @see org.wsn.sennet.AbstractRecieveTrigger
	 * @generated
	 */
	EClass getAbstractRecieveTrigger();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.AbstractStartEndingJobTrigger <em>Abstract Start Ending Job Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Start Ending Job Trigger</em>'.
	 * @see org.wsn.sennet.AbstractStartEndingJobTrigger
	 * @generated
	 */
	EClass getAbstractStartEndingJobTrigger();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.AbstratAction <em>Abstrat Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstrat Action</em>'.
	 * @see org.wsn.sennet.AbstratAction
	 * @generated
	 */
	EClass getAbstratAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.wsn.sennet.AbstratAction#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.wsn.sennet.AbstratAction#getCondition()
	 * @see #getAbstratAction()
	 * @generated
	 */
	EReference getAbstratAction_Condition();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.ConditionalAction <em>Conditional Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Action</em>'.
	 * @see org.wsn.sennet.ConditionalAction
	 * @generated
	 */
	EClass getConditionalAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.ConditionalAction#getSensorTerm <em>Sensor Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Term</em>'.
	 * @see org.wsn.sennet.ConditionalAction#getSensorTerm()
	 * @see #getConditionalAction()
	 * @generated
	 */
	EAttribute getConditionalAction_SensorTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.ConditionalAction#getLogicalSymbol <em>Logical Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical Symbol</em>'.
	 * @see org.wsn.sennet.ConditionalAction#getLogicalSymbol()
	 * @see #getConditionalAction()
	 * @generated
	 */
	EAttribute getConditionalAction_LogicalSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.ConditionalAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.wsn.sennet.ConditionalAction#getValue()
	 * @see #getConditionalAction()
	 * @generated
	 */
	EAttribute getConditionalAction_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.ConditionalAction#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.wsn.sennet.ConditionalAction#getUnit()
	 * @see #getConditionalAction()
	 * @generated
	 */
	EAttribute getConditionalAction_Unit();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.AbstractNodeMemoryAction <em>Abstract Node Memory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node Memory Action</em>'.
	 * @see org.wsn.sennet.AbstractNodeMemoryAction
	 * @generated
	 */
	EClass getAbstractNodeMemoryAction();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.ReadNodeMemoryAction <em>Read Node Memory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Node Memory Action</em>'.
	 * @see org.wsn.sennet.ReadNodeMemoryAction
	 * @generated
	 */
	EClass getReadNodeMemoryAction();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.WriteNodeMemoryAction <em>Write Node Memory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Node Memory Action</em>'.
	 * @see org.wsn.sennet.WriteNodeMemoryAction
	 * @generated
	 */
	EClass getWriteNodeMemoryAction();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.SendMessageAction <em>Send Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Message Action</em>'.
	 * @see org.wsn.sennet.SendMessageAction
	 * @generated
	 */
	EClass getSendMessageAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.SendMessageAction#getSendMessageTo <em>Send Message To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send Message To</em>'.
	 * @see org.wsn.sennet.SendMessageAction#getSendMessageTo()
	 * @see #getSendMessageAction()
	 * @generated
	 */
	EAttribute getSendMessageAction_SendMessageTo();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.BlinkAction <em>Blink Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blink Action</em>'.
	 * @see org.wsn.sennet.BlinkAction
	 * @generated
	 */
	EClass getBlinkAction();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.BlinkAction#getLed <em>Led</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Led</em>'.
	 * @see org.wsn.sennet.BlinkAction#getLed()
	 * @see #getBlinkAction()
	 * @generated
	 */
	EAttribute getBlinkAction_Led();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.BlinkAction#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.wsn.sennet.BlinkAction#getStatus()
	 * @see #getBlinkAction()
	 * @generated
	 */
	EAttribute getBlinkAction_Status();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.AbstractResponceAction <em>Abstract Responce Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Responce Action</em>'.
	 * @see org.wsn.sennet.AbstractResponceAction
	 * @generated
	 */
	EClass getAbstractResponceAction();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.SendSerialPortMsgAction <em>Send Serial Port Msg Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Serial Port Msg Action</em>'.
	 * @see org.wsn.sennet.SendSerialPortMsgAction
	 * @generated
	 */
	EClass getSendSerialPortMsgAction();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.AbstractSensor <em>Abstract Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Sensor</em>'.
	 * @see org.wsn.sennet.AbstractSensor
	 * @generated
	 */
	EClass getAbstractSensor();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.AccelerometerSensor <em>Accelerometer Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accelerometer Sensor</em>'.
	 * @see org.wsn.sennet.AccelerometerSensor
	 * @generated
	 */
	EClass getAccelerometerSensor();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Sensor</em>'.
	 * @see org.wsn.sennet.LightSensor
	 * @generated
	 */
	EClass getLightSensor();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.LocationSensor <em>Location Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Sensor</em>'.
	 * @see org.wsn.sennet.LocationSensor
	 * @generated
	 */
	EClass getLocationSensor();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.MicrophoneSensor <em>Microphone Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microphone Sensor</em>'.
	 * @see org.wsn.sennet.MicrophoneSensor
	 * @generated
	 */
	EClass getMicrophoneSensor();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.TemperatureSensor <em>Temperature Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature Sensor</em>'.
	 * @see org.wsn.sennet.TemperatureSensor
	 * @generated
	 */
	EClass getTemperatureSensor();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.PressureSensor <em>Pressure Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Sensor</em>'.
	 * @see org.wsn.sennet.PressureSensor
	 * @generated
	 */
	EClass getPressureSensor();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.HumiditySensor <em>Humidity Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Humidity Sensor</em>'.
	 * @see org.wsn.sennet.HumiditySensor
	 * @generated
	 */
	EClass getHumiditySensor();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.VoltageSensor <em>Voltage Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voltage Sensor</em>'.
	 * @see org.wsn.sennet.VoltageSensor
	 * @generated
	 */
	EClass getVoltageSensor();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.DataProcessingJob <em>Data Processing Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Processing Job</em>'.
	 * @see org.wsn.sennet.DataProcessingJob
	 * @generated
	 */
	EClass getDataProcessingJob();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.NetworkLevelSpecialAlgorithm <em>Network Level Special Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Level Special Algorithm</em>'.
	 * @see org.wsn.sennet.NetworkLevelSpecialAlgorithm
	 * @generated
	 */
	EClass getNetworkLevelSpecialAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.NetworkLevelSpecialAlgorithm#getSpecialAlgorithmJob <em>Special Algorithm Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Algorithm Job</em>'.
	 * @see org.wsn.sennet.NetworkLevelSpecialAlgorithm#getSpecialAlgorithmJob()
	 * @see #getNetworkLevelSpecialAlgorithm()
	 * @generated
	 */
	EAttribute getNetworkLevelSpecialAlgorithm_SpecialAlgorithmJob();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.NetworkLevelSpecialAlgorithm#getSensingSamplingRate <em>Sensing Sampling Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensing Sampling Rate</em>'.
	 * @see org.wsn.sennet.NetworkLevelSpecialAlgorithm#getSensingSamplingRate()
	 * @see #getNetworkLevelSpecialAlgorithm()
	 * @generated
	 */
	EAttribute getNetworkLevelSpecialAlgorithm_SensingSamplingRate();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.NetworkLevelSpecialAlgorithm#getAlgorithmSamplingRate <em>Algorithm Sampling Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm Sampling Rate</em>'.
	 * @see org.wsn.sennet.NetworkLevelSpecialAlgorithm#getAlgorithmSamplingRate()
	 * @see #getNetworkLevelSpecialAlgorithm()
	 * @generated
	 */
	EAttribute getNetworkLevelSpecialAlgorithm_AlgorithmSamplingRate();

	/**
	 * Returns the meta object for the attribute list '{@link org.wsn.sennet.NetworkLevelSpecialAlgorithm#getNodeIDList <em>Node ID List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Node ID List</em>'.
	 * @see org.wsn.sennet.NetworkLevelSpecialAlgorithm#getNodeIDList()
	 * @see #getNetworkLevelSpecialAlgorithm()
	 * @generated
	 */
	EAttribute getNetworkLevelSpecialAlgorithm_NodeIDList();

	/**
	 * Returns the meta object for class '{@link org.wsn.sennet.NetworkDataProcessing <em>Network Data Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Data Processing</em>'.
	 * @see org.wsn.sennet.NetworkDataProcessing
	 * @generated
	 */
	EClass getNetworkDataProcessing();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.NetworkDataProcessing#getNetworkDataProcessing <em>Network Data Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Data Processing</em>'.
	 * @see org.wsn.sennet.NetworkDataProcessing#getNetworkDataProcessing()
	 * @see #getNetworkDataProcessing()
	 * @generated
	 */
	EAttribute getNetworkDataProcessing_NetworkDataProcessing();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.NetworkDataProcessing#getSensingSamplingRate <em>Sensing Sampling Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensing Sampling Rate</em>'.
	 * @see org.wsn.sennet.NetworkDataProcessing#getSensingSamplingRate()
	 * @see #getNetworkDataProcessing()
	 * @generated
	 */
	EAttribute getNetworkDataProcessing_SensingSamplingRate();

	/**
	 * Returns the meta object for the attribute '{@link org.wsn.sennet.NetworkDataProcessing#getDataProcessingRate <em>Data Processing Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Processing Rate</em>'.
	 * @see org.wsn.sennet.NetworkDataProcessing#getDataProcessingRate()
	 * @see #getNetworkDataProcessing()
	 * @generated
	 */
	EAttribute getNetworkDataProcessing_DataProcessingRate();

	/**
	 * Returns the meta object for the attribute list '{@link org.wsn.sennet.NetworkDataProcessing#getNodeIDList <em>Node ID List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Node ID List</em>'.
	 * @see org.wsn.sennet.NetworkDataProcessing#getNodeIDList()
	 * @see #getNetworkDataProcessing()
	 * @generated
	 */
	EAttribute getNetworkDataProcessing_NodeIDList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SennetFactory getSennetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.SeNetAppImpl <em>Se Net App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.SeNetAppImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getSeNetApp()
		 * @generated
		 */
		EClass SE_NET_APP = eINSTANCE.getSeNetApp();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE_NET_APP__JOBS = eINSTANCE.getSeNetApp_Jobs();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.IdentifiableImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_Id();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.NamedElementImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.AbstractNodeImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NODE__POSITION = eINSTANCE.getAbstractNode_Position();

		/**
		 * The meta object literal for the '<em><b>Node Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__NODE_RESOURCES = eINSTANCE.getAbstractNode_NodeResources();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.AbstractFlatNodeImpl <em>Abstract Flat Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.AbstractFlatNodeImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractFlatNode()
		 * @generated
		 */
		EClass ABSTRACT_FLAT_NODE = eINSTANCE.getAbstractFlatNode();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.AbstractClusterNodeImpl <em>Abstract Cluster Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.AbstractClusterNodeImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractClusterNode()
		 * @generated
		 */
		EClass ABSTRACT_CLUSTER_NODE = eINSTANCE.getAbstractClusterNode();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.SensorNodeImpl <em>Sensor Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.SensorNodeImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getSensorNode()
		 * @generated
		 */
		EClass SENSOR_NODE = eINSTANCE.getSensorNode();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.ClusterHeadNodeImpl <em>Cluster Head Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.ClusterHeadNodeImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getClusterHeadNode()
		 * @generated
		 */
		EClass CLUSTER_HEAD_NODE = eINSTANCE.getClusterHeadNode();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.SinkNodeImpl <em>Sink Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.SinkNodeImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getSinkNode()
		 * @generated
		 */
		EClass SINK_NODE = eINSTANCE.getSinkNode();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.ComputationNodeImpl <em>Computation Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.ComputationNodeImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getComputationNode()
		 * @generated
		 */
		EClass COMPUTATION_NODE = eINSTANCE.getComputationNode();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.AbstractNetworkImpl <em>Abstract Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.AbstractNetworkImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractNetwork()
		 * @generated
		 */
		EClass ABSTRACT_NETWORK = eINSTANCE.getAbstractNetwork();

		/**
		 * The meta object literal for the '<em><b>Nb Of Nodes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NETWORK__NB_OF_NODES = eINSTANCE.getAbstractNetwork_NbOfNodes();

		/**
		 * The meta object literal for the '<em><b>Inter Node Comm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NETWORK__INTER_NODE_COMM = eINSTANCE.getAbstractNetwork_InterNodeComm();

		/**
		 * The meta object literal for the '<em><b>Routing Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NETWORK__ROUTING_PROTOCOL = eINSTANCE.getAbstractNetwork_RoutingProtocol();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NETWORK__RESOURCES = eINSTANCE.getAbstractNetwork_Resources();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NETWORK__SINK = eINSTANCE.getAbstractNetwork_Sink();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.FlatNetworkImpl <em>Flat Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.FlatNetworkImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getFlatNetwork()
		 * @generated
		 */
		EClass FLAT_NETWORK = eINSTANCE.getFlatNetwork();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLAT_NETWORK__NODES = eINSTANCE.getFlatNetwork_Nodes();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.ClusteredNetworkImpl <em>Clustered Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.ClusteredNetworkImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getClusteredNetwork()
		 * @generated
		 */
		EClass CLUSTERED_NETWORK = eINSTANCE.getClusteredNetwork();

		/**
		 * The meta object literal for the '<em><b>Clusters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTERED_NETWORK__CLUSTERS = eINSTANCE.getClusteredNetwork_Clusters();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.ClusterImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__NODES = eINSTANCE.getCluster_Nodes();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__RESOURCES = eINSTANCE.getCluster_Resources();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.AbstractJobImpl <em>Abstract Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.AbstractJobImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractJob()
		 * @generated
		 */
		EClass ABSTRACT_JOB = eINSTANCE.getAbstractJob();

		/**
		 * The meta object literal for the '<em><b>Job Target Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_JOB__JOB_TARGET_NODE = eINSTANCE.getAbstractJob_JobTargetNode();

		/**
		 * The meta object literal for the '<em><b>Job Target Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_JOB__JOB_TARGET_NETWORK = eINSTANCE.getAbstractJob_JobTargetNetwork();

		/**
		 * The meta object literal for the '<em><b>Start End Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_JOB__START_END_TRIGGER = eINSTANCE.getAbstractJob_StartEndTrigger();

		/**
		 * The meta object literal for the '<em><b>Jobaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_JOB__JOBACTION = eINSTANCE.getAbstractJob_Jobaction();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.NodeLevelJobImpl <em>Node Level Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.NodeLevelJobImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getNodeLevelJob()
		 * @generated
		 */
		EClass NODE_LEVEL_JOB = eINSTANCE.getNodeLevelJob();

		/**
		 * The meta object literal for the '<em><b>Node Data Processing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_LEVEL_JOB__NODE_DATA_PROCESSING = eINSTANCE.getNodeLevelJob_NodeDataProcessing();

		/**
		 * The meta object literal for the '<em><b>Sensing Sampling Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_LEVEL_JOB__SENSING_SAMPLING_RATE = eINSTANCE.getNodeLevelJob_SensingSamplingRate();

		/**
		 * The meta object literal for the '<em><b>Data Processing Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_LEVEL_JOB__DATA_PROCESSING_RATE = eINSTANCE.getNodeLevelJob_DataProcessingRate();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.NetworkLevelJobImpl <em>Network Level Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.NetworkLevelJobImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getNetworkLevelJob()
		 * @generated
		 */
		EClass NETWORK_LEVEL_JOB = eINSTANCE.getNetworkLevelJob();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.SenseNowJobImpl <em>Sense Now Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.SenseNowJobImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getSenseNowJob()
		 * @generated
		 */
		EClass SENSE_NOW_JOB = eINSTANCE.getSenseNowJob();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.SinkJobImpl <em>Sink Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.SinkJobImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getSinkJob()
		 * @generated
		 */
		EClass SINK_JOB = eINSTANCE.getSinkJob();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.SenseJobImpl <em>Sense Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.SenseJobImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getSenseJob()
		 * @generated
		 */
		EClass SENSE_JOB = eINSTANCE.getSenseJob();

		/**
		 * The meta object literal for the '<em><b>Sensing Sampling Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSE_JOB__SENSING_SAMPLING_RATE = eINSTANCE.getSenseJob_SensingSamplingRate();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.ReceiveMessageTriggerImpl <em>Receive Message Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.ReceiveMessageTriggerImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getReceiveMessageTrigger()
		 * @generated
		 */
		EClass RECEIVE_MESSAGE_TRIGGER = eINSTANCE.getReceiveMessageTrigger();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.RecieveSerialMsgTriggerImpl <em>Recieve Serial Msg Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.RecieveSerialMsgTriggerImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getRecieveSerialMsgTrigger()
		 * @generated
		 */
		EClass RECIEVE_SERIAL_MSG_TRIGGER = eINSTANCE.getRecieveSerialMsgTrigger();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.StartJobTriggerImpl <em>Start Job Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.StartJobTriggerImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getStartJobTrigger()
		 * @generated
		 */
		EClass START_JOB_TRIGGER = eINSTANCE.getStartJobTrigger();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.StopJobTriggerImpl <em>Stop Job Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.StopJobTriggerImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getStopJobTrigger()
		 * @generated
		 */
		EClass STOP_JOB_TRIGGER = eINSTANCE.getStopJobTrigger();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.PushButtomTriggerImpl <em>Push Buttom Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.PushButtomTriggerImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getPushButtomTrigger()
		 * @generated
		 */
		EClass PUSH_BUTTOM_TRIGGER = eINSTANCE.getPushButtomTrigger();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.AbstractRecieveTriggerImpl <em>Abstract Recieve Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.AbstractRecieveTriggerImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractRecieveTrigger()
		 * @generated
		 */
		EClass ABSTRACT_RECIEVE_TRIGGER = eINSTANCE.getAbstractRecieveTrigger();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.AbstractStartEndingJobTriggerImpl <em>Abstract Start Ending Job Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.AbstractStartEndingJobTriggerImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractStartEndingJobTrigger()
		 * @generated
		 */
		EClass ABSTRACT_START_ENDING_JOB_TRIGGER = eINSTANCE.getAbstractStartEndingJobTrigger();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.AbstratActionImpl <em>Abstrat Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.AbstratActionImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstratAction()
		 * @generated
		 */
		EClass ABSTRAT_ACTION = eINSTANCE.getAbstratAction();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRAT_ACTION__CONDITION = eINSTANCE.getAbstratAction_Condition();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.ConditionalActionImpl <em>Conditional Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.ConditionalActionImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getConditionalAction()
		 * @generated
		 */
		EClass CONDITIONAL_ACTION = eINSTANCE.getConditionalAction();

		/**
		 * The meta object literal for the '<em><b>Sensor Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_ACTION__SENSOR_TERM = eINSTANCE.getConditionalAction_SensorTerm();

		/**
		 * The meta object literal for the '<em><b>Logical Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_ACTION__LOGICAL_SYMBOL = eINSTANCE.getConditionalAction_LogicalSymbol();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_ACTION__VALUE = eINSTANCE.getConditionalAction_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_ACTION__UNIT = eINSTANCE.getConditionalAction_Unit();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.AbstractNodeMemoryActionImpl <em>Abstract Node Memory Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.AbstractNodeMemoryActionImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractNodeMemoryAction()
		 * @generated
		 */
		EClass ABSTRACT_NODE_MEMORY_ACTION = eINSTANCE.getAbstractNodeMemoryAction();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.ReadNodeMemoryActionImpl <em>Read Node Memory Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.ReadNodeMemoryActionImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getReadNodeMemoryAction()
		 * @generated
		 */
		EClass READ_NODE_MEMORY_ACTION = eINSTANCE.getReadNodeMemoryAction();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.WriteNodeMemoryActionImpl <em>Write Node Memory Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.WriteNodeMemoryActionImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getWriteNodeMemoryAction()
		 * @generated
		 */
		EClass WRITE_NODE_MEMORY_ACTION = eINSTANCE.getWriteNodeMemoryAction();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.SendMessageActionImpl <em>Send Message Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.SendMessageActionImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getSendMessageAction()
		 * @generated
		 */
		EClass SEND_MESSAGE_ACTION = eINSTANCE.getSendMessageAction();

		/**
		 * The meta object literal for the '<em><b>Send Message To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_MESSAGE_ACTION__SEND_MESSAGE_TO = eINSTANCE.getSendMessageAction_SendMessageTo();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.BlinkActionImpl <em>Blink Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.BlinkActionImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getBlinkAction()
		 * @generated
		 */
		EClass BLINK_ACTION = eINSTANCE.getBlinkAction();

		/**
		 * The meta object literal for the '<em><b>Led</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLINK_ACTION__LED = eINSTANCE.getBlinkAction_Led();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLINK_ACTION__STATUS = eINSTANCE.getBlinkAction_Status();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.AbstractResponceActionImpl <em>Abstract Responce Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.AbstractResponceActionImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractResponceAction()
		 * @generated
		 */
		EClass ABSTRACT_RESPONCE_ACTION = eINSTANCE.getAbstractResponceAction();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.SendSerialPortMsgActionImpl <em>Send Serial Port Msg Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.SendSerialPortMsgActionImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getSendSerialPortMsgAction()
		 * @generated
		 */
		EClass SEND_SERIAL_PORT_MSG_ACTION = eINSTANCE.getSendSerialPortMsgAction();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.AbstractSensorImpl <em>Abstract Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.AbstractSensorImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getAbstractSensor()
		 * @generated
		 */
		EClass ABSTRACT_SENSOR = eINSTANCE.getAbstractSensor();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.AccelerometerSensorImpl <em>Accelerometer Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.AccelerometerSensorImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getAccelerometerSensor()
		 * @generated
		 */
		EClass ACCELEROMETER_SENSOR = eINSTANCE.getAccelerometerSensor();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.LightSensorImpl <em>Light Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.LightSensorImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getLightSensor()
		 * @generated
		 */
		EClass LIGHT_SENSOR = eINSTANCE.getLightSensor();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.LocationSensorImpl <em>Location Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.LocationSensorImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getLocationSensor()
		 * @generated
		 */
		EClass LOCATION_SENSOR = eINSTANCE.getLocationSensor();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.MicrophoneSensorImpl <em>Microphone Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.MicrophoneSensorImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getMicrophoneSensor()
		 * @generated
		 */
		EClass MICROPHONE_SENSOR = eINSTANCE.getMicrophoneSensor();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.TemperatureSensorImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getTemperatureSensor()
		 * @generated
		 */
		EClass TEMPERATURE_SENSOR = eINSTANCE.getTemperatureSensor();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.PressureSensorImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getPressureSensor()
		 * @generated
		 */
		EClass PRESSURE_SENSOR = eINSTANCE.getPressureSensor();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.HumiditySensorImpl <em>Humidity Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.HumiditySensorImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getHumiditySensor()
		 * @generated
		 */
		EClass HUMIDITY_SENSOR = eINSTANCE.getHumiditySensor();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.VoltageSensorImpl <em>Voltage Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.VoltageSensorImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getVoltageSensor()
		 * @generated
		 */
		EClass VOLTAGE_SENSOR = eINSTANCE.getVoltageSensor();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.DataProcessingJobImpl <em>Data Processing Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.DataProcessingJobImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getDataProcessingJob()
		 * @generated
		 */
		EClass DATA_PROCESSING_JOB = eINSTANCE.getDataProcessingJob();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.NetworkLevelSpecialAlgorithmImpl <em>Network Level Special Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.NetworkLevelSpecialAlgorithmImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getNetworkLevelSpecialAlgorithm()
		 * @generated
		 */
		EClass NETWORK_LEVEL_SPECIAL_ALGORITHM = eINSTANCE.getNetworkLevelSpecialAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Special Algorithm Job</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LEVEL_SPECIAL_ALGORITHM__SPECIAL_ALGORITHM_JOB = eINSTANCE.getNetworkLevelSpecialAlgorithm_SpecialAlgorithmJob();

		/**
		 * The meta object literal for the '<em><b>Sensing Sampling Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LEVEL_SPECIAL_ALGORITHM__SENSING_SAMPLING_RATE = eINSTANCE.getNetworkLevelSpecialAlgorithm_SensingSamplingRate();

		/**
		 * The meta object literal for the '<em><b>Algorithm Sampling Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LEVEL_SPECIAL_ALGORITHM__ALGORITHM_SAMPLING_RATE = eINSTANCE.getNetworkLevelSpecialAlgorithm_AlgorithmSamplingRate();

		/**
		 * The meta object literal for the '<em><b>Node ID List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LEVEL_SPECIAL_ALGORITHM__NODE_ID_LIST = eINSTANCE.getNetworkLevelSpecialAlgorithm_NodeIDList();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.impl.NetworkDataProcessingImpl <em>Network Data Processing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.impl.NetworkDataProcessingImpl
		 * @see org.wsn.sennet.impl.SennetPackageImpl#getNetworkDataProcessing()
		 * @generated
		 */
		EClass NETWORK_DATA_PROCESSING = eINSTANCE.getNetworkDataProcessing();

		/**
		 * The meta object literal for the '<em><b>Network Data Processing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_DATA_PROCESSING__NETWORK_DATA_PROCESSING = eINSTANCE.getNetworkDataProcessing_NetworkDataProcessing();

		/**
		 * The meta object literal for the '<em><b>Sensing Sampling Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_DATA_PROCESSING__SENSING_SAMPLING_RATE = eINSTANCE.getNetworkDataProcessing_SensingSamplingRate();

		/**
		 * The meta object literal for the '<em><b>Data Processing Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_DATA_PROCESSING__DATA_PROCESSING_RATE = eINSTANCE.getNetworkDataProcessing_DataProcessingRate();

		/**
		 * The meta object literal for the '<em><b>Node ID List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_DATA_PROCESSING__NODE_ID_LIST = eINSTANCE.getNetworkDataProcessing_NodeIDList();

	}

} //SennetPackage
