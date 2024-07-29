/**
 */
package de.hsu.grafcet.impl;

import de.hsu.grafcet.Action;
import de.hsu.grafcet.ActionLink;
import de.hsu.grafcet.ActionType;
import de.hsu.grafcet.Arc;
import de.hsu.grafcet.Condition;
import de.hsu.grafcet.ContinuousAction;
import de.hsu.grafcet.ContinuousActionType;
import de.hsu.grafcet.ControlGrafcet;
import de.hsu.grafcet.EnclosingStep;
import de.hsu.grafcet.EntryStep;
import de.hsu.grafcet.ExitStep;
import de.hsu.grafcet.ForcingOrder;
import de.hsu.grafcet.ForcingOrderType;
import de.hsu.grafcet.Grafcet;
import de.hsu.grafcet.GrafcetFactory;
import de.hsu.grafcet.GrafcetPackage;
import de.hsu.grafcet.InitializableType;
import de.hsu.grafcet.Macrostep;
import de.hsu.grafcet.MacrostepExpansion;
import de.hsu.grafcet.Node;
import de.hsu.grafcet.PartialGrafcet;
import de.hsu.grafcet.ProcessGrafcet;
import de.hsu.grafcet.Step;
import de.hsu.grafcet.StoredAction;
import de.hsu.grafcet.StoredActionType;
import de.hsu.grafcet.Synchronization;
import de.hsu.grafcet.TimeCondition;
import de.hsu.grafcet.TimeConditionType;
import de.hsu.grafcet.TimeUnit;
import de.hsu.grafcet.Transition;
import de.hsu.grafcet.VariableDeclarationContainer;

import de.hsu.grafcet.util.GrafcetValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import terms.TermsPackage;

