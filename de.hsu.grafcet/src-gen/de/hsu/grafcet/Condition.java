/**
 */
package de.hsu.grafcet;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import terms.Term;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.Condition#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see de.hsu.grafcet.GrafcetPackage#getCondition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConditionVariableType'"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(Term)
	 * @see de.hsu.grafcet.GrafcetPackage#getCondition_Term()
	 * @model containment="true"
	 * @generated
	 */
	Term getTerm();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.Condition#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(Term value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.term &lt;&gt; null implies self.term.sort.oclIsTypeOf(terms::Bool)'"
	 * @generated
	 */
	boolean ConditionTermType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.term &lt;&gt; null implies(if self.term.oclIsTypeOf(terms::Variable) then \n\t\t\tself.term.oclAsType(terms::Variable).variableDeclaration.variableDeclarationType &lt;&gt; terms::VariableDeclarationType::output else\n\t\t\tself.term.oclAsType(terms::Operator)-&gt;closure(term: terms::Term| term-&gt;selectByKind(terms::Operator).subterm)\n\t\t\t-&gt;selectByKind(terms::Variable)-&gt;select(var|var.variableDeclaration.variableDeclarationType = terms::VariableDeclarationType::output)-&gt;size() = 0\n\t\t\tendif)'"
	 * @generated
	 */
	boolean ConditionVariableType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Condition
