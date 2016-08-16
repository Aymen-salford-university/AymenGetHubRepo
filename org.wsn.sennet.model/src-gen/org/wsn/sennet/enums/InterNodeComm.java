/**
 */
package org.wsn.sennet.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Inter Node Comm</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.wsn.sennet.enums.EnumsPackage#getInterNodeComm()
 * @model
 * @generated
 */
public enum InterNodeComm implements Enumerator {
	/**
	 * The '<em><b>BT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BT_VALUE
	 * @generated
	 * @ordered
	 */
	BT(0, "BT", "BT"),

	/**
	 * The '<em><b>Zigbee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZIGBEE_VALUE
	 * @generated
	 * @ordered
	 */
	ZIGBEE(1, "Zigbee", "Zigbee"),

	/**
	 * The '<em><b>WLan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WLAN_VALUE
	 * @generated
	 * @ordered
	 */
	WLAN(2, "WLan", "WLan"),

	/**
	 * The '<em><b>RF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RF_VALUE
	 * @generated
	 * @ordered
	 */
	RF(3, "RF", "RF");

	/**
	 * The '<em><b>BT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BT_VALUE = 0;

	/**
	 * The '<em><b>Zigbee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Zigbee</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZIGBEE
	 * @model name="Zigbee"
	 * @generated
	 * @ordered
	 */
	public static final int ZIGBEE_VALUE = 1;

	/**
	 * The '<em><b>WLan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WLan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WLAN
	 * @model name="WLan"
	 * @generated
	 * @ordered
	 */
	public static final int WLAN_VALUE = 2;

	/**
	 * The '<em><b>RF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RF_VALUE = 3;

	/**
	 * An array of all the '<em><b>Inter Node Comm</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InterNodeComm[] VALUES_ARRAY =
		new InterNodeComm[] {
			BT,
			ZIGBEE,
			WLAN,
			RF,
		};

	/**
	 * A public read-only list of all the '<em><b>Inter Node Comm</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InterNodeComm> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Inter Node Comm</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterNodeComm get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterNodeComm result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Inter Node Comm</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterNodeComm getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterNodeComm result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Inter Node Comm</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterNodeComm get(int value) {
		switch (value) {
			case BT_VALUE: return BT;
			case ZIGBEE_VALUE: return ZIGBEE;
			case WLAN_VALUE: return WLAN;
			case RF_VALUE: return RF;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InterNodeComm(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //InterNodeComm
