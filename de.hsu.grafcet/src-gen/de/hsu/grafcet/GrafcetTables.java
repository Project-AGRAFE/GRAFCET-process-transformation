/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /de.hsu.grafcet/model/grafcet.ecore
 *   /de.hsu.grafcet/model/terms.ecore
 * using:
 *   /de.hsu.grafcet/model/grafcet.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package de.hsu.grafcet;

import de.hsu.grafcet.GrafcetPackage;
import de.hsu.grafcet.GrafcetTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import terms.TermsPackage;

/**
 * GrafcetTables provides the dispatch tables for the grafcet for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class GrafcetTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(GrafcetPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_grafcet = IdManager.getNsURIPackageId("http://www.example.org/grafcet", null, GrafcetPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_terms = IdManager.getNsURIPackageId("http://www.example.org/terms", null, TermsPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Action = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("Action", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ActionLink = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("ActionLink", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ActionType = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("ActionType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Arc = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("Arc", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Bool = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("Bool", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = GrafcetTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Condition = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("Condition", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ContinuousAction = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("ContinuousAction", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ControlGrafcet = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("ControlGrafcet", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EnclosingStep = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("EnclosingStep", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EntryStep = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("EntryStep", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ExitStep = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("ExitStep", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_FallingEdge = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("FallingEdge", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ForcingOrder = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("ForcingOrder", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Grafcet = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("Grafcet", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_InitializableType = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("InitializableType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Macrostep = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("Macrostep", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MacrostepExpansion = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("MacrostepExpansion", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Node = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("Node", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Operator = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("Operator", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PartialGrafcet = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("PartialGrafcet", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProcessGrafcet = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("ProcessGrafcet", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_RisingEdge = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("RisingEdge", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Sort = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("Sort", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Step = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("Step", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StoredAction = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("StoredAction", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Synchronization = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("Synchronization", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Term = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("Term", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Transition = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("Transition", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Variable = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("Variable", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_VariableDeclaration = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("VariableDeclaration", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_VariableDeclarationContainer = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("VariableDeclarationContainer", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = GrafcetTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ContinuousActionType = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getEnumerationId("ContinuousActionType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ForcingOrderType = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getEnumerationId("ForcingOrderType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_StoredActionType = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getEnumerationId("StoredActionType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TimeConditionType = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getEnumerationId("TimeConditionType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TimeUnit = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getEnumerationId("TimeUnit");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_VariableDeclarationType = GrafcetTables.PACKid_http_c_s_s_www_example_org_s_terms.getEnumerationId("VariableDeclarationType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ActionLink = TypeId.BAG.getSpecializedId(GrafcetTables.CLSSid_ActionLink);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Arc = TypeId.BAG.getSpecializedId(GrafcetTables.CLSSid_Arc);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_EnclosingStep = TypeId.BAG.getSpecializedId(GrafcetTables.CLSSid_EnclosingStep);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ForcingOrder = TypeId.BAG.getSpecializedId(GrafcetTables.CLSSid_ForcingOrder);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Grafcet = TypeId.BAG.getSpecializedId(GrafcetTables.CLSSid_Grafcet);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Macrostep = TypeId.BAG.getSpecializedId(GrafcetTables.CLSSid_Macrostep);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_PartialGrafcet = TypeId.BAG.getSpecializedId(GrafcetTables.CLSSid_PartialGrafcet);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Term = TypeId.BAG.getSpecializedId(GrafcetTables.CLSSid_Term);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_assignationCondition = GrafcetTables.ENUMid_ContinuousActionType.getEnumerationLiteralId("assignationCondition");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_event = GrafcetTables.ENUMid_StoredActionType.getEnumerationLiteralId("event");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_internal = GrafcetTables.ENUMid_VariableDeclarationType.getEnumerationLiteralId("internal");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_output = GrafcetTables.ENUMid_VariableDeclarationType.getEnumerationLiteralId("output");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ActionLink = TypeId.ORDERED_SET.getSpecializedId(GrafcetTables.CLSSid_ActionLink);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ActionType = TypeId.ORDERED_SET.getSpecializedId(GrafcetTables.CLSSid_ActionType);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Arc = TypeId.ORDERED_SET.getSpecializedId(GrafcetTables.CLSSid_Arc);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EntryStep = TypeId.ORDERED_SET.getSpecializedId(GrafcetTables.CLSSid_EntryStep);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Grafcet = TypeId.ORDERED_SET.getSpecializedId(GrafcetTables.CLSSid_Grafcet);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_InitializableType = TypeId.ORDERED_SET.getSpecializedId(GrafcetTables.CLSSid_InitializableType);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Macrostep = TypeId.ORDERED_SET.getSpecializedId(GrafcetTables.CLSSid_Macrostep);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_PartialGrafcet = TypeId.ORDERED_SET.getSpecializedId(GrafcetTables.CLSSid_PartialGrafcet);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Synchronization = TypeId.ORDERED_SET.getSpecializedId(GrafcetTables.CLSSid_Synchronization);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Term = TypeId.ORDERED_SET.getSpecializedId(GrafcetTables.CLSSid_Term);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Transition = TypeId.ORDERED_SET.getSpecializedId(GrafcetTables.CLSSid_Transition);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_VariableDeclaration = TypeId.ORDERED_SET.getSpecializedId(GrafcetTables.CLSSid_VariableDeclaration);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Operator = TypeId.SET.getSpecializedId(GrafcetTables.CLSSid_Operator);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Term = TypeId.SET.getSpecializedId(GrafcetTables.CLSSid_Term);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Variable = TypeId.SET.getSpecializedId(GrafcetTables.CLSSid_Variable);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			GrafcetTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GrafcetTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Action = new EcoreExecutorType(GrafcetPackage.Literals.ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _ActionLink = new EcoreExecutorType(GrafcetPackage.Literals.ACTION_LINK, PACKAGE, 0);
		public static final EcoreExecutorType _ActionType = new EcoreExecutorType(GrafcetPackage.Literals.ACTION_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Arc = new EcoreExecutorType(GrafcetPackage.Literals.ARC, PACKAGE, 0);
		public static final EcoreExecutorType _Condition = new EcoreExecutorType(GrafcetPackage.Literals.CONDITION, PACKAGE, 0);
		public static final EcoreExecutorType _ContinuousAction = new EcoreExecutorType(GrafcetPackage.Literals.CONTINUOUS_ACTION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ContinuousActionType = new EcoreExecutorEnumeration(GrafcetPackage.Literals.CONTINUOUS_ACTION_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _ControlGrafcet = new EcoreExecutorType(GrafcetPackage.Literals.CONTROL_GRAFCET, PACKAGE, 0);
		public static final EcoreExecutorType _EnclosingStep = new EcoreExecutorType(GrafcetPackage.Literals.ENCLOSING_STEP, PACKAGE, 0);
		public static final EcoreExecutorType _EntryStep = new EcoreExecutorType(GrafcetPackage.Literals.ENTRY_STEP, PACKAGE, 0);
		public static final EcoreExecutorType _ExitStep = new EcoreExecutorType(GrafcetPackage.Literals.EXIT_STEP, PACKAGE, 0);
		public static final EcoreExecutorType _ForcingOrder = new EcoreExecutorType(GrafcetPackage.Literals.FORCING_ORDER, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ForcingOrderType = new EcoreExecutorEnumeration(GrafcetPackage.Literals.FORCING_ORDER_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Grafcet = new EcoreExecutorType(GrafcetPackage.Literals.GRAFCET, PACKAGE, 0);
		public static final EcoreExecutorType _InitializableType = new EcoreExecutorType(GrafcetPackage.Literals.INITIALIZABLE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Macrostep = new EcoreExecutorType(GrafcetPackage.Literals.MACROSTEP, PACKAGE, 0);
		public static final EcoreExecutorType _MacrostepExpansion = new EcoreExecutorType(GrafcetPackage.Literals.MACROSTEP_EXPANSION, PACKAGE, 0);
		public static final EcoreExecutorType _Node = new EcoreExecutorType(GrafcetPackage.Literals.NODE, PACKAGE, 0);
		public static final EcoreExecutorType _PartialGrafcet = new EcoreExecutorType(GrafcetPackage.Literals.PARTIAL_GRAFCET, PACKAGE, 0);
		public static final EcoreExecutorType _ProcessGrafcet = new EcoreExecutorType(GrafcetPackage.Literals.PROCESS_GRAFCET, PACKAGE, 0);
		public static final EcoreExecutorType _Step = new EcoreExecutorType(GrafcetPackage.Literals.STEP, PACKAGE, 0);
		public static final EcoreExecutorType _StoredAction = new EcoreExecutorType(GrafcetPackage.Literals.STORED_ACTION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _StoredActionType = new EcoreExecutorEnumeration(GrafcetPackage.Literals.STORED_ACTION_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Synchronization = new EcoreExecutorType(GrafcetPackage.Literals.SYNCHRONIZATION, PACKAGE, 0);
		public static final EcoreExecutorType _TimeCondition = new EcoreExecutorType(GrafcetPackage.Literals.TIME_CONDITION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TimeConditionType = new EcoreExecutorEnumeration(GrafcetPackage.Literals.TIME_CONDITION_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TimeUnit = new EcoreExecutorEnumeration(GrafcetPackage.Literals.TIME_UNIT, PACKAGE, 0);
		public static final EcoreExecutorType _Transition = new EcoreExecutorType(GrafcetPackage.Literals.TRANSITION, PACKAGE, 0);
		public static final EcoreExecutorType _VariableDeclarationContainer = new EcoreExecutorType(GrafcetPackage.Literals.VARIABLE_DECLARATION_CONTAINER, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Action,
			_ActionLink,
			_ActionType,
			_Arc,
			_Condition,
			_ContinuousAction,
			_ContinuousActionType,
			_ControlGrafcet,
			_EnclosingStep,
			_EntryStep,
			_ExitStep,
			_ForcingOrder,
			_ForcingOrderType,
			_Grafcet,
			_InitializableType,
			_Macrostep,
			_MacrostepExpansion,
			_Node,
			_PartialGrafcet,
			_ProcessGrafcet,
			_Step,
			_StoredAction,
			_StoredActionType,
			_Synchronization,
			_TimeCondition,
			_TimeConditionType,
			_TimeUnit,
			_Transition,
			_VariableDeclarationContainer
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GrafcetTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Action__Action = new ExecutorFragment(Types._Action, GrafcetTables.Types._Action);
		private static final ExecutorFragment _Action__ActionType = new ExecutorFragment(Types._Action, GrafcetTables.Types._ActionType);
		private static final ExecutorFragment _Action__OclAny = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Action__OclElement = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ActionLink__ActionLink = new ExecutorFragment(Types._ActionLink, GrafcetTables.Types._ActionLink);
		private static final ExecutorFragment _ActionLink__OclAny = new ExecutorFragment(Types._ActionLink, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ActionLink__OclElement = new ExecutorFragment(Types._ActionLink, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ActionType__ActionType = new ExecutorFragment(Types._ActionType, GrafcetTables.Types._ActionType);
		private static final ExecutorFragment _ActionType__OclAny = new ExecutorFragment(Types._ActionType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ActionType__OclElement = new ExecutorFragment(Types._ActionType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Arc__Arc = new ExecutorFragment(Types._Arc, GrafcetTables.Types._Arc);
		private static final ExecutorFragment _Arc__OclAny = new ExecutorFragment(Types._Arc, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Arc__OclElement = new ExecutorFragment(Types._Arc, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Condition__Condition = new ExecutorFragment(Types._Condition, GrafcetTables.Types._Condition);
		private static final ExecutorFragment _Condition__OclAny = new ExecutorFragment(Types._Condition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Condition__OclElement = new ExecutorFragment(Types._Condition, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ContinuousAction__Action = new ExecutorFragment(Types._ContinuousAction, GrafcetTables.Types._Action);
		private static final ExecutorFragment _ContinuousAction__ActionType = new ExecutorFragment(Types._ContinuousAction, GrafcetTables.Types._ActionType);
		private static final ExecutorFragment _ContinuousAction__Condition = new ExecutorFragment(Types._ContinuousAction, GrafcetTables.Types._Condition);
		private static final ExecutorFragment _ContinuousAction__ContinuousAction = new ExecutorFragment(Types._ContinuousAction, GrafcetTables.Types._ContinuousAction);
		private static final ExecutorFragment _ContinuousAction__OclAny = new ExecutorFragment(Types._ContinuousAction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ContinuousAction__OclElement = new ExecutorFragment(Types._ContinuousAction, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ContinuousAction__TimeCondition = new ExecutorFragment(Types._ContinuousAction, GrafcetTables.Types._TimeCondition);

		private static final ExecutorFragment _ContinuousActionType__ContinuousActionType = new ExecutorFragment(Types._ContinuousActionType, GrafcetTables.Types._ContinuousActionType);
		private static final ExecutorFragment _ContinuousActionType__OclAny = new ExecutorFragment(Types._ContinuousActionType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ContinuousActionType__OclElement = new ExecutorFragment(Types._ContinuousActionType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ContinuousActionType__OclEnumeration = new ExecutorFragment(Types._ContinuousActionType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ContinuousActionType__OclType = new ExecutorFragment(Types._ContinuousActionType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _ControlGrafcet__ControlGrafcet = new ExecutorFragment(Types._ControlGrafcet, GrafcetTables.Types._ControlGrafcet);
		private static final ExecutorFragment _ControlGrafcet__Grafcet = new ExecutorFragment(Types._ControlGrafcet, GrafcetTables.Types._Grafcet);
		private static final ExecutorFragment _ControlGrafcet__OclAny = new ExecutorFragment(Types._ControlGrafcet, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ControlGrafcet__OclElement = new ExecutorFragment(Types._ControlGrafcet, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ControlGrafcet__PartialGrafcet = new ExecutorFragment(Types._ControlGrafcet, GrafcetTables.Types._PartialGrafcet);

		private static final ExecutorFragment _EnclosingStep__EnclosingStep = new ExecutorFragment(Types._EnclosingStep, GrafcetTables.Types._EnclosingStep);
		private static final ExecutorFragment _EnclosingStep__InitializableType = new ExecutorFragment(Types._EnclosingStep, GrafcetTables.Types._InitializableType);
		private static final ExecutorFragment _EnclosingStep__Node = new ExecutorFragment(Types._EnclosingStep, GrafcetTables.Types._Node);
		private static final ExecutorFragment _EnclosingStep__OclAny = new ExecutorFragment(Types._EnclosingStep, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EnclosingStep__OclElement = new ExecutorFragment(Types._EnclosingStep, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EntryStep__EntryStep = new ExecutorFragment(Types._EntryStep, GrafcetTables.Types._EntryStep);
		private static final ExecutorFragment _EntryStep__Node = new ExecutorFragment(Types._EntryStep, GrafcetTables.Types._Node);
		private static final ExecutorFragment _EntryStep__OclAny = new ExecutorFragment(Types._EntryStep, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EntryStep__OclElement = new ExecutorFragment(Types._EntryStep, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ExitStep__ExitStep = new ExecutorFragment(Types._ExitStep, GrafcetTables.Types._ExitStep);
		private static final ExecutorFragment _ExitStep__Node = new ExecutorFragment(Types._ExitStep, GrafcetTables.Types._Node);
		private static final ExecutorFragment _ExitStep__OclAny = new ExecutorFragment(Types._ExitStep, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ExitStep__OclElement = new ExecutorFragment(Types._ExitStep, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ForcingOrder__ActionType = new ExecutorFragment(Types._ForcingOrder, GrafcetTables.Types._ActionType);
		private static final ExecutorFragment _ForcingOrder__ForcingOrder = new ExecutorFragment(Types._ForcingOrder, GrafcetTables.Types._ForcingOrder);
		private static final ExecutorFragment _ForcingOrder__OclAny = new ExecutorFragment(Types._ForcingOrder, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ForcingOrder__OclElement = new ExecutorFragment(Types._ForcingOrder, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ForcingOrderType__ForcingOrderType = new ExecutorFragment(Types._ForcingOrderType, GrafcetTables.Types._ForcingOrderType);
		private static final ExecutorFragment _ForcingOrderType__OclAny = new ExecutorFragment(Types._ForcingOrderType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ForcingOrderType__OclElement = new ExecutorFragment(Types._ForcingOrderType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ForcingOrderType__OclEnumeration = new ExecutorFragment(Types._ForcingOrderType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ForcingOrderType__OclType = new ExecutorFragment(Types._ForcingOrderType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Grafcet__Grafcet = new ExecutorFragment(Types._Grafcet, GrafcetTables.Types._Grafcet);
		private static final ExecutorFragment _Grafcet__OclAny = new ExecutorFragment(Types._Grafcet, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Grafcet__OclElement = new ExecutorFragment(Types._Grafcet, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _InitializableType__InitializableType = new ExecutorFragment(Types._InitializableType, GrafcetTables.Types._InitializableType);
		private static final ExecutorFragment _InitializableType__Node = new ExecutorFragment(Types._InitializableType, GrafcetTables.Types._Node);
		private static final ExecutorFragment _InitializableType__OclAny = new ExecutorFragment(Types._InitializableType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _InitializableType__OclElement = new ExecutorFragment(Types._InitializableType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Macrostep__Macrostep = new ExecutorFragment(Types._Macrostep, GrafcetTables.Types._Macrostep);
		private static final ExecutorFragment _Macrostep__Node = new ExecutorFragment(Types._Macrostep, GrafcetTables.Types._Node);
		private static final ExecutorFragment _Macrostep__OclAny = new ExecutorFragment(Types._Macrostep, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Macrostep__OclElement = new ExecutorFragment(Types._Macrostep, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MacrostepExpansion__Grafcet = new ExecutorFragment(Types._MacrostepExpansion, GrafcetTables.Types._Grafcet);
		private static final ExecutorFragment _MacrostepExpansion__MacrostepExpansion = new ExecutorFragment(Types._MacrostepExpansion, GrafcetTables.Types._MacrostepExpansion);
		private static final ExecutorFragment _MacrostepExpansion__OclAny = new ExecutorFragment(Types._MacrostepExpansion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MacrostepExpansion__OclElement = new ExecutorFragment(Types._MacrostepExpansion, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Node__Node = new ExecutorFragment(Types._Node, GrafcetTables.Types._Node);
		private static final ExecutorFragment _Node__OclAny = new ExecutorFragment(Types._Node, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Node__OclElement = new ExecutorFragment(Types._Node, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _PartialGrafcet__Grafcet = new ExecutorFragment(Types._PartialGrafcet, GrafcetTables.Types._Grafcet);
		private static final ExecutorFragment _PartialGrafcet__OclAny = new ExecutorFragment(Types._PartialGrafcet, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PartialGrafcet__OclElement = new ExecutorFragment(Types._PartialGrafcet, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PartialGrafcet__PartialGrafcet = new ExecutorFragment(Types._PartialGrafcet, GrafcetTables.Types._PartialGrafcet);

		private static final ExecutorFragment _ProcessGrafcet__Grafcet = new ExecutorFragment(Types._ProcessGrafcet, GrafcetTables.Types._Grafcet);
		private static final ExecutorFragment _ProcessGrafcet__OclAny = new ExecutorFragment(Types._ProcessGrafcet, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProcessGrafcet__OclElement = new ExecutorFragment(Types._ProcessGrafcet, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProcessGrafcet__PartialGrafcet = new ExecutorFragment(Types._ProcessGrafcet, GrafcetTables.Types._PartialGrafcet);
		private static final ExecutorFragment _ProcessGrafcet__ProcessGrafcet = new ExecutorFragment(Types._ProcessGrafcet, GrafcetTables.Types._ProcessGrafcet);

		private static final ExecutorFragment _Step__InitializableType = new ExecutorFragment(Types._Step, GrafcetTables.Types._InitializableType);
		private static final ExecutorFragment _Step__Node = new ExecutorFragment(Types._Step, GrafcetTables.Types._Node);
		private static final ExecutorFragment _Step__OclAny = new ExecutorFragment(Types._Step, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Step__OclElement = new ExecutorFragment(Types._Step, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Step__Step = new ExecutorFragment(Types._Step, GrafcetTables.Types._Step);

		private static final ExecutorFragment _StoredAction__Action = new ExecutorFragment(Types._StoredAction, GrafcetTables.Types._Action);
		private static final ExecutorFragment _StoredAction__ActionType = new ExecutorFragment(Types._StoredAction, GrafcetTables.Types._ActionType);
		private static final ExecutorFragment _StoredAction__Condition = new ExecutorFragment(Types._StoredAction, GrafcetTables.Types._Condition);
		private static final ExecutorFragment _StoredAction__OclAny = new ExecutorFragment(Types._StoredAction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StoredAction__OclElement = new ExecutorFragment(Types._StoredAction, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StoredAction__StoredAction = new ExecutorFragment(Types._StoredAction, GrafcetTables.Types._StoredAction);

		private static final ExecutorFragment _StoredActionType__OclAny = new ExecutorFragment(Types._StoredActionType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StoredActionType__OclElement = new ExecutorFragment(Types._StoredActionType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StoredActionType__OclEnumeration = new ExecutorFragment(Types._StoredActionType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _StoredActionType__OclType = new ExecutorFragment(Types._StoredActionType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _StoredActionType__StoredActionType = new ExecutorFragment(Types._StoredActionType, GrafcetTables.Types._StoredActionType);

		private static final ExecutorFragment _Synchronization__Node = new ExecutorFragment(Types._Synchronization, GrafcetTables.Types._Node);
		private static final ExecutorFragment _Synchronization__OclAny = new ExecutorFragment(Types._Synchronization, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Synchronization__OclElement = new ExecutorFragment(Types._Synchronization, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Synchronization__Synchronization = new ExecutorFragment(Types._Synchronization, GrafcetTables.Types._Synchronization);

		private static final ExecutorFragment _TimeCondition__Condition = new ExecutorFragment(Types._TimeCondition, GrafcetTables.Types._Condition);
		private static final ExecutorFragment _TimeCondition__OclAny = new ExecutorFragment(Types._TimeCondition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TimeCondition__OclElement = new ExecutorFragment(Types._TimeCondition, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TimeCondition__TimeCondition = new ExecutorFragment(Types._TimeCondition, GrafcetTables.Types._TimeCondition);

		private static final ExecutorFragment _TimeConditionType__OclAny = new ExecutorFragment(Types._TimeConditionType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TimeConditionType__OclElement = new ExecutorFragment(Types._TimeConditionType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TimeConditionType__OclEnumeration = new ExecutorFragment(Types._TimeConditionType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TimeConditionType__OclType = new ExecutorFragment(Types._TimeConditionType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _TimeConditionType__TimeConditionType = new ExecutorFragment(Types._TimeConditionType, GrafcetTables.Types._TimeConditionType);

		private static final ExecutorFragment _TimeUnit__OclAny = new ExecutorFragment(Types._TimeUnit, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TimeUnit__OclElement = new ExecutorFragment(Types._TimeUnit, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TimeUnit__OclEnumeration = new ExecutorFragment(Types._TimeUnit, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TimeUnit__OclType = new ExecutorFragment(Types._TimeUnit, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _TimeUnit__TimeUnit = new ExecutorFragment(Types._TimeUnit, GrafcetTables.Types._TimeUnit);

		private static final ExecutorFragment _Transition__Condition = new ExecutorFragment(Types._Transition, GrafcetTables.Types._Condition);
		private static final ExecutorFragment _Transition__Node = new ExecutorFragment(Types._Transition, GrafcetTables.Types._Node);
		private static final ExecutorFragment _Transition__OclAny = new ExecutorFragment(Types._Transition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Transition__OclElement = new ExecutorFragment(Types._Transition, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Transition__TimeCondition = new ExecutorFragment(Types._Transition, GrafcetTables.Types._TimeCondition);
		private static final ExecutorFragment _Transition__Transition = new ExecutorFragment(Types._Transition, GrafcetTables.Types._Transition);

		private static final ExecutorFragment _VariableDeclarationContainer__OclAny = new ExecutorFragment(Types._VariableDeclarationContainer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VariableDeclarationContainer__OclElement = new ExecutorFragment(Types._VariableDeclarationContainer, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VariableDeclarationContainer__VariableDeclarationContainer = new ExecutorFragment(Types._VariableDeclarationContainer, GrafcetTables.Types._VariableDeclarationContainer);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GrafcetTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GrafcetTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GrafcetTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Action__variable = new EcoreExecutorProperty(GrafcetPackage.Literals.ACTION__VARIABLE, Types._Action, 0);

		public static final ExecutorProperty _ActionLink__actionType = new EcoreExecutorProperty(GrafcetPackage.Literals.ACTION_LINK__ACTION_TYPE, Types._ActionLink, 0);
		public static final ExecutorProperty _ActionLink__step = new EcoreExecutorProperty(GrafcetPackage.Literals.ACTION_LINK__STEP, Types._ActionLink, 1);
		public static final ExecutorProperty _ActionLink__Grafcet__actionLinks = new ExecutorPropertyWithImplementation("Grafcet", Types._ActionLink, 2, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.GRAFCET__ACTION_LINKS));

		public static final ExecutorProperty _ActionType__id = new EcoreExecutorProperty(GrafcetPackage.Literals.ACTION_TYPE__ID, Types._ActionType, 0);
		public static final ExecutorProperty _ActionType__ActionLink__actionType = new ExecutorPropertyWithImplementation("ActionLink", Types._ActionType, 1, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.ACTION_LINK__ACTION_TYPE));
		public static final ExecutorProperty _ActionType__Grafcet__actionTypes = new ExecutorPropertyWithImplementation("Grafcet", Types._ActionType, 2, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.GRAFCET__ACTION_TYPES));

		public static final ExecutorProperty _Arc__source = new EcoreExecutorProperty(GrafcetPackage.Literals.ARC__SOURCE, Types._Arc, 0);
		public static final ExecutorProperty _Arc__target = new EcoreExecutorProperty(GrafcetPackage.Literals.ARC__TARGET, Types._Arc, 1);
		public static final ExecutorProperty _Arc__Grafcet__arcs = new ExecutorPropertyWithImplementation("Grafcet", Types._Arc, 2, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.GRAFCET__ARCS));

		public static final ExecutorProperty _Condition__term = new EcoreExecutorProperty(GrafcetPackage.Literals.CONDITION__TERM, Types._Condition, 0);

		public static final ExecutorProperty _ContinuousAction__continuousActionType = new EcoreExecutorProperty(GrafcetPackage.Literals.CONTINUOUS_ACTION__CONTINUOUS_ACTION_TYPE, Types._ContinuousAction, 0);

		public static final ExecutorProperty _ControlGrafcet__Grafcet__controlGrafcet = new ExecutorPropertyWithImplementation("Grafcet", Types._ControlGrafcet, 0, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.GRAFCET__CONTROL_GRAFCET));

		public static final ExecutorProperty _EnclosingStep__partialGrafcets = new EcoreExecutorProperty(GrafcetPackage.Literals.ENCLOSING_STEP__PARTIAL_GRAFCETS, Types._EnclosingStep, 0);
		public static final ExecutorProperty _EnclosingStep__PartialGrafcet__enclosingStep = new ExecutorPropertyWithImplementation("PartialGrafcet", Types._EnclosingStep, 1, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.PARTIAL_GRAFCET__ENCLOSING_STEP));

		public static final ExecutorProperty _EntryStep__MacrostepExpansion__entryStep = new ExecutorPropertyWithImplementation("MacrostepExpansion", Types._EntryStep, 0, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.MACROSTEP_EXPANSION__ENTRY_STEP));

		public static final ExecutorProperty _ExitStep__MacrostepExpansion__exitStep = new ExecutorPropertyWithImplementation("MacrostepExpansion", Types._ExitStep, 0, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.MACROSTEP_EXPANSION__EXIT_STEP));

		public static final ExecutorProperty _ForcingOrder__forcedSteps = new EcoreExecutorProperty(GrafcetPackage.Literals.FORCING_ORDER__FORCED_STEPS, Types._ForcingOrder, 0);
		public static final ExecutorProperty _ForcingOrder__forcingOrderType = new EcoreExecutorProperty(GrafcetPackage.Literals.FORCING_ORDER__FORCING_ORDER_TYPE, Types._ForcingOrder, 1);
		public static final ExecutorProperty _ForcingOrder__partialGrafcet = new EcoreExecutorProperty(GrafcetPackage.Literals.FORCING_ORDER__PARTIAL_GRAFCET, Types._ForcingOrder, 2);

		public static final ExecutorProperty _Grafcet__actionLinks = new EcoreExecutorProperty(GrafcetPackage.Literals.GRAFCET__ACTION_LINKS, Types._Grafcet, 0);
		public static final ExecutorProperty _Grafcet__actionTypes = new EcoreExecutorProperty(GrafcetPackage.Literals.GRAFCET__ACTION_TYPES, Types._Grafcet, 1);
		public static final ExecutorProperty _Grafcet__arcs = new EcoreExecutorProperty(GrafcetPackage.Literals.GRAFCET__ARCS, Types._Grafcet, 2);
		public static final ExecutorProperty _Grafcet__controlGrafcet = new EcoreExecutorProperty(GrafcetPackage.Literals.GRAFCET__CONTROL_GRAFCET, Types._Grafcet, 3);
		public static final ExecutorProperty _Grafcet__macrosteps = new EcoreExecutorProperty(GrafcetPackage.Literals.GRAFCET__MACROSTEPS, Types._Grafcet, 4);
		public static final ExecutorProperty _Grafcet__name = new EcoreExecutorProperty(GrafcetPackage.Literals.GRAFCET__NAME, Types._Grafcet, 5);
		public static final ExecutorProperty _Grafcet__partialGrafcets = new EcoreExecutorProperty(GrafcetPackage.Literals.GRAFCET__PARTIAL_GRAFCETS, Types._Grafcet, 6);
		public static final ExecutorProperty _Grafcet__processGrafcet = new EcoreExecutorProperty(GrafcetPackage.Literals.GRAFCET__PROCESS_GRAFCET, Types._Grafcet, 7);
		public static final ExecutorProperty _Grafcet__steps = new EcoreExecutorProperty(GrafcetPackage.Literals.GRAFCET__STEPS, Types._Grafcet, 8);
		public static final ExecutorProperty _Grafcet__synchronizations = new EcoreExecutorProperty(GrafcetPackage.Literals.GRAFCET__SYNCHRONIZATIONS, Types._Grafcet, 9);
		public static final ExecutorProperty _Grafcet__transitions = new EcoreExecutorProperty(GrafcetPackage.Literals.GRAFCET__TRANSITIONS, Types._Grafcet, 10);
		public static final ExecutorProperty _Grafcet__variableDeclarationContainer = new EcoreExecutorProperty(GrafcetPackage.Literals.GRAFCET__VARIABLE_DECLARATION_CONTAINER, Types._Grafcet, 11);
		public static final ExecutorProperty _Grafcet__Grafcet__partialGrafcets = new ExecutorPropertyWithImplementation("Grafcet", Types._Grafcet, 12, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.GRAFCET__PARTIAL_GRAFCETS));

		public static final ExecutorProperty _InitializableType__activationLink = new EcoreExecutorProperty(GrafcetPackage.Literals.INITIALIZABLE_TYPE__ACTIVATION_LINK, Types._InitializableType, 0);
		public static final ExecutorProperty _InitializableType__initial = new EcoreExecutorProperty(GrafcetPackage.Literals.INITIALIZABLE_TYPE__INITIAL, Types._InitializableType, 1);
		public static final ExecutorProperty _InitializableType__ForcingOrder__forcedSteps = new ExecutorPropertyWithImplementation("ForcingOrder", Types._InitializableType, 2, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.FORCING_ORDER__FORCED_STEPS));
		public static final ExecutorProperty _InitializableType__Grafcet__steps = new ExecutorPropertyWithImplementation("Grafcet", Types._InitializableType, 3, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.GRAFCET__STEPS));

		public static final ExecutorProperty _Macrostep__expansion = new EcoreExecutorProperty(GrafcetPackage.Literals.MACROSTEP__EXPANSION, Types._Macrostep, 0);
		public static final ExecutorProperty _Macrostep__Grafcet__macrosteps = new ExecutorPropertyWithImplementation("Grafcet", Types._Macrostep, 1, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.GRAFCET__MACROSTEPS));

		public static final ExecutorProperty _MacrostepExpansion__entryStep = new EcoreExecutorProperty(GrafcetPackage.Literals.MACROSTEP_EXPANSION__ENTRY_STEP, Types._MacrostepExpansion, 0);
		public static final ExecutorProperty _MacrostepExpansion__exitStep = new EcoreExecutorProperty(GrafcetPackage.Literals.MACROSTEP_EXPANSION__EXIT_STEP, Types._MacrostepExpansion, 1);
		public static final ExecutorProperty _MacrostepExpansion__Macrostep__expansion = new ExecutorPropertyWithImplementation("Macrostep", Types._MacrostepExpansion, 2, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.MACROSTEP__EXPANSION));

		public static final ExecutorProperty _Node__id = new EcoreExecutorProperty(GrafcetPackage.Literals.NODE__ID, Types._Node, 0);
		public static final ExecutorProperty _Node__Arc__source = new ExecutorPropertyWithImplementation("Arc", Types._Node, 1, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.ARC__SOURCE));
		public static final ExecutorProperty _Node__Arc__target = new ExecutorPropertyWithImplementation("Arc", Types._Node, 2, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.ARC__TARGET));

		public static final ExecutorProperty _PartialGrafcet__enclosingStep = new EcoreExecutorProperty(GrafcetPackage.Literals.PARTIAL_GRAFCET__ENCLOSING_STEP, Types._PartialGrafcet, 0);
		public static final ExecutorProperty _PartialGrafcet__EnclosingStep__partialGrafcets = new ExecutorPropertyWithImplementation("EnclosingStep", Types._PartialGrafcet, 1, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.ENCLOSING_STEP__PARTIAL_GRAFCETS));
		public static final ExecutorProperty _PartialGrafcet__ForcingOrder__partialGrafcet = new ExecutorPropertyWithImplementation("ForcingOrder", Types._PartialGrafcet, 2, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.FORCING_ORDER__PARTIAL_GRAFCET));

		public static final ExecutorProperty _ProcessGrafcet__Grafcet__processGrafcet = new ExecutorPropertyWithImplementation("Grafcet", Types._ProcessGrafcet, 0, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.GRAFCET__PROCESS_GRAFCET));

		public static final ExecutorProperty _Step__ActionLink__step = new ExecutorPropertyWithImplementation("ActionLink", Types._Step, 0, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.ACTION_LINK__STEP));

		public static final ExecutorProperty _StoredAction__storedActionType = new EcoreExecutorProperty(GrafcetPackage.Literals.STORED_ACTION__STORED_ACTION_TYPE, Types._StoredAction, 0);
		public static final ExecutorProperty _StoredAction__value = new EcoreExecutorProperty(GrafcetPackage.Literals.STORED_ACTION__VALUE, Types._StoredAction, 1);

		public static final ExecutorProperty _Synchronization__Grafcet__synchronizations = new ExecutorPropertyWithImplementation("Grafcet", Types._Synchronization, 0, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.GRAFCET__SYNCHRONIZATIONS));

		public static final ExecutorProperty _TimeCondition__delayTime = new EcoreExecutorProperty(GrafcetPackage.Literals.TIME_CONDITION__DELAY_TIME, Types._TimeCondition, 0);
		public static final ExecutorProperty _TimeCondition__resetTime = new EcoreExecutorProperty(GrafcetPackage.Literals.TIME_CONDITION__RESET_TIME, Types._TimeCondition, 1);
		public static final ExecutorProperty _TimeCondition__timeConditionType = new EcoreExecutorProperty(GrafcetPackage.Literals.TIME_CONDITION__TIME_CONDITION_TYPE, Types._TimeCondition, 2);
		public static final ExecutorProperty _TimeCondition__unit = new EcoreExecutorProperty(GrafcetPackage.Literals.TIME_CONDITION__UNIT, Types._TimeCondition, 3);

		public static final ExecutorProperty _Transition__Grafcet__transitions = new ExecutorPropertyWithImplementation("Grafcet", Types._Transition, 0, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.GRAFCET__TRANSITIONS));

		public static final ExecutorProperty _VariableDeclarationContainer__variableDeclarations = new EcoreExecutorProperty(GrafcetPackage.Literals.VARIABLE_DECLARATION_CONTAINER__VARIABLE_DECLARATIONS, Types._VariableDeclarationContainer, 0);
		public static final ExecutorProperty _VariableDeclarationContainer__Grafcet__variableDeclarationContainer = new ExecutorPropertyWithImplementation("Grafcet", Types._VariableDeclarationContainer, 1, new EcoreLibraryOppositeProperty(GrafcetPackage.Literals.GRAFCET__VARIABLE_DECLARATION_CONTAINER));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GrafcetTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Action =
			{
				Fragments._Action__OclAny /* 0 */,
				Fragments._Action__OclElement /* 1 */,
				Fragments._Action__ActionType /* 2 */,
				Fragments._Action__Action /* 3 */
			};
		private static final int /*@NonNull*/ [] __Action = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ActionLink =
			{
				Fragments._ActionLink__OclAny /* 0 */,
				Fragments._ActionLink__OclElement /* 1 */,
				Fragments._ActionLink__ActionLink /* 2 */
			};
		private static final int /*@NonNull*/ [] __ActionLink = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ActionType =
			{
				Fragments._ActionType__OclAny /* 0 */,
				Fragments._ActionType__OclElement /* 1 */,
				Fragments._ActionType__ActionType /* 2 */
			};
		private static final int /*@NonNull*/ [] __ActionType = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Arc =
			{
				Fragments._Arc__OclAny /* 0 */,
				Fragments._Arc__OclElement /* 1 */,
				Fragments._Arc__Arc /* 2 */
			};
		private static final int /*@NonNull*/ [] __Arc = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Condition =
			{
				Fragments._Condition__OclAny /* 0 */,
				Fragments._Condition__OclElement /* 1 */,
				Fragments._Condition__Condition /* 2 */
			};
		private static final int /*@NonNull*/ [] __Condition = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ContinuousAction =
			{
				Fragments._ContinuousAction__OclAny /* 0 */,
				Fragments._ContinuousAction__OclElement /* 1 */,
				Fragments._ContinuousAction__ActionType /* 2 */,
				Fragments._ContinuousAction__Condition /* 2 */,
				Fragments._ContinuousAction__Action /* 3 */,
				Fragments._ContinuousAction__TimeCondition /* 3 */,
				Fragments._ContinuousAction__ContinuousAction /* 4 */
			};
		private static final int /*@NonNull*/ [] __ContinuousAction = { 1,1,2,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ContinuousActionType =
			{
				Fragments._ContinuousActionType__OclAny /* 0 */,
				Fragments._ContinuousActionType__OclElement /* 1 */,
				Fragments._ContinuousActionType__OclType /* 2 */,
				Fragments._ContinuousActionType__OclEnumeration /* 3 */,
				Fragments._ContinuousActionType__ContinuousActionType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ContinuousActionType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ControlGrafcet =
			{
				Fragments._ControlGrafcet__OclAny /* 0 */,
				Fragments._ControlGrafcet__OclElement /* 1 */,
				Fragments._ControlGrafcet__Grafcet /* 2 */,
				Fragments._ControlGrafcet__PartialGrafcet /* 3 */,
				Fragments._ControlGrafcet__ControlGrafcet /* 4 */
			};
		private static final int /*@NonNull*/ [] __ControlGrafcet = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EnclosingStep =
			{
				Fragments._EnclosingStep__OclAny /* 0 */,
				Fragments._EnclosingStep__OclElement /* 1 */,
				Fragments._EnclosingStep__Node /* 2 */,
				Fragments._EnclosingStep__InitializableType /* 3 */,
				Fragments._EnclosingStep__EnclosingStep /* 4 */
			};
		private static final int /*@NonNull*/ [] __EnclosingStep = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EntryStep =
			{
				Fragments._EntryStep__OclAny /* 0 */,
				Fragments._EntryStep__OclElement /* 1 */,
				Fragments._EntryStep__Node /* 2 */,
				Fragments._EntryStep__EntryStep /* 3 */
			};
		private static final int /*@NonNull*/ [] __EntryStep = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ExitStep =
			{
				Fragments._ExitStep__OclAny /* 0 */,
				Fragments._ExitStep__OclElement /* 1 */,
				Fragments._ExitStep__Node /* 2 */,
				Fragments._ExitStep__ExitStep /* 3 */
			};
		private static final int /*@NonNull*/ [] __ExitStep = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ForcingOrder =
			{
				Fragments._ForcingOrder__OclAny /* 0 */,
				Fragments._ForcingOrder__OclElement /* 1 */,
				Fragments._ForcingOrder__ActionType /* 2 */,
				Fragments._ForcingOrder__ForcingOrder /* 3 */
			};
		private static final int /*@NonNull*/ [] __ForcingOrder = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ForcingOrderType =
			{
				Fragments._ForcingOrderType__OclAny /* 0 */,
				Fragments._ForcingOrderType__OclElement /* 1 */,
				Fragments._ForcingOrderType__OclType /* 2 */,
				Fragments._ForcingOrderType__OclEnumeration /* 3 */,
				Fragments._ForcingOrderType__ForcingOrderType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ForcingOrderType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Grafcet =
			{
				Fragments._Grafcet__OclAny /* 0 */,
				Fragments._Grafcet__OclElement /* 1 */,
				Fragments._Grafcet__Grafcet /* 2 */
			};
		private static final int /*@NonNull*/ [] __Grafcet = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _InitializableType =
			{
				Fragments._InitializableType__OclAny /* 0 */,
				Fragments._InitializableType__OclElement /* 1 */,
				Fragments._InitializableType__Node /* 2 */,
				Fragments._InitializableType__InitializableType /* 3 */
			};
		private static final int /*@NonNull*/ [] __InitializableType = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Macrostep =
			{
				Fragments._Macrostep__OclAny /* 0 */,
				Fragments._Macrostep__OclElement /* 1 */,
				Fragments._Macrostep__Node /* 2 */,
				Fragments._Macrostep__Macrostep /* 3 */
			};
		private static final int /*@NonNull*/ [] __Macrostep = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MacrostepExpansion =
			{
				Fragments._MacrostepExpansion__OclAny /* 0 */,
				Fragments._MacrostepExpansion__OclElement /* 1 */,
				Fragments._MacrostepExpansion__Grafcet /* 2 */,
				Fragments._MacrostepExpansion__MacrostepExpansion /* 3 */
			};
		private static final int /*@NonNull*/ [] __MacrostepExpansion = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Node =
			{
				Fragments._Node__OclAny /* 0 */,
				Fragments._Node__OclElement /* 1 */,
				Fragments._Node__Node /* 2 */
			};
		private static final int /*@NonNull*/ [] __Node = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PartialGrafcet =
			{
				Fragments._PartialGrafcet__OclAny /* 0 */,
				Fragments._PartialGrafcet__OclElement /* 1 */,
				Fragments._PartialGrafcet__Grafcet /* 2 */,
				Fragments._PartialGrafcet__PartialGrafcet /* 3 */
			};
		private static final int /*@NonNull*/ [] __PartialGrafcet = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProcessGrafcet =
			{
				Fragments._ProcessGrafcet__OclAny /* 0 */,
				Fragments._ProcessGrafcet__OclElement /* 1 */,
				Fragments._ProcessGrafcet__Grafcet /* 2 */,
				Fragments._ProcessGrafcet__PartialGrafcet /* 3 */,
				Fragments._ProcessGrafcet__ProcessGrafcet /* 4 */
			};
		private static final int /*@NonNull*/ [] __ProcessGrafcet = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Step =
			{
				Fragments._Step__OclAny /* 0 */,
				Fragments._Step__OclElement /* 1 */,
				Fragments._Step__Node /* 2 */,
				Fragments._Step__InitializableType /* 3 */,
				Fragments._Step__Step /* 4 */
			};
		private static final int /*@NonNull*/ [] __Step = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StoredAction =
			{
				Fragments._StoredAction__OclAny /* 0 */,
				Fragments._StoredAction__OclElement /* 1 */,
				Fragments._StoredAction__ActionType /* 2 */,
				Fragments._StoredAction__Condition /* 2 */,
				Fragments._StoredAction__Action /* 3 */,
				Fragments._StoredAction__StoredAction /* 4 */
			};
		private static final int /*@NonNull*/ [] __StoredAction = { 1,1,2,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StoredActionType =
			{
				Fragments._StoredActionType__OclAny /* 0 */,
				Fragments._StoredActionType__OclElement /* 1 */,
				Fragments._StoredActionType__OclType /* 2 */,
				Fragments._StoredActionType__OclEnumeration /* 3 */,
				Fragments._StoredActionType__StoredActionType /* 4 */
			};
		private static final int /*@NonNull*/ [] __StoredActionType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Synchronization =
			{
				Fragments._Synchronization__OclAny /* 0 */,
				Fragments._Synchronization__OclElement /* 1 */,
				Fragments._Synchronization__Node /* 2 */,
				Fragments._Synchronization__Synchronization /* 3 */
			};
		private static final int /*@NonNull*/ [] __Synchronization = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TimeCondition =
			{
				Fragments._TimeCondition__OclAny /* 0 */,
				Fragments._TimeCondition__OclElement /* 1 */,
				Fragments._TimeCondition__Condition /* 2 */,
				Fragments._TimeCondition__TimeCondition /* 3 */
			};
		private static final int /*@NonNull*/ [] __TimeCondition = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TimeConditionType =
			{
				Fragments._TimeConditionType__OclAny /* 0 */,
				Fragments._TimeConditionType__OclElement /* 1 */,
				Fragments._TimeConditionType__OclType /* 2 */,
				Fragments._TimeConditionType__OclEnumeration /* 3 */,
				Fragments._TimeConditionType__TimeConditionType /* 4 */
			};
		private static final int /*@NonNull*/ [] __TimeConditionType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TimeUnit =
			{
				Fragments._TimeUnit__OclAny /* 0 */,
				Fragments._TimeUnit__OclElement /* 1 */,
				Fragments._TimeUnit__OclType /* 2 */,
				Fragments._TimeUnit__OclEnumeration /* 3 */,
				Fragments._TimeUnit__TimeUnit /* 4 */
			};
		private static final int /*@NonNull*/ [] __TimeUnit = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Transition =
			{
				Fragments._Transition__OclAny /* 0 */,
				Fragments._Transition__OclElement /* 1 */,
				Fragments._Transition__Condition /* 2 */,
				Fragments._Transition__Node /* 2 */,
				Fragments._Transition__TimeCondition /* 3 */,
				Fragments._Transition__Transition /* 4 */
			};
		private static final int /*@NonNull*/ [] __Transition = { 1,1,2,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VariableDeclarationContainer =
			{
				Fragments._VariableDeclarationContainer__OclAny /* 0 */,
				Fragments._VariableDeclarationContainer__OclElement /* 1 */,
				Fragments._VariableDeclarationContainer__VariableDeclarationContainer /* 2 */
			};
		private static final int /*@NonNull*/ [] __VariableDeclarationContainer = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Action.initFragments(_Action, __Action);
			Types._ActionLink.initFragments(_ActionLink, __ActionLink);
			Types._ActionType.initFragments(_ActionType, __ActionType);
			Types._Arc.initFragments(_Arc, __Arc);
			Types._Condition.initFragments(_Condition, __Condition);
			Types._ContinuousAction.initFragments(_ContinuousAction, __ContinuousAction);
			Types._ContinuousActionType.initFragments(_ContinuousActionType, __ContinuousActionType);
			Types._ControlGrafcet.initFragments(_ControlGrafcet, __ControlGrafcet);
			Types._EnclosingStep.initFragments(_EnclosingStep, __EnclosingStep);
			Types._EntryStep.initFragments(_EntryStep, __EntryStep);
			Types._ExitStep.initFragments(_ExitStep, __ExitStep);
			Types._ForcingOrder.initFragments(_ForcingOrder, __ForcingOrder);
			Types._ForcingOrderType.initFragments(_ForcingOrderType, __ForcingOrderType);
			Types._Grafcet.initFragments(_Grafcet, __Grafcet);
			Types._InitializableType.initFragments(_InitializableType, __InitializableType);
			Types._Macrostep.initFragments(_Macrostep, __Macrostep);
			Types._MacrostepExpansion.initFragments(_MacrostepExpansion, __MacrostepExpansion);
			Types._Node.initFragments(_Node, __Node);
			Types._PartialGrafcet.initFragments(_PartialGrafcet, __PartialGrafcet);
			Types._ProcessGrafcet.initFragments(_ProcessGrafcet, __ProcessGrafcet);
			Types._Step.initFragments(_Step, __Step);
			Types._StoredAction.initFragments(_StoredAction, __StoredAction);
			Types._StoredActionType.initFragments(_StoredActionType, __StoredActionType);
			Types._Synchronization.initFragments(_Synchronization, __Synchronization);
			Types._TimeCondition.initFragments(_TimeCondition, __TimeCondition);
			Types._TimeConditionType.initFragments(_TimeConditionType, __TimeConditionType);
			Types._TimeUnit.initFragments(_TimeUnit, __TimeUnit);
			Types._Transition.initFragments(_Transition, __Transition);
			Types._VariableDeclarationContainer.initFragments(_VariableDeclarationContainer, __VariableDeclarationContainer);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GrafcetTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Action__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__ActionType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ActionLink__ActionLink = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ActionLink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ActionLink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ActionType__ActionType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ActionType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ActionType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Arc__Arc = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Arc__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Arc__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Condition__Condition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Condition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Condition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ContinuousAction__ContinuousAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContinuousAction__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContinuousAction__ActionType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContinuousAction__Condition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContinuousAction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ContinuousAction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ContinuousAction__TimeCondition = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ContinuousActionType__ContinuousActionType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContinuousActionType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ContinuousActionType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ContinuousActionType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ContinuousActionType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ControlGrafcet__ControlGrafcet = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ControlGrafcet__Grafcet = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ControlGrafcet__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ControlGrafcet__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ControlGrafcet__PartialGrafcet = {};

		private static final ExecutorOperation /*@NonNull*/ [] _EnclosingStep__EnclosingStep = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnclosingStep__InitializableType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnclosingStep__Node = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnclosingStep__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EnclosingStep__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EntryStep__EntryStep = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EntryStep__Node = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EntryStep__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EntryStep__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ExitStep__ExitStep = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExitStep__Node = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExitStep__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ExitStep__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ForcingOrder__ForcingOrder = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ForcingOrder__ActionType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ForcingOrder__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ForcingOrder__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ForcingOrderType__ForcingOrderType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ForcingOrderType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ForcingOrderType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ForcingOrderType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ForcingOrderType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Grafcet__Grafcet = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Grafcet__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Grafcet__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _InitializableType__InitializableType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InitializableType__Node = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InitializableType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _InitializableType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Macrostep__Macrostep = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Macrostep__Node = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Macrostep__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Macrostep__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MacrostepExpansion__MacrostepExpansion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MacrostepExpansion__Grafcet = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MacrostepExpansion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MacrostepExpansion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Node__Node = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Node__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Node__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PartialGrafcet__PartialGrafcet = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PartialGrafcet__Grafcet = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PartialGrafcet__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PartialGrafcet__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProcessGrafcet__ProcessGrafcet = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessGrafcet__Grafcet = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessGrafcet__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessGrafcet__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessGrafcet__PartialGrafcet = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Step__Step = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Step__InitializableType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Step__Node = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Step__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Step__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StoredAction__StoredAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StoredAction__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StoredAction__ActionType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StoredAction__Condition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StoredAction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StoredAction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StoredActionType__StoredActionType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StoredActionType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StoredActionType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StoredActionType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StoredActionType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Synchronization__Synchronization = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Synchronization__Node = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Synchronization__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Synchronization__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TimeCondition__TimeCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeCondition__Condition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeCondition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeCondition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TimeConditionType__TimeConditionType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeConditionType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeConditionType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeConditionType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeConditionType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TimeUnit__TimeUnit = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeUnit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeUnit__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeUnit__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeUnit__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Transition__Transition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Transition__Condition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Transition__Node = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Transition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Transition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Transition__TimeCondition = {};

		private static final ExecutorOperation /*@NonNull*/ [] _VariableDeclarationContainer__VariableDeclarationContainer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VariableDeclarationContainer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VariableDeclarationContainer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initOperations(_Action__Action);
			Fragments._Action__ActionType.initOperations(_Action__ActionType);
			Fragments._Action__OclAny.initOperations(_Action__OclAny);
			Fragments._Action__OclElement.initOperations(_Action__OclElement);

			Fragments._ActionLink__ActionLink.initOperations(_ActionLink__ActionLink);
			Fragments._ActionLink__OclAny.initOperations(_ActionLink__OclAny);
			Fragments._ActionLink__OclElement.initOperations(_ActionLink__OclElement);

			Fragments._ActionType__ActionType.initOperations(_ActionType__ActionType);
			Fragments._ActionType__OclAny.initOperations(_ActionType__OclAny);
			Fragments._ActionType__OclElement.initOperations(_ActionType__OclElement);

			Fragments._Arc__Arc.initOperations(_Arc__Arc);
			Fragments._Arc__OclAny.initOperations(_Arc__OclAny);
			Fragments._Arc__OclElement.initOperations(_Arc__OclElement);

			Fragments._Condition__Condition.initOperations(_Condition__Condition);
			Fragments._Condition__OclAny.initOperations(_Condition__OclAny);
			Fragments._Condition__OclElement.initOperations(_Condition__OclElement);

			Fragments._ContinuousAction__Action.initOperations(_ContinuousAction__Action);
			Fragments._ContinuousAction__ActionType.initOperations(_ContinuousAction__ActionType);
			Fragments._ContinuousAction__Condition.initOperations(_ContinuousAction__Condition);
			Fragments._ContinuousAction__ContinuousAction.initOperations(_ContinuousAction__ContinuousAction);
			Fragments._ContinuousAction__OclAny.initOperations(_ContinuousAction__OclAny);
			Fragments._ContinuousAction__OclElement.initOperations(_ContinuousAction__OclElement);
			Fragments._ContinuousAction__TimeCondition.initOperations(_ContinuousAction__TimeCondition);

			Fragments._ContinuousActionType__ContinuousActionType.initOperations(_ContinuousActionType__ContinuousActionType);
			Fragments._ContinuousActionType__OclAny.initOperations(_ContinuousActionType__OclAny);
			Fragments._ContinuousActionType__OclElement.initOperations(_ContinuousActionType__OclElement);
			Fragments._ContinuousActionType__OclEnumeration.initOperations(_ContinuousActionType__OclEnumeration);
			Fragments._ContinuousActionType__OclType.initOperations(_ContinuousActionType__OclType);

			Fragments._ControlGrafcet__ControlGrafcet.initOperations(_ControlGrafcet__ControlGrafcet);
			Fragments._ControlGrafcet__Grafcet.initOperations(_ControlGrafcet__Grafcet);
			Fragments._ControlGrafcet__OclAny.initOperations(_ControlGrafcet__OclAny);
			Fragments._ControlGrafcet__OclElement.initOperations(_ControlGrafcet__OclElement);
			Fragments._ControlGrafcet__PartialGrafcet.initOperations(_ControlGrafcet__PartialGrafcet);

			Fragments._EnclosingStep__EnclosingStep.initOperations(_EnclosingStep__EnclosingStep);
			Fragments._EnclosingStep__InitializableType.initOperations(_EnclosingStep__InitializableType);
			Fragments._EnclosingStep__Node.initOperations(_EnclosingStep__Node);
			Fragments._EnclosingStep__OclAny.initOperations(_EnclosingStep__OclAny);
			Fragments._EnclosingStep__OclElement.initOperations(_EnclosingStep__OclElement);

			Fragments._EntryStep__EntryStep.initOperations(_EntryStep__EntryStep);
			Fragments._EntryStep__Node.initOperations(_EntryStep__Node);
			Fragments._EntryStep__OclAny.initOperations(_EntryStep__OclAny);
			Fragments._EntryStep__OclElement.initOperations(_EntryStep__OclElement);

			Fragments._ExitStep__ExitStep.initOperations(_ExitStep__ExitStep);
			Fragments._ExitStep__Node.initOperations(_ExitStep__Node);
			Fragments._ExitStep__OclAny.initOperations(_ExitStep__OclAny);
			Fragments._ExitStep__OclElement.initOperations(_ExitStep__OclElement);

			Fragments._ForcingOrder__ActionType.initOperations(_ForcingOrder__ActionType);
			Fragments._ForcingOrder__ForcingOrder.initOperations(_ForcingOrder__ForcingOrder);
			Fragments._ForcingOrder__OclAny.initOperations(_ForcingOrder__OclAny);
			Fragments._ForcingOrder__OclElement.initOperations(_ForcingOrder__OclElement);

			Fragments._ForcingOrderType__ForcingOrderType.initOperations(_ForcingOrderType__ForcingOrderType);
			Fragments._ForcingOrderType__OclAny.initOperations(_ForcingOrderType__OclAny);
			Fragments._ForcingOrderType__OclElement.initOperations(_ForcingOrderType__OclElement);
			Fragments._ForcingOrderType__OclEnumeration.initOperations(_ForcingOrderType__OclEnumeration);
			Fragments._ForcingOrderType__OclType.initOperations(_ForcingOrderType__OclType);

			Fragments._Grafcet__Grafcet.initOperations(_Grafcet__Grafcet);
			Fragments._Grafcet__OclAny.initOperations(_Grafcet__OclAny);
			Fragments._Grafcet__OclElement.initOperations(_Grafcet__OclElement);

			Fragments._InitializableType__InitializableType.initOperations(_InitializableType__InitializableType);
			Fragments._InitializableType__Node.initOperations(_InitializableType__Node);
			Fragments._InitializableType__OclAny.initOperations(_InitializableType__OclAny);
			Fragments._InitializableType__OclElement.initOperations(_InitializableType__OclElement);

			Fragments._Macrostep__Macrostep.initOperations(_Macrostep__Macrostep);
			Fragments._Macrostep__Node.initOperations(_Macrostep__Node);
			Fragments._Macrostep__OclAny.initOperations(_Macrostep__OclAny);
			Fragments._Macrostep__OclElement.initOperations(_Macrostep__OclElement);

			Fragments._MacrostepExpansion__Grafcet.initOperations(_MacrostepExpansion__Grafcet);
			Fragments._MacrostepExpansion__MacrostepExpansion.initOperations(_MacrostepExpansion__MacrostepExpansion);
			Fragments._MacrostepExpansion__OclAny.initOperations(_MacrostepExpansion__OclAny);
			Fragments._MacrostepExpansion__OclElement.initOperations(_MacrostepExpansion__OclElement);

			Fragments._Node__Node.initOperations(_Node__Node);
			Fragments._Node__OclAny.initOperations(_Node__OclAny);
			Fragments._Node__OclElement.initOperations(_Node__OclElement);

			Fragments._PartialGrafcet__Grafcet.initOperations(_PartialGrafcet__Grafcet);
			Fragments._PartialGrafcet__OclAny.initOperations(_PartialGrafcet__OclAny);
			Fragments._PartialGrafcet__OclElement.initOperations(_PartialGrafcet__OclElement);
			Fragments._PartialGrafcet__PartialGrafcet.initOperations(_PartialGrafcet__PartialGrafcet);

			Fragments._ProcessGrafcet__Grafcet.initOperations(_ProcessGrafcet__Grafcet);
			Fragments._ProcessGrafcet__OclAny.initOperations(_ProcessGrafcet__OclAny);
			Fragments._ProcessGrafcet__OclElement.initOperations(_ProcessGrafcet__OclElement);
			Fragments._ProcessGrafcet__PartialGrafcet.initOperations(_ProcessGrafcet__PartialGrafcet);
			Fragments._ProcessGrafcet__ProcessGrafcet.initOperations(_ProcessGrafcet__ProcessGrafcet);

			Fragments._Step__InitializableType.initOperations(_Step__InitializableType);
			Fragments._Step__Node.initOperations(_Step__Node);
			Fragments._Step__OclAny.initOperations(_Step__OclAny);
			Fragments._Step__OclElement.initOperations(_Step__OclElement);
			Fragments._Step__Step.initOperations(_Step__Step);

			Fragments._StoredAction__Action.initOperations(_StoredAction__Action);
			Fragments._StoredAction__ActionType.initOperations(_StoredAction__ActionType);
			Fragments._StoredAction__Condition.initOperations(_StoredAction__Condition);
			Fragments._StoredAction__OclAny.initOperations(_StoredAction__OclAny);
			Fragments._StoredAction__OclElement.initOperations(_StoredAction__OclElement);
			Fragments._StoredAction__StoredAction.initOperations(_StoredAction__StoredAction);

			Fragments._StoredActionType__OclAny.initOperations(_StoredActionType__OclAny);
			Fragments._StoredActionType__OclElement.initOperations(_StoredActionType__OclElement);
			Fragments._StoredActionType__OclEnumeration.initOperations(_StoredActionType__OclEnumeration);
			Fragments._StoredActionType__OclType.initOperations(_StoredActionType__OclType);
			Fragments._StoredActionType__StoredActionType.initOperations(_StoredActionType__StoredActionType);

			Fragments._Synchronization__Node.initOperations(_Synchronization__Node);
			Fragments._Synchronization__OclAny.initOperations(_Synchronization__OclAny);
			Fragments._Synchronization__OclElement.initOperations(_Synchronization__OclElement);
			Fragments._Synchronization__Synchronization.initOperations(_Synchronization__Synchronization);

			Fragments._TimeCondition__Condition.initOperations(_TimeCondition__Condition);
			Fragments._TimeCondition__OclAny.initOperations(_TimeCondition__OclAny);
			Fragments._TimeCondition__OclElement.initOperations(_TimeCondition__OclElement);
			Fragments._TimeCondition__TimeCondition.initOperations(_TimeCondition__TimeCondition);

			Fragments._TimeConditionType__OclAny.initOperations(_TimeConditionType__OclAny);
			Fragments._TimeConditionType__OclElement.initOperations(_TimeConditionType__OclElement);
			Fragments._TimeConditionType__OclEnumeration.initOperations(_TimeConditionType__OclEnumeration);
			Fragments._TimeConditionType__OclType.initOperations(_TimeConditionType__OclType);
			Fragments._TimeConditionType__TimeConditionType.initOperations(_TimeConditionType__TimeConditionType);

			Fragments._TimeUnit__OclAny.initOperations(_TimeUnit__OclAny);
			Fragments._TimeUnit__OclElement.initOperations(_TimeUnit__OclElement);
			Fragments._TimeUnit__OclEnumeration.initOperations(_TimeUnit__OclEnumeration);
			Fragments._TimeUnit__OclType.initOperations(_TimeUnit__OclType);
			Fragments._TimeUnit__TimeUnit.initOperations(_TimeUnit__TimeUnit);

			Fragments._Transition__Condition.initOperations(_Transition__Condition);
			Fragments._Transition__Node.initOperations(_Transition__Node);
			Fragments._Transition__OclAny.initOperations(_Transition__OclAny);
			Fragments._Transition__OclElement.initOperations(_Transition__OclElement);
			Fragments._Transition__TimeCondition.initOperations(_Transition__TimeCondition);
			Fragments._Transition__Transition.initOperations(_Transition__Transition);

			Fragments._VariableDeclarationContainer__OclAny.initOperations(_VariableDeclarationContainer__OclAny);
			Fragments._VariableDeclarationContainer__OclElement.initOperations(_VariableDeclarationContainer__OclElement);
			Fragments._VariableDeclarationContainer__VariableDeclarationContainer.initOperations(_VariableDeclarationContainer__VariableDeclarationContainer);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GrafcetTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Action = {
			GrafcetTables.Properties._ActionType__id,
			GrafcetTables.Properties._Action__variable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ActionLink = {
			GrafcetTables.Properties._ActionLink__actionType,
			GrafcetTables.Properties._ActionLink__step
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ActionType = {
			GrafcetTables.Properties._ActionType__id
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Arc = {
			GrafcetTables.Properties._Arc__source,
			GrafcetTables.Properties._Arc__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Condition = {
			GrafcetTables.Properties._Condition__term
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ContinuousAction = {
			GrafcetTables.Properties._ContinuousAction__continuousActionType,
			GrafcetTables.Properties._TimeCondition__delayTime,
			GrafcetTables.Properties._ActionType__id,
			GrafcetTables.Properties._TimeCondition__resetTime,
			GrafcetTables.Properties._Condition__term,
			GrafcetTables.Properties._TimeCondition__timeConditionType,
			GrafcetTables.Properties._TimeCondition__unit,
			GrafcetTables.Properties._Action__variable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ContinuousActionType = {};

		private static final ExecutorProperty /*@NonNull*/ [] _ControlGrafcet = {
			GrafcetTables.Properties._Grafcet__actionLinks,
			GrafcetTables.Properties._Grafcet__actionTypes,
			GrafcetTables.Properties._Grafcet__arcs,
			GrafcetTables.Properties._Grafcet__controlGrafcet,
			GrafcetTables.Properties._PartialGrafcet__enclosingStep,
			GrafcetTables.Properties._Grafcet__macrosteps,
			GrafcetTables.Properties._Grafcet__name,
			GrafcetTables.Properties._Grafcet__partialGrafcets,
			GrafcetTables.Properties._Grafcet__processGrafcet,
			GrafcetTables.Properties._Grafcet__steps,
			GrafcetTables.Properties._Grafcet__synchronizations,
			GrafcetTables.Properties._Grafcet__transitions,
			GrafcetTables.Properties._Grafcet__variableDeclarationContainer
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EnclosingStep = {
			GrafcetTables.Properties._InitializableType__activationLink,
			GrafcetTables.Properties._Node__id,
			GrafcetTables.Properties._InitializableType__initial,
			GrafcetTables.Properties._EnclosingStep__partialGrafcets
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EntryStep = {
			GrafcetTables.Properties._Node__id
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ExitStep = {
			GrafcetTables.Properties._Node__id
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ForcingOrder = {
			GrafcetTables.Properties._ForcingOrder__forcedSteps,
			GrafcetTables.Properties._ForcingOrder__forcingOrderType,
			GrafcetTables.Properties._ActionType__id,
			GrafcetTables.Properties._ForcingOrder__partialGrafcet
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ForcingOrderType = {};

		private static final ExecutorProperty /*@NonNull*/ [] _Grafcet = {
			GrafcetTables.Properties._Grafcet__actionLinks,
			GrafcetTables.Properties._Grafcet__actionTypes,
			GrafcetTables.Properties._Grafcet__arcs,
			GrafcetTables.Properties._Grafcet__controlGrafcet,
			GrafcetTables.Properties._Grafcet__macrosteps,
			GrafcetTables.Properties._Grafcet__name,
			GrafcetTables.Properties._Grafcet__partialGrafcets,
			GrafcetTables.Properties._Grafcet__processGrafcet,
			GrafcetTables.Properties._Grafcet__steps,
			GrafcetTables.Properties._Grafcet__synchronizations,
			GrafcetTables.Properties._Grafcet__transitions,
			GrafcetTables.Properties._Grafcet__variableDeclarationContainer
		};

		private static final ExecutorProperty /*@NonNull*/ [] _InitializableType = {
			GrafcetTables.Properties._InitializableType__activationLink,
			GrafcetTables.Properties._Node__id,
			GrafcetTables.Properties._InitializableType__initial
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Macrostep = {
			GrafcetTables.Properties._Macrostep__expansion,
			GrafcetTables.Properties._Node__id
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MacrostepExpansion = {
			GrafcetTables.Properties._Grafcet__actionLinks,
			GrafcetTables.Properties._Grafcet__actionTypes,
			GrafcetTables.Properties._Grafcet__arcs,
			GrafcetTables.Properties._Grafcet__controlGrafcet,
			GrafcetTables.Properties._MacrostepExpansion__entryStep,
			GrafcetTables.Properties._MacrostepExpansion__exitStep,
			GrafcetTables.Properties._Grafcet__macrosteps,
			GrafcetTables.Properties._Grafcet__name,
			GrafcetTables.Properties._Grafcet__partialGrafcets,
			GrafcetTables.Properties._Grafcet__processGrafcet,
			GrafcetTables.Properties._Grafcet__steps,
			GrafcetTables.Properties._Grafcet__synchronizations,
			GrafcetTables.Properties._Grafcet__transitions,
			GrafcetTables.Properties._Grafcet__variableDeclarationContainer
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Node = {
			GrafcetTables.Properties._Node__id
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PartialGrafcet = {
			GrafcetTables.Properties._Grafcet__actionLinks,
			GrafcetTables.Properties._Grafcet__actionTypes,
			GrafcetTables.Properties._Grafcet__arcs,
			GrafcetTables.Properties._Grafcet__controlGrafcet,
			GrafcetTables.Properties._PartialGrafcet__enclosingStep,
			GrafcetTables.Properties._Grafcet__macrosteps,
			GrafcetTables.Properties._Grafcet__name,
			GrafcetTables.Properties._Grafcet__partialGrafcets,
			GrafcetTables.Properties._Grafcet__processGrafcet,
			GrafcetTables.Properties._Grafcet__steps,
			GrafcetTables.Properties._Grafcet__synchronizations,
			GrafcetTables.Properties._Grafcet__transitions,
			GrafcetTables.Properties._Grafcet__variableDeclarationContainer
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProcessGrafcet = {
			GrafcetTables.Properties._Grafcet__actionLinks,
			GrafcetTables.Properties._Grafcet__actionTypes,
			GrafcetTables.Properties._Grafcet__arcs,
			GrafcetTables.Properties._Grafcet__controlGrafcet,
			GrafcetTables.Properties._PartialGrafcet__enclosingStep,
			GrafcetTables.Properties._Grafcet__macrosteps,
			GrafcetTables.Properties._Grafcet__name,
			GrafcetTables.Properties._Grafcet__partialGrafcets,
			GrafcetTables.Properties._Grafcet__processGrafcet,
			GrafcetTables.Properties._Grafcet__steps,
			GrafcetTables.Properties._Grafcet__synchronizations,
			GrafcetTables.Properties._Grafcet__transitions,
			GrafcetTables.Properties._Grafcet__variableDeclarationContainer
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Step = {
			GrafcetTables.Properties._InitializableType__activationLink,
			GrafcetTables.Properties._Node__id,
			GrafcetTables.Properties._InitializableType__initial
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StoredAction = {
			GrafcetTables.Properties._ActionType__id,
			GrafcetTables.Properties._StoredAction__storedActionType,
			GrafcetTables.Properties._Condition__term,
			GrafcetTables.Properties._StoredAction__value,
			GrafcetTables.Properties._Action__variable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StoredActionType = {};

		private static final ExecutorProperty /*@NonNull*/ [] _Synchronization = {
			GrafcetTables.Properties._Node__id
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TimeCondition = {
			GrafcetTables.Properties._TimeCondition__delayTime,
			GrafcetTables.Properties._TimeCondition__resetTime,
			GrafcetTables.Properties._Condition__term,
			GrafcetTables.Properties._TimeCondition__timeConditionType,
			GrafcetTables.Properties._TimeCondition__unit
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TimeConditionType = {};

		private static final ExecutorProperty /*@NonNull*/ [] _TimeUnit = {};

		private static final ExecutorProperty /*@NonNull*/ [] _Transition = {
			GrafcetTables.Properties._TimeCondition__delayTime,
			GrafcetTables.Properties._Node__id,
			GrafcetTables.Properties._TimeCondition__resetTime,
			GrafcetTables.Properties._Condition__term,
			GrafcetTables.Properties._TimeCondition__timeConditionType,
			GrafcetTables.Properties._TimeCondition__unit
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VariableDeclarationContainer = {
			GrafcetTables.Properties._VariableDeclarationContainer__variableDeclarations
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initProperties(_Action);
			Fragments._ActionLink__ActionLink.initProperties(_ActionLink);
			Fragments._ActionType__ActionType.initProperties(_ActionType);
			Fragments._Arc__Arc.initProperties(_Arc);
			Fragments._Condition__Condition.initProperties(_Condition);
			Fragments._ContinuousAction__ContinuousAction.initProperties(_ContinuousAction);
			Fragments._ContinuousActionType__ContinuousActionType.initProperties(_ContinuousActionType);
			Fragments._ControlGrafcet__ControlGrafcet.initProperties(_ControlGrafcet);
			Fragments._EnclosingStep__EnclosingStep.initProperties(_EnclosingStep);
			Fragments._EntryStep__EntryStep.initProperties(_EntryStep);
			Fragments._ExitStep__ExitStep.initProperties(_ExitStep);
			Fragments._ForcingOrder__ForcingOrder.initProperties(_ForcingOrder);
			Fragments._ForcingOrderType__ForcingOrderType.initProperties(_ForcingOrderType);
			Fragments._Grafcet__Grafcet.initProperties(_Grafcet);
			Fragments._InitializableType__InitializableType.initProperties(_InitializableType);
			Fragments._Macrostep__Macrostep.initProperties(_Macrostep);
			Fragments._MacrostepExpansion__MacrostepExpansion.initProperties(_MacrostepExpansion);
			Fragments._Node__Node.initProperties(_Node);
			Fragments._PartialGrafcet__PartialGrafcet.initProperties(_PartialGrafcet);
			Fragments._ProcessGrafcet__ProcessGrafcet.initProperties(_ProcessGrafcet);
			Fragments._Step__Step.initProperties(_Step);
			Fragments._StoredAction__StoredAction.initProperties(_StoredAction);
			Fragments._StoredActionType__StoredActionType.initProperties(_StoredActionType);
			Fragments._Synchronization__Synchronization.initProperties(_Synchronization);
			Fragments._TimeCondition__TimeCondition.initProperties(_TimeCondition);
			Fragments._TimeConditionType__TimeConditionType.initProperties(_TimeConditionType);
			Fragments._TimeUnit__TimeUnit.initProperties(_TimeUnit);
			Fragments._Transition__Transition.initProperties(_Transition);
			Fragments._VariableDeclarationContainer__VariableDeclarationContainer.initProperties(_VariableDeclarationContainer);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GrafcetTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _ContinuousActionType__continuousAction = new EcoreExecutorEnumerationLiteral(GrafcetPackage.Literals.CONTINUOUS_ACTION_TYPE.getEEnumLiteral("continuousAction"), Types._ContinuousActionType, 0);
		public static final EcoreExecutorEnumerationLiteral _ContinuousActionType__assignationCondition = new EcoreExecutorEnumerationLiteral(GrafcetPackage.Literals.CONTINUOUS_ACTION_TYPE.getEEnumLiteral("assignationCondition"), Types._ContinuousActionType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ContinuousActionType = {
			_ContinuousActionType__continuousAction,
			_ContinuousActionType__assignationCondition
		};

		public static final EcoreExecutorEnumerationLiteral _ForcingOrderType__currentSituation = new EcoreExecutorEnumerationLiteral(GrafcetPackage.Literals.FORCING_ORDER_TYPE.getEEnumLiteral("currentSituation"), Types._ForcingOrderType, 0);
		public static final EcoreExecutorEnumerationLiteral _ForcingOrderType__emptySituation = new EcoreExecutorEnumerationLiteral(GrafcetPackage.Literals.FORCING_ORDER_TYPE.getEEnumLiteral("emptySituation"), Types._ForcingOrderType, 1);
		public static final EcoreExecutorEnumerationLiteral _ForcingOrderType__initialSituation = new EcoreExecutorEnumerationLiteral(GrafcetPackage.Literals.FORCING_ORDER_TYPE.getEEnumLiteral("initialSituation"), Types._ForcingOrderType, 2);
		public static final EcoreExecutorEnumerationLiteral _ForcingOrderType__explicitSituation = new EcoreExecutorEnumerationLiteral(GrafcetPackage.Literals.FORCING_ORDER_TYPE.getEEnumLiteral("explicitSituation"), Types._ForcingOrderType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ForcingOrderType = {
			_ForcingOrderType__currentSituation,
			_ForcingOrderType__emptySituation,
			_ForcingOrderType__initialSituation,
			_ForcingOrderType__explicitSituation
		};

		public static final EcoreExecutorEnumerationLiteral _StoredActionType__activation = new EcoreExecutorEnumerationLiteral(GrafcetPackage.Literals.STORED_ACTION_TYPE.getEEnumLiteral("activation"), Types._StoredActionType, 0);
		public static final EcoreExecutorEnumerationLiteral _StoredActionType__deactivation = new EcoreExecutorEnumerationLiteral(GrafcetPackage.Literals.STORED_ACTION_TYPE.getEEnumLiteral("deactivation"), Types._StoredActionType, 1);
		public static final EcoreExecutorEnumerationLiteral _StoredActionType__event = new EcoreExecutorEnumerationLiteral(GrafcetPackage.Literals.STORED_ACTION_TYPE.getEEnumLiteral("event"), Types._StoredActionType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _StoredActionType = {
			_StoredActionType__activation,
			_StoredActionType__deactivation,
			_StoredActionType__event
		};

		public static final EcoreExecutorEnumerationLiteral _TimeConditionType__none = new EcoreExecutorEnumerationLiteral(GrafcetPackage.Literals.TIME_CONDITION_TYPE.getEEnumLiteral("none"), Types._TimeConditionType, 0);
		public static final EcoreExecutorEnumerationLiteral _TimeConditionType__timeDependent = new EcoreExecutorEnumerationLiteral(GrafcetPackage.Literals.TIME_CONDITION_TYPE.getEEnumLiteral("timeDependent"), Types._TimeConditionType, 1);
		public static final EcoreExecutorEnumerationLiteral _TimeConditionType__timeDelayed = new EcoreExecutorEnumerationLiteral(GrafcetPackage.Literals.TIME_CONDITION_TYPE.getEEnumLiteral("timeDelayed"), Types._TimeConditionType, 2);
		public static final EcoreExecutorEnumerationLiteral _TimeConditionType__timeLimited = new EcoreExecutorEnumerationLiteral(GrafcetPackage.Literals.TIME_CONDITION_TYPE.getEEnumLiteral("timeLimited"), Types._TimeConditionType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TimeConditionType = {
			_TimeConditionType__none,
			_TimeConditionType__timeDependent,
			_TimeConditionType__timeDelayed,
			_TimeConditionType__timeLimited
		};

		public static final EcoreExecutorEnumerationLiteral _TimeUnit__second = new EcoreExecutorEnumerationLiteral(GrafcetPackage.Literals.TIME_UNIT.getEEnumLiteral("second"), Types._TimeUnit, 0);
		public static final EcoreExecutorEnumerationLiteral _TimeUnit__millisecond = new EcoreExecutorEnumerationLiteral(GrafcetPackage.Literals.TIME_UNIT.getEEnumLiteral("millisecond"), Types._TimeUnit, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TimeUnit = {
			_TimeUnit__second,
			_TimeUnit__millisecond
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._ContinuousActionType.initLiterals(_ContinuousActionType);
			Types._ForcingOrderType.initLiterals(_ForcingOrderType);
			Types._StoredActionType.initLiterals(_StoredActionType);
			Types._TimeConditionType.initLiterals(_TimeConditionType);
			Types._TimeUnit.initLiterals(_TimeUnit);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GrafcetTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
