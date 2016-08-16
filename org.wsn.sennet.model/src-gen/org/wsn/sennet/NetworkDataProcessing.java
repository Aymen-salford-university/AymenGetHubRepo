/**
 */
package org.wsn.sennet;

import org.eclipse.emf.common.util.EList;

import org.wsn.sennet.enums.Aggregation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Data Processing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wsn.sennet.NetworkDataProcessing#getNetworkDataProcessing <em>Network Data Processing</em>}</li>
 *   <li>{@link org.wsn.sennet.NetworkDataProcessing#getSensingSamplingRate <em>Sensing Sampling Rate</em>}</li>
 *   <li>{@link org.wsn.sennet.NetworkDataProcessing#getDataProcessingRate <em>Data Processing Rate</em>}</li>
 *   <li>{@link org.wsn.sennet.NetworkDataProcessing#getNodeIDList <em>Node ID List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wsn.sennet.SennetPackage#getNetworkDataProcessing()
 * @model
 * @generated
 */
public interface NetworkDataProcessing extends NetworkLevelJob {
	/**
	 * Returns the value of the '<em><b>Network Data Processing</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wsn.sennet.enums.Aggregation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Data Processing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Data Processing</em>' attribute.
	 * @see org.wsn.sennet.enums.Aggregation
	 * @see #setNetworkDataProcessing(Aggregation)
	 * @see org.wsn.sennet.SennetPackage#getNetworkDataProcessing_NetworkDataProcessing()
	 * @model
	 * @generated
	 */
	Aggregation getNetworkDataProcessing();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.NetworkDataProcessing#getNetworkDataProcessing <em>Network Data Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Data Processing</em>' attribute.
	 * @see org.wsn.sennet.enums.Aggregation
	 * @see #getNetworkDataProcessing()
	 * @generated
	 */
	void setNetworkDataProcessing(Aggregation value);

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
	 * @see org.wsn.sennet.SennetPackage#getNetworkDataProcessing_SensingSamplingRate()
	 * @model
	 * @generated
	 */
	long getSensingSamplingRate();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.NetworkDataProcessing#getSensingSamplingRate <em>Sensing Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensing Sampling Rate</em>' attribute.
	 * @see #getSensingSamplingRate()
	 * @generated
	 */
	void setSensingSamplingRate(long value);

	/**
	 * Returns the value of the '<em><b>Data Processing Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Processing Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Processing Rate</em>' attribute.
	 * @see #setDataProcessingRate(long)
	 * @see org.wsn.sennet.SennetPackage#getNetworkDataProcessing_DataProcessingRate()
	 * @model
	 * @generated
	 */
	long getDataProcessingRate();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.NetworkDataProcessing#getDataProcessingRate <em>Data Processing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Processing Rate</em>' attribute.
	 * @see #getDataProcessingRate()
	 * @generated
	 */
	void setDataProcessingRate(long value);

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
	 * @see org.wsn.sennet.SennetPackage#getNetworkDataProcessing_NodeIDList()
	 * @model
	 * @generated
	 */
	EList<Integer> getNodeIDList();

} // NetworkDataProcessing
