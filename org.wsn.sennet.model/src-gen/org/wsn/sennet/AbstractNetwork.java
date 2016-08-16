/**
 */
package org.wsn.sennet;

import org.eclipse.emf.common.util.EList;

import org.wsn.sennet.enums.InterNodeComm;
import org.wsn.sennet.enums.RoutingProtocol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wsn.sennet.AbstractNetwork#getNbOfNodes <em>Nb Of Nodes</em>}</li>
 *   <li>{@link org.wsn.sennet.AbstractNetwork#getInterNodeComm <em>Inter Node Comm</em>}</li>
 *   <li>{@link org.wsn.sennet.AbstractNetwork#getRoutingProtocol <em>Routing Protocol</em>}</li>
 *   <li>{@link org.wsn.sennet.AbstractNetwork#getResources <em>Resources</em>}</li>
 *   <li>{@link org.wsn.sennet.AbstractNetwork#getSink <em>Sink</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wsn.sennet.SennetPackage#getAbstractNetwork()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNetwork extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Nb Of Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Of Nodes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Of Nodes</em>' attribute.
	 * @see #setNbOfNodes(int)
	 * @see org.wsn.sennet.SennetPackage#getAbstractNetwork_NbOfNodes()
	 * @model
	 * @generated
	 */
	int getNbOfNodes();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.AbstractNetwork#getNbOfNodes <em>Nb Of Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Of Nodes</em>' attribute.
	 * @see #getNbOfNodes()
	 * @generated
	 */
	void setNbOfNodes(int value);

	/**
	 * Returns the value of the '<em><b>Inter Node Comm</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wsn.sennet.enums.InterNodeComm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inter Node Comm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Node Comm</em>' attribute.
	 * @see org.wsn.sennet.enums.InterNodeComm
	 * @see #setInterNodeComm(InterNodeComm)
	 * @see org.wsn.sennet.SennetPackage#getAbstractNetwork_InterNodeComm()
	 * @model
	 * @generated
	 */
	InterNodeComm getInterNodeComm();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.AbstractNetwork#getInterNodeComm <em>Inter Node Comm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inter Node Comm</em>' attribute.
	 * @see org.wsn.sennet.enums.InterNodeComm
	 * @see #getInterNodeComm()
	 * @generated
	 */
	void setInterNodeComm(InterNodeComm value);

	/**
	 * Returns the value of the '<em><b>Routing Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wsn.sennet.enums.RoutingProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Protocol</em>' attribute.
	 * @see org.wsn.sennet.enums.RoutingProtocol
	 * @see #setRoutingProtocol(RoutingProtocol)
	 * @see org.wsn.sennet.SennetPackage#getAbstractNetwork_RoutingProtocol()
	 * @model
	 * @generated
	 */
	RoutingProtocol getRoutingProtocol();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.AbstractNetwork#getRoutingProtocol <em>Routing Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Protocol</em>' attribute.
	 * @see org.wsn.sennet.enums.RoutingProtocol
	 * @see #getRoutingProtocol()
	 * @generated
	 */
	void setRoutingProtocol(RoutingProtocol value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.wsn.sennet.AbstractSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.wsn.sennet.SennetPackage#getAbstractNetwork_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractSensor> getResources();

	/**
	 * Returns the value of the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sink</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink</em>' containment reference.
	 * @see #setSink(SinkNode)
	 * @see org.wsn.sennet.SennetPackage#getAbstractNetwork_Sink()
	 * @model containment="true"
	 * @generated
	 */
	SinkNode getSink();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.AbstractNetwork#getSink <em>Sink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink</em>' containment reference.
	 * @see #getSink()
	 * @generated
	 */
	void setSink(SinkNode value);

} // AbstractNetwork
