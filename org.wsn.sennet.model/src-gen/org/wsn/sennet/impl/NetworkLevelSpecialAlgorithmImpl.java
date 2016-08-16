/**
 */
package org.wsn.sennet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.wsn.sennet.NetworkLevelSpecialAlgorithm;
import org.wsn.sennet.SennetPackage;

import org.wsn.sennet.enums.Fusion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Level Special Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wsn.sennet.impl.NetworkLevelSpecialAlgorithmImpl#getSpecialAlgorithmJob <em>Special Algorithm Job</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.NetworkLevelSpecialAlgorithmImpl#getSensingSamplingRate <em>Sensing Sampling Rate</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.NetworkLevelSpecialAlgorithmImpl#getAlgorithmSamplingRate <em>Algorithm Sampling Rate</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.NetworkLevelSpecialAlgorithmImpl#getNodeIDList <em>Node ID List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkLevelSpecialAlgorithmImpl extends NetworkLevelJobImpl implements NetworkLevelSpecialAlgorithm {
	/**
	 * The default value of the '{@link #getSpecialAlgorithmJob() <em>Special Algorithm Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialAlgorithmJob()
	 * @generated
	 * @ordered
	 */
	protected static final Fusion SPECIAL_ALGORITHM_JOB_EDEFAULT = Fusion.CLASSIFICATION;

	/**
	 * The cached value of the '{@link #getSpecialAlgorithmJob() <em>Special Algorithm Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialAlgorithmJob()
	 * @generated
	 * @ordered
	 */
	protected Fusion specialAlgorithmJob = SPECIAL_ALGORITHM_JOB_EDEFAULT;

	/**
	 * The default value of the '{@link #getSensingSamplingRate() <em>Sensing Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensingSamplingRate()
	 * @generated
	 * @ordered
	 */
	protected static final long SENSING_SAMPLING_RATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSensingSamplingRate() <em>Sensing Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensingSamplingRate()
	 * @generated
	 * @ordered
	 */
	protected long sensingSamplingRate = SENSING_SAMPLING_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithmSamplingRate() <em>Algorithm Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmSamplingRate()
	 * @generated
	 * @ordered
	 */
	protected static final long ALGORITHM_SAMPLING_RATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAlgorithmSamplingRate() <em>Algorithm Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmSamplingRate()
	 * @generated
	 * @ordered
	 */
	protected long algorithmSamplingRate = ALGORITHM_SAMPLING_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodeIDList() <em>Node ID List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeIDList()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> nodeIDList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkLevelSpecialAlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SennetPackage.Literals.NETWORK_LEVEL_SPECIAL_ALGORITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fusion getSpecialAlgorithmJob() {
		return specialAlgorithmJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialAlgorithmJob(Fusion newSpecialAlgorithmJob) {
		Fusion oldSpecialAlgorithmJob = specialAlgorithmJob;
		specialAlgorithmJob = newSpecialAlgorithmJob == null ? SPECIAL_ALGORITHM_JOB_EDEFAULT : newSpecialAlgorithmJob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__SPECIAL_ALGORITHM_JOB, oldSpecialAlgorithmJob, specialAlgorithmJob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSensingSamplingRate() {
		return sensingSamplingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensingSamplingRate(long newSensingSamplingRate) {
		long oldSensingSamplingRate = sensingSamplingRate;
		sensingSamplingRate = newSensingSamplingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__SENSING_SAMPLING_RATE, oldSensingSamplingRate, sensingSamplingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAlgorithmSamplingRate() {
		return algorithmSamplingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmSamplingRate(long newAlgorithmSamplingRate) {
		long oldAlgorithmSamplingRate = algorithmSamplingRate;
		algorithmSamplingRate = newAlgorithmSamplingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__ALGORITHM_SAMPLING_RATE, oldAlgorithmSamplingRate, algorithmSamplingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getNodeIDList() {
		if (nodeIDList == null) {
			nodeIDList = new EDataTypeUniqueEList<Integer>(Integer.class, this, SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__NODE_ID_LIST);
		}
		return nodeIDList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__SPECIAL_ALGORITHM_JOB:
				return getSpecialAlgorithmJob();
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__SENSING_SAMPLING_RATE:
				return getSensingSamplingRate();
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__ALGORITHM_SAMPLING_RATE:
				return getAlgorithmSamplingRate();
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__NODE_ID_LIST:
				return getNodeIDList();
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
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__SPECIAL_ALGORITHM_JOB:
				setSpecialAlgorithmJob((Fusion)newValue);
				return;
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__SENSING_SAMPLING_RATE:
				setSensingSamplingRate((Long)newValue);
				return;
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__ALGORITHM_SAMPLING_RATE:
				setAlgorithmSamplingRate((Long)newValue);
				return;
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__NODE_ID_LIST:
				getNodeIDList().clear();
				getNodeIDList().addAll((Collection<? extends Integer>)newValue);
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
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__SPECIAL_ALGORITHM_JOB:
				setSpecialAlgorithmJob(SPECIAL_ALGORITHM_JOB_EDEFAULT);
				return;
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__SENSING_SAMPLING_RATE:
				setSensingSamplingRate(SENSING_SAMPLING_RATE_EDEFAULT);
				return;
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__ALGORITHM_SAMPLING_RATE:
				setAlgorithmSamplingRate(ALGORITHM_SAMPLING_RATE_EDEFAULT);
				return;
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__NODE_ID_LIST:
				getNodeIDList().clear();
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
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__SPECIAL_ALGORITHM_JOB:
				return specialAlgorithmJob != SPECIAL_ALGORITHM_JOB_EDEFAULT;
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__SENSING_SAMPLING_RATE:
				return sensingSamplingRate != SENSING_SAMPLING_RATE_EDEFAULT;
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__ALGORITHM_SAMPLING_RATE:
				return algorithmSamplingRate != ALGORITHM_SAMPLING_RATE_EDEFAULT;
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__NODE_ID_LIST:
				return nodeIDList != null && !nodeIDList.isEmpty();
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
		result.append(" (specialAlgorithmJob: ");
		result.append(specialAlgorithmJob);
		result.append(", sensingSamplingRate: ");
		result.append(sensingSamplingRate);
		result.append(", algorithmSamplingRate: ");
		result.append(algorithmSamplingRate);
		result.append(", nodeIDList: ");
		result.append(nodeIDList);
		result.append(')');
		return result.toString();
	}

} //NetworkLevelSpecialAlgorithmImpl
