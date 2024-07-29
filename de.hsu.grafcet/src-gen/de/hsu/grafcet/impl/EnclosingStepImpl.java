/**
 */
package de.hsu.grafcet.impl;

import de.hsu.grafcet.EnclosingStep;
import de.hsu.grafcet.GrafcetPackage;
import de.hsu.grafcet.PartialGrafcet;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enclosing Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.impl.EnclosingStepImpl#getPartialGrafcets <em>Partial Grafcets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnclosingStepImpl extends InitializableTypeImpl implements EnclosingStep {
	/**
	 * The cached value of the '{@link #getPartialGrafcets() <em>Partial Grafcets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialGrafcets()
	 * @generated
	 * @ordered
	 */
	protected EList<PartialGrafcet> partialGrafcets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnclosingStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.ENCLOSING_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartialGrafcet> getPartialGrafcets() {
		if (partialGrafcets == null) {
			partialGrafcets = new EObjectResolvingEList<PartialGrafcet>(PartialGrafcet.class, this,
					GrafcetPackage.ENCLOSING_STEP__PARTIAL_GRAFCETS);
		}
		return partialGrafcets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GrafcetPackage.ENCLOSING_STEP__PARTIAL_GRAFCETS:
			return getPartialGrafcets();
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
		case GrafcetPackage.ENCLOSING_STEP__PARTIAL_GRAFCETS:
			getPartialGrafcets().clear();
			getPartialGrafcets().addAll((Collection<? extends PartialGrafcet>) newValue);
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
		case GrafcetPackage.ENCLOSING_STEP__PARTIAL_GRAFCETS:
			getPartialGrafcets().clear();
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
		case GrafcetPackage.ENCLOSING_STEP__PARTIAL_GRAFCETS:
			return partialGrafcets != null && !partialGrafcets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnclosingStepImpl
