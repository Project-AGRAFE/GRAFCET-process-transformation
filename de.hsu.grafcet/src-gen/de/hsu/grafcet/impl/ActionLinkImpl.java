/**
 */
package de.hsu.grafcet.impl;

import de.hsu.grafcet.ActionLink;
import de.hsu.grafcet.ActionType;
import de.hsu.grafcet.GrafcetPackage;
import de.hsu.grafcet.Step;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.impl.ActionLinkImpl#getStep <em>Step</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.ActionLinkImpl#getActionType <em>Action Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionLinkImpl extends MinimalEObjectImpl.Container implements ActionLink {
	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected Step step;

	/**
	 * The cached value of the '{@link #getActionType() <em>Action Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected ActionType actionType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.ACTION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getStep() {
		if (step != null && step.eIsProxy()) {
			InternalEObject oldStep = (InternalEObject) step;
			step = (Step) eResolveProxy(oldStep);
			if (step != oldStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetPackage.ACTION_LINK__STEP, oldStep,
							step));
			}
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(Step newStep) {
		Step oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.ACTION_LINK__STEP, oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType getActionType() {
		if (actionType != null && actionType.eIsProxy()) {
			InternalEObject oldActionType = (InternalEObject) actionType;
			actionType = (ActionType) eResolveProxy(oldActionType);
			if (actionType != oldActionType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetPackage.ACTION_LINK__ACTION_TYPE,
							oldActionType, actionType));
			}
		}
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType basicGetActionType() {
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionType(ActionType newActionType) {
		ActionType oldActionType = actionType;
		actionType = newActionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.ACTION_LINK__ACTION_TYPE,
					oldActionType, actionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GrafcetPackage.ACTION_LINK__STEP:
			if (resolve)
				return getStep();
			return basicGetStep();
		case GrafcetPackage.ACTION_LINK__ACTION_TYPE:
			if (resolve)
				return getActionType();
			return basicGetActionType();
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
		case GrafcetPackage.ACTION_LINK__STEP:
			setStep((Step) newValue);
			return;
		case GrafcetPackage.ACTION_LINK__ACTION_TYPE:
			setActionType((ActionType) newValue);
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
		case GrafcetPackage.ACTION_LINK__STEP:
			setStep((Step) null);
			return;
		case GrafcetPackage.ACTION_LINK__ACTION_TYPE:
			setActionType((ActionType) null);
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
		case GrafcetPackage.ACTION_LINK__STEP:
			return step != null;
		case GrafcetPackage.ACTION_LINK__ACTION_TYPE:
			return actionType != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionLinkImpl
