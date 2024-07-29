/**
 */
package de.hsu.grafcet.impl;

import de.hsu.grafcet.GrafcetPackage;
import de.hsu.grafcet.VariableDeclarationContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import terms.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.impl.VariableDeclarationContainerImpl#getVariableDeclarations <em>Variable Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationContainerImpl extends MinimalEObjectImpl.Container
		implements VariableDeclarationContainer {
	/**
	 * The cached value of the '{@link #getVariableDeclarations() <em>Variable Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration> variableDeclarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.VARIABLE_DECLARATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclaration> getVariableDeclarations() {
		if (variableDeclarations == null) {
			variableDeclarations = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this,
					GrafcetPackage.VARIABLE_DECLARATION_CONTAINER__VARIABLE_DECLARATIONS);
		}
		return variableDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GrafcetPackage.VARIABLE_DECLARATION_CONTAINER__VARIABLE_DECLARATIONS:
			return ((InternalEList<?>) getVariableDeclarations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GrafcetPackage.VARIABLE_DECLARATION_CONTAINER__VARIABLE_DECLARATIONS:
			return getVariableDeclarations();
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
		case GrafcetPackage.VARIABLE_DECLARATION_CONTAINER__VARIABLE_DECLARATIONS:
			getVariableDeclarations().clear();
			getVariableDeclarations().addAll((Collection<? extends VariableDeclaration>) newValue);
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
		case GrafcetPackage.VARIABLE_DECLARATION_CONTAINER__VARIABLE_DECLARATIONS:
			getVariableDeclarations().clear();
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
		case GrafcetPackage.VARIABLE_DECLARATION_CONTAINER__VARIABLE_DECLARATIONS:
			return variableDeclarations != null && !variableDeclarations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariableDeclarationContainerImpl
