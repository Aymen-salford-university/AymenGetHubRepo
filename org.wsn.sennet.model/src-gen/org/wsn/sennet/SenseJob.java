/**
 */
package org.wsn.sennet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sense Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wsn.sennet.SenseJob#getSensingSamplingRate <em>Sensing Sampling Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wsn.sennet.SennetPackage#getSenseJob()
 * @model
 * @generated
 */
public interface SenseJob extends AbstractJob {
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
	 * @see org.wsn.sennet.SennetPackage#getSenseJob_SensingSamplingRate()
	 * @model
	 * @generated
	 */
	long getSensingSamplingRate();

	/**
	 * Sets the value of the '{@link org.wsn.sennet.SenseJob#getSensingSamplingRate <em>Sensing Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensing Sampling Rate</em>' attribute.
	 * @see #getSensingSamplingRate()
	 * @generated
	 */
	void setSensingSamplingRate(long value);

} // SenseJob