import terms.impl.TermsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrafcetPackageImpl extends EPackageImpl implements GrafcetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grafcetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialGrafcetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macrostepExpansionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enclosingStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macrostepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forcingOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storedActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processGrafcetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlGrafcetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum forcingOrderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum storedActionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum continuousActionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeConditionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.hsu.grafcet.GrafcetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GrafcetPackageImpl() {
		super(eNS_URI, GrafcetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GrafcetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GrafcetPackage init() {
		if (isInited)
			return (GrafcetPackage) EPackage.Registry.INSTANCE.getEPackage(GrafcetPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGrafcetPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GrafcetPackageImpl theGrafcetPackage = registeredGrafcetPackage instanceof GrafcetPackageImpl
				? (GrafcetPackageImpl) registeredGrafcetPackage
				: new GrafcetPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl) (registeredPackage instanceof TermsPackageImpl
				? registeredPackage
				: TermsPackage.eINSTANCE);

		// Create package meta-data objects
		theGrafcetPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		theGrafcetPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theGrafcetPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return GrafcetValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theGrafcetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GrafcetPackage.eNS_URI, theGrafcetPackage);
		return theGrafcetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrafcet() {
		return grafcetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafcet_Name() {
		return (EAttribute) grafcetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_VariableDeclarationContainer() {
		return (EReference) grafcetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_PartialGrafcets() {
		return (EReference) grafcetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_Steps() {
		return (EReference) grafcetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_Transitions() {
		return (EReference) grafcetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_Synchronizations() {
		return (EReference) grafcetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_Macrosteps() {
		return (EReference) grafcetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_Arcs() {
		return (EReference) grafcetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_ActionTypes() {
		return (EReference) grafcetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_ActionLinks() {
		return (EReference) grafcetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_ControlGrafcet() {
		return (EReference) grafcetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_ProcessGrafcet() {
		return (EReference) grafcetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclarationContainer() {
		return variableDeclarationContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclarationContainer_VariableDeclarations() {
		return (EReference) variableDeclarationContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialGrafcet() {
		return partialGrafcetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialGrafcet_EnclosingStep() {
		return (EReference) partialGrafcetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacrostepExpansion() {
		return macrostepExpansionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMacrostepExpansion_EntryStep() {
		return (EReference) macrostepExpansionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMacrostepExpansion_ExitStep() {
		return (EReference) macrostepExpansionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Id() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitializableType() {
		return initializableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitializableType_Initial() {
		return (EAttribute) initializableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitializableType_ActivationLink() {
		return (EAttribute) initializableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnclosingStep() {
		return enclosingStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnclosingStep_PartialGrafcets() {
		return (EReference) enclosingStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronization() {
		return synchronizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacrostep() {
		return macrostepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMacrostep_Expansion() {
		return (EReference) macrostepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryStep() {
		return entryStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExitStep() {
		return exitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Source() {
		return (EReference) arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Target() {
		return (EReference) arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionType() {
		return actionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionType_Id() {
		return (EAttribute) actionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForcingOrder() {
		return forcingOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForcingOrder_PartialGrafcet() {
		return (EReference) forcingOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForcingOrder_ForcedSteps() {
		return (EReference) forcingOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForcingOrder_ForcingOrderType() {
		return (EAttribute) forcingOrderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Variable() {
		return (EReference) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__ActionOutputVariableType__DiagnosticChain_Map() {
		return actionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoredAction() {
		return storedActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoredAction_StoredActionType() {
		return (EAttribute) storedActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoredAction_Value() {
		return (EReference) storedActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoredAction__StoredActionCondType__DiagnosticChain_Map() {
		return storedActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoredAction__StoredActionVarType__DiagnosticChain_Map() {
		return storedActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuousAction() {
		return continuousActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuousAction_ContinuousActionType() {
		return (EAttribute) continuousActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuousAction__ContinuousActionCondType__DiagnosticChain_Map() {
		return continuousActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuousAction__ContinuousActionVarType__DiagnosticChain_Map() {
		return continuousActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionLink() {
		return actionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionLink_Step() {
		return (EReference) actionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionLink_ActionType() {
		return (EReference) actionLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeCondition() {
		return timeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCondition_DelayTime() {
		return (EAttribute) timeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCondition_ResetTime() {
		return (EAttribute) timeConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCondition_Unit() {
		return (EAttribute) timeConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCondition_TimeConditionType() {
		return (EAttribute) timeConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Term() {
		return (EReference) conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCondition__ConditionTermType__DiagnosticChain_Map() {
		return conditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCondition__ConditionVariableType__DiagnosticChain_Map() {
		return conditionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessGrafcet() {
		return processGrafcetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlGrafcet() {
		return controlGrafcetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getForcingOrderType() {
		return forcingOrderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStoredActionType() {
		return storedActionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContinuousActionType() {
		return continuousActionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnit() {
		return timeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeConditionType() {
		return timeConditionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetFactory getGrafcetFactory() {
		return (GrafcetFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		grafcetEClass = createEClass(GRAFCET);
		createEAttribute(grafcetEClass, GRAFCET__NAME);
		createEReference(grafcetEClass, GRAFCET__VARIABLE_DECLARATION_CONTAINER);
		createEReference(grafcetEClass, GRAFCET__PARTIAL_GRAFCETS);
		createEReference(grafcetEClass, GRAFCET__STEPS);
		createEReference(grafcetEClass, GRAFCET__TRANSITIONS);
		createEReference(grafcetEClass, GRAFCET__SYNCHRONIZATIONS);
		createEReference(grafcetEClass, GRAFCET__MACROSTEPS);
		createEReference(grafcetEClass, GRAFCET__ARCS);
		createEReference(grafcetEClass, GRAFCET__ACTION_TYPES);
		createEReference(grafcetEClass, GRAFCET__ACTION_LINKS);
		createEReference(grafcetEClass, GRAFCET__CONTROL_GRAFCET);
		createEReference(grafcetEClass, GRAFCET__PROCESS_GRAFCET);

		variableDeclarationContainerEClass = createEClass(VARIABLE_DECLARATION_CONTAINER);
		createEReference(variableDeclarationContainerEClass, VARIABLE_DECLARATION_CONTAINER__VARIABLE_DECLARATIONS);

		partialGrafcetEClass = createEClass(PARTIAL_GRAFCET);
		createEReference(partialGrafcetEClass, PARTIAL_GRAFCET__ENCLOSING_STEP);

		macrostepExpansionEClass = createEClass(MACROSTEP_EXPANSION);
		createEReference(macrostepExpansionEClass, MACROSTEP_EXPANSION__ENTRY_STEP);
		createEReference(macrostepExpansionEClass, MACROSTEP_EXPANSION__EXIT_STEP);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__ID);

		initializableTypeEClass = createEClass(INITIALIZABLE_TYPE);
		createEAttribute(initializableTypeEClass, INITIALIZABLE_TYPE__INITIAL);
		createEAttribute(initializableTypeEClass, INITIALIZABLE_TYPE__ACTIVATION_LINK);

		enclosingStepEClass = createEClass(ENCLOSING_STEP);
		createEReference(enclosingStepEClass, ENCLOSING_STEP__PARTIAL_GRAFCETS);

		stepEClass = createEClass(STEP);

		transitionEClass = createEClass(TRANSITION);

		synchronizationEClass = createEClass(SYNCHRONIZATION);

		macrostepEClass = createEClass(MACROSTEP);
		createEReference(macrostepEClass, MACROSTEP__EXPANSION);

		entryStepEClass = createEClass(ENTRY_STEP);

		exitStepEClass = createEClass(EXIT_STEP);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__SOURCE);
		createEReference(arcEClass, ARC__TARGET);

		actionTypeEClass = createEClass(ACTION_TYPE);
		createEAttribute(actionTypeEClass, ACTION_TYPE__ID);

		forcingOrderEClass = createEClass(FORCING_ORDER);
		createEReference(forcingOrderEClass, FORCING_ORDER__PARTIAL_GRAFCET);
		createEReference(forcingOrderEClass, FORCING_ORDER__FORCED_STEPS);
		createEAttribute(forcingOrderEClass, FORCING_ORDER__FORCING_ORDER_TYPE);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__VARIABLE);
		createEOperation(actionEClass, ACTION___ACTION_OUTPUT_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP);

		storedActionEClass = createEClass(STORED_ACTION);
		createEAttribute(storedActionEClass, STORED_ACTION__STORED_ACTION_TYPE);
		createEReference(storedActionEClass, STORED_ACTION__VALUE);
		createEOperation(storedActionEClass, STORED_ACTION___STORED_ACTION_COND_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(storedActionEClass, STORED_ACTION___STORED_ACTION_VAR_TYPE__DIAGNOSTICCHAIN_MAP);

		continuousActionEClass = createEClass(CONTINUOUS_ACTION);
		createEAttribute(continuousActionEClass, CONTINUOUS_ACTION__CONTINUOUS_ACTION_TYPE);
		createEOperation(continuousActionEClass, CONTINUOUS_ACTION___CONTINUOUS_ACTION_COND_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(continuousActionEClass, CONTINUOUS_ACTION___CONTINUOUS_ACTION_VAR_TYPE__DIAGNOSTICCHAIN_MAP);

		actionLinkEClass = createEClass(ACTION_LINK);
		createEReference(actionLinkEClass, ACTION_LINK__STEP);
		createEReference(actionLinkEClass, ACTION_LINK__ACTION_TYPE);

		timeConditionEClass = createEClass(TIME_CONDITION);
		createEAttribute(timeConditionEClass, TIME_CONDITION__DELAY_TIME);
		createEAttribute(timeConditionEClass, TIME_CONDITION__RESET_TIME);
		createEAttribute(timeConditionEClass, TIME_CONDITION__UNIT);
		createEAttribute(timeConditionEClass, TIME_CONDITION__TIME_CONDITION_TYPE);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__TERM);
		createEOperation(conditionEClass, CONDITION___CONDITION_TERM_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(conditionEClass, CONDITION___CONDITION_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP);

		processGrafcetEClass = createEClass(PROCESS_GRAFCET);

		controlGrafcetEClass = createEClass(CONTROL_GRAFCET);

		// Create enums
		forcingOrderTypeEEnum = createEEnum(FORCING_ORDER_TYPE);
		storedActionTypeEEnum = createEEnum(STORED_ACTION_TYPE);
		continuousActionTypeEEnum = createEEnum(CONTINUOUS_ACTION_TYPE);
		timeUnitEEnum = createEEnum(TIME_UNIT);
		timeConditionTypeEEnum = createEEnum(TIME_CONDITION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TermsPackage theTermsPackage = (TermsPackage) EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		partialGrafcetEClass.getESuperTypes().add(this.getGrafcet());
		macrostepExpansionEClass.getESuperTypes().add(this.getGrafcet());
		initializableTypeEClass.getESuperTypes().add(this.getNode());
		enclosingStepEClass.getESuperTypes().add(this.getInitializableType());
		stepEClass.getESuperTypes().add(this.getInitializableType());
		transitionEClass.getESuperTypes().add(this.getNode());
		transitionEClass.getESuperTypes().add(this.getTimeCondition());
		synchronizationEClass.getESuperTypes().add(this.getNode());
		macrostepEClass.getESuperTypes().add(this.getNode());
		entryStepEClass.getESuperTypes().add(this.getNode());
		exitStepEClass.getESuperTypes().add(this.getNode());
		forcingOrderEClass.getESuperTypes().add(this.getActionType());
		actionEClass.getESuperTypes().add(this.getActionType());
		storedActionEClass.getESuperTypes().add(this.getAction());
		storedActionEClass.getESuperTypes().add(this.getCondition());
		continuousActionEClass.getESuperTypes().add(this.getAction());
		continuousActionEClass.getESuperTypes().add(this.getTimeCondition());
		timeConditionEClass.getESuperTypes().add(this.getCondition());
		processGrafcetEClass.getESuperTypes().add(this.getPartialGrafcet());
		controlGrafcetEClass.getESuperTypes().add(this.getPartialGrafcet());

		// Initialize classes, features, and operations; add parameters
		initEClass(grafcetEClass, Grafcet.class, "Grafcet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrafcet_Name(), ecorePackage.getEString(), "name", "GRAFCETChart", 1, 1, Grafcet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcet_VariableDeclarationContainer(), this.getVariableDeclarationContainer(), null,
				"variableDeclarationContainer", null, 0, 1, Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcet_PartialGrafcets(), this.getGrafcet(), null, "partialGrafcets", null, 0, -1,
				Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcet_Steps(), this.getInitializableType(), null, "steps", null, 0, -1, Grafcet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcet_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, Grafcet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcet_Synchronizations(), this.getSynchronization(), null, "synchronizations", null, 0, -1,
				Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcet_Macrosteps(), this.getMacrostep(), null, "macrosteps", null, 0, -1, Grafcet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcet_Arcs(), this.getArc(), null, "arcs", null, 0, -1, Grafcet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGrafcet_ActionTypes(), this.getActionType(), null, "actionTypes", null, 0, -1, Grafcet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcet_ActionLinks(), this.getActionLink(), null, "actionLinks", null, 0, -1, Grafcet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcet_ControlGrafcet(), this.getControlGrafcet(), null, "controlGrafcet", null, 1, 1,
				Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcet_ProcessGrafcet(), this.getProcessGrafcet(), null, "processGrafcet", null, 0, 1,
				Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDeclarationContainerEClass, VariableDeclarationContainer.class,
				"VariableDeclarationContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDeclarationContainer_VariableDeclarations(), theTermsPackage.getVariableDeclaration(),
				null, "variableDeclarations", null, 0, -1, VariableDeclarationContainer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(partialGrafcetEClass, PartialGrafcet.class, "PartialGrafcet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartialGrafcet_EnclosingStep(), this.getEnclosingStep(), null, "enclosingStep", null, 0, 1,
				PartialGrafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(macrostepExpansionEClass, MacrostepExpansion.class, "MacrostepExpansion", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMacrostepExpansion_EntryStep(), this.getEntryStep(), null, "entryStep", null, 0, -1,
				MacrostepExpansion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMacrostepExpansion_ExitStep(), this.getExitStep(), null, "exitStep", null, 0, 1,
				MacrostepExpansion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initializableTypeEClass, InitializableType.class, "InitializableType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitializableType_Initial(), ecorePackage.getEBoolean(), "initial", "false", 1, 1,
				InitializableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitializableType_ActivationLink(), ecorePackage.getEBoolean(), "activationLink", "false", 1,
				1, InitializableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enclosingStepEClass, EnclosingStep.class, "EnclosingStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnclosingStep_PartialGrafcets(), this.getPartialGrafcet(), null, "partialGrafcets", null, 1,
				-1, EnclosingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(synchronizationEClass, Synchronization.class, "Synchronization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(macrostepEClass, Macrostep.class, "Macrostep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMacrostep_Expansion(), this.getMacrostepExpansion(), null, "expansion", null, 1, 1,
				Macrostep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryStepEClass, EntryStep.class, "EntryStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(exitStepEClass, ExitStep.class, "ExitStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Source(), this.getNode(), null, "source", null, 1, 1, Arc.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getArc_Target(), this.getNode(), null, "target", null, 1, 1, Arc.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(actionTypeEClass, ActionType.class, "ActionType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionType_Id(), ecorePackage.getEInt(), "id", null, 1, 1, ActionType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forcingOrderEClass, ForcingOrder.class, "ForcingOrder", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForcingOrder_PartialGrafcet(), this.getPartialGrafcet(), null, "partialGrafcet", null, 1, 1,
				ForcingOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForcingOrder_ForcedSteps(), this.getInitializableType(), null, "forcedSteps", null, 0, -1,
				ForcingOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForcingOrder_ForcingOrderType(), this.getForcingOrderType(), "forcingOrderType",
				"currentSituation", 0, 1, ForcingOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Variable(), theTermsPackage.getVariable(), null, "variable", null, 1, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAction__ActionOutputVariableType__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ActionOutputVariableType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(storedActionEClass, StoredAction.class, "StoredAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoredAction_StoredActionType(), this.getStoredActionType(), "storedActionType", "activation",
				1, 1, StoredAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getStoredAction_Value(), theTermsPackage.getTerm(), null, "value", null, 1, 1,
				StoredAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getStoredAction__StoredActionCondType__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"StoredActionCondType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStoredAction__StoredActionVarType__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"StoredActionVarType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(continuousActionEClass, ContinuousAction.class, "ContinuousAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousAction_ContinuousActionType(), this.getContinuousActionType(),
				"continuousActionType", "continuousAction", 0, 1, ContinuousAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getContinuousAction__ContinuousActionCondType__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ContinuousActionCondType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContinuousAction__ContinuousActionVarType__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ContinuousActionVarType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionLinkEClass, ActionLink.class, "ActionLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionLink_Step(), this.getStep(), null, "step", null, 1, 1, ActionLink.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getActionLink_ActionType(), this.getActionType(), null, "actionType", null, 1, 1,
				ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeConditionEClass, TimeCondition.class, "TimeCondition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeCondition_DelayTime(), ecorePackage.getEInt(), "delayTime", "0", 1, 1,
				TimeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeCondition_ResetTime(), ecorePackage.getEInt(), "resetTime", "0", 1, 1,
				TimeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeCondition_Unit(), this.getTimeUnit(), "unit", null, 0, 1, TimeCondition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeCondition_TimeConditionType(), this.getTimeConditionType(), "timeConditionType", null, 0,
				1, TimeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Term(), theTermsPackage.getTerm(), null, "term", null, 0, 1, Condition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCondition__ConditionTermType__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ConditionTermType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCondition__ConditionVariableType__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ConditionVariableType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(processGrafcetEClass, ProcessGrafcet.class, "ProcessGrafcet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlGrafcetEClass, ControlGrafcet.class, "ControlGrafcet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(forcingOrderTypeEEnum, ForcingOrderType.class, "ForcingOrderType");
		addEEnumLiteral(forcingOrderTypeEEnum, ForcingOrderType.CURRENT_SITUATION);
		addEEnumLiteral(forcingOrderTypeEEnum, ForcingOrderType.EMPTY_SITUATION);
		addEEnumLiteral(forcingOrderTypeEEnum, ForcingOrderType.INITIAL_SITUATION);
		addEEnumLiteral(forcingOrderTypeEEnum, ForcingOrderType.EXPLICIT_SITUATION);

		initEEnum(storedActionTypeEEnum, StoredActionType.class, "StoredActionType");
		addEEnumLiteral(storedActionTypeEEnum, StoredActionType.ACTIVATION);
		addEEnumLiteral(storedActionTypeEEnum, StoredActionType.DEACTIVATION);
		addEEnumLiteral(storedActionTypeEEnum, StoredActionType.EVENT);

		initEEnum(continuousActionTypeEEnum, ContinuousActionType.class, "ContinuousActionType");
		addEEnumLiteral(continuousActionTypeEEnum, ContinuousActionType.CONTINUOUS_ACTION);
		addEEnumLiteral(continuousActionTypeEEnum, ContinuousActionType.ASSIGNATION_CONDITION);

		initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
		addEEnumLiteral(timeUnitEEnum, TimeUnit.SECOND);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MILLISECOND);

		initEEnum(timeConditionTypeEEnum, TimeConditionType.class, "TimeConditionType");
		addEEnumLiteral(timeConditionTypeEEnum, TimeConditionType.NONE);
		addEEnumLiteral(timeConditionTypeEEnum, TimeConditionType.TIME_DEPENDENT);
		addEEnumLiteral(timeConditionTypeEEnum, TimeConditionType.TIME_DELAYED);
		addEEnumLiteral(timeConditionTypeEEnum, TimeConditionType.TIME_LIMITED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(actionEClass, source, new String[] { "constraints", "ActionOutputVariableType" });
		addAnnotation(storedActionEClass, source, new String[] { "constraints", "StoredActionVarType" });
		addAnnotation(continuousActionEClass, source, new String[] { "constraints", "ContinuousActionVarType" });
		addAnnotation(conditionEClass, source, new String[] { "constraints", "ConditionVariableType" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getAction__ActionOutputVariableType__DiagnosticChain_Map(), source, new String[] { "body",
				"self.variable.variableDeclaration.variableDeclarationType = terms::VariableDeclarationType::output \n\t\t\tor if self.oclIsTypeOf(StoredAction) then \n\t\t\tself.variable.variableDeclaration.variableDeclarationType = terms::VariableDeclarationType::internal else false endif" });
		addAnnotation(getStoredAction__StoredActionCondType__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.storedActionType = grafcet::StoredActionType::event implies(\n\t\t\tif self.term.oclIsTypeOf(terms::Variable) then false else\n\t\t\tself.term.oclAsType(terms::Operator)->closure(term: terms::Term| term->selectByKind(terms::Operator).subterm)\n\t\t\t->select(operator|operator.oclIsTypeOf(terms::RisingEdge))->size()\n\t\t\t+ self.term.oclAsType(terms::Operator)->closure(term: terms::Term| term->selectByKind(terms::Operator).subterm)\n\t\t\t->select(operator|operator.oclIsTypeOf(terms::FallingEdge))->size() > 0\n\t\t\tendif)" });
		addAnnotation(getStoredAction__StoredActionVarType__DiagnosticChain_Map(), source, new String[] { "body",
				"self.variable.variableDeclaration.sort.oclType() = self.value.sort.oclType()" });
		addAnnotation(getContinuousAction__ContinuousActionCondType__DiagnosticChain_Map(), source, new String[] {
				"body",
				"\n\t\t\tif self.continuousActionType = grafcet::ContinuousActionType::assignationCondition then\n\t\t\tif self.term.oclIsTypeOf(terms::Variable) then true else\n\t\t\t\tself.term.oclAsType(terms::Operator)->closure(term: terms::Term| term->selectByKind(terms::Operator).subterm)\n\t\t\t\t\t->select(operator|operator.oclIsTypeOf(terms::RisingEdge))->size()\n\t\t\t\t+ self.term.oclAsType(terms::Operator)->closure(term: terms::Term| term->selectByKind(terms::Operator).subterm)\n\t\t\t\t\t->select(operator|operator.oclIsTypeOf(terms::FallingEdge))->size() = 0\n\t\t\tendif\n\t\t\telse true endif" });
		addAnnotation(getContinuousAction__ContinuousActionVarType__DiagnosticChain_Map(), source,
				new String[] { "body", "self.variable.variableDeclaration.sort.oclIsTypeOf(terms::Bool)" });
		addAnnotation(getCondition__ConditionTermType__DiagnosticChain_Map(), source,
				new String[] { "body", "self.term <> null implies self.term.sort.oclIsTypeOf(terms::Bool)" });
		addAnnotation(getCondition__ConditionVariableType__DiagnosticChain_Map(), source, new String[] { "body",
				"self.term <> null implies(if self.term.oclIsTypeOf(terms::Variable) then \n\t\t\tself.term.oclAsType(terms::Variable).variableDeclaration.variableDeclarationType <> terms::VariableDeclarationType::output else\n\t\t\tself.term.oclAsType(terms::Operator)->closure(term: terms::Term| term->selectByKind(terms::Operator).subterm)\n\t\t\t->selectByKind(terms::Variable)->select(var|var.variableDeclaration.variableDeclarationType = terms::VariableDeclarationType::output)->size() = 0\n\t\t\tendif)" });
	}

} //GrafcetPackageImpl
