/**
 */
package org.wsn.sennet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flat Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wsn.sennet.FlatNetwork#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wsn.sennet.SennetPackage#getFlatNetwork()
 * @model
 * @generated
 */
public interface FlatNetwork extends AbstractNetwork {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.wsn.sennet.AbstractFlatNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.wsn.sennet.SennetPackage#getFlatNetwork_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractFlatNode> getNodes();

} // FlatNetwork
