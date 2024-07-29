/**
 */
package de.hsu.grafcet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macrostep Expansion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.MacrostepExpansion#getEntryStep <em>Entry Step</em>}</li>
 *   <li>{@link de.hsu.grafcet.MacrostepExpansion#getExitStep <em>Exit Step</em>}</li>
 * </ul>
 *
 * @see de.hsu.grafcet.GrafcetPackage#getMacrostepExpansion()
 * @model
 * @generated
 */
public interface MacrostepExpansion extends Grafcet {
	/**
	 * Returns the value of the '<em><b>Entry Step</b></em>' containment reference list.
	 * The list contents are of type {@link de.hsu.grafcet.EntryStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Step</em>' containment reference list.
	 * @see de.hsu.grafcet.GrafcetPackage#getMacrostepExpansion_EntryStep()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntryStep> getEntryStep();

	/**
	 * Returns the value of the '<em><b>Exit Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Step</em>' containment reference.
	 * @see #setExitStep(ExitStep)
	 * @see de.hsu.grafcet.GrafcetPackage#getMacrostepExpansion_ExitStep()
	 * @model containment="true"
	 * @generated
	 */
	ExitStep getExitStep();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.MacrostepExpansion#getExitStep <em>Exit Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Step</em>' containment reference.
	 * @see #getExitStep()
	 * @generated
	 */
	void setExitStep(ExitStep value);

} // MacrostepExpansion
