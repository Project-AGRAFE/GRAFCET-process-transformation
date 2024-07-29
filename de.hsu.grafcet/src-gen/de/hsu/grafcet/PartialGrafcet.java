/**
 */
package de.hsu.grafcet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial Grafcet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.PartialGrafcet#getEnclosingStep <em>Enclosing Step</em>}</li>
 * </ul>
 *
 * @see de.hsu.grafcet.GrafcetPackage#getPartialGrafcet()
 * @model
 * @generated
 */
public interface PartialGrafcet extends Grafcet {
	/**
	 * Returns the value of the '<em><b>Enclosing Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosing Step</em>' reference.
	 * @see #setEnclosingStep(EnclosingStep)
	 * @see de.hsu.grafcet.GrafcetPackage#getPartialGrafcet_EnclosingStep()
	 * @model
	 * @generated
	 */
	EnclosingStep getEnclosingStep();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.PartialGrafcet#getEnclosingStep <em>Enclosing Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Step</em>' reference.
	 * @see #getEnclosingStep()
	 * @generated
	 */
	void setEnclosingStep(EnclosingStep value);

} // PartialGrafcet
