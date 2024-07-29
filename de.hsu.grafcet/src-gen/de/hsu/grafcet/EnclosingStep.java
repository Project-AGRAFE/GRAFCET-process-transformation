/**
 */
package de.hsu.grafcet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enclosing Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.EnclosingStep#getPartialGrafcets <em>Partial Grafcets</em>}</li>
 * </ul>
 *
 * @see de.hsu.grafcet.GrafcetPackage#getEnclosingStep()
 * @model
 * @generated
 */
public interface EnclosingStep extends InitializableType {
	/**
	 * Returns the value of the '<em><b>Partial Grafcets</b></em>' reference list.
	 * The list contents are of type {@link de.hsu.grafcet.PartialGrafcet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial Grafcets</em>' reference list.
	 * @see de.hsu.grafcet.GrafcetPackage#getEnclosingStep_PartialGrafcets()
	 * @model required="true"
	 * @generated
	 */
	EList<PartialGrafcet> getPartialGrafcets();

} // EnclosingStep
