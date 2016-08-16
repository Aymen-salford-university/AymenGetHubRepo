/**
 */
package org.wsn.sennet;

import org.eclipse.emf.common.util.EList;

import org.wsn.sennet.enums.Fusion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Level Special Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wsn.sennet.NetworkLevelSpecialAlgorithm#getSpecialAlgorithmJob <em>Special Algorithm Job</em>}</li>
 *   <li>{@link org.wsn.sennet.NetworkLevelSpecialAlgorithm#getSensingSamplingRate <em>Sensing Sampling Rate</em>}</li>
 *   <li>{@link org.wsn.sennet.NetworkLevelSpecialAlgorithm#getAlgorithmSamplingRate <em>Algorithm Sampling Rate</em>}</li>
 *   <li>{@link org.wsn.sennet.NetworkLevelSpecialAlgorithm#getNodeIDList <em>Node ID List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wsn.sennet.SennetPackage#getNetworkLevelSpecialAlgorithm()
 * @model
 * @generated
 */
public interface NetworkLevelSpecialAlgorithm extends NetworkLevelJob {
	/**
	 * Returns the value of the '<em><b>Special Algorithm Job</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wsn.sennet.enums.Fusion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Algorithm Job</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Algorithm Job</em>' attribute.
	 * @see org.wsn.sennet.enums.Fusion
	 * @see #setSpecialAlgorithmJob(Fusion)
	 * @see org.wsn.sennet.SennetPackage#getNetworkLevelSpecialAlgorithm_SpecialAlgorithmJob()
	 * @model
	 * @generated
	 */
	Fusion getSpecialAlgorithmJob();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.NetworkLevelSpecialAlgorithm#getSpecialAlgorithmJob <em>Special Algorithm Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Algorithm Job</em>' attribute.
	 * @see org.wsn.sennet.enums.Fusion
	 * @see #getSpecialAlgorithmJob()
	 * @generated
	 */
	void setSpecialAlgorithmJob(Fusion value);

	/**
	 * Returns the value of the '<em><b>Sensing Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensing Sampling Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensing Sampling Rate</em>' attribute.
	 * @see #setSensingSamplingRate(long)
	 * @see org.wsn.sennet.SennetPackage#getNetworkLevelSpecialAlgorithm_SensingSamplingRate()
	 * @model
	 * @generated
	 */
	long getSensingSamplingRate();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.NetworkLevelSpecialAlgorithm#getSensingSamplingRate <em>Sensing Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensing Sampling Rate</em>' attribute.
	 * @see #getSensingSamplingRate()
	 * @generated
	 */
	void setSensingSamplingRate(long value);

	/**
	 * Returns the value of the '<em><b>Algorithm Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm Sampling Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Sampling Rate</em>' attribute.
	 * @see #setAlgorithmSamplingRate(long)
	 * @see org.wsn.sennet.SennetPackage#getNetworkLevelSpecialAlgorithm_AlgorithmSamplingRate()
	 * @model
	 * @generated
	 */
	long getAlgorithmSamplingRate();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.NetworkLevelSpecialAlgorithm#getAlgorithmSamplingRate <em>Algorithm Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Sampling Rate</em>' attribute.
	 * @see #getAlgorithmSamplingRate()
	 * @generated
	 */
	void setAlgorithmSamplingRate(long value);

	/**
	 * Returns the value of the '<em><b>Node ID List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node ID List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node ID List</em>' attribute list.
	 * @see org.wsn.sennet.SennetPackage#getNetworkLevelSpecialAlgorithm_NodeIDList()
	 * @model
	 * @generated
	 */
	EList<Integer> getNodeIDList();

} // NetworkLevelSpecialAlgorithm
