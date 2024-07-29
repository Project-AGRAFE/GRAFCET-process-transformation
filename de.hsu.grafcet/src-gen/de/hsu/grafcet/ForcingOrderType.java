/**
 */
package de.hsu.grafcet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Forcing Order Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.hsu.grafcet.GrafcetPackage#getForcingOrderType()
 * @model
 * @generated
 */
public enum ForcingOrderType implements Enumerator {
	/**
	 * The '<em><b>Current Situation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_SITUATION_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT_SITUATION(0, "currentSituation", "currentSituation"),

	/**
	 * The '<em><b>Empty Situation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPTY_SITUATION_VALUE
	 * @generated
	 * @ordered
	 */
	EMPTY_SITUATION(1, "emptySituation", "emptySituation"),

	/**
	 * The '<em><b>Initial Situation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL_SITUATION_VALUE
	 * @generated
	 * @ordered
	 */
	INITIAL_SITUATION(2, "initialSituation", "initialSituation"),

	/**
	 * The '<em><b>Explicit Situation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLICIT_SITUATION_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLICIT_SITUATION(3, "explicitSituation", "explicitSituation");

	/**
	 * The '<em><b>Current Situation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_SITUATION
	 * @model name="currentSituation"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_SITUATION_VALUE = 0;

	/**
	 * The '<em><b>Empty Situation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPTY_SITUATION
	 * @model name="emptySituation"
	 * @generated
	 * @ordered
	 */
	public static final int EMPTY_SITUATION_VALUE = 1;

	/**
	 * The '<em><b>Initial Situation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL_SITUATION
	 * @model name="initialSituation"
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_SITUATION_VALUE = 2;

	/**
	 * The '<em><b>Explicit Situation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLICIT_SITUATION
	 * @model name="explicitSituation"
	 * @generated
	 * @ordered
	 */
	public static final int EXPLICIT_SITUATION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Forcing Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ForcingOrderType[] VALUES_ARRAY = new ForcingOrderType[] { CURRENT_SITUATION, EMPTY_SITUATION,
			INITIAL_SITUATION, EXPLICIT_SITUATION, };

	/**
	 * A public read-only list of all the '<em><b>Forcing Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ForcingOrderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Forcing Order Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ForcingOrderType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ForcingOrderType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Forcing Order Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ForcingOrderType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ForcingOrderType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Forcing Order Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ForcingOrderType get(int value) {
		switch (value) {
		case CURRENT_SITUATION_VALUE:
			return CURRENT_SITUATION;
		case EMPTY_SITUATION_VALUE:
			return EMPTY_SITUATION;
		case INITIAL_SITUATION_VALUE:
			return INITIAL_SITUATION;
		case EXPLICIT_SITUATION_VALUE:
			return EXPLICIT_SITUATION;
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
	private ForcingOrderType(int value, String name, String literal) {
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

} //ForcingOrderType
