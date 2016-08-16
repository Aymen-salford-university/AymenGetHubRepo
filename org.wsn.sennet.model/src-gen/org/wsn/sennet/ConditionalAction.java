/**
 */
package org.wsn.sennet;

import org.eclipse.emf.ecore.EObject;

import org.wsn.sennet.enums.LogicalSymbol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wsn.sennet.ConditionalAction#getSensorTerm <em>Sensor Term</em>}</li>
 *   <li>{@link org.wsn.sennet.ConditionalAction#getLogicalSymbol <em>Logical Symbol</em>}</li>
 *   <li>{@link org.wsn.sennet.ConditionalAction#getValue <em>Value</em>}</li>
 *   <li>{@link org.wsn.sennet.ConditionalAction#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wsn.sennet.SennetPackage#getConditionalAction()
 * @model
 * @generated
 */
public interface ConditionalAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Term</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Term</em>' attribute.
	 * @see #setSensorTerm(String)
	 * @see org.wsn.sennet.SennetPackage#getConditionalAction_SensorTerm()
	 * @model
	 * @generated
	 */
	String getSensorTerm();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.ConditionalAction#getSensorTerm <em>Sensor Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Term</em>' attribute.
	 * @see #getSensorTerm()
	 * @generated
	 */
	void setSensorTerm(String value);

	/**
	 * Returns the value of the '<em><b>Logical Symbol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wsn.sennet.enums.LogicalSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Symbol</em>' attribute.
	 * @see org.wsn.sennet.enums.LogicalSymbol
	 * @see #setLogicalSymbol(LogicalSymbol)
	 * @see org.wsn.sennet.SennetPackage#getConditionalAction_LogicalSymbol()
	 * @model
	 * @generated
	 */
	LogicalSymbol getLogicalSymbol();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.ConditionalAction#getLogicalSymbol <em>Logical Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Symbol</em>' attribute.
	 * @see org.wsn.sennet.enums.LogicalSymbol
	 * @see #getLogicalSymbol()
	 * @generated
	 */
	void setLogicalSymbol(LogicalSymbol value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see org.wsn.sennet.SennetPackage#getConditionalAction_Value()
	 * @model
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.ConditionalAction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see org.wsn.sennet.SennetPackage#getConditionalAction_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.ConditionalAction#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // ConditionalAction
