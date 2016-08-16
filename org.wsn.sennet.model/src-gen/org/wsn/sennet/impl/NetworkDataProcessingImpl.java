/**
 */
package org.wsn.sennet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.wsn.sennet.NetworkDataProcessing;
import org.wsn.sennet.SennetPackage;

import org.wsn.sennet.enums.Aggregation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Data Processing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wsn.sennet.impl.NetworkDataProcessingImpl#getNetworkDataProcessing <em>Network Data Processing</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.NetworkDataProcessingImpl#getSensingSamplingRate <em>Sensing Sampling Rate</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.NetworkDataProcessingImpl#getDataProcessingRate <em>Data Processing Rate</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.NetworkDataProcessingImpl#getNodeIDList <em>Node ID List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkDataProcessingImpl extends NetworkLevelJobImpl implements NetworkDataProcessing {
	/**
	 * The default value of the '{@link #getNetworkDataProcessing() <em>Network Data Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkDataProcessing()
	 * @generated
	 * @ordered
	 */
	protected static final Aggregation NETWORK_DATA_PROCESSING_EDEFAULT = Aggregation.COMPRESSION;

	/**
	 * The cached value of the '{@link #getNetworkDataProcessing() <em>Network Data Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkDataProcessing()
	 * @generated
	 * @ordered
	 */
	protected Aggregation networkDataProcessing = NETWORK_DATA_PROCESSING_EDEFAULT;

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
	 * The default value of the '{@link #getDataProcessingRate() <em>Data Processing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProcessingRate()
	 * @generated
	 * @ordered
	 */
	protected static final long DATA_PROCESSING_RATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDataProcessingRate() <em>Data Processing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProcessingRate()
	 * @generated
	 * @ordered
	 */
	protected long dataProcessingRate = DATA_PROCESSING_RATE_EDEFAULT;

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
	protected NetworkDataProcessingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SennetPackage.Literals.NETWORK_DATA_PROCESSING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregation getNetworkDataProcessing() {
		return networkDataProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkDataProcessing(Aggregation newNetworkDataProcessing) {
		Aggregation oldNetworkDataProcessing = networkDataProcessing;
		networkDataProcessing = newNetworkDataProcessing == null ? NETWORK_DATA_PROCESSING_EDEFAULT : newNetworkDataProcessing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.NETWORK_DATA_PROCESSING__NETWORK_DATA_PROCESSING, oldNetworkDataProcessing, networkDataProcessing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.NETWORK_DATA_PROCESSING__SENSING_SAMPLING_RATE, oldSensingSamplingRate, sensingSamplingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDataProcessingRate() {
		return dataProcessingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataProcessingRate(long newDataProcessingRate) {
		long oldDataProcessingRate = dataProcessingRate;
		dataProcessingRate = newDataProcessingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.NETWORK_DATA_PROCESSING__DATA_PROCESSING_RATE, oldDataProcessingRate, dataProcessingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getNodeIDList() {
		if (nodeIDList == null) {
			nodeIDList = new EDataTypeUniqueEList<Integer>(Integer.class, this, SennetPackage.NETWORK_DATA_PROCESSING__NODE_ID_LIST);
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
			case SennetPackage.NETWORK_DATA_PROCESSING__NETWORK_DATA_PROCESSING:
				return getNetworkDataProcessing();
			case SennetPackage.NETWORK_DATA_PROCESSING__SENSING_SAMPLING_RATE:
				return getSensingSamplingRate();
			case SennetPackage.NETWORK_DATA_PROCESSING__DATA_PROCESSING_RATE:
				return getDataProcessingRate();
			case SennetPackage.NETWORK_DATA_PROCESSING__NODE_ID_LIST:
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
			case SennetPackage.NETWORK_DATA_PROCESSING__NETWORK_DATA_PROCESSING:
				setNetworkDataProcessing((Aggregation)newValue);
				return;
			case SennetPackage.NETWORK_DATA_PROCESSING__SENSING_SAMPLING_RATE:
				setSensingSamplingRate((Long)newValue);
				return;
			case SennetPackage.NETWORK_DATA_PROCESSING__DATA_PROCESSING_RATE:
				setDataProcessingRate((Long)newValue);
				return;
			case SennetPackage.NETWORK_DATA_PROCESSING__NODE_ID_LIST:
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
			case SennetPackage.NETWORK_DATA_PROCESSING__NETWORK_DATA_PROCESSING:
				setNetworkDataProcessing(NETWORK_DATA_PROCESSING_EDEFAULT);
				return;
			case SennetPackage.NETWORK_DATA_PROCESSING__SENSING_SAMPLING_RATE:
				setSensingSamplingRate(SENSING_SAMPLING_RATE_EDEFAULT);
				return;
			case SennetPackage.NETWORK_DATA_PROCESSING__DATA_PROCESSING_RATE:
				setDataProcessingRate(DATA_PROCESSING_RATE_EDEFAULT);
				return;
			case SennetPackage.NETWORK_DATA_PROCESSING__NODE_ID_LIST:
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
			case SennetPackage.NETWORK_DATA_PROCESSING__NETWORK_DATA_PROCESSING:
				return networkDataProcessing != NETWORK_DATA_PROCESSING_EDEFAULT;
			case SennetPackage.NETWORK_DATA_PROCESSING__SENSING_SAMPLING_RATE:
				return sensingSamplingRate != SENSING_SAMPLING_RATE_EDEFAULT;
			case SennetPackage.NETWORK_DATA_PROCESSING__DATA_PROCESSING_RATE:
				return dataProcessingRate != DATA_PROCESSING_RATE_EDEFAULT;
			case SennetPackage.NETWORK_DATA_PROCESSING__NODE_ID_LIST:
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
		result.append(" (networkDataProcessing: ");
		result.append(networkDataProcessing);
		result.append(", sensingSamplingRate: ");
		result.append(sensingSamplingRate);
		result.append(", dataProcessingRate: ");
		result.append(dataProcessingRate);
		result.append(", nodeIDList: ");
		result.append(nodeIDList);
		result.append(')');
		return result.toString();
	}

} //NetworkDataProcessingImpl
