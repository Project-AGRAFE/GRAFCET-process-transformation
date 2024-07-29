/**
 */
package terms;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see terms.TermsPackage#getAddition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OutputTypesAdd'"
 * @generated
 */
public interface Addition extends IntegerOperator {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.output.oclIsKindOf(_\'Integer\')'"
	 * @generated
	 */
	boolean OutputTypesAdd(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Addition
