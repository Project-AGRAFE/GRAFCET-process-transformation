/**
 */
package de.hsu.grafcet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Condition Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.hsu.grafcet.GrafcetPackage#getTimeConditionType()
 * @model
 * @generated
 */
public enum TimeConditionType implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>Time Dependent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_DEPENDENT_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_DEPENDENT(1, "timeDependent", "timeDependent"),

	/**
	 * The '<em><b>Time Delayed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_DELAYED_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_DELAYED(2, "timeDelayed", "timeDelayed"),

	/**
	 * The '<em><b>Time Limited</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_LIMITED_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_LIMITED(3, "timeLimited", "timeLimited");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Time Dependent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_DEPENDENT
	 * @model name="timeDependent"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_DEPENDENT_VALUE = 1;

	/**
	 * The '<em><b>Time Delayed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_DELAYED
	 * @model name="timeDelayed"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_DELAYED_VALUE = 2;

	/**
	 * The '<em><b>Time Limited</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_LIMITED
	 * @model name="timeLimited"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_LIMITED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Time Condition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeConditionType[] VALUES_ARRAY = new TimeConditionType[] { NONE, TIME_DEPENDENT,
			TIME_DELAYED, TIME_LIMITED, };

	/**
	 * A public read-only list of all the '<em><b>Time Condition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeConditionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Condition Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeConditionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeConditionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Condition Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeConditionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeConditionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Condition Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeConditionType get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case TIME_DEPENDENT_VALUE:
			return TIME_DEPENDENT;
		case TIME_DELAYED_VALUE:
			return TIME_DELAYED;
		case TIME_LIMITED_VALUE:
			return TIME_LIMITED;
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
	private TimeConditionType(int value, String name, String literal) {
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

} //TimeConditionType
