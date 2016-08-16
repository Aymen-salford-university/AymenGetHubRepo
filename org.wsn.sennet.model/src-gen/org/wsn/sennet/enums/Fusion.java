/**
 */
package org.wsn.sennet.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fusion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.wsn.sennet.enums.EnumsPackage#getFusion()
 * @model
 * @generated
 */
public enum Fusion implements Enumerator {
	/**
	 * The '<em><b>Classification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CLASSIFICATION(0, "classification", "classification"),

	/**
	 * The '<em><b>Event detection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_DETECTION_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_DETECTION(1, "event_detection", "event_detection"),

	/**
	 * The '<em><b>Tracking</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRACKING_VALUE
	 * @generated
	 * @ordered
	 */
	TRACKING(2, "tracking", "tracking"),

	/**
	 * The '<em><b>Decision making</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISION_MAKING_VALUE
	 * @generated
	 * @ordered
	 */
	DECISION_MAKING(3, "decision_making", "decision_making");

	/**
	 * The '<em><b>Classification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Classification</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASSIFICATION
	 * @model name="classification"
	 * @generated
	 * @ordered
	 */
	public static final int CLASSIFICATION_VALUE = 0;

	/**
	 * The '<em><b>Event detection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event detection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_DETECTION
	 * @model name="event_detection"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_DETECTION_VALUE = 1;

	/**
	 * The '<em><b>Tracking</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tracking</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRACKING
	 * @model name="tracking"
	 * @generated
	 * @ordered
	 */
	public static final int TRACKING_VALUE = 2;

	/**
	 * The '<em><b>Decision making</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Decision making</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECISION_MAKING
	 * @model name="decision_making"
	 * @generated
	 * @ordered
	 */
	public static final int DECISION_MAKING_VALUE = 3;

	/**
	 * An array of all the '<em><b>Fusion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Fusion[] VALUES_ARRAY =
		new Fusion[] {
			CLASSIFICATION,
			EVENT_DETECTION,
			TRACKING,
			DECISION_MAKING,
		};

	/**
	 * A public read-only list of all the '<em><b>Fusion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Fusion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fusion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Fusion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Fusion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fusion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Fusion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Fusion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fusion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Fusion get(int value) {
		switch (value) {
			case CLASSIFICATION_VALUE: return CLASSIFICATION;
			case EVENT_DETECTION_VALUE: return EVENT_DETECTION;
			case TRACKING_VALUE: return TRACKING;
			case DECISION_MAKING_VALUE: return DECISION_MAKING;
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
	private Fusion(int value, String name, String literal) {
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
	
} //Fusion
