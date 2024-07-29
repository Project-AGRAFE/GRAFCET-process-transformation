/**
 */
package de.hsu.grafcet;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuous Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.ContinuousAction#getContinuousActionType <em>Continuous Action Type</em>}</li>
 * </ul>
 *
 * @see de.hsu.grafcet.GrafcetPackage#getContinuousAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ContinuousActionVarType'"
 * @generated
 */
public interface ContinuousAction extends Action, TimeCondition {
	/**
	 * Returns the value of the '<em><b>Continuous Action Type</b></em>' attribute.
	 * The default value is <code>"continuousAction"</code>.
	 * The literals are from the enumeration {@link de.hsu.grafcet.ContinuousActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuous Action Type</em>' attribute.
	 * @see de.hsu.grafcet.ContinuousActionType
	 * @see #setContinuousActionType(ContinuousActionType)
	 * @see de.hsu.grafcet.GrafcetPackage#getContinuousAction_ContinuousActionType()
	 * @model default="continuousAction"
	 * @generated
	 */
	ContinuousActionType getContinuousActionType();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.ContinuousAction#getContinuousActionType <em>Continuous Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuous Action Type</em>' attribute.
	 * @see de.hsu.grafcet.ContinuousActionType
	 * @see #getContinuousActionType()
	 * @generated
	 */
	void setContinuousActionType(ContinuousActionType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif self.continuousActionType = grafcet::ContinuousActionType::assignationCondition then\n\t\t\tif self.term.oclIsTypeOf(terms::Variable) then true else\n\t\t\t\tself.term.oclAsType(terms::Operator)-&gt;closure(term: terms::Term| term-&gt;selectByKind(terms::Operator).subterm)\n\t\t\t\t\t-&gt;select(operator|operator.oclIsTypeOf(terms::RisingEdge))-&gt;size()\n\t\t\t\t+ self.term.oclAsType(terms::Operator)-&gt;closure(term: terms::Term| term-&gt;selectByKind(terms::Operator).subterm)\n\t\t\t\t\t-&gt;select(operator|operator.oclIsTypeOf(terms::FallingEdge))-&gt;size() = 0\n\t\t\tendif\n\t\t\telse true endif'"
	 * @generated
	 */
	boolean ContinuousActionCondType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.variable.variableDeclaration.sort.oclIsTypeOf(terms::Bool)'"
	 * @generated
	 */
	boolean ContinuousActionVarType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ContinuousAction
