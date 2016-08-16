/**
 */
package org.wsn.sennet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.wsn.sennet.SennetPackage;
import org.wsn.sennet.SenseJob;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sense Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wsn.sennet.impl.SenseJobImpl#getSensingSamplingRate <em>Sensing Sampling Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SenseJobImpl extends AbstractJobImpl implements SenseJob {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SenseJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SennetPackage.Literals.SENSE_JOB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.SENSE_JOB__SENSING_SAMPLING_RATE, oldSensingSamplingRate, sensingSamplingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SennetPackage.SENSE_JOB__SENSING_SAMPLING_RATE:
				return getSensingSamplingRate();
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
			case SennetPackage.SENSE_JOB__SENSING_SAMPLING_RATE:
				setSensingSamplingRate((Long)newValue);
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
			case SennetPackage.SENSE_JOB__SENSING_SAMPLING_RATE:
				setSensingSamplingRate(SENSING_SAMPLING_RATE_EDEFAULT);
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
			case SennetPackage.SENSE_JOB__SENSING_SAMPLING_RATE:
				return sensingSamplingRate != SENSING_SAMPLING_RATE_EDEFAULT;
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
		result.append(" (sensingSamplingRate: ");
		result.append(sensingSamplingRate);
		result.append(')');
		return result.toString();
	}

} //SenseJobImpl
