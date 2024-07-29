/**
 */
package de.hsu.grafcet;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import terms.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.Action#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see de.hsu.grafcet.GrafcetPackage#getAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ActionOutputVariableType'"
 * @generated
 */
public interface Action extends ActionType {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Variable)
	 * @see de.hsu.grafcet.GrafcetPackage#getAction_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.Action#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.variable.variableDeclaration.variableDeclarationType = terms::VariableDeclarationType::output \n\t\t\tor if self.oclIsTypeOf(StoredAction) then \n\t\t\tself.variable.variableDeclaration.variableDeclarationType = terms::VariableDeclarationType::internal else false endif'"
	 * @generated
	 */
	boolean ActionOutputVariableType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Action
