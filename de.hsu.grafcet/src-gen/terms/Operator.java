/**
 */
package terms;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terms.Operator#getSubterm <em>Subterm</em>}</li>
 *   <li>{@link terms.Operator#getOutput <em>Output</em>}</li>
 *   <li>{@link terms.Operator#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see terms.TermsPackage#getOperator()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OperatorInputType'"
 * @generated
 */
public interface Operator extends Term {
	/**
	 * Returns the value of the '<em><b>Subterm</b></em>' containment reference list.
	 * The list contents are of type {@link terms.Term}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subterm</em>' containment reference list.
	 * @see terms.TermsPackage#getOperator_Subterm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Term> getSubterm();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Sort)
	 * @see terms.TermsPackage#getOperator_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sort getOutput();

	/**
	 * Sets the value of the '{@link terms.Operator#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Sort value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link terms.Sort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see terms.TermsPackage#getOperator_Input()
	 * @model
	 * @generated
	 */
	EList<Sort> getInput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.sort = self.output'"
	 * @generated
	 */
	boolean OperatorSort(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.subterm-&gt;collect(subterm|subterm.sort) = self.input-&gt;asSequence()'"
	 * @generated
	 */
	boolean OperatorInputType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Operator
