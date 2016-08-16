/**
 */
package org.wsn.sennet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wsn.sennet.AbstractJob#getJobTargetNode <em>Job Target Node</em>}</li>
 *   <li>{@link org.wsn.sennet.AbstractJob#getJobTargetNetwork <em>Job Target Network</em>}</li>
 *   <li>{@link org.wsn.sennet.AbstractJob#getStartEndTrigger <em>Start End Trigger</em>}</li>
 *   <li>{@link org.wsn.sennet.AbstractJob#getJobaction <em>Jobaction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wsn.sennet.SennetPackage#getAbstractJob()
 * @model abstract="true"
 * @generated
 */
public interface AbstractJob extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Target Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Target Node</em>' containment reference.
	 * @see #setJobTargetNode(AbstractNode)
	 * @see org.wsn.sennet.SennetPackage#getAbstractJob_JobTargetNode()
	 * @model containment="true"
	 * @generated
	 */
	AbstractNode getJobTargetNode();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.AbstractJob#getJobTargetNode <em>Job Target Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Target Node</em>' containment reference.
	 * @see #getJobTargetNode()
	 * @generated
	 */
	void setJobTargetNode(AbstractNode value);

	/**
	 * Returns the value of the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Target Network</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Target Network</em>' containment reference.
	 * @see #setJobTargetNetwork(AbstractNetwork)
	 * @see org.wsn.sennet.SennetPackage#getAbstractJob_JobTargetNetwork()
	 * @model containment="true"
	 * @generated
	 */
	AbstractNetwork getJobTargetNetwork();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.AbstractJob#getJobTargetNetwork <em>Job Target Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Target Network</em>' containment reference.
	 * @see #getJobTargetNetwork()
	 * @generated
	 */
	void setJobTargetNetwork(AbstractNetwork value);

	/**
	 * Returns the value of the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.wsn.sennet.AbstractStartEndingJobTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start End Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start End Trigger</em>' containment reference list.
	 * @see org.wsn.sennet.SennetPackage#getAbstractJob_StartEndTrigger()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractStartEndingJobTrigger> getStartEndTrigger();

	/**
	 * Returns the value of the '<em><b>Jobaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.wsn.sennet.AbstratAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobaction</em>' containment reference list.
	 * @see org.wsn.sennet.SennetPackage#getAbstractJob_Jobaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstratAction> getJobaction();

} // AbstractJob
