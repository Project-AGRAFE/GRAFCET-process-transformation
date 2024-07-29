/**
 */
package de.hsu.grafcet.impl;

import de.hsu.grafcet.GrafcetPackage;
import de.hsu.grafcet.Macrostep;
import de.hsu.grafcet.MacrostepExpansion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Macrostep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.impl.MacrostepImpl#getExpansion <em>Expansion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MacrostepImpl extends NodeImpl implements Macrostep {
	/**
	 * The cached value of the '{@link #getExpansion() <em>Expansion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpansion()
	 * @generated
	 * @ordered
	 */
	protected MacrostepExpansion expansion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MacrostepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.MACROSTEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacrostepExpansion getExpansion() {
		if (expansion != null && expansion.eIsProxy()) {
			InternalEObject oldExpansion = (InternalEObject) expansion;
			expansion = (MacrostepExpansion) eResolveProxy(oldExpansion);
			if (expansion != oldExpansion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetPackage.MACROSTEP__EXPANSION,
							oldExpansion, expansion));
			}
		}
		return expansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacrostepExpansion basicGetExpansion() {
		return expansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpansion(MacrostepExpansion newExpansion) {
		MacrostepExpansion oldExpansion = expansion;
		expansion = newExpansion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.MACROSTEP__EXPANSION, oldExpansion,
					expansion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GrafcetPackage.MACROSTEP__EXPANSION:
			if (resolve)
				return getExpansion();
			return basicGetExpansion();
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
		case GrafcetPackage.MACROSTEP__EXPANSION:
			setExpansion((MacrostepExpansion) newValue);
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
		case GrafcetPackage.MACROSTEP__EXPANSION:
			setExpansion((MacrostepExpansion) null);
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
		case GrafcetPackage.MACROSTEP__EXPANSION:
			return expansion != null;
		}
		return super.eIsSet(featureID);
	}

} //MacrostepImpl
