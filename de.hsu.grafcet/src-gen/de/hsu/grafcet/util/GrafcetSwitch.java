/**
 */
package de.hsu.grafcet.util;

import de.hsu.grafcet.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.hsu.grafcet.GrafcetPackage
 * @generated
 */
public class GrafcetSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GrafcetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetSwitch() {
		if (modelPackage == null) {
			modelPackage = GrafcetPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case GrafcetPackage.GRAFCET: {
			Grafcet grafcet = (Grafcet) theEObject;
			T result = caseGrafcet(grafcet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.VARIABLE_DECLARATION_CONTAINER: {
			VariableDeclarationContainer variableDeclarationContainer = (VariableDeclarationContainer) theEObject;
			T result = caseVariableDeclarationContainer(variableDeclarationContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.PARTIAL_GRAFCET: {
			PartialGrafcet partialGrafcet = (PartialGrafcet) theEObject;
			T result = casePartialGrafcet(partialGrafcet);
			if (result == null)
				result = caseGrafcet(partialGrafcet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.MACROSTEP_EXPANSION: {
			MacrostepExpansion macrostepExpansion = (MacrostepExpansion) theEObject;
			T result = caseMacrostepExpansion(macrostepExpansion);
			if (result == null)
				result = caseGrafcet(macrostepExpansion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.INITIALIZABLE_TYPE: {
			InitializableType initializableType = (InitializableType) theEObject;
			T result = caseInitializableType(initializableType);
			if (result == null)
				result = caseNode(initializableType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.ENCLOSING_STEP: {
			EnclosingStep enclosingStep = (EnclosingStep) theEObject;
			T result = caseEnclosingStep(enclosingStep);
			if (result == null)
				result = caseInitializableType(enclosingStep);
			if (result == null)
				result = caseNode(enclosingStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.STEP: {
			Step step = (Step) theEObject;
			T result = caseStep(step);
			if (result == null)
				result = caseInitializableType(step);
			if (result == null)
				result = caseNode(step);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.TRANSITION: {
			Transition transition = (Transition) theEObject;
			T result = caseTransition(transition);
			if (result == null)
				result = caseNode(transition);
			if (result == null)
				result = caseTimeCondition(transition);
			if (result == null)
				result = caseCondition(transition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.SYNCHRONIZATION: {
			Synchronization synchronization = (Synchronization) theEObject;
			T result = caseSynchronization(synchronization);
			if (result == null)
				result = caseNode(synchronization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.MACROSTEP: {
			Macrostep macrostep = (Macrostep) theEObject;
			T result = caseMacrostep(macrostep);
			if (result == null)
				result = caseNode(macrostep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.ENTRY_STEP: {
			EntryStep entryStep = (EntryStep) theEObject;
			T result = caseEntryStep(entryStep);
			if (result == null)
				result = caseNode(entryStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.EXIT_STEP: {
			ExitStep exitStep = (ExitStep) theEObject;
			T result = caseExitStep(exitStep);
			if (result == null)
				result = caseNode(exitStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.ARC: {
			Arc arc = (Arc) theEObject;
			T result = caseArc(arc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.ACTION_TYPE: {
			ActionType actionType = (ActionType) theEObject;
			T result = caseActionType(actionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.FORCING_ORDER: {
			ForcingOrder forcingOrder = (ForcingOrder) theEObject;
			T result = caseForcingOrder(forcingOrder);
			if (result == null)
				result = caseActionType(forcingOrder);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.ACTION: {
			Action action = (Action) theEObject;
			T result = caseAction(action);
			if (result == null)
				result = caseActionType(action);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.STORED_ACTION: {
			StoredAction storedAction = (StoredAction) theEObject;
			T result = caseStoredAction(storedAction);
			if (result == null)
				result = caseAction(storedAction);
			if (result == null)
				result = caseCondition(storedAction);
			if (result == null)
				result = caseActionType(storedAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.CONTINUOUS_ACTION: {
			ContinuousAction continuousAction = (ContinuousAction) theEObject;
			T result = caseContinuousAction(continuousAction);
			if (result == null)
				result = caseAction(continuousAction);
			if (result == null)
				result = caseTimeCondition(continuousAction);
			if (result == null)
				result = caseActionType(continuousAction);
			if (result == null)
				result = caseCondition(continuousAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.ACTION_LINK: {
			ActionLink actionLink = (ActionLink) theEObject;
			T result = caseActionLink(actionLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.TIME_CONDITION: {
			TimeCondition timeCondition = (TimeCondition) theEObject;
			T result = caseTimeCondition(timeCondition);
			if (result == null)
				result = caseCondition(timeCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.PROCESS_GRAFCET: {
			ProcessGrafcet processGrafcet = (ProcessGrafcet) theEObject;
			T result = caseProcessGrafcet(processGrafcet);
			if (result == null)
				result = casePartialGrafcet(processGrafcet);
			if (result == null)
				result = caseGrafcet(processGrafcet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GrafcetPackage.CONTROL_GRAFCET: {
			ControlGrafcet controlGrafcet = (ControlGrafcet) theEObject;
			T result = caseControlGrafcet(controlGrafcet);
			if (result == null)
				result = casePartialGrafcet(controlGrafcet);
			if (result == null)
				result = caseGrafcet(controlGrafcet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grafcet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrafcet(Grafcet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationContainer(VariableDeclarationContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Grafcet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialGrafcet(PartialGrafcet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macrostep Expansion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macrostep Expansion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacrostepExpansion(MacrostepExpansion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initializable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initializable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializableType(InitializableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enclosing Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enclosing Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnclosingStep(EnclosingStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronization(Synchronization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macrostep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macrostep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacrostep(Macrostep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryStep(EntryStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitStep(ExitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionType(ActionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forcing Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forcing Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForcingOrder(ForcingOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stored Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stored Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoredAction(StoredAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousAction(ContinuousAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionLink(ActionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeCondition(TimeCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Grafcet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessGrafcet(ProcessGrafcet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Grafcet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlGrafcet(ControlGrafcet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GrafcetSwitch
