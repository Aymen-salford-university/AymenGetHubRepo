/**
 */
package org.wsn.sennet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.wsn.sennet.AbstractNetwork;
import org.wsn.sennet.AbstractSensor;
import org.wsn.sennet.SennetPackage;
import org.wsn.sennet.SinkNode;

import org.wsn.sennet.enums.InterNodeComm;
import org.wsn.sennet.enums.RoutingProtocol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wsn.sennet.impl.AbstractNetworkImpl#getNbOfNodes <em>Nb Of Nodes</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.AbstractNetworkImpl#getInterNodeComm <em>Inter Node Comm</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.AbstractNetworkImpl#getRoutingProtocol <em>Routing Protocol</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.AbstractNetworkImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.AbstractNetworkImpl#getSink <em>Sink</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractNetworkImpl extends IdentifiableImpl implements AbstractNetwork {
	/**
	 * The default value of the '{@link #getNbOfNodes() <em>Nb Of Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOfNodes()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_OF_NODES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbOfNodes() <em>Nb Of Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOfNodes()
	 * @generated
	 * @ordered
	 */
	protected int nbOfNodes = NB_OF_NODES_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterNodeComm() <em>Inter Node Comm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterNodeComm()
	 * @generated
	 * @ordered
	 */
	protected static final InterNodeComm INTER_NODE_COMM_EDEFAULT = InterNodeComm.BT;

	/**
	 * The cached value of the '{@link #getInterNodeComm() <em>Inter Node Comm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterNodeComm()
	 * @generated
	 * @ordered
	 */
	protected InterNodeComm interNodeComm = INTER_NODE_COMM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoutingProtocol() <em>Routing Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final RoutingProtocol ROUTING_PROTOCOL_EDEFAULT = RoutingProtocol.LEACH;

	/**
	 * The cached value of the '{@link #getRoutingProtocol() <em>Routing Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingProtocol()
	 * @generated
	 * @ordered
	 */
	protected RoutingProtocol routingProtocol = ROUTING_PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractSensor> resources;

	/**
	 * The cached value of the '{@link #getSink() <em>Sink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSink()
	 * @generated
	 * @ordered
	 */
	protected SinkNode sink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SennetPackage.Literals.ABSTRACT_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbOfNodes() {
		return nbOfNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbOfNodes(int newNbOfNodes) {
		int oldNbOfNodes = nbOfNodes;
		nbOfNodes = newNbOfNodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.ABSTRACT_NETWORK__NB_OF_NODES, oldNbOfNodes, nbOfNodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterNodeComm getInterNodeComm() {
		return interNodeComm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterNodeComm(InterNodeComm newInterNodeComm) {
		InterNodeComm oldInterNodeComm = interNodeComm;
		interNodeComm = newInterNodeComm == null ? INTER_NODE_COMM_EDEFAULT : newInterNodeComm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.ABSTRACT_NETWORK__INTER_NODE_COMM, oldInterNodeComm, interNodeComm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingProtocol getRoutingProtocol() {
		return routingProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutingProtocol(RoutingProtocol newRoutingProtocol) {
		RoutingProtocol oldRoutingProtocol = routingProtocol;
		routingProtocol = newRoutingProtocol == null ? ROUTING_PROTOCOL_EDEFAULT : newRoutingProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.ABSTRACT_NETWORK__ROUTING_PROTOCOL, oldRoutingProtocol, routingProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractSensor> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<AbstractSensor>(AbstractSensor.class, this, SennetPackage.ABSTRACT_NETWORK__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkNode getSink() {
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSink(SinkNode newSink, NotificationChain msgs) {
		SinkNode oldSink = sink;
		sink = newSink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SennetPackage.ABSTRACT_NETWORK__SINK, oldSink, newSink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSink(SinkNode newSink) {
		if (newSink != sink) {
			NotificationChain msgs = null;
			if (sink != null)
				msgs = ((InternalEObject)sink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SennetPackage.ABSTRACT_NETWORK__SINK, null, msgs);
			if (newSink != null)
				msgs = ((InternalEObject)newSink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SennetPackage.ABSTRACT_NETWORK__SINK, null, msgs);
			msgs = basicSetSink(newSink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.ABSTRACT_NETWORK__SINK, newSink, newSink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SennetPackage.ABSTRACT_NETWORK__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case SennetPackage.ABSTRACT_NETWORK__SINK:
				return basicSetSink(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SennetPackage.ABSTRACT_NETWORK__NB_OF_NODES:
				return getNbOfNodes();
			case SennetPackage.ABSTRACT_NETWORK__INTER_NODE_COMM:
				return getInterNodeComm();
			case SennetPackage.ABSTRACT_NETWORK__ROUTING_PROTOCOL:
				return getRoutingProtocol();
			case SennetPackage.ABSTRACT_NETWORK__RESOURCES:
				return getResources();
			case SennetPackage.ABSTRACT_NETWORK__SINK:
				return getSink();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SennetPackage.ABSTRACT_NETWORK__NB_OF_NODES:
				setNbOfNodes((Integer)newValue);
				return;
			case SennetPackage.ABSTRACT_NETWORK__INTER_NODE_COMM:
				setInterNodeComm((InterNodeComm)newValue);
				return;
			case SennetPackage.ABSTRACT_NETWORK__ROUTING_PROTOCOL:
				setRoutingProtocol((RoutingProtocol)newValue);
				return;
			case SennetPackage.ABSTRACT_NETWORK__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends AbstractSensor>)newValue);
				return;
			case SennetPackage.ABSTRACT_NETWORK__SINK:
				setSink((SinkNode)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SennetPackage.ABSTRACT_NETWORK__NB_OF_NODES:
				setNbOfNodes(NB_OF_NODES_EDEFAULT);
				return;
			case SennetPackage.ABSTRACT_NETWORK__INTER_NODE_COMM:
				setInterNodeComm(INTER_NODE_COMM_EDEFAULT);
				return;
			case SennetPackage.ABSTRACT_NETWORK__ROUTING_PROTOCOL:
				setRoutingProtocol(ROUTING_PROTOCOL_EDEFAULT);
				return;
			case SennetPackage.ABSTRACT_NETWORK__RESOURCES:
				getResources().clear();
				return;
			case SennetPackage.ABSTRACT_NETWORK__SINK:
				setSink((SinkNode)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SennetPackage.ABSTRACT_NETWORK__NB_OF_NODES:
				return nbOfNodes != NB_OF_NODES_EDEFAULT;
			case SennetPackage.ABSTRACT_NETWORK__INTER_NODE_COMM:
				return interNodeComm != INTER_NODE_COMM_EDEFAULT;
			case SennetPackage.ABSTRACT_NETWORK__ROUTING_PROTOCOL:
				return routingProtocol != ROUTING_PROTOCOL_EDEFAULT;
			case SennetPackage.ABSTRACT_NETWORK__RESOURCES:
				return resources != null && !resources.isEmpty();
			case SennetPackage.ABSTRACT_NETWORK__SINK:
				return sink != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nbOfNodes: ");
		result.append(nbOfNodes);
		result.append(", interNodeComm: ");
		result.append(interNodeComm);
		result.append(", routingProtocol: ");
		result.append(routingProtocol);
		result.append(')');
		return result.toString();
	}

} //AbstractNetworkImpl
