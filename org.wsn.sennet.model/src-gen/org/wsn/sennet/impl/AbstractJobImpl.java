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

import org.wsn.sennet.AbstractJob;
import org.wsn.sennet.AbstractNetwork;
import org.wsn.sennet.AbstractNode;
import org.wsn.sennet.AbstractStartEndingJobTrigger;
import org.wsn.sennet.AbstratAction;
import org.wsn.sennet.SennetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wsn.sennet.impl.AbstractJobImpl#getJobTargetNode <em>Job Target Node</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.AbstractJobImpl#getJobTargetNetwork <em>Job Target Network</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.AbstractJobImpl#getStartEndTrigger <em>Start End Trigger</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.AbstractJobImpl#getJobaction <em>Jobaction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractJobImpl extends IdentifiableImpl implements AbstractJob {
	/**
	 * The cached value of the '{@link #getJobTargetNode() <em>Job Target Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobTargetNode()
	 * @generated
	 * @ordered
	 */
	protected AbstractNode jobTargetNode;

	/**
	 * The cached value of the '{@link #getJobTargetNetwork() <em>Job Target Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobTargetNetwork()
	 * @generated
	 * @ordered
	 */
	protected AbstractNetwork jobTargetNetwork;

	/**
	 * The cached value of the '{@link #getStartEndTrigger() <em>Start End Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartEndTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractStartEndingJobTrigger> startEndTrigger;

	/**
	 * The cached value of the '{@link #getJobaction() <em>Jobaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobaction()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstratAction> jobaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SennetPackage.Literals.ABSTRACT_JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode getJobTargetNode() {
		return jobTargetNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobTargetNode(AbstractNode newJobTargetNode, NotificationChain msgs) {
		AbstractNode oldJobTargetNode = jobTargetNode;
		jobTargetNode = newJobTargetNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SennetPackage.ABSTRACT_JOB__JOB_TARGET_NODE, oldJobTargetNode, newJobTargetNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobTargetNode(AbstractNode newJobTargetNode) {
		if (newJobTargetNode != jobTargetNode) {
			NotificationChain msgs = null;
			if (jobTargetNode != null)
				msgs = ((InternalEObject)jobTargetNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SennetPackage.ABSTRACT_JOB__JOB_TARGET_NODE, null, msgs);
			if (newJobTargetNode != null)
				msgs = ((InternalEObject)newJobTargetNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SennetPackage.ABSTRACT_JOB__JOB_TARGET_NODE, null, msgs);
			msgs = basicSetJobTargetNode(newJobTargetNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.ABSTRACT_JOB__JOB_TARGET_NODE, newJobTargetNode, newJobTargetNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNetwork getJobTargetNetwork() {
		return jobTargetNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobTargetNetwork(AbstractNetwork newJobTargetNetwork, NotificationChain msgs) {
		AbstractNetwork oldJobTargetNetwork = jobTargetNetwork;
		jobTargetNetwork = newJobTargetNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SennetPackage.ABSTRACT_JOB__JOB_TARGET_NETWORK, oldJobTargetNetwork, newJobTargetNetwork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobTargetNetwork(AbstractNetwork newJobTargetNetwork) {
		if (newJobTargetNetwork != jobTargetNetwork) {
			NotificationChain msgs = null;
			if (jobTargetNetwork != null)
				msgs = ((InternalEObject)jobTargetNetwork).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SennetPackage.ABSTRACT_JOB__JOB_TARGET_NETWORK, null, msgs);
			if (newJobTargetNetwork != null)
				msgs = ((InternalEObject)newJobTargetNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SennetPackage.ABSTRACT_JOB__JOB_TARGET_NETWORK, null, msgs);
			msgs = basicSetJobTargetNetwork(newJobTargetNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.ABSTRACT_JOB__JOB_TARGET_NETWORK, newJobTargetNetwork, newJobTargetNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractStartEndingJobTrigger> getStartEndTrigger() {
		if (startEndTrigger == null) {
			startEndTrigger = new EObjectContainmentEList<AbstractStartEndingJobTrigger>(AbstractStartEndingJobTrigger.class, this, SennetPackage.ABSTRACT_JOB__START_END_TRIGGER);
		}
		return startEndTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstratAction> getJobaction() {
		if (jobaction == null) {
			jobaction = new EObjectContainmentEList<AbstratAction>(AbstratAction.class, this, SennetPackage.ABSTRACT_JOB__JOBACTION);
		}
		return jobaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SennetPackage.ABSTRACT_JOB__JOB_TARGET_NODE:
				return basicSetJobTargetNode(null, msgs);
			case SennetPackage.ABSTRACT_JOB__JOB_TARGET_NETWORK:
				return basicSetJobTargetNetwork(null, msgs);
			case SennetPackage.ABSTRACT_JOB__START_END_TRIGGER:
				return ((InternalEList<?>)getStartEndTrigger()).basicRemove(otherEnd, msgs);
			case SennetPackage.ABSTRACT_JOB__JOBACTION:
				return ((InternalEList<?>)getJobaction()).basicRemove(otherEnd, msgs);
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
			case SennetPackage.ABSTRACT_JOB__JOB_TARGET_NODE:
				return getJobTargetNode();
			case SennetPackage.ABSTRACT_JOB__JOB_TARGET_NETWORK:
				return getJobTargetNetwork();
			case SennetPackage.ABSTRACT_JOB__START_END_TRIGGER:
				return getStartEndTrigger();
			case SennetPackage.ABSTRACT_JOB__JOBACTION:
				return getJobaction();
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
			case SennetPackage.ABSTRACT_JOB__JOB_TARGET_NODE:
				setJobTargetNode((AbstractNode)newValue);
				return;
			case SennetPackage.ABSTRACT_JOB__JOB_TARGET_NETWORK:
				setJobTargetNetwork((AbstractNetwork)newValue);
				return;
			case SennetPackage.ABSTRACT_JOB__START_END_TRIGGER:
				getStartEndTrigger().clear();
				getStartEndTrigger().addAll((Collection<? extends AbstractStartEndingJobTrigger>)newValue);
				return;
			case SennetPackage.ABSTRACT_JOB__JOBACTION:
				getJobaction().clear();
				getJobaction().addAll((Collection<? extends AbstratAction>)newValue);
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
			case SennetPackage.ABSTRACT_JOB__JOB_TARGET_NODE:
				setJobTargetNode((AbstractNode)null);
				return;
			case SennetPackage.ABSTRACT_JOB__JOB_TARGET_NETWORK:
				setJobTargetNetwork((AbstractNetwork)null);
				return;
			case SennetPackage.ABSTRACT_JOB__START_END_TRIGGER:
				getStartEndTrigger().clear();
				return;
			case SennetPackage.ABSTRACT_JOB__JOBACTION:
				getJobaction().clear();
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
			case SennetPackage.ABSTRACT_JOB__JOB_TARGET_NODE:
				return jobTargetNode != null;
			case SennetPackage.ABSTRACT_JOB__JOB_TARGET_NETWORK:
				return jobTargetNetwork != null;
			case SennetPackage.ABSTRACT_JOB__START_END_TRIGGER:
				return startEndTrigger != null && !startEndTrigger.isEmpty();
			case SennetPackage.ABSTRACT_JOB__JOBACTION:
				return jobaction != null && !jobaction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractJobImpl
