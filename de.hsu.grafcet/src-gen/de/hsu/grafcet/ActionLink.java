/**
 */
package de.hsu.grafcet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.ActionLink#getStep <em>Step</em>}</li>
 *   <li>{@link de.hsu.grafcet.ActionLink#getActionType <em>Action Type</em>}</li>
 * </ul>
 *
 * @see de.hsu.grafcet.GrafcetPackage#getActionLink()
 * @model
 * @generated
 */
public interface ActionLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' reference.
	 * @see #setStep(Step)
	 * @see de.hsu.grafcet.GrafcetPackage#getActionLink_Step()
	 * @model required="true"
	 * @generated
	 */
	Step getStep();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.ActionLink#getStep <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(Step value);

	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Type</em>' reference.
	 * @see #setActionType(ActionType)
	 * @see de.hsu.grafcet.GrafcetPackage#getActionLink_ActionType()
	 * @model required="true"
	 * @generated
	 */
	ActionType getActionType();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.ActionLink#getActionType <em>Action Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Type</em>' reference.
	 * @see #getActionType()
	 * @generated
	 */
	void setActionType(ActionType value);

} // ActionLink
