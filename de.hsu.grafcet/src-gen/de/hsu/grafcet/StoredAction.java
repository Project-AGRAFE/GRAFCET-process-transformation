/**
 */
package de.hsu.grafcet;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import terms.Term;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stored Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.StoredAction#getStoredActionType <em>Stored Action Type</em>}</li>
 *   <li>{@link de.hsu.grafcet.StoredAction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.hsu.grafcet.GrafcetPackage#getStoredAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StoredActionVarType'"
 * @generated
 */
public interface StoredAction extends Action, Condition {
	/**
	 * Returns the value of the '<em><b>Stored Action Type</b></em>' attribute.
	 * The default value is <code>"activation"</code>.
	 * The literals are from the enumeration {@link de.hsu.grafcet.StoredActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stored Action Type</em>' attribute.
	 * @see de.hsu.grafcet.StoredActionType
	 * @see #setStoredActionType(StoredActionType)
	 * @see de.hsu.grafcet.GrafcetPackage#getStoredAction_StoredActionType()
	 * @model default="activation" required="true"
	 * @generated
	 */
	StoredActionType getStoredActionType();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.StoredAction#getStoredActionType <em>Stored Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stored Action Type</em>' attribute.
	 * @see de.hsu.grafcet.StoredActionType
	 * @see #getStoredActionType()
	 * @generated
	 */
	void setStoredActionType(StoredActionType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Term)
	 * @see de.hsu.grafcet.GrafcetPackage#getStoredAction_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getValue();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.StoredAction#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Term value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.storedActionType = grafcet::StoredActionType::event implies(\n\t\t\tif self.term.oclIsTypeOf(terms::Variable) then false else\n\t\t\tself.term.oclAsType(terms::Operator)-&gt;closure(term: terms::Term| term-&gt;selectByKind(terms::Operator).subterm)\n\t\t\t-&gt;select(operator|operator.oclIsTypeOf(terms::RisingEdge))-&gt;size()\n\t\t\t+ self.term.oclAsType(terms::Operator)-&gt;closure(term: terms::Term| term-&gt;selectByKind(terms::Operator).subterm)\n\t\t\t-&gt;select(operator|operator.oclIsTypeOf(terms::FallingEdge))-&gt;size() &gt; 0\n\t\t\tendif)'"
	 * @generated
	 */
	boolean StoredActionCondType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.variable.variableDeclaration.sort.oclType() = self.value.sort.oclType()'"
	 * @generated
	 */
	boolean StoredActionVarType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // StoredAction
