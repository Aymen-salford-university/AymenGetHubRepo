/**
 */
package org.wsn.sennet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.wsn.sennet.NodeLevelJob;
import org.wsn.sennet.SennetPackage;

import org.wsn.sennet.enums.Aggregation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Level Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wsn.sennet.impl.NodeLevelJobImpl#getNodeDataProcessing <em>Node Data Processing</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.NodeLevelJobImpl#getSensingSamplingRate <em>Sensing Sampling Rate</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.NodeLevelJobImpl#getDataProcessingRate <em>Data Processing Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeLevelJobImpl extends DataProcessingJobImpl implements NodeLevelJob {
	/**
	 * The default value of the '{@link #getNodeDataProcessing() <em>Node Data Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeDataProcessing()
	 * @generated
	 * @ordered
	 */
	protected static final Aggregation NODE_DATA_PROCESSING_EDEFAULT = Aggregation.COMPRESSION;

	/**
	 * The cached value of the '{@link #getNodeDataProcessing() <em>Node Data Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeDataProcessing()
	 * @generated
	 * @ordered
	 */
	protected Aggregation nodeDataProcessing = NODE_DATA_PROCESSING_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeLevelJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SennetPackage.Literals.NODE_LEVEL_JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregation getNodeDataProcessing() {
		return nodeDataProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeDataProcessing(Aggregation newNodeDataProcessing) {
		Aggregation oldNodeDataProcessing = nodeDataProcessing;
		nodeDataProcessing = newNodeDataProcessing == null ? NODE_DATA_PROCESSING_EDEFAULT : newNodeDataProcessing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.NODE_LEVEL_JOB__NODE_DATA_PROCESSING, oldNodeDataProcessing, nodeDataProcessing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.NODE_LEVEL_JOB__SENSING_SAMPLING_RATE, oldSensingSamplingRate, sensingSamplingRate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.NODE_LEVEL_JOB__DATA_PROCESSING_RATE, oldDataProcessingRate, dataProcessingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SennetPackage.NODE_LEVEL_JOB__NODE_DATA_PROCESSING:
				return getNodeDataProcessing();
			case SennetPackage.NODE_LEVEL_JOB__SENSING_SAMPLING_RATE:
				return getSensingSamplingRate();
			case SennetPackage.NODE_LEVEL_JOB__DATA_PROCESSING_RATE:
				return getDataProcessingRate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SennetPackage.NODE_LEVEL_JOB__NODE_DATA_PROCESSING:
				setNodeDataProcessing((Aggregation)newValue);
				return;
			case SennetPackage.NODE_LEVEL_JOB__SENSING_SAMPLING_RATE:
				setSensingSamplingRate((Long)newValue);
				return;
			case SennetPackage.NODE_LEVEL_JOB__DATA_PROCESSING_RATE:
				setDataProcessingRate((Long)newValue);
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
			case SennetPackage.NODE_LEVEL_JOB__NODE_DATA_PROCESSING:
				setNodeDataProcessing(NODE_DATA_PROCESSING_EDEFAULT);
				return;
			case SennetPackage.NODE_LEVEL_JOB__SENSING_SAMPLING_RATE:
				setSensingSamplingRate(SENSING_SAMPLING_RATE_EDEFAULT);
				return;
			case SennetPackage.NODE_LEVEL_JOB__DATA_PROCESSING_RATE:
				setDataProcessingRate(DATA_PROCESSING_RATE_EDEFAULT);
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
			case SennetPackage.NODE_LEVEL_JOB__NODE_DATA_PROCESSING:
				return nodeDataProcessing != NODE_DATA_PROCESSING_EDEFAULT;
			case SennetPackage.NODE_LEVEL_JOB__SENSING_SAMPLING_RATE:
				return sensingSamplingRate != SENSING_SAMPLING_RATE_EDEFAULT;
			case SennetPackage.NODE_LEVEL_JOB__DATA_PROCESSING_RATE:
				return dataProcessingRate != DATA_PROCESSING_RATE_EDEFAULT;
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
		result.append(" (nodeDataProcessing: ");
		result.append(nodeDataProcessing);
		result.append(", sensingSamplingRate: ");
		result.append(sensingSamplingRate);
		result.append(", dataProcessingRate: ");
		result.append(dataProcessingRate);
		result.append(')');
		return result.toString();
	}

} //NodeLevelJobImpl
