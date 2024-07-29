/**
 */
package terms;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terms.Variable#getVariableDeclaration <em>Variable Declaration</em>}</li>
 * </ul>
 *
 * @see terms.TermsPackage#getVariable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SortVariable'"
 * @generated
 */
public interface Variable extends Term {
	/**
	 * Returns the value of the '<em><b>Variable Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declaration</em>' reference.
	 * @see #setVariableDeclaration(VariableDeclaration)
	 * @see terms.TermsPackage#getVariable_VariableDeclaration()
	 * @model required="true"
	 * @generated
	 */
	VariableDeclaration getVariableDeclaration();

	/**
	 * Sets the value of the '{@link terms.Variable#getVariableDeclaration <em>Variable Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Declaration</em>' reference.
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	void setVariableDeclaration(VariableDeclaration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.sort = self.variableDeclaration.sort'"
	 * @generated
	 */
	boolean SortVariable(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Variable
