/**
 */
package org.wsn.sennet;

import org.wsn.sennet.enums.Aggregation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Level Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wsn.sennet.NodeLevelJob#getNodeDataProcessing <em>Node Data Processing</em>}</li>
 *   <li>{@link org.wsn.sennet.NodeLevelJob#getSensingSamplingRate <em>Sensing Sampling Rate</em>}</li>
 *   <li>{@link org.wsn.sennet.NodeLevelJob#getDataProcessingRate <em>Data Processing Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wsn.sennet.SennetPackage#getNodeLevelJob()
 * @model
 * @generated
 */
public interface NodeLevelJob extends DataProcessingJob {
	/**
	 * Returns the value of the '<em><b>Node Data Processing</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wsn.sennet.enums.Aggregation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Data Processing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Data Processing</em>' attribute.
	 * @see org.wsn.sennet.enums.Aggregation
	 * @see #setNodeDataProcessing(Aggregation)
	 * @see org.wsn.sennet.SennetPackage#getNodeLevelJob_NodeDataProcessing()
	 * @model
	 * @generated
	 */
	Aggregation getNodeDataProcessing();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.NodeLevelJob#getNodeDataProcessing <em>Node Data Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Data Processing</em>' attribute.
	 * @see org.wsn.sennet.enums.Aggregation
	 * @see #getNodeDataProcessing()
	 * @generated
	 */
	void setNodeDataProcessing(Aggregation value);

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
	 * @see org.wsn.sennet.SennetPackage#getNodeLevelJob_SensingSamplingRate()
	 * @model
	 * @generated
	 */
	long getSensingSamplingRate();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.NodeLevelJob#getSensingSamplingRate <em>Sensing Sampling Rate</em>}' attribute.
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
	 * @see org.wsn.sennet.SennetPackage#getNodeLevelJob_DataProcessingRate()
	 * @model
	 * @generated
	 */
	long getDataProcessingRate();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.NodeLevelJob#getDataProcessingRate <em>Data Processing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Processing Rate</em>' attribute.
	 * @see #getDataProcessingRate()
	 * @generated
	 */
	void setDataProcessingRate(long value);

} // NodeLevelJob
