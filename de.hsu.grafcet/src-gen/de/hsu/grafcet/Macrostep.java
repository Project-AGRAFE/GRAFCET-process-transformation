/**
 */
package de.hsu.grafcet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macrostep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.Macrostep#getExpansion <em>Expansion</em>}</li>
 * </ul>
 *
 * @see de.hsu.grafcet.GrafcetPackage#getMacrostep()
 * @model
 * @generated
 */
public interface Macrostep extends Node {
	/**
	 * Returns the value of the '<em><b>Expansion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expansion</em>' reference.
	 * @see #setExpansion(MacrostepExpansion)
	 * @see de.hsu.grafcet.GrafcetPackage#getMacrostep_Expansion()
	 * @model required="true"
	 * @generated
	 */
	MacrostepExpansion getExpansion();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.Macrostep#getExpansion <em>Expansion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expansion</em>' reference.
	 * @see #getExpansion()
	 * @generated
	 */
	void setExpansion(MacrostepExpansion value);

} // Macrostep
