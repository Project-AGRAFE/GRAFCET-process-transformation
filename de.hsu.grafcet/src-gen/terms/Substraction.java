/**
 */
package terms;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substraction</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see terms.TermsPackage#getSubstraction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OutputTypesSubstr'"
 * @generated
 */
public interface Substraction extends IntegerOperator {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.output.oclIsKindOf(_\'Integer\')'"
	 * @generated
	 */
	boolean OutputTypesSubstr(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Substraction
