/**
 */
package org.wsn.sennet;

import org.wsn.sennet.enums.LedStatus;
import org.wsn.sennet.enums.Leds;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blink Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wsn.sennet.BlinkAction#getLed <em>Led</em>}</li>
 *   <li>{@link org.wsn.sennet.BlinkAction#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wsn.sennet.SennetPackage#getBlinkAction()
 * @model
 * @generated
 */
public interface BlinkAction extends AbstractResponceAction {
	/**
	 * Returns the value of the '<em><b>Led</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wsn.sennet.enums.Leds}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Led</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Led</em>' attribute.
	 * @see org.wsn.sennet.enums.Leds
	 * @see #setLed(Leds)
	 * @see org.wsn.sennet.SennetPackage#getBlinkAction_Led()
	 * @model
	 * @generated
	 */
	Leds getLed();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.BlinkAction#getLed <em>Led</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Led</em>' attribute.
	 * @see org.wsn.sennet.enums.Leds
	 * @see #getLed()
	 * @generated
	 */
	void setLed(Leds value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wsn.sennet.enums.LedStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.wsn.sennet.enums.LedStatus
	 * @see #setStatus(LedStatus)
	 * @see org.wsn.sennet.SennetPackage#getBlinkAction_Status()
	 * @model
	 * @generated
	 */
	LedStatus getStatus();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.BlinkAction#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.wsn.sennet.enums.LedStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(LedStatus value);

} // BlinkAction
