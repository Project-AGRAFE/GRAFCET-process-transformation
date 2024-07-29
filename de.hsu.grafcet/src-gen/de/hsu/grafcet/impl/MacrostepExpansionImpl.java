/**
 */
package de.hsu.grafcet.impl;

import de.hsu.grafcet.EntryStep;
import de.hsu.grafcet.ExitStep;
import de.hsu.grafcet.GrafcetPackage;
import de.hsu.grafcet.MacrostepExpansion;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Macrostep Expansion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.impl.MacrostepExpansionImpl#getEntryStep <em>Entry Step</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.MacrostepExpansionImpl#getExitStep <em>Exit Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MacrostepExpansionImpl extends GrafcetImpl implements MacrostepExpansion {
	/**
	 * The cached value of the '{@link #getEntryStep() <em>Entry Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryStep()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryStep> entryStep;

	/**
	 * The cached value of the '{@link #getExitStep() <em>Exit Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitStep()
	 * @generated
	 * @ordered
	 */
	protected ExitStep exitStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MacrostepExpansionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.MACROSTEP_EXPANSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryStep> getEntryStep() {
		if (entryStep == null) {
			entryStep = new EObjectContainmentEList<EntryStep>(EntryStep.class, this,
					GrafcetPackage.MACROSTEP_EXPANSION__ENTRY_STEP);
		}
		return entryStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitStep getExitStep() {
		return exitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExitStep(ExitStep newExitStep, NotificationChain msgs) {
		ExitStep oldExitStep = exitStep;
		exitStep = newExitStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GrafcetPackage.MACROSTEP_EXPANSION__EXIT_STEP, oldExitStep, newExitStep);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitStep(ExitStep newExitStep) {
		if (newExitStep != exitStep) {
			NotificationChain msgs = null;
			if (exitStep != null)
				msgs = ((InternalEObject) exitStep).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GrafcetPackage.MACROSTEP_EXPANSION__EXIT_STEP, null, msgs);
			if (newExitStep != null)
				msgs = ((InternalEObject) newExitStep).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GrafcetPackage.MACROSTEP_EXPANSION__EXIT_STEP, null, msgs);
			msgs = basicSetExitStep(newExitStep, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.MACROSTEP_EXPANSION__EXIT_STEP,
					newExitStep, newExitStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GrafcetPackage.MACROSTEP_EXPANSION__ENTRY_STEP:
			return ((InternalEList<?>) getEntryStep()).basicRemove(otherEnd, msgs);
		case GrafcetPackage.MACROSTEP_EXPANSION__EXIT_STEP:
			return basicSetExitStep(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GrafcetPackage.MACROSTEP_EXPANSION__ENTRY_STEP:
			return getEntryStep();
		case GrafcetPackage.MACROSTEP_EXPANSION__EXIT_STEP:
			return getExitStep();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GrafcetPackage.MACROSTEP_EXPANSION__ENTRY_STEP:
			getEntryStep().clear();
			getEntryStep().addAll((Collection<? extends EntryStep>) newValue);
			return;
		case GrafcetPackage.MACROSTEP_EXPANSION__EXIT_STEP:
			setExitStep((ExitStep) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GrafcetPackage.MACROSTEP_EXPANSION__ENTRY_STEP:
			getEntryStep().clear();
			return;
		case GrafcetPackage.MACROSTEP_EXPANSION__EXIT_STEP:
			setExitStep((ExitStep) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GrafcetPackage.MACROSTEP_EXPANSION__ENTRY_STEP:
			return entryStep != null && !entryStep.isEmpty();
		case GrafcetPackage.MACROSTEP_EXPANSION__EXIT_STEP:
			return exitStep != null;
		}
		return super.eIsSet(featureID);
	}

} //MacrostepExpansionImpl
