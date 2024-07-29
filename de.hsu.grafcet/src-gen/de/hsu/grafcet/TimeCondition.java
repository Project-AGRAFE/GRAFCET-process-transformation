/**
 */
package de.hsu.grafcet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.TimeCondition#getDelayTime <em>Delay Time</em>}</li>
 *   <li>{@link de.hsu.grafcet.TimeCondition#getResetTime <em>Reset Time</em>}</li>
 *   <li>{@link de.hsu.grafcet.TimeCondition#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.hsu.grafcet.TimeCondition#getTimeConditionType <em>Time Condition Type</em>}</li>
 * </ul>
 *
 * @see de.hsu.grafcet.GrafcetPackage#getTimeCondition()
 * @model
 * @generated
 */
public interface TimeCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Delay Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay Time</em>' attribute.
	 * @see #setDelayTime(int)
	 * @see de.hsu.grafcet.GrafcetPackage#getTimeCondition_DelayTime()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getDelayTime();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.TimeCondition#getDelayTime <em>Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay Time</em>' attribute.
	 * @see #getDelayTime()
	 * @generated
	 */
	void setDelayTime(int value);

	/**
	 * Returns the value of the '<em><b>Reset Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Time</em>' attribute.
	 * @see #setResetTime(int)
	 * @see de.hsu.grafcet.GrafcetPackage#getTimeCondition_ResetTime()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getResetTime();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.TimeCondition#getResetTime <em>Reset Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Time</em>' attribute.
	 * @see #getResetTime()
	 * @generated
	 */
	void setResetTime(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link de.hsu.grafcet.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see de.hsu.grafcet.TimeUnit
	 * @see #setUnit(TimeUnit)
	 * @see de.hsu.grafcet.GrafcetPackage#getTimeCondition_Unit()
	 * @model
	 * @generated
	 */
	TimeUnit getUnit();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.TimeCondition#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see de.hsu.grafcet.TimeUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnit value);

	/**
	 * Returns the value of the '<em><b>Time Condition Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.hsu.grafcet.TimeConditionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Condition Type</em>' attribute.
	 * @see de.hsu.grafcet.TimeConditionType
	 * @see #setTimeConditionType(TimeConditionType)
	 * @see de.hsu.grafcet.GrafcetPackage#getTimeCondition_TimeConditionType()
	 * @model
	 * @generated
	 */
	TimeConditionType getTimeConditionType();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.TimeCondition#getTimeConditionType <em>Time Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Condition Type</em>' attribute.
	 * @see de.hsu.grafcet.TimeConditionType
	 * @see #getTimeConditionType()
	 * @generated
	 */
	void setTimeConditionType(TimeConditionType value);

} // TimeCondition
