/**
 */
package terms;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greater Than</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see terms.TermsPackage#getGreaterThan()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OutputTypesGreat'"
 * @generated
 */
public interface GreaterThan extends IntegerOperator {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.output.oclIsKindOf(Bool)'"
	 * @generated
	 */
	boolean OutputTypesGreat(DiagnosticChain diagnostics, Map<Object, Object> context);
} // GreaterThan
