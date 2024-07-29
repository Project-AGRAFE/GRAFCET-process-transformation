/**
 */
package terms;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Falling Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see terms.TermsPackage#getFallingEdge()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InputSizeFallingEdge'"
 * @generated
 */
public interface FallingEdge extends BooleanOperator {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.input-&gt;size() = 1'"
	 * @generated
	 */
	boolean InputSizeFallingEdge(DiagnosticChain diagnostics, Map<Object, Object> context);
} // FallingEdge
