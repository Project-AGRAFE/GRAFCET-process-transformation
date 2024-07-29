/**
 */
package de.hsu.grafcet.util;

import de.hsu.grafcet.*;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.hsu.grafcet.GrafcetPackage
 * @generated
 */
public class GrafcetValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GrafcetValidator INSTANCE = new GrafcetValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.hsu.grafcet";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Action Output Variable Type' of 'Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTION__ACTION_OUTPUT_VARIABLE_TYPE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Stored Action Cond Type' of 'Stored Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STORED_ACTION__STORED_ACTION_COND_TYPE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Stored Action Var Type' of 'Stored Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STORED_ACTION__STORED_ACTION_VAR_TYPE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuous Action Cond Type' of 'Continuous Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUOUS_ACTION__CONTINUOUS_ACTION_COND_TYPE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuous Action Var Type' of 'Continuous Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUOUS_ACTION__CONTINUOUS_ACTION_VAR_TYPE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Condition Term Type' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_TERM_TYPE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Condition Variable Type' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_VARIABLE_TYPE = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return GrafcetPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case GrafcetPackage.GRAFCET:
			return validateGrafcet((Grafcet) value, diagnostics, context);
		case GrafcetPackage.VARIABLE_DECLARATION_CONTAINER:
			return validateVariableDeclarationContainer((VariableDeclarationContainer) value, diagnostics, context);
		case GrafcetPackage.PARTIAL_GRAFCET:
			return validatePartialGrafcet((PartialGrafcet) value, diagnostics, context);
		case GrafcetPackage.MACROSTEP_EXPANSION:
			return validateMacrostepExpansion((MacrostepExpansion) value, diagnostics, context);
		case GrafcetPackage.NODE:
			return validateNode((Node) value, diagnostics, context);
		case GrafcetPackage.INITIALIZABLE_TYPE:
			return validateInitializableType((InitializableType) value, diagnostics, context);
		case GrafcetPackage.ENCLOSING_STEP:
			return validateEnclosingStep((EnclosingStep) value, diagnostics, context);
		case GrafcetPackage.STEP:
			return validateStep((Step) value, diagnostics, context);
		case GrafcetPackage.TRANSITION:
			return validateTransition((Transition) value, diagnostics, context);
		case GrafcetPackage.SYNCHRONIZATION:
			return validateSynchronization((Synchronization) value, diagnostics, context);
		case GrafcetPackage.MACROSTEP:
			return validateMacrostep((Macrostep) value, diagnostics, context);
		case GrafcetPackage.ENTRY_STEP:
			return validateEntryStep((EntryStep) value, diagnostics, context);
		case GrafcetPackage.EXIT_STEP:
			return validateExitStep((ExitStep) value, diagnostics, context);
		case GrafcetPackage.ARC:
			return validateArc((Arc) value, diagnostics, context);
		case GrafcetPackage.ACTION_TYPE:
			return validateActionType((ActionType) value, diagnostics, context);
		case GrafcetPackage.FORCING_ORDER:
			return validateForcingOrder((ForcingOrder) value, diagnostics, context);
		case GrafcetPackage.ACTION:
			return validateAction((Action) value, diagnostics, context);
		case GrafcetPackage.STORED_ACTION:
			return validateStoredAction((StoredAction) value, diagnostics, context);
		case GrafcetPackage.CONTINUOUS_ACTION:
			return validateContinuousAction((ContinuousAction) value, diagnostics, context);
		case GrafcetPackage.ACTION_LINK:
			return validateActionLink((ActionLink) value, diagnostics, context);
		case GrafcetPackage.TIME_CONDITION:
			return validateTimeCondition((TimeCondition) value, diagnostics, context);
		case GrafcetPackage.CONDITION:
			return validateCondition((Condition) value, diagnostics, context);
		case GrafcetPackage.PROCESS_GRAFCET:
			return validateProcessGrafcet((ProcessGrafcet) value, diagnostics, context);
		case GrafcetPackage.CONTROL_GRAFCET:
			return validateControlGrafcet((ControlGrafcet) value, diagnostics, context);
		case GrafcetPackage.FORCING_ORDER_TYPE:
			return validateForcingOrderType((ForcingOrderType) value, diagnostics, context);
		case GrafcetPackage.STORED_ACTION_TYPE:
			return validateStoredActionType((StoredActionType) value, diagnostics, context);
		case GrafcetPackage.CONTINUOUS_ACTION_TYPE:
			return validateContinuousActionType((ContinuousActionType) value, diagnostics, context);
		case GrafcetPackage.TIME_UNIT:
			return validateTimeUnit((TimeUnit) value, diagnostics, context);
		case GrafcetPackage.TIME_CONDITION_TYPE:
			return validateTimeConditionType((TimeConditionType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrafcet(Grafcet grafcet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(grafcet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableDeclarationContainer(VariableDeclarationContainer variableDeclarationContainer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableDeclarationContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartialGrafcet(PartialGrafcet partialGrafcet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partialGrafcet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMacrostepExpansion(MacrostepExpansion macrostepExpansion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(macrostepExpansion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(node, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitializableType(InitializableType initializableType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initializableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnclosingStep(EnclosingStep enclosingStep, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enclosingStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(step, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCondition_ConditionVariableType(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCondition_ConditionTermType(transition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronization(Synchronization synchronization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synchronization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMacrostep(Macrostep macrostep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(macrostep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryStep(EntryStep entryStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExitStep(ExitStep exitStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exitStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc(Arc arc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForcingOrder(ForcingOrder forcingOrder, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forcingOrder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(action, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAction_ActionOutputVariableType(action, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ActionOutputVariableType constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction_ActionOutputVariableType(Action action, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return action.ActionOutputVariableType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoredAction(StoredAction storedAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storedAction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(storedAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(storedAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(storedAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(storedAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(storedAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(storedAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(storedAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(storedAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAction_ActionOutputVariableType(storedAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCondition_ConditionVariableType(storedAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCondition_ConditionTermType(storedAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateStoredAction_StoredActionVarType(storedAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateStoredAction_StoredActionCondType(storedAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the StoredActionVarType constraint of '<em>Stored Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoredAction_StoredActionVarType(StoredAction storedAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return storedAction.StoredActionVarType(diagnostics, context);
	}

	/**
	 * Validates the StoredActionCondType constraint of '<em>Stored Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoredAction_StoredActionCondType(StoredAction storedAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return storedAction.StoredActionCondType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousAction(ContinuousAction continuousAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(continuousAction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(continuousAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(continuousAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(continuousAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(continuousAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(continuousAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(continuousAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(continuousAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(continuousAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAction_ActionOutputVariableType(continuousAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCondition_ConditionVariableType(continuousAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCondition_ConditionTermType(continuousAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateContinuousAction_ContinuousActionVarType(continuousAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateContinuousAction_ContinuousActionCondType(continuousAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ContinuousActionVarType constraint of '<em>Continuous Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousAction_ContinuousActionVarType(ContinuousAction continuousAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuousAction.ContinuousActionVarType(diagnostics, context);
	}

	/**
	 * Validates the ContinuousActionCondType constraint of '<em>Continuous Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousAction_ContinuousActionCondType(ContinuousAction continuousAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuousAction.ContinuousActionCondType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionLink(ActionLink actionLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeCondition(TimeCondition timeCondition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeCondition, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(timeCondition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(timeCondition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(timeCondition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(timeCondition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(timeCondition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(timeCondition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(timeCondition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(timeCondition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCondition_ConditionVariableType(timeCondition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCondition_ConditionTermType(timeCondition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(condition, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(condition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(condition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(condition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(condition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(condition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(condition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(condition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(condition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCondition_ConditionVariableType(condition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCondition_ConditionTermType(condition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConditionTermType constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_ConditionTermType(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condition.ConditionTermType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessGrafcet(ProcessGrafcet processGrafcet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processGrafcet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlGrafcet(ControlGrafcet controlGrafcet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlGrafcet, diagnostics, context);
	}

	/**
	 * Validates the ConditionVariableType constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_ConditionVariableType(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condition.ConditionVariableType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForcingOrderType(ForcingOrderType forcingOrderType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoredActionType(StoredActionType storedActionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousActionType(ContinuousActionType continuousActionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnit(TimeUnit timeUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeConditionType(TimeConditionType timeConditionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GrafcetValidator
