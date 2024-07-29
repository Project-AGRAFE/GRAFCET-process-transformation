/**
 */
package terms;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see terms.TermsPackage#getBooleanOperator()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InputOutputTypesBoolOp'"
 * @generated
 */
public interface BooleanOperator extends Operator {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.output.oclIsKindOf(Bool) and  self.input-&gt;forAll(c | c.oclIsKindOf(Bool))'"
	 * @generated
	 */
	boolean InputOutputTypesBoolOp(DiagnosticChain diagnostics, Map<Object, Object> context);
} // BooleanOperator
