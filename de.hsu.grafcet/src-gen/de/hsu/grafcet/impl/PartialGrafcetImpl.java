/**
 */
package de.hsu.grafcet.impl;

import de.hsu.grafcet.EnclosingStep;
import de.hsu.grafcet.GrafcetPackage;
import de.hsu.grafcet.PartialGrafcet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partial Grafcet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.impl.PartialGrafcetImpl#getEnclosingStep <em>Enclosing Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartialGrafcetImpl extends GrafcetImpl implements PartialGrafcet {
	/**
	 * The cached value of the '{@link #getEnclosingStep() <em>Enclosing Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosingStep()
	 * @generated
	 * @ordered
	 */
	protected EnclosingStep enclosingStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialGrafcetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.PARTIAL_GRAFCET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnclosingStep getEnclosingStep() {
		if (enclosingStep != null && enclosingStep.eIsProxy()) {
			InternalEObject oldEnclosingStep = (InternalEObject) enclosingStep;
			enclosingStep = (EnclosingStep) eResolveProxy(oldEnclosingStep);
			if (enclosingStep != oldEnclosingStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GrafcetPackage.PARTIAL_GRAFCET__ENCLOSING_STEP, oldEnclosingStep, enclosingStep));
			}
		}
		return enclosingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnclosingStep basicGetEnclosingStep() {
		return enclosingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingStep(EnclosingStep newEnclosingStep) {
		EnclosingStep oldEnclosingStep = enclosingStep;
		enclosingStep = newEnclosingStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.PARTIAL_GRAFCET__ENCLOSING_STEP,
					oldEnclosingStep, enclosingStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GrafcetPackage.PARTIAL_GRAFCET__ENCLOSING_STEP:
			if (resolve)
				return getEnclosingStep();
			return basicGetEnclosingStep();
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
		case GrafcetPackage.PARTIAL_GRAFCET__ENCLOSING_STEP:
			setEnclosingStep((EnclosingStep) newValue);
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
		case GrafcetPackage.PARTIAL_GRAFCET__ENCLOSING_STEP:
			setEnclosingStep((EnclosingStep) null);
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
		case GrafcetPackage.PARTIAL_GRAFCET__ENCLOSING_STEP:
			return enclosingStep != null;
		}
		return super.eIsSet(featureID);
	}

} //PartialGrafcetImpl
