/**
 */
package org.wsn.sennet;

import org.eclipse.emf.common.util.EList;

import org.wsn.sennet.enums.Position;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wsn.sennet.AbstractNode#getPosition <em>Position</em>}</li>
 *   <li>{@link org.wsn.sennet.AbstractNode#getNodeResources <em>Node Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wsn.sennet.SennetPackage#getAbstractNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNode extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wsn.sennet.enums.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see org.wsn.sennet.enums.Position
	 * @see #setPosition(Position)
	 * @see org.wsn.sennet.SennetPackage#getAbstractNode_Position()
	 * @model
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.AbstractNode#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see org.wsn.sennet.enums.Position
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Node Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.wsn.sennet.AbstractSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Resources</em>' containment reference list.
	 * @see org.wsn.sennet.SennetPackage#getAbstractNode_NodeResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractSensor> getNodeResources();

} // AbstractNode
