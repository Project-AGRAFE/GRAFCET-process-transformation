/**
 */
package terms;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see terms.TermsPackage#getAnd()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InputSizeAnd'"
 * @generated
 */
public interface And extends BooleanOperator {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.input-&gt; size() = 2'"
	 * @generated
	 */
	boolean InputSizeAnd(DiagnosticChain diagnostics, Map<Object, Object> context);
} // And
