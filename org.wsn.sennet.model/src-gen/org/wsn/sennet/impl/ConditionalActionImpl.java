/**
 */
package org.wsn.sennet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.wsn.sennet.ConditionalAction;
import org.wsn.sennet.SennetPackage;

import org.wsn.sennet.enums.LogicalSymbol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wsn.sennet.impl.ConditionalActionImpl#getSensorTerm <em>Sensor Term</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.ConditionalActionImpl#getLogicalSymbol <em>Logical Symbol</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.ConditionalActionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.wsn.sennet.impl.ConditionalActionImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalActionImpl extends MinimalEObjectImpl.Container implements ConditionalAction {
	/**
	 * The default value of the '{@link #getSensorTerm() <em>Sensor Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String SENSOR_TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensorTerm() <em>Sensor Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorTerm()
	 * @generated
	 * @ordered
	 */
	protected String sensorTerm = SENSOR_TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalSymbol() <em>Logical Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalSymbol LOGICAL_SYMBOL_EDEFAULT = LogicalSymbol.EQUAL;

	/**
	 * The cached value of the '{@link #getLogicalSymbol() <em>Logical Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalSymbol()
	 * @generated
	 * @ordered
	 */
	protected LogicalSymbol logicalSymbol = LOGICAL_SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final long VALUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected long value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SennetPackage.Literals.CONDITIONAL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSensorTerm() {
		return sensorTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorTerm(String newSensorTerm) {
		String oldSensorTerm = sensorTerm;
		sensorTerm = newSensorTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.CONDITIONAL_ACTION__SENSOR_TERM, oldSensorTerm, sensorTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalSymbol getLogicalSymbol() {
		return logicalSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalSymbol(LogicalSymbol newLogicalSymbol) {
		LogicalSymbol oldLogicalSymbol = logicalSymbol;
		logicalSymbol = newLogicalSymbol == null ? LOGICAL_SYMBOL_EDEFAULT : newLogicalSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.CONDITIONAL_ACTION__LOGICAL_SYMBOL, oldLogicalSymbol, logicalSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(long newValue) {
		long oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.CONDITIONAL_ACTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SennetPackage.CONDITIONAL_ACTION__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SennetPackage.CONDITIONAL_ACTION__SENSOR_TERM:
				return getSensorTerm();
			case SennetPackage.CONDITIONAL_ACTION__LOGICAL_SYMBOL:
				return getLogicalSymbol();
			case SennetPackage.CONDITIONAL_ACTION__VALUE:
				return getValue();
			case SennetPackage.CONDITIONAL_ACTION__UNIT:
				return getUnit();
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
			case SennetPackage.CONDITIONAL_ACTION__SENSOR_TERM:
				setSensorTerm((String)newValue);
				return;
			case SennetPackage.CONDITIONAL_ACTION__LOGICAL_SYMBOL:
				setLogicalSymbol((LogicalSymbol)newValue);
				return;
			case SennetPackage.CONDITIONAL_ACTION__VALUE:
				setValue((Long)newValue);
				return;
			case SennetPackage.CONDITIONAL_ACTION__UNIT:
				setUnit((String)newValue);
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
			case SennetPackage.CONDITIONAL_ACTION__SENSOR_TERM:
				setSensorTerm(SENSOR_TERM_EDEFAULT);
				return;
			case SennetPackage.CONDITIONAL_ACTION__LOGICAL_SYMBOL:
				setLogicalSymbol(LOGICAL_SYMBOL_EDEFAULT);
				return;
			case SennetPackage.CONDITIONAL_ACTION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SennetPackage.CONDITIONAL_ACTION__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case SennetPackage.CONDITIONAL_ACTION__SENSOR_TERM:
				return SENSOR_TERM_EDEFAULT == null ? sensorTerm != null : !SENSOR_TERM_EDEFAULT.equals(sensorTerm);
			case SennetPackage.CONDITIONAL_ACTION__LOGICAL_SYMBOL:
				return logicalSymbol != LOGICAL_SYMBOL_EDEFAULT;
			case SennetPackage.CONDITIONAL_ACTION__VALUE:
				return value != VALUE_EDEFAULT;
			case SennetPackage.CONDITIONAL_ACTION__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
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
		result.append(" (sensorTerm: ");
		result.append(sensorTerm);
		result.append(", logicalSymbol: ");
		result.append(logicalSymbol);
		result.append(", value: ");
		result.append(value);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //ConditionalActionImpl
