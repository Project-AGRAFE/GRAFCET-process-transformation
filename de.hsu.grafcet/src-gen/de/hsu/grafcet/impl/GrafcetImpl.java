/**
 */
package de.hsu.grafcet.impl;

import de.hsu.grafcet.ActionLink;
import de.hsu.grafcet.ActionType;
import de.hsu.grafcet.Arc;
import de.hsu.grafcet.ControlGrafcet;
import de.hsu.grafcet.Grafcet;
import de.hsu.grafcet.GrafcetPackage;
import de.hsu.grafcet.InitializableType;
import de.hsu.grafcet.Macrostep;
import de.hsu.grafcet.ProcessGrafcet;
import de.hsu.grafcet.Synchronization;
import de.hsu.grafcet.Transition;
import de.hsu.grafcet.VariableDeclarationContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grafcet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.impl.GrafcetImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.GrafcetImpl#getVariableDeclarationContainer <em>Variable Declaration Container</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.GrafcetImpl#getPartialGrafcets <em>Partial Grafcets</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.GrafcetImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.GrafcetImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.GrafcetImpl#getSynchronizations <em>Synchronizations</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.GrafcetImpl#getMacrosteps <em>Macrosteps</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.GrafcetImpl#getArcs <em>Arcs</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.GrafcetImpl#getActionTypes <em>Action Types</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.GrafcetImpl#getActionLinks <em>Action Links</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.GrafcetImpl#getControlGrafcet <em>Control Grafcet</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.GrafcetImpl#getProcessGrafcet <em>Process Grafcet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrafcetImpl extends MinimalEObjectImpl.Container implements Grafcet {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "GRAFCETChart";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariableDeclarationContainer() <em>Variable Declaration Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDeclarationContainer()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclarationContainer variableDeclarationContainer;

	/**
	 * The cached value of the '{@link #getPartialGrafcets() <em>Partial Grafcets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialGrafcets()
	 * @generated
	 * @ordered
	 */
	protected EList<Grafcet> partialGrafcets;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<InitializableType> steps;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getSynchronizations() <em>Synchronizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Synchronization> synchronizations;

	/**
	 * The cached value of the '{@link #getMacrosteps() <em>Macrosteps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacrosteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Macrostep> macrosteps;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getActionTypes() <em>Action Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionType> actionTypes;

	/**
	 * The cached value of the '{@link #getActionLinks() <em>Action Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionLink> actionLinks;

	/**
	 * The cached value of the '{@link #getControlGrafcet() <em>Control Grafcet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlGrafcet()
	 * @generated
	 * @ordered
	 */
	protected ControlGrafcet controlGrafcet;

	/**
	 * The cached value of the '{@link #getProcessGrafcet() <em>Process Grafcet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessGrafcet()
	 * @generated
	 * @ordered
	 */
	protected ProcessGrafcet processGrafcet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrafcetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.GRAFCET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationContainer getVariableDeclarationContainer() {
		return variableDeclarationContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDeclarationContainer(
			VariableDeclarationContainer newVariableDeclarationContainer, NotificationChain msgs) {
		VariableDeclarationContainer oldVariableDeclarationContainer = variableDeclarationContainer;
		variableDeclarationContainer = newVariableDeclarationContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GrafcetPackage.GRAFCET__VARIABLE_DECLARATION_CONTAINER, oldVariableDeclarationContainer,
					newVariableDeclarationContainer);
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
	public void setVariableDeclarationContainer(VariableDeclarationContainer newVariableDeclarationContainer) {
		if (newVariableDeclarationContainer != variableDeclarationContainer) {
			NotificationChain msgs = null;
			if (variableDeclarationContainer != null)
				msgs = ((InternalEObject) variableDeclarationContainer).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GrafcetPackage.GRAFCET__VARIABLE_DECLARATION_CONTAINER, null, msgs);
			if (newVariableDeclarationContainer != null)
				msgs = ((InternalEObject) newVariableDeclarationContainer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GrafcetPackage.GRAFCET__VARIABLE_DECLARATION_CONTAINER, null, msgs);
			msgs = basicSetVariableDeclarationContainer(newVariableDeclarationContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GrafcetPackage.GRAFCET__VARIABLE_DECLARATION_CONTAINER, newVariableDeclarationContainer,
					newVariableDeclarationContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Grafcet> getPartialGrafcets() {
		if (partialGrafcets == null) {
			partialGrafcets = new EObjectContainmentEList<Grafcet>(Grafcet.class, this,
					GrafcetPackage.GRAFCET__PARTIAL_GRAFCETS);
		}
		return partialGrafcets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitializableType> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<InitializableType>(InitializableType.class, this,
					GrafcetPackage.GRAFCET__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this,
					GrafcetPackage.GRAFCET__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Synchronization> getSynchronizations() {
		if (synchronizations == null) {
			synchronizations = new EObjectContainmentEList<Synchronization>(Synchronization.class, this,
					GrafcetPackage.GRAFCET__SYNCHRONIZATIONS);
		}
		return synchronizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Macrostep> getMacrosteps() {
		if (macrosteps == null) {
			macrosteps = new EObjectContainmentEList<Macrostep>(Macrostep.class, this,
					GrafcetPackage.GRAFCET__MACROSTEPS);
		}
		return macrosteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArcs() {
		if (arcs == null) {
			arcs = new EObjectContainmentEList<Arc>(Arc.class, this, GrafcetPackage.GRAFCET__ARCS);
		}
		return arcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionType> getActionTypes() {
		if (actionTypes == null) {
			actionTypes = new EObjectContainmentEList<ActionType>(ActionType.class, this,
					GrafcetPackage.GRAFCET__ACTION_TYPES);
		}
		return actionTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionLink> getActionLinks() {
		if (actionLinks == null) {
			actionLinks = new EObjectContainmentEList<ActionLink>(ActionLink.class, this,
					GrafcetPackage.GRAFCET__ACTION_LINKS);
		}
		return actionLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlGrafcet getControlGrafcet() {
		if (controlGrafcet != null && controlGrafcet.eIsProxy()) {
			InternalEObject oldControlGrafcet = (InternalEObject) controlGrafcet;
			controlGrafcet = (ControlGrafcet) eResolveProxy(oldControlGrafcet);
			if (controlGrafcet != oldControlGrafcet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetPackage.GRAFCET__CONTROL_GRAFCET,
							oldControlGrafcet, controlGrafcet));
			}
		}
		return controlGrafcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlGrafcet basicGetControlGrafcet() {
		return controlGrafcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlGrafcet(ControlGrafcet newControlGrafcet) {
		ControlGrafcet oldControlGrafcet = controlGrafcet;
		controlGrafcet = newControlGrafcet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET__CONTROL_GRAFCET,
					oldControlGrafcet, controlGrafcet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessGrafcet getProcessGrafcet() {
		if (processGrafcet != null && processGrafcet.eIsProxy()) {
			InternalEObject oldProcessGrafcet = (InternalEObject) processGrafcet;
			processGrafcet = (ProcessGrafcet) eResolveProxy(oldProcessGrafcet);
			if (processGrafcet != oldProcessGrafcet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetPackage.GRAFCET__PROCESS_GRAFCET,
							oldProcessGrafcet, processGrafcet));
			}
		}
		return processGrafcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessGrafcet basicGetProcessGrafcet() {
		return processGrafcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessGrafcet(ProcessGrafcet newProcessGrafcet) {
		ProcessGrafcet oldProcessGrafcet = processGrafcet;
		processGrafcet = newProcessGrafcet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET__PROCESS_GRAFCET,
					oldProcessGrafcet, processGrafcet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GrafcetPackage.GRAFCET__VARIABLE_DECLARATION_CONTAINER:
			return basicSetVariableDeclarationContainer(null, msgs);
		case GrafcetPackage.GRAFCET__PARTIAL_GRAFCETS:
			return ((InternalEList<?>) getPartialGrafcets()).basicRemove(otherEnd, msgs);
		case GrafcetPackage.GRAFCET__STEPS:
			return ((InternalEList<?>) getSteps()).basicRemove(otherEnd, msgs);
		case GrafcetPackage.GRAFCET__TRANSITIONS:
			return ((InternalEList<?>) getTransitions()).basicRemove(otherEnd, msgs);
		case GrafcetPackage.GRAFCET__SYNCHRONIZATIONS:
			return ((InternalEList<?>) getSynchronizations()).basicRemove(otherEnd, msgs);
		case GrafcetPackage.GRAFCET__MACROSTEPS:
			return ((InternalEList<?>) getMacrosteps()).basicRemove(otherEnd, msgs);
		case GrafcetPackage.GRAFCET__ARCS:
			return ((InternalEList<?>) getArcs()).basicRemove(otherEnd, msgs);
		case GrafcetPackage.GRAFCET__ACTION_TYPES:
			return ((InternalEList<?>) getActionTypes()).basicRemove(otherEnd, msgs);
		case GrafcetPackage.GRAFCET__ACTION_LINKS:
			return ((InternalEList<?>) getActionLinks()).basicRemove(otherEnd, msgs);
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
		case GrafcetPackage.GRAFCET__NAME:
			return getName();
		case GrafcetPackage.GRAFCET__VARIABLE_DECLARATION_CONTAINER:
			return getVariableDeclarationContainer();
		case GrafcetPackage.GRAFCET__PARTIAL_GRAFCETS:
			return getPartialGrafcets();
		case GrafcetPackage.GRAFCET__STEPS:
			return getSteps();
		case GrafcetPackage.GRAFCET__TRANSITIONS:
			return getTransitions();
		case GrafcetPackage.GRAFCET__SYNCHRONIZATIONS:
			return getSynchronizations();
		case GrafcetPackage.GRAFCET__MACROSTEPS:
			return getMacrosteps();
		case GrafcetPackage.GRAFCET__ARCS:
			return getArcs();
		case GrafcetPackage.GRAFCET__ACTION_TYPES:
			return getActionTypes();
		case GrafcetPackage.GRAFCET__ACTION_LINKS:
			return getActionLinks();
		case GrafcetPackage.GRAFCET__CONTROL_GRAFCET:
			if (resolve)
				return getControlGrafcet();
			return basicGetControlGrafcet();
		case GrafcetPackage.GRAFCET__PROCESS_GRAFCET:
			if (resolve)
				return getProcessGrafcet();
			return basicGetProcessGrafcet();
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
		case GrafcetPackage.GRAFCET__NAME:
			setName((String) newValue);
			return;
		case GrafcetPackage.GRAFCET__VARIABLE_DECLARATION_CONTAINER:
			setVariableDeclarationContainer((VariableDeclarationContainer) newValue);
			return;
		case GrafcetPackage.GRAFCET__PARTIAL_GRAFCETS:
			getPartialGrafcets().clear();
			getPartialGrafcets().addAll((Collection<? extends Grafcet>) newValue);
			return;
		case GrafcetPackage.GRAFCET__STEPS:
			getSteps().clear();
			getSteps().addAll((Collection<? extends InitializableType>) newValue);
			return;
		case GrafcetPackage.GRAFCET__TRANSITIONS:
			getTransitions().clear();
			getTransitions().addAll((Collection<? extends Transition>) newValue);
			return;
		case GrafcetPackage.GRAFCET__SYNCHRONIZATIONS:
			getSynchronizations().clear();
			getSynchronizations().addAll((Collection<? extends Synchronization>) newValue);
			return;
		case GrafcetPackage.GRAFCET__MACROSTEPS:
			getMacrosteps().clear();
			getMacrosteps().addAll((Collection<? extends Macrostep>) newValue);
			return;
		case GrafcetPackage.GRAFCET__ARCS:
			getArcs().clear();
			getArcs().addAll((Collection<? extends Arc>) newValue);
			return;
		case GrafcetPackage.GRAFCET__ACTION_TYPES:
			getActionTypes().clear();
			getActionTypes().addAll((Collection<? extends ActionType>) newValue);
			return;
		case GrafcetPackage.GRAFCET__ACTION_LINKS:
			getActionLinks().clear();
			getActionLinks().addAll((Collection<? extends ActionLink>) newValue);
			return;
		case GrafcetPackage.GRAFCET__CONTROL_GRAFCET:
			setControlGrafcet((ControlGrafcet) newValue);
			return;
		case GrafcetPackage.GRAFCET__PROCESS_GRAFCET:
			setProcessGrafcet((ProcessGrafcet) newValue);
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
		case GrafcetPackage.GRAFCET__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GrafcetPackage.GRAFCET__VARIABLE_DECLARATION_CONTAINER:
			setVariableDeclarationContainer((VariableDeclarationContainer) null);
			return;
		case GrafcetPackage.GRAFCET__PARTIAL_GRAFCETS:
			getPartialGrafcets().clear();
			return;
		case GrafcetPackage.GRAFCET__STEPS:
			getSteps().clear();
			return;
		case GrafcetPackage.GRAFCET__TRANSITIONS:
			getTransitions().clear();
			return;
		case GrafcetPackage.GRAFCET__SYNCHRONIZATIONS:
			getSynchronizations().clear();
			return;
		case GrafcetPackage.GRAFCET__MACROSTEPS:
			getMacrosteps().clear();
			return;
		case GrafcetPackage.GRAFCET__ARCS:
			getArcs().clear();
			return;
		case GrafcetPackage.GRAFCET__ACTION_TYPES:
			getActionTypes().clear();
			return;
		case GrafcetPackage.GRAFCET__ACTION_LINKS:
			getActionLinks().clear();
			return;
		case GrafcetPackage.GRAFCET__CONTROL_GRAFCET:
			setControlGrafcet((ControlGrafcet) null);
			return;
		case GrafcetPackage.GRAFCET__PROCESS_GRAFCET:
			setProcessGrafcet((ProcessGrafcet) null);
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
		case GrafcetPackage.GRAFCET__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GrafcetPackage.GRAFCET__VARIABLE_DECLARATION_CONTAINER:
			return variableDeclarationContainer != null;
		case GrafcetPackage.GRAFCET__PARTIAL_GRAFCETS:
			return partialGrafcets != null && !partialGrafcets.isEmpty();
		case GrafcetPackage.GRAFCET__STEPS:
			return steps != null && !steps.isEmpty();
		case GrafcetPackage.GRAFCET__TRANSITIONS:
			return transitions != null && !transitions.isEmpty();
		case GrafcetPackage.GRAFCET__SYNCHRONIZATIONS:
			return synchronizations != null && !synchronizations.isEmpty();
		case GrafcetPackage.GRAFCET__MACROSTEPS:
			return macrosteps != null && !macrosteps.isEmpty();
		case GrafcetPackage.GRAFCET__ARCS:
			return arcs != null && !arcs.isEmpty();
		case GrafcetPackage.GRAFCET__ACTION_TYPES:
			return actionTypes != null && !actionTypes.isEmpty();
		case GrafcetPackage.GRAFCET__ACTION_LINKS:
			return actionLinks != null && !actionLinks.isEmpty();
		case GrafcetPackage.GRAFCET__CONTROL_GRAFCET:
			return controlGrafcet != null;
		case GrafcetPackage.GRAFCET__PROCESS_GRAFCET:
			return processGrafcet != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GrafcetImpl
