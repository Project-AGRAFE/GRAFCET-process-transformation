/**
 */
package de.hsu.grafcet.impl;

import de.hsu.grafcet.GrafcetPackage;
import de.hsu.grafcet.InitializableType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initializable Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.impl.InitializableTypeImpl#isInitial <em>Initial</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.InitializableTypeImpl#isActivationLink <em>Activation Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitializableTypeImpl extends NodeImpl implements InitializableType {
	/**
	 * The default value of the '{@link #isInitial() <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitial() <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected boolean initial = INITIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isActivationLink() <em>Activation Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivationLink()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVATION_LINK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActivationLink() <em>Activation Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivationLink()
	 * @generated
	 * @ordered
	 */
	protected boolean activationLink = ACTIVATION_LINK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitializableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.INITIALIZABLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(boolean newInitial) {
		boolean oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.INITIALIZABLE_TYPE__INITIAL,
					oldInitial, initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActivationLink() {
		return activationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationLink(boolean newActivationLink) {
		boolean oldActivationLink = activationLink;
		activationLink = newActivationLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.INITIALIZABLE_TYPE__ACTIVATION_LINK,
					oldActivationLink, activationLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GrafcetPackage.INITIALIZABLE_TYPE__INITIAL:
			return isInitial();
		case GrafcetPackage.INITIALIZABLE_TYPE__ACTIVATION_LINK:
			return isActivationLink();
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
		case GrafcetPackage.INITIALIZABLE_TYPE__INITIAL:
			setInitial((Boolean) newValue);
			return;
		case GrafcetPackage.INITIALIZABLE_TYPE__ACTIVATION_LINK:
			setActivationLink((Boolean) newValue);
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
		case GrafcetPackage.INITIALIZABLE_TYPE__INITIAL:
			setInitial(INITIAL_EDEFAULT);
			return;
		case GrafcetPackage.INITIALIZABLE_TYPE__ACTIVATION_LINK:
			setActivationLink(ACTIVATION_LINK_EDEFAULT);
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
		case GrafcetPackage.INITIALIZABLE_TYPE__INITIAL:
			return initial != INITIAL_EDEFAULT;
		case GrafcetPackage.INITIALIZABLE_TYPE__ACTIVATION_LINK:
			return activationLink != ACTIVATION_LINK_EDEFAULT;
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
		result.append(" (initial: ");
		result.append(initial);
		result.append(", activationLink: ");
		result.append(activationLink);
		result.append(')');
		return result.toString();
	}

} //InitializableTypeImpl
