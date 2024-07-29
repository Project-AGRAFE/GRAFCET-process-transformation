/**
 */
package de.hsu.grafcet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import terms.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.VariableDeclarationContainer#getVariableDeclarations <em>Variable Declarations</em>}</li>
 * </ul>
 *
 * @see de.hsu.grafcet.GrafcetPackage#getVariableDeclarationContainer()
 * @model
 * @generated
 */
public interface VariableDeclarationContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link terms.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declarations</em>' containment reference list.
	 * @see de.hsu.grafcet.GrafcetPackage#getVariableDeclarationContainer_VariableDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getVariableDeclarations();

} // VariableDeclarationContainer
