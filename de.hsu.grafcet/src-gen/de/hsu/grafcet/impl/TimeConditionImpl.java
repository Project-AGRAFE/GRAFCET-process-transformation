/**
 */
package de.hsu.grafcet.impl;

import de.hsu.grafcet.GrafcetPackage;
import de.hsu.grafcet.TimeCondition;
import de.hsu.grafcet.TimeConditionType;
import de.hsu.grafcet.TimeUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.impl.TimeConditionImpl#getDelayTime <em>Delay Time</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.TimeConditionImpl#getResetTime <em>Reset Time</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.TimeConditionImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.TimeConditionImpl#getTimeConditionType <em>Time Condition Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeConditionImpl extends ConditionImpl implements TimeCondition {
	/**
	 * The default value of the '{@link #getDelayTime() <em>Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayTime()
	 * @generated
	 * @ordered
	 */
	protected static final int DELAY_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDelayTime() <em>Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayTime()
	 * @generated
	 * @ordered
	 */
	protected int delayTime = DELAY_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResetTime() <em>Reset Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetTime()
	 * @generated
	 * @ordered
	 */
	protected static final int RESET_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResetTime() <em>Reset Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetTime()
	 * @generated
	 * @ordered
	 */
	protected int resetTime = RESET_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit UNIT_EDEFAULT = TimeUnit.SECOND;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeConditionType() <em>Time Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConditionType()
	 * @generated
	 * @ordered
	 */
	protected static final TimeConditionType TIME_CONDITION_TYPE_EDEFAULT = TimeConditionType.NONE;

	/**
	 * The cached value of the '{@link #getTimeConditionType() <em>Time Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConditionType()
	 * @generated
	 * @ordered
	 */
	protected TimeConditionType timeConditionType = TIME_CONDITION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.TIME_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDelayTime() {
		return delayTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelayTime(int newDelayTime) {
		int oldDelayTime = delayTime;
		delayTime = newDelayTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.TIME_CONDITION__DELAY_TIME,
					oldDelayTime, delayTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResetTime() {
		return resetTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetTime(int newResetTime) {
		int oldResetTime = resetTime;
		resetTime = newResetTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.TIME_CONDITION__RESET_TIME,
					oldResetTime, resetTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(TimeUnit newUnit) {
		TimeUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.TIME_CONDITION__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConditionType getTimeConditionType() {
		return timeConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeConditionType(TimeConditionType newTimeConditionType) {
		TimeConditionType oldTimeConditionType = timeConditionType;
		timeConditionType = newTimeConditionType == null ? TIME_CONDITION_TYPE_EDEFAULT : newTimeConditionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.TIME_CONDITION__TIME_CONDITION_TYPE,
					oldTimeConditionType, timeConditionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GrafcetPackage.TIME_CONDITION__DELAY_TIME:
			return getDelayTime();
		case GrafcetPackage.TIME_CONDITION__RESET_TIME:
			return getResetTime();
		case GrafcetPackage.TIME_CONDITION__UNIT:
			return getUnit();
		case GrafcetPackage.TIME_CONDITION__TIME_CONDITION_TYPE:
			return getTimeConditionType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GrafcetPackage.TIME_CONDITION__DELAY_TIME:
			setDelayTime((Integer) newValue);
			return;
		case GrafcetPackage.TIME_CONDITION__RESET_TIME:
			setResetTime((Integer) newValue);
			return;
		case GrafcetPackage.TIME_CONDITION__UNIT:
			setUnit((TimeUnit) newValue);
			return;
		case GrafcetPackage.TIME_CONDITION__TIME_CONDITION_TYPE:
			setTimeConditionType((TimeConditionType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GrafcetPackage.TIME_CONDITION__DELAY_TIME:
			setDelayTime(DELAY_TIME_EDEFAULT);
			return;
		case GrafcetPackage.TIME_CONDITION__RESET_TIME:
			setResetTime(RESET_TIME_EDEFAULT);
			return;
		case GrafcetPackage.TIME_CONDITION__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case GrafcetPackage.TIME_CONDITION__TIME_CONDITION_TYPE:
			setTimeConditionType(TIME_CONDITION_TYPE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GrafcetPackage.TIME_CONDITION__DELAY_TIME:
			return delayTime != DELAY_TIME_EDEFAULT;
		case GrafcetPackage.TIME_CONDITION__RESET_TIME:
			return resetTime != RESET_TIME_EDEFAULT;
		case GrafcetPackage.TIME_CONDITION__UNIT:
			return unit != UNIT_EDEFAULT;
		case GrafcetPackage.TIME_CONDITION__TIME_CONDITION_TYPE:
			return timeConditionType != TIME_CONDITION_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (delayTime: ");
		result.append(delayTime);
		result.append(", resetTime: ");
		result.append(resetTime);
		result.append(", unit: ");
		result.append(unit);
		result.append(", timeConditionType: ");
		result.append(timeConditionType);
		result.append(')');
		return result.toString();
	}

} //TimeConditionImpl
