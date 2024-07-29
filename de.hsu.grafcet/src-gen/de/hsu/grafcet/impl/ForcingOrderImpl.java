/**
 */
package de.hsu.grafcet.impl;

import de.hsu.grafcet.ForcingOrder;
import de.hsu.grafcet.ForcingOrderType;
import de.hsu.grafcet.GrafcetPackage;
import de.hsu.grafcet.InitializableType;
import de.hsu.grafcet.PartialGrafcet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forcing Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.impl.ForcingOrderImpl#getPartialGrafcet <em>Partial Grafcet</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.ForcingOrderImpl#getForcedSteps <em>Forced Steps</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.ForcingOrderImpl#getForcingOrderType <em>Forcing Order Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForcingOrderImpl extends ActionTypeImpl implements ForcingOrder {
	/**
	 * The cached value of the '{@link #getPartialGrafcet() <em>Partial Grafcet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialGrafcet()
	 * @generated
	 * @ordered
	 */
	protected PartialGrafcet partialGrafcet;

	/**
	 * The cached value of the '{@link #getForcedSteps() <em>Forced Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForcedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<InitializableType> forcedSteps;

	/**
	 * The default value of the '{@link #getForcingOrderType() <em>Forcing Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForcingOrderType()
	 * @generated
	 * @ordered
	 */
	protected static final ForcingOrderType FORCING_ORDER_TYPE_EDEFAULT = ForcingOrderType.CURRENT_SITUATION;

	/**
	 * The cached value of the '{@link #getForcingOrderType() <em>Forcing Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForcingOrderType()
	 * @generated
	 * @ordered
	 */
	protected ForcingOrderType forcingOrderType = FORCING_ORDER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForcingOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.FORCING_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialGrafcet getPartialGrafcet() {
		if (partialGrafcet != null && partialGrafcet.eIsProxy()) {
			InternalEObject oldPartialGrafcet = (InternalEObject) partialGrafcet;
			partialGrafcet = (PartialGrafcet) eResolveProxy(oldPartialGrafcet);
			if (partialGrafcet != oldPartialGrafcet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GrafcetPackage.FORCING_ORDER__PARTIAL_GRAFCET, oldPartialGrafcet, partialGrafcet));
			}
		}
		return partialGrafcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialGrafcet basicGetPartialGrafcet() {
		return partialGrafcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartialGrafcet(PartialGrafcet newPartialGrafcet) {
		PartialGrafcet oldPartialGrafcet = partialGrafcet;
		partialGrafcet = newPartialGrafcet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.FORCING_ORDER__PARTIAL_GRAFCET,
					oldPartialGrafcet, partialGrafcet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitializableType> getForcedSteps() {
		if (forcedSteps == null) {
			forcedSteps = new EObjectResolvingEList<InitializableType>(InitializableType.class, this,
					GrafcetPackage.FORCING_ORDER__FORCED_STEPS);
		}
		return forcedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForcingOrderType getForcingOrderType() {
		return forcingOrderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForcingOrderType(ForcingOrderType newForcingOrderType) {
		ForcingOrderType oldForcingOrderType = forcingOrderType;
		forcingOrderType = newForcingOrderType == null ? FORCING_ORDER_TYPE_EDEFAULT : newForcingOrderType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.FORCING_ORDER__FORCING_ORDER_TYPE,
					oldForcingOrderType, forcingOrderType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GrafcetPackage.FORCING_ORDER__PARTIAL_GRAFCET:
			if (resolve)
				return getPartialGrafcet();
			return basicGetPartialGrafcet();
		case GrafcetPackage.FORCING_ORDER__FORCED_STEPS:
			return getForcedSteps();
		case GrafcetPackage.FORCING_ORDER__FORCING_ORDER_TYPE:
			return getForcingOrderType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GrafcetPackage.FORCING_ORDER__PARTIAL_GRAFCET:
			setPartialGrafcet((PartialGrafcet) newValue);
			return;
		case GrafcetPackage.FORCING_ORDER__FORCED_STEPS:
			getForcedSteps().clear();
			getForcedSteps().addAll((Collection<? extends InitializableType>) newValue);
			return;
		case GrafcetPackage.FORCING_ORDER__FORCING_ORDER_TYPE:
			setForcingOrderType((ForcingOrderType) newValue);
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
		case GrafcetPackage.FORCING_ORDER__PARTIAL_GRAFCET:
			setPartialGrafcet((PartialGrafcet) null);
			return;
		case GrafcetPackage.FORCING_ORDER__FORCED_STEPS:
			getForcedSteps().clear();
			return;
		case GrafcetPackage.FORCING_ORDER__FORCING_ORDER_TYPE:
			setForcingOrderType(FORCING_ORDER_TYPE_EDEFAULT);
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
		case GrafcetPackage.FORCING_ORDER__PARTIAL_GRAFCET:
			return partialGrafcet != null;
		case GrafcetPackage.FORCING_ORDER__FORCED_STEPS:
			return forcedSteps != null && !forcedSteps.isEmpty();
		case GrafcetPackage.FORCING_ORDER__FORCING_ORDER_TYPE:
			return forcingOrderType != FORCING_ORDER_TYPE_EDEFAULT;
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
		result.append(" (forcingOrderType: ");
		result.append(forcingOrderType);
		result.append(')');
		return result.toString();
	}

} //ForcingOrderImpl
