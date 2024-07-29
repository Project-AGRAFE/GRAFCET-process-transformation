/**
 */
package terms;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terms.IntegerConstant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see terms.TermsPackage#getIntegerConstant()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InputSizeOutputTypesIntConts'"
 * @generated
 */
public interface IntegerConstant extends Constant {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see terms.TermsPackage#getIntegerConstant_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link terms.IntegerConstant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.input-&gt;size() = 0 and self.output.oclIsTypeOf(_\'Integer\')'"
	 * @generated
	 */
	boolean InputSizeOutputTypesIntConts(DiagnosticChain diagnostics, Map<Object, Object> context);

} // IntegerConstant
