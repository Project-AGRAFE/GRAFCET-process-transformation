/**
 */
package terms;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see terms.TermsPackage#getEquality()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InputSizeInputOutputTypesEq'"
 * @generated
 */
public interface Equality extends Operator {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.input-&gt; size() &gt;= 2 and self.output.oclIsKindOf(Bool) and self.input-&gt;forAll(c,d|c.oclIsTypeOf(d.oclType()) or d.oclIsTypeOf(c.oclType()))'"
	 * @generated
	 */
	boolean InputSizeInputOutputTypesEq(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Equality
