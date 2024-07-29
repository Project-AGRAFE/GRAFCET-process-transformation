/**
 */
package terms;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see terms.TermsPackage#getIntegerOperator()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InputSizeTypesIntOp'"
 * @generated
 */
public interface IntegerOperator extends Operator {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.input-&gt; size() = 2 and self.input-&gt;forAll(c | c.oclIsKindOf(_\'Integer\'))'"
	 * @generated
	 */
	boolean InputSizeTypesIntOp(DiagnosticChain diagnostics, Map<Object, Object> context);
} // IntegerOperator
