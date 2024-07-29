/**
 */
package de.hsu.grafcet.impl;

import de.hsu.grafcet.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrafcetFactoryImpl extends EFactoryImpl implements GrafcetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GrafcetFactory init() {
		try {
			GrafcetFactory theGrafcetFactory = (GrafcetFactory) EPackage.Registry.INSTANCE
					.getEFactory(GrafcetPackage.eNS_URI);
			if (theGrafcetFactory != null) {
				return theGrafcetFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GrafcetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GrafcetPackage.GRAFCET:
			return createGrafcet();
		case GrafcetPackage.VARIABLE_DECLARATION_CONTAINER:
			return createVariableDeclarationContainer();
		case GrafcetPackage.PARTIAL_GRAFCET:
			return createPartialGrafcet();
		case GrafcetPackage.MACROSTEP_EXPANSION:
			return createMacrostepExpansion();
		case GrafcetPackage.NODE:
			return createNode();
		case GrafcetPackage.INITIALIZABLE_TYPE:
			return createInitializableType();
		case GrafcetPackage.ENCLOSING_STEP:
			return createEnclosingStep();
		case GrafcetPackage.STEP:
			return createStep();
		case GrafcetPackage.TRANSITION:
			return createTransition();
		case GrafcetPackage.SYNCHRONIZATION:
			return createSynchronization();
		case GrafcetPackage.MACROSTEP:
			return createMacrostep();
		case GrafcetPackage.ENTRY_STEP:
			return createEntryStep();
		case GrafcetPackage.EXIT_STEP:
			return createExitStep();
		case GrafcetPackage.ARC:
			return createArc();
		case GrafcetPackage.ACTION_TYPE:
			return createActionType();
		case GrafcetPackage.FORCING_ORDER:
			return createForcingOrder();
		case GrafcetPackage.ACTION:
			return createAction();
		case GrafcetPackage.STORED_ACTION:
			return createStoredAction();
		case GrafcetPackage.CONTINUOUS_ACTION:
			return createContinuousAction();
		case GrafcetPackage.ACTION_LINK:
			return createActionLink();
		case GrafcetPackage.TIME_CONDITION:
			return createTimeCondition();
		case GrafcetPackage.CONDITION:
			return createCondition();
		case GrafcetPackage.PROCESS_GRAFCET:
			return createProcessGrafcet();
		case GrafcetPackage.CONTROL_GRAFCET:
			return createControlGrafcet();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case GrafcetPackage.FORCING_ORDER_TYPE:
			return createForcingOrderTypeFromString(eDataType, initialValue);
		case GrafcetPackage.STORED_ACTION_TYPE:
			return createStoredActionTypeFromString(eDataType, initialValue);
		case GrafcetPackage.CONTINUOUS_ACTION_TYPE:
			return createContinuousActionTypeFromString(eDataType, initialValue);
		case GrafcetPackage.TIME_UNIT:
			return createTimeUnitFromString(eDataType, initialValue);
		case GrafcetPackage.TIME_CONDITION_TYPE:
			return createTimeConditionTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case GrafcetPackage.FORCING_ORDER_TYPE:
			return convertForcingOrderTypeToString(eDataType, instanceValue);
		case GrafcetPackage.STORED_ACTION_TYPE:
			return convertStoredActionTypeToString(eDataType, instanceValue);
		case GrafcetPackage.CONTINUOUS_ACTION_TYPE:
			return convertContinuousActionTypeToString(eDataType, instanceValue);
		case GrafcetPackage.TIME_UNIT:
			return convertTimeUnitToString(eDataType, instanceValue);
		case GrafcetPackage.TIME_CONDITION_TYPE:
			return convertTimeConditionTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grafcet createGrafcet() {
		GrafcetImpl grafcet = new GrafcetImpl();
		return grafcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationContainer createVariableDeclarationContainer() {
		VariableDeclarationContainerImpl variableDeclarationContainer = new VariableDeclarationContainerImpl();
		return variableDeclarationContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialGrafcet createPartialGrafcet() {
		PartialGrafcetImpl partialGrafcet = new PartialGrafcetImpl();
		return partialGrafcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacrostepExpansion createMacrostepExpansion() {
		MacrostepExpansionImpl macrostepExpansion = new MacrostepExpansionImpl();
		return macrostepExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializableType createInitializableType() {
		InitializableTypeImpl initializableType = new InitializableTypeImpl();
		return initializableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnclosingStep createEnclosingStep() {
		EnclosingStepImpl enclosingStep = new EnclosingStepImpl();
		return enclosingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}
	
	/**
	 * custom create with id
	 */
	public Step createStep(int id) {
		StepImpl step = new StepImpl();
		step.setId(id);
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization createSynchronization() {
		SynchronizationImpl synchronization = new SynchronizationImpl();
		return synchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Macrostep createMacrostep() {
		MacrostepImpl macrostep = new MacrostepImpl();
		return macrostep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryStep createEntryStep() {
		EntryStepImpl entryStep = new EntryStepImpl();
		return entryStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitStep createExitStep() {
		ExitStepImpl exitStep = new ExitStepImpl();
		return exitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionType() {
		ActionTypeImpl actionType = new ActionTypeImpl();
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForcingOrder createForcingOrder() {
		ForcingOrderImpl forcingOrder = new ForcingOrderImpl();
		return forcingOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoredAction createStoredAction() {
		StoredActionImpl storedAction = new StoredActionImpl();
		return storedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousAction createContinuousAction() {
		ContinuousActionImpl continuousAction = new ContinuousActionImpl();
		return continuousAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionLink createActionLink() {
		ActionLinkImpl actionLink = new ActionLinkImpl();
		return actionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeCondition createTimeCondition() {
		TimeConditionImpl timeCondition = new TimeConditionImpl();
		return timeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessGrafcet createProcessGrafcet() {
		ProcessGrafcetImpl processGrafcet = new ProcessGrafcetImpl();
		return processGrafcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlGrafcet createControlGrafcet() {
		ControlGrafcetImpl controlGrafcet = new ControlGrafcetImpl();
		return controlGrafcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForcingOrderType createForcingOrderTypeFromString(EDataType eDataType, String initialValue) {
		ForcingOrderType result = ForcingOrderType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertForcingOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoredActionType createStoredActionTypeFromString(EDataType eDataType, String initialValue) {
		StoredActionType result = StoredActionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStoredActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousActionType createContinuousActionTypeFromString(EDataType eDataType, String initialValue) {
		ContinuousActionType result = ContinuousActionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuousActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
		TimeUnit result = TimeUnit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConditionType createTimeConditionTypeFromString(EDataType eDataType, String initialValue) {
		TimeConditionType result = TimeConditionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeConditionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetPackage getGrafcetPackage() {
		return (GrafcetPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GrafcetPackage getPackage() {
		return GrafcetPackage.eINSTANCE;
	}

} //GrafcetFactoryImpl
