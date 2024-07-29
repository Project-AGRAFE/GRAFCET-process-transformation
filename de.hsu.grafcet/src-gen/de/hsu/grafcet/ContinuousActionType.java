/**
 */
package de.hsu.grafcet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Continuous Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.hsu.grafcet.GrafcetPackage#getContinuousActionType()
 * @model
 * @generated
 */
public enum ContinuousActionType implements Enumerator {
	/**
	 * The '<em><b>Continuous Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUOUS_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUOUS_ACTION(0, "continuousAction", "continuousAction"),

	/**
	 * The '<em><b>Assignation Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNATION_CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNATION_CONDITION(1, "assignationCondition", "assignationCondition");

	/**
	 * The '<em><b>Continuous Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUOUS_ACTION
	 * @model name="continuousAction"
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUOUS_ACTION_VALUE = 0;

	/**
	 * The '<em><b>Assignation Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNATION_CONDITION
	 * @model name="assignationCondition"
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNATION_CONDITION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Continuous Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContinuousActionType[] VALUES_ARRAY = new ContinuousActionType[] { CONTINUOUS_ACTION,
			ASSIGNATION_CONDITION, };

	/**
	 * A public read-only list of all the '<em><b>Continuous Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContinuousActionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Continuous Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContinuousActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContinuousActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Continuous Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContinuousActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContinuousActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Continuous Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContinuousActionType get(int value) {
		switch (value) {
		case CONTINUOUS_ACTION_VALUE:
			return CONTINUOUS_ACTION;
		case ASSIGNATION_CONDITION_VALUE:
			return ASSIGNATION_CONDITION;
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
	private ContinuousActionType(int value, String name, String literal) {
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

} //ContinuousActionType
