/**
 */
package de.hsu.grafcet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forcing Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.ForcingOrder#getPartialGrafcet <em>Partial Grafcet</em>}</li>
 *   <li>{@link de.hsu.grafcet.ForcingOrder#getForcedSteps <em>Forced Steps</em>}</li>
 *   <li>{@link de.hsu.grafcet.ForcingOrder#getForcingOrderType <em>Forcing Order Type</em>}</li>
 * </ul>
 *
 * @see de.hsu.grafcet.GrafcetPackage#getForcingOrder()
 * @model
 * @generated
 */
public interface ForcingOrder extends ActionType {
	/**
	 * Returns the value of the '<em><b>Partial Grafcet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial Grafcet</em>' reference.
	 * @see #setPartialGrafcet(PartialGrafcet)
	 * @see de.hsu.grafcet.GrafcetPackage#getForcingOrder_PartialGrafcet()
	 * @model required="true"
	 * @generated
	 */
	PartialGrafcet getPartialGrafcet();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.ForcingOrder#getPartialGrafcet <em>Partial Grafcet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial Grafcet</em>' reference.
	 * @see #getPartialGrafcet()
	 * @generated
	 */
	void setPartialGrafcet(PartialGrafcet value);

	/**
	 * Returns the value of the '<em><b>Forced Steps</b></em>' reference list.
	 * The list contents are of type {@link de.hsu.grafcet.InitializableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forced Steps</em>' reference list.
	 * @see de.hsu.grafcet.GrafcetPackage#getForcingOrder_ForcedSteps()
	 * @model
	 * @generated
	 */
	EList<InitializableType> getForcedSteps();

	/**
	 * Returns the value of the '<em><b>Forcing Order Type</b></em>' attribute.
	 * The default value is <code>"currentSituation"</code>.
	 * The literals are from the enumeration {@link de.hsu.grafcet.ForcingOrderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forcing Order Type</em>' attribute.
	 * @see de.hsu.grafcet.ForcingOrderType
	 * @see #setForcingOrderType(ForcingOrderType)
	 * @see de.hsu.grafcet.GrafcetPackage#getForcingOrder_ForcingOrderType()
	 * @model default="currentSituation"
	 * @generated
	 */
	ForcingOrderType getForcingOrderType();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.ForcingOrder#getForcingOrderType <em>Forcing Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forcing Order Type</em>' attribute.
	 * @see de.hsu.grafcet.ForcingOrderType
	 * @see #getForcingOrderType()
	 * @generated
	 */
	void setForcingOrderType(ForcingOrderType value);

} // ForcingOrder
