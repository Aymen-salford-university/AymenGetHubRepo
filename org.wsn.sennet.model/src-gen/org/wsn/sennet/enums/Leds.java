/**
 */
package org.wsn.sennet.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Leds</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.wsn.sennet.enums.EnumsPackage#getLeds()
 * @model
 * @generated
 */
public enum Leds implements Enumerator {
	/**
	 * The '<em><b>Led0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LED0_VALUE
	 * @generated
	 * @ordered
	 */
	LED0(0, "led0", "led0"),

	/**
	 * The '<em><b>Led1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LED1_VALUE
	 * @generated
	 * @ordered
	 */
	LED1(1, "led1", "led1"),

	/**
	 * The '<em><b>Led2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LED2_VALUE
	 * @generated
	 * @ordered
	 */
	LED2(2, "led2", "led2");

	/**
	 * The '<em><b>Led0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Led0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LED0
	 * @model name="led0"
	 * @generated
	 * @ordered
	 */
	public static final int LED0_VALUE = 0;

	/**
	 * The '<em><b>Led1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Led1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LED1
	 * @model name="led1"
	 * @generated
	 * @ordered
	 */
	public static final int LED1_VALUE = 1;

	/**
	 * The '<em><b>Led2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Led2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LED2
	 * @model name="led2"
	 * @generated
	 * @ordered
	 */
	public static final int LED2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Leds</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Leds[] VALUES_ARRAY =
		new Leds[] {
			LED0,
			LED1,
			LED2,
		};

	/**
	 * A public read-only list of all the '<em><b>Leds</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Leds> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Leds</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Leds get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Leds result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Leds</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Leds getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Leds result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Leds</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Leds get(int value) {
		switch (value) {
			case LED0_VALUE: return LED0;
			case LED1_VALUE: return LED1;
			case LED2_VALUE: return LED2;
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
	private Leds(int value, String name, String literal) {
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
	
} //Leds
