/**
 */
package de.hsu.grafcet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grafcet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.Grafcet#getName <em>Name</em>}</li>
 *   <li>{@link de.hsu.grafcet.Grafcet#getVariableDeclarationContainer <em>Variable Declaration Container</em>}</li>
 *   <li>{@link de.hsu.grafcet.Grafcet#getPartialGrafcets <em>Partial Grafcets</em>}</li>
 *   <li>{@link de.hsu.grafcet.Grafcet#getSteps <em>Steps</em>}</li>
 *   <li>{@link de.hsu.grafcet.Grafcet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.hsu.grafcet.Grafcet#getSynchronizations <em>Synchronizations</em>}</li>
 *   <li>{@link de.hsu.grafcet.Grafcet#getMacrosteps <em>Macrosteps</em>}</li>
 *   <li>{@link de.hsu.grafcet.Grafcet#getArcs <em>Arcs</em>}</li>
 *   <li>{@link de.hsu.grafcet.Grafcet#getActionTypes <em>Action Types</em>}</li>
 *   <li>{@link de.hsu.grafcet.Grafcet#getActionLinks <em>Action Links</em>}</li>
 *   <li>{@link de.hsu.grafcet.Grafcet#getControlGrafcet <em>Control Grafcet</em>}</li>
 *   <li>{@link de.hsu.grafcet.Grafcet#getProcessGrafcet <em>Process Grafcet</em>}</li>
 * </ul>
 *
 * @see de.hsu.grafcet.GrafcetPackage#getGrafcet()
 * @model
 * @generated
 */
public interface Grafcet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"GRAFCETChart"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.hsu.grafcet.GrafcetPackage#getGrafcet_Name()
	 * @model default="GRAFCETChart" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.Grafcet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variable Declaration Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declaration Container</em>' containment reference.
	 * @see #setVariableDeclarationContainer(VariableDeclarationContainer)
	 * @see de.hsu.grafcet.GrafcetPackage#getGrafcet_VariableDeclarationContainer()
	 * @model containment="true"
	 * @generated
	 */
	VariableDeclarationContainer getVariableDeclarationContainer();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.Grafcet#getVariableDeclarationContainer <em>Variable Declaration Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Declaration Container</em>' containment reference.
	 * @see #getVariableDeclarationContainer()
	 * @generated
	 */
	void setVariableDeclarationContainer(VariableDeclarationContainer value);

	/**
	 * Returns the value of the '<em><b>Partial Grafcets</b></em>' containment reference list.
	 * The list contents are of type {@link de.hsu.grafcet.Grafcet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial Grafcets</em>' containment reference list.
	 * @see de.hsu.grafcet.GrafcetPackage#getGrafcet_PartialGrafcets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Grafcet> getPartialGrafcets();

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link de.hsu.grafcet.InitializableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see de.hsu.grafcet.GrafcetPackage#getGrafcet_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<InitializableType> getSteps();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.hsu.grafcet.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see de.hsu.grafcet.GrafcetPackage#getGrafcet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Synchronizations</b></em>' containment reference list.
	 * The list contents are of type {@link de.hsu.grafcet.Synchronization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronizations</em>' containment reference list.
	 * @see de.hsu.grafcet.GrafcetPackage#getGrafcet_Synchronizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Synchronization> getSynchronizations();

	/**
	 * Returns the value of the '<em><b>Macrosteps</b></em>' containment reference list.
	 * The list contents are of type {@link de.hsu.grafcet.Macrostep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macrosteps</em>' containment reference list.
	 * @see de.hsu.grafcet.GrafcetPackage#getGrafcet_Macrosteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Macrostep> getMacrosteps();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link de.hsu.grafcet.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see de.hsu.grafcet.GrafcetPackage#getGrafcet_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Action Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.hsu.grafcet.ActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Types</em>' containment reference list.
	 * @see de.hsu.grafcet.GrafcetPackage#getGrafcet_ActionTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionType> getActionTypes();

	/**
	 * Returns the value of the '<em><b>Action Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.hsu.grafcet.ActionLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Links</em>' containment reference list.
	 * @see de.hsu.grafcet.GrafcetPackage#getGrafcet_ActionLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionLink> getActionLinks();

	/**
	 * Returns the value of the '<em><b>Control Grafcet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Grafcet</em>' reference.
	 * @see #setControlGrafcet(ControlGrafcet)
	 * @see de.hsu.grafcet.GrafcetPackage#getGrafcet_ControlGrafcet()
	 * @model required="true"
	 * @generated
	 */
	ControlGrafcet getControlGrafcet();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.Grafcet#getControlGrafcet <em>Control Grafcet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Grafcet</em>' reference.
	 * @see #getControlGrafcet()
	 * @generated
	 */
	void setControlGrafcet(ControlGrafcet value);

	/**
	 * Returns the value of the '<em><b>Process Grafcet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Grafcet</em>' reference.
	 * @see #setProcessGrafcet(ProcessGrafcet)
	 * @see de.hsu.grafcet.GrafcetPackage#getGrafcet_ProcessGrafcet()
	 * @model
	 * @generated
	 */
	ProcessGrafcet getProcessGrafcet();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.Grafcet#getProcessGrafcet <em>Process Grafcet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Grafcet</em>' reference.
	 * @see #getProcessGrafcet()
	 * @generated
	 */
	void setProcessGrafcet(ProcessGrafcet value);

} // Grafcet
