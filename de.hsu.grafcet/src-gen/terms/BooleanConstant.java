/**
 */
package terms;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terms.BooleanConstant#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see terms.TermsPackage#getBooleanConstant()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InputSizeOutputTypesBoolConst'"
 * @generated
 */
public interface BooleanConstant extends Constant {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see terms.TermsPackage#getBooleanConstant_Value()
	 * @model required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link terms.BooleanConstant#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.input-&gt; size() = 0 and self.output.oclIsTypeOf(Bool)'"
	 * @generated
	 */
	boolean InputSizeOutputTypesBoolConst(DiagnosticChain diagnostics, Map<Object, Object> context);

} // BooleanConstant
