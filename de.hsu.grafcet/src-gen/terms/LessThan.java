/**
 */
package terms;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Less Than</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see terms.TermsPackage#getLessThan()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OutputTypesLess'"
 * @generated
 */
public interface LessThan extends IntegerOperator {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.output.oclIsKindOf(Bool)'"
	 * @generated
	 */
	boolean OutputTypesLess(DiagnosticChain diagnostics, Map<Object, Object> context);
} // LessThan
