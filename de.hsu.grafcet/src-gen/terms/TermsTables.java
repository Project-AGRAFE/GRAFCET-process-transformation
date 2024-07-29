/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /de.hsu.grafcet/model/terms.ecore
 *   /de.hsu.grafcet/model/grafcet.ecore
 * using:
 *   /de.hsu.grafcet/model/grafcet.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package terms;

import de.hsu.grafcet.GrafcetPackage;
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
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import terms.TermsPackage;
import terms.TermsTables;

/**
 * TermsTables provides the dispatch tables for the terms for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class TermsTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(TermsPackage.eINSTANCE);

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
	public static final /*@NonInvalid*/ ClassId CLSSid_Addition = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("Addition", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_And = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("And", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Bool = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("Bool", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BooleanConstant = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("BooleanConstant", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BooleanOperator = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("BooleanOperator", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = TermsTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Equality = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("Equality", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_FallingEdge = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("FallingEdge", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_GreaterThan = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("GreaterThan", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_InitializableType = TermsTables.PACKid_http_c_s_s_www_example_org_s_grafcet.getClassId("InitializableType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Integer = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("Integer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_IntegerConstant = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("IntegerConstant", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_IntegerOperator = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("IntegerOperator", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_LessThan = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("LessThan", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Not = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("Not", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Operator = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("Operator", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Or = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("Or", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_RisingEdge = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("RisingEdge", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Sort = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("Sort", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Substraction = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("Substraction", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Term = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("Term", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Variable = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("Variable", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_VariableDeclaration = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getClassId("VariableDeclaration", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = TermsTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_VariableDeclarationType = TermsTables.PACKid_http_c_s_s_www_example_org_s_terms.getEnumerationId("VariableDeclarationType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_2 = ValueUtil.integerValueOf("2");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Operator = TypeId.BAG.getSpecializedId(TermsTables.CLSSid_Operator);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Term = TypeId.BAG.getSpecializedId(TermsTables.CLSSid_Term);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Variable = TypeId.BAG.getSpecializedId(TermsTables.CLSSid_Variable);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_step = TermsTables.ENUMid_VariableDeclarationType.getEnumerationLiteralId("step");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Sort = TypeId.ORDERED_SET.getSpecializedId(TermsTables.CLSSid_Sort);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Term = TypeId.ORDERED_SET.getSpecializedId(TermsTables.CLSSid_Term);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Sort = TypeId.SEQUENCE.getSpecializedId(TermsTables.CLSSid_Sort);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			TermsTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TermsTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _Addition = new EcoreExecutorType(TermsPackage.Literals.ADDITION, PACKAGE, 0);
		public static final EcoreExecutorType _And = new EcoreExecutorType(TermsPackage.Literals.AND, PACKAGE, 0);
		public static final EcoreExecutorType _Bool = new EcoreExecutorType(TermsPackage.Literals.BOOL, PACKAGE, 0);
		public static final EcoreExecutorType _BooleanConstant = new EcoreExecutorType(TermsPackage.Literals.BOOLEAN_CONSTANT, PACKAGE, 0);
		public static final EcoreExecutorType _BooleanOperator = new EcoreExecutorType(TermsPackage.Literals.BOOLEAN_OPERATOR, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Constant = new EcoreExecutorType(TermsPackage.Literals.CONSTANT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Equality = new EcoreExecutorType(TermsPackage.Literals.EQUALITY, PACKAGE, 0);
		public static final EcoreExecutorType _FallingEdge = new EcoreExecutorType(TermsPackage.Literals.FALLING_EDGE, PACKAGE, 0);
		public static final EcoreExecutorType _GreaterThan = new EcoreExecutorType(TermsPackage.Literals.GREATER_THAN, PACKAGE, 0);
		public static final EcoreExecutorType _Integer = new EcoreExecutorType(TermsPackage.Literals.INTEGER, PACKAGE, 0);
		public static final EcoreExecutorType _IntegerConstant = new EcoreExecutorType(TermsPackage.Literals.INTEGER_CONSTANT, PACKAGE, 0);
		public static final EcoreExecutorType _IntegerOperator = new EcoreExecutorType(TermsPackage.Literals.INTEGER_OPERATOR, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _LessThan = new EcoreExecutorType(TermsPackage.Literals.LESS_THAN, PACKAGE, 0);
		public static final EcoreExecutorType _Not = new EcoreExecutorType(TermsPackage.Literals.NOT, PACKAGE, 0);
		public static final EcoreExecutorType _Operator = new EcoreExecutorType(TermsPackage.Literals.OPERATOR, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Or = new EcoreExecutorType(TermsPackage.Literals.OR, PACKAGE, 0);
		public static final EcoreExecutorType _RisingEdge = new EcoreExecutorType(TermsPackage.Literals.RISING_EDGE, PACKAGE, 0);
		public static final EcoreExecutorType _Sort = new EcoreExecutorType(TermsPackage.Literals.SORT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Substraction = new EcoreExecutorType(TermsPackage.Literals.SUBSTRACTION, PACKAGE, 0);
		public static final EcoreExecutorType _Term = new EcoreExecutorType(TermsPackage.Literals.TERM, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Variable = new EcoreExecutorType(TermsPackage.Literals.VARIABLE, PACKAGE, 0);
		public static final EcoreExecutorType _VariableDeclaration = new EcoreExecutorType(TermsPackage.Literals.VARIABLE_DECLARATION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _VariableDeclarationType = new EcoreExecutorEnumeration(TermsPackage.Literals.VARIABLE_DECLARATION_TYPE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Addition,
			_And,
			_Bool,
			_BooleanConstant,
			_BooleanOperator,
			_Constant,
			_Equality,
			_FallingEdge,
			_GreaterThan,
			_Integer,
			_IntegerConstant,
			_IntegerOperator,
			_LessThan,
			_Not,
			_Operator,
			_Or,
			_RisingEdge,
			_Sort,
			_Substraction,
			_Term,
			_Variable,
			_VariableDeclaration,
			_VariableDeclarationType
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TermsTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _Addition__Addition = new ExecutorFragment(Types._Addition, TermsTables.Types._Addition);
		private static final ExecutorFragment _Addition__IntegerOperator = new ExecutorFragment(Types._Addition, TermsTables.Types._IntegerOperator);
		private static final ExecutorFragment _Addition__OclAny = new ExecutorFragment(Types._Addition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Addition__OclElement = new ExecutorFragment(Types._Addition, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Addition__Operator = new ExecutorFragment(Types._Addition, TermsTables.Types._Operator);
		private static final ExecutorFragment _Addition__Term = new ExecutorFragment(Types._Addition, TermsTables.Types._Term);

		private static final ExecutorFragment _And__And = new ExecutorFragment(Types._And, TermsTables.Types._And);
		private static final ExecutorFragment _And__BooleanOperator = new ExecutorFragment(Types._And, TermsTables.Types._BooleanOperator);
		private static final ExecutorFragment _And__OclAny = new ExecutorFragment(Types._And, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _And__OclElement = new ExecutorFragment(Types._And, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _And__Operator = new ExecutorFragment(Types._And, TermsTables.Types._Operator);
		private static final ExecutorFragment _And__Term = new ExecutorFragment(Types._And, TermsTables.Types._Term);

		private static final ExecutorFragment _Bool__Bool = new ExecutorFragment(Types._Bool, TermsTables.Types._Bool);
		private static final ExecutorFragment _Bool__OclAny = new ExecutorFragment(Types._Bool, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Bool__OclElement = new ExecutorFragment(Types._Bool, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Bool__Sort = new ExecutorFragment(Types._Bool, TermsTables.Types._Sort);

		private static final ExecutorFragment _BooleanConstant__BooleanConstant = new ExecutorFragment(Types._BooleanConstant, TermsTables.Types._BooleanConstant);
		private static final ExecutorFragment _BooleanConstant__Constant = new ExecutorFragment(Types._BooleanConstant, TermsTables.Types._Constant);
		private static final ExecutorFragment _BooleanConstant__OclAny = new ExecutorFragment(Types._BooleanConstant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BooleanConstant__OclElement = new ExecutorFragment(Types._BooleanConstant, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BooleanConstant__Operator = new ExecutorFragment(Types._BooleanConstant, TermsTables.Types._Operator);
		private static final ExecutorFragment _BooleanConstant__Term = new ExecutorFragment(Types._BooleanConstant, TermsTables.Types._Term);

		private static final ExecutorFragment _BooleanOperator__BooleanOperator = new ExecutorFragment(Types._BooleanOperator, TermsTables.Types._BooleanOperator);
		private static final ExecutorFragment _BooleanOperator__OclAny = new ExecutorFragment(Types._BooleanOperator, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BooleanOperator__OclElement = new ExecutorFragment(Types._BooleanOperator, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BooleanOperator__Operator = new ExecutorFragment(Types._BooleanOperator, TermsTables.Types._Operator);
		private static final ExecutorFragment _BooleanOperator__Term = new ExecutorFragment(Types._BooleanOperator, TermsTables.Types._Term);

		private static final ExecutorFragment _Constant__Constant = new ExecutorFragment(Types._Constant, TermsTables.Types._Constant);
		private static final ExecutorFragment _Constant__OclAny = new ExecutorFragment(Types._Constant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Constant__OclElement = new ExecutorFragment(Types._Constant, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Constant__Operator = new ExecutorFragment(Types._Constant, TermsTables.Types._Operator);
		private static final ExecutorFragment _Constant__Term = new ExecutorFragment(Types._Constant, TermsTables.Types._Term);

		private static final ExecutorFragment _Equality__Equality = new ExecutorFragment(Types._Equality, TermsTables.Types._Equality);
		private static final ExecutorFragment _Equality__OclAny = new ExecutorFragment(Types._Equality, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Equality__OclElement = new ExecutorFragment(Types._Equality, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Equality__Operator = new ExecutorFragment(Types._Equality, TermsTables.Types._Operator);
		private static final ExecutorFragment _Equality__Term = new ExecutorFragment(Types._Equality, TermsTables.Types._Term);

		private static final ExecutorFragment _FallingEdge__BooleanOperator = new ExecutorFragment(Types._FallingEdge, TermsTables.Types._BooleanOperator);
		private static final ExecutorFragment _FallingEdge__FallingEdge = new ExecutorFragment(Types._FallingEdge, TermsTables.Types._FallingEdge);
		private static final ExecutorFragment _FallingEdge__OclAny = new ExecutorFragment(Types._FallingEdge, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FallingEdge__OclElement = new ExecutorFragment(Types._FallingEdge, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _FallingEdge__Operator = new ExecutorFragment(Types._FallingEdge, TermsTables.Types._Operator);
		private static final ExecutorFragment _FallingEdge__Term = new ExecutorFragment(Types._FallingEdge, TermsTables.Types._Term);

		private static final ExecutorFragment _GreaterThan__GreaterThan = new ExecutorFragment(Types._GreaterThan, TermsTables.Types._GreaterThan);
		private static final ExecutorFragment _GreaterThan__IntegerOperator = new ExecutorFragment(Types._GreaterThan, TermsTables.Types._IntegerOperator);
		private static final ExecutorFragment _GreaterThan__OclAny = new ExecutorFragment(Types._GreaterThan, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _GreaterThan__OclElement = new ExecutorFragment(Types._GreaterThan, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _GreaterThan__Operator = new ExecutorFragment(Types._GreaterThan, TermsTables.Types._Operator);
		private static final ExecutorFragment _GreaterThan__Term = new ExecutorFragment(Types._GreaterThan, TermsTables.Types._Term);

		private static final ExecutorFragment _Integer__Integer = new ExecutorFragment(Types._Integer, TermsTables.Types._Integer);
		private static final ExecutorFragment _Integer__OclAny = new ExecutorFragment(Types._Integer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Integer__OclElement = new ExecutorFragment(Types._Integer, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Integer__Sort = new ExecutorFragment(Types._Integer, TermsTables.Types._Sort);

		private static final ExecutorFragment _IntegerConstant__Constant = new ExecutorFragment(Types._IntegerConstant, TermsTables.Types._Constant);
		private static final ExecutorFragment _IntegerConstant__IntegerConstant = new ExecutorFragment(Types._IntegerConstant, TermsTables.Types._IntegerConstant);
		private static final ExecutorFragment _IntegerConstant__OclAny = new ExecutorFragment(Types._IntegerConstant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IntegerConstant__OclElement = new ExecutorFragment(Types._IntegerConstant, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _IntegerConstant__Operator = new ExecutorFragment(Types._IntegerConstant, TermsTables.Types._Operator);
		private static final ExecutorFragment _IntegerConstant__Term = new ExecutorFragment(Types._IntegerConstant, TermsTables.Types._Term);

		private static final ExecutorFragment _IntegerOperator__IntegerOperator = new ExecutorFragment(Types._IntegerOperator, TermsTables.Types._IntegerOperator);
		private static final ExecutorFragment _IntegerOperator__OclAny = new ExecutorFragment(Types._IntegerOperator, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IntegerOperator__OclElement = new ExecutorFragment(Types._IntegerOperator, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _IntegerOperator__Operator = new ExecutorFragment(Types._IntegerOperator, TermsTables.Types._Operator);
		private static final ExecutorFragment _IntegerOperator__Term = new ExecutorFragment(Types._IntegerOperator, TermsTables.Types._Term);

		private static final ExecutorFragment _LessThan__IntegerOperator = new ExecutorFragment(Types._LessThan, TermsTables.Types._IntegerOperator);
		private static final ExecutorFragment _LessThan__LessThan = new ExecutorFragment(Types._LessThan, TermsTables.Types._LessThan);
		private static final ExecutorFragment _LessThan__OclAny = new ExecutorFragment(Types._LessThan, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LessThan__OclElement = new ExecutorFragment(Types._LessThan, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _LessThan__Operator = new ExecutorFragment(Types._LessThan, TermsTables.Types._Operator);
		private static final ExecutorFragment _LessThan__Term = new ExecutorFragment(Types._LessThan, TermsTables.Types._Term);

		private static final ExecutorFragment _Not__BooleanOperator = new ExecutorFragment(Types._Not, TermsTables.Types._BooleanOperator);
		private static final ExecutorFragment _Not__Not = new ExecutorFragment(Types._Not, TermsTables.Types._Not);
		private static final ExecutorFragment _Not__OclAny = new ExecutorFragment(Types._Not, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Not__OclElement = new ExecutorFragment(Types._Not, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Not__Operator = new ExecutorFragment(Types._Not, TermsTables.Types._Operator);
		private static final ExecutorFragment _Not__Term = new ExecutorFragment(Types._Not, TermsTables.Types._Term);

		private static final ExecutorFragment _Operator__OclAny = new ExecutorFragment(Types._Operator, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Operator__OclElement = new ExecutorFragment(Types._Operator, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Operator__Operator = new ExecutorFragment(Types._Operator, TermsTables.Types._Operator);
		private static final ExecutorFragment _Operator__Term = new ExecutorFragment(Types._Operator, TermsTables.Types._Term);

		private static final ExecutorFragment _Or__BooleanOperator = new ExecutorFragment(Types._Or, TermsTables.Types._BooleanOperator);
		private static final ExecutorFragment _Or__OclAny = new ExecutorFragment(Types._Or, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Or__OclElement = new ExecutorFragment(Types._Or, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Or__Operator = new ExecutorFragment(Types._Or, TermsTables.Types._Operator);
		private static final ExecutorFragment _Or__Or = new ExecutorFragment(Types._Or, TermsTables.Types._Or);
		private static final ExecutorFragment _Or__Term = new ExecutorFragment(Types._Or, TermsTables.Types._Term);

		private static final ExecutorFragment _RisingEdge__BooleanOperator = new ExecutorFragment(Types._RisingEdge, TermsTables.Types._BooleanOperator);
		private static final ExecutorFragment _RisingEdge__OclAny = new ExecutorFragment(Types._RisingEdge, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RisingEdge__OclElement = new ExecutorFragment(Types._RisingEdge, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RisingEdge__Operator = new ExecutorFragment(Types._RisingEdge, TermsTables.Types._Operator);
		private static final ExecutorFragment _RisingEdge__RisingEdge = new ExecutorFragment(Types._RisingEdge, TermsTables.Types._RisingEdge);
		private static final ExecutorFragment _RisingEdge__Term = new ExecutorFragment(Types._RisingEdge, TermsTables.Types._Term);

		private static final ExecutorFragment _Sort__OclAny = new ExecutorFragment(Types._Sort, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Sort__OclElement = new ExecutorFragment(Types._Sort, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Sort__Sort = new ExecutorFragment(Types._Sort, TermsTables.Types._Sort);

		private static final ExecutorFragment _Substraction__IntegerOperator = new ExecutorFragment(Types._Substraction, TermsTables.Types._IntegerOperator);
		private static final ExecutorFragment _Substraction__OclAny = new ExecutorFragment(Types._Substraction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Substraction__OclElement = new ExecutorFragment(Types._Substraction, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Substraction__Operator = new ExecutorFragment(Types._Substraction, TermsTables.Types._Operator);
		private static final ExecutorFragment _Substraction__Substraction = new ExecutorFragment(Types._Substraction, TermsTables.Types._Substraction);
		private static final ExecutorFragment _Substraction__Term = new ExecutorFragment(Types._Substraction, TermsTables.Types._Term);

		private static final ExecutorFragment _Term__OclAny = new ExecutorFragment(Types._Term, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Term__OclElement = new ExecutorFragment(Types._Term, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Term__Term = new ExecutorFragment(Types._Term, TermsTables.Types._Term);

		private static final ExecutorFragment _Variable__OclAny = new ExecutorFragment(Types._Variable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Variable__OclElement = new ExecutorFragment(Types._Variable, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Variable__Term = new ExecutorFragment(Types._Variable, TermsTables.Types._Term);
		private static final ExecutorFragment _Variable__Variable = new ExecutorFragment(Types._Variable, TermsTables.Types._Variable);

		private static final ExecutorFragment _VariableDeclaration__OclAny = new ExecutorFragment(Types._VariableDeclaration, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VariableDeclaration__OclElement = new ExecutorFragment(Types._VariableDeclaration, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VariableDeclaration__VariableDeclaration = new ExecutorFragment(Types._VariableDeclaration, TermsTables.Types._VariableDeclaration);

		private static final ExecutorFragment _VariableDeclarationType__OclAny = new ExecutorFragment(Types._VariableDeclarationType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VariableDeclarationType__OclElement = new ExecutorFragment(Types._VariableDeclarationType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VariableDeclarationType__OclEnumeration = new ExecutorFragment(Types._VariableDeclarationType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _VariableDeclarationType__OclType = new ExecutorFragment(Types._VariableDeclarationType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _VariableDeclarationType__VariableDeclarationType = new ExecutorFragment(Types._VariableDeclarationType, TermsTables.Types._VariableDeclarationType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TermsTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of TermsTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of TermsTables::Operations and all preceding sub-packages.
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


		public static final ExecutorProperty _BooleanConstant__value = new EcoreExecutorProperty(TermsPackage.Literals.BOOLEAN_CONSTANT__VALUE, Types._BooleanConstant, 0);

		public static final ExecutorProperty _IntegerConstant__value = new EcoreExecutorProperty(TermsPackage.Literals.INTEGER_CONSTANT__VALUE, Types._IntegerConstant, 0);

		public static final ExecutorProperty _Operator__input = new EcoreExecutorProperty(TermsPackage.Literals.OPERATOR__INPUT, Types._Operator, 0);
		public static final ExecutorProperty _Operator__output = new EcoreExecutorProperty(TermsPackage.Literals.OPERATOR__OUTPUT, Types._Operator, 1);
		public static final ExecutorProperty _Operator__subterm = new EcoreExecutorProperty(TermsPackage.Literals.OPERATOR__SUBTERM, Types._Operator, 2);

		public static final ExecutorProperty _Sort__id = new EcoreExecutorProperty(TermsPackage.Literals.SORT__ID, Types._Sort, 0);
		public static final ExecutorProperty _Sort__Operator__input = new ExecutorPropertyWithImplementation("Operator", Types._Sort, 1, new EcoreLibraryOppositeProperty(TermsPackage.Literals.OPERATOR__INPUT));
		public static final ExecutorProperty _Sort__Operator__output = new ExecutorPropertyWithImplementation("Operator", Types._Sort, 2, new EcoreLibraryOppositeProperty(TermsPackage.Literals.OPERATOR__OUTPUT));
		public static final ExecutorProperty _Sort__Term__sort = new ExecutorPropertyWithImplementation("Term", Types._Sort, 3, new EcoreLibraryOppositeProperty(TermsPackage.Literals.TERM__SORT));
		public static final ExecutorProperty _Sort__VariableDeclaration__sort = new ExecutorPropertyWithImplementation("VariableDeclaration", Types._Sort, 4, new EcoreLibraryOppositeProperty(TermsPackage.Literals.VARIABLE_DECLARATION__SORT));

		public static final ExecutorProperty _Term__id = new EcoreExecutorProperty(TermsPackage.Literals.TERM__ID, Types._Term, 0);
		public static final ExecutorProperty _Term__sort = new EcoreExecutorProperty(TermsPackage.Literals.TERM__SORT, Types._Term, 1);
		public static final ExecutorProperty _Term__Operator__subterm = new ExecutorPropertyWithImplementation("Operator", Types._Term, 2, new EcoreLibraryOppositeProperty(TermsPackage.Literals.OPERATOR__SUBTERM));

		public static final ExecutorProperty _Variable__variableDeclaration = new EcoreExecutorProperty(TermsPackage.Literals.VARIABLE__VARIABLE_DECLARATION, Types._Variable, 0);

		public static final ExecutorProperty _VariableDeclaration__name = new EcoreExecutorProperty(TermsPackage.Literals.VARIABLE_DECLARATION__NAME, Types._VariableDeclaration, 0);
		public static final ExecutorProperty _VariableDeclaration__sort = new EcoreExecutorProperty(TermsPackage.Literals.VARIABLE_DECLARATION__SORT, Types._VariableDeclaration, 1);
		public static final ExecutorProperty _VariableDeclaration__step = new EcoreExecutorProperty(TermsPackage.Literals.VARIABLE_DECLARATION__STEP, Types._VariableDeclaration, 2);
		public static final ExecutorProperty _VariableDeclaration__variableDeclarationType = new EcoreExecutorProperty(TermsPackage.Literals.VARIABLE_DECLARATION__VARIABLE_DECLARATION_TYPE, Types._VariableDeclaration, 3);
		public static final ExecutorProperty _VariableDeclaration__Variable__variableDeclaration = new ExecutorPropertyWithImplementation("Variable", Types._VariableDeclaration, 4, new EcoreLibraryOppositeProperty(TermsPackage.Literals.VARIABLE__VARIABLE_DECLARATION));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TermsTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _Addition =
			{
				Fragments._Addition__OclAny /* 0 */,
				Fragments._Addition__OclElement /* 1 */,
				Fragments._Addition__Term /* 2 */,
				Fragments._Addition__Operator /* 3 */,
				Fragments._Addition__IntegerOperator /* 4 */,
				Fragments._Addition__Addition /* 5 */
			};
		private static final int /*@NonNull*/ [] __Addition = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _And =
			{
				Fragments._And__OclAny /* 0 */,
				Fragments._And__OclElement /* 1 */,
				Fragments._And__Term /* 2 */,
				Fragments._And__Operator /* 3 */,
				Fragments._And__BooleanOperator /* 4 */,
				Fragments._And__And /* 5 */
			};
		private static final int /*@NonNull*/ [] __And = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Bool =
			{
				Fragments._Bool__OclAny /* 0 */,
				Fragments._Bool__OclElement /* 1 */,
				Fragments._Bool__Sort /* 2 */,
				Fragments._Bool__Bool /* 3 */
			};
		private static final int /*@NonNull*/ [] __Bool = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BooleanConstant =
			{
				Fragments._BooleanConstant__OclAny /* 0 */,
				Fragments._BooleanConstant__OclElement /* 1 */,
				Fragments._BooleanConstant__Term /* 2 */,
				Fragments._BooleanConstant__Operator /* 3 */,
				Fragments._BooleanConstant__Constant /* 4 */,
				Fragments._BooleanConstant__BooleanConstant /* 5 */
			};
		private static final int /*@NonNull*/ [] __BooleanConstant = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BooleanOperator =
			{
				Fragments._BooleanOperator__OclAny /* 0 */,
				Fragments._BooleanOperator__OclElement /* 1 */,
				Fragments._BooleanOperator__Term /* 2 */,
				Fragments._BooleanOperator__Operator /* 3 */,
				Fragments._BooleanOperator__BooleanOperator /* 4 */
			};
		private static final int /*@NonNull*/ [] __BooleanOperator = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Constant =
			{
				Fragments._Constant__OclAny /* 0 */,
				Fragments._Constant__OclElement /* 1 */,
				Fragments._Constant__Term /* 2 */,
				Fragments._Constant__Operator /* 3 */,
				Fragments._Constant__Constant /* 4 */
			};
		private static final int /*@NonNull*/ [] __Constant = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Equality =
			{
				Fragments._Equality__OclAny /* 0 */,
				Fragments._Equality__OclElement /* 1 */,
				Fragments._Equality__Term /* 2 */,
				Fragments._Equality__Operator /* 3 */,
				Fragments._Equality__Equality /* 4 */
			};
		private static final int /*@NonNull*/ [] __Equality = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FallingEdge =
			{
				Fragments._FallingEdge__OclAny /* 0 */,
				Fragments._FallingEdge__OclElement /* 1 */,
				Fragments._FallingEdge__Term /* 2 */,
				Fragments._FallingEdge__Operator /* 3 */,
				Fragments._FallingEdge__BooleanOperator /* 4 */,
				Fragments._FallingEdge__FallingEdge /* 5 */
			};
		private static final int /*@NonNull*/ [] __FallingEdge = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _GreaterThan =
			{
				Fragments._GreaterThan__OclAny /* 0 */,
				Fragments._GreaterThan__OclElement /* 1 */,
				Fragments._GreaterThan__Term /* 2 */,
				Fragments._GreaterThan__Operator /* 3 */,
				Fragments._GreaterThan__IntegerOperator /* 4 */,
				Fragments._GreaterThan__GreaterThan /* 5 */
			};
		private static final int /*@NonNull*/ [] __GreaterThan = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Integer =
			{
				Fragments._Integer__OclAny /* 0 */,
				Fragments._Integer__OclElement /* 1 */,
				Fragments._Integer__Sort /* 2 */,
				Fragments._Integer__Integer /* 3 */
			};
		private static final int /*@NonNull*/ [] __Integer = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IntegerConstant =
			{
				Fragments._IntegerConstant__OclAny /* 0 */,
				Fragments._IntegerConstant__OclElement /* 1 */,
				Fragments._IntegerConstant__Term /* 2 */,
				Fragments._IntegerConstant__Operator /* 3 */,
				Fragments._IntegerConstant__Constant /* 4 */,
				Fragments._IntegerConstant__IntegerConstant /* 5 */
			};
		private static final int /*@NonNull*/ [] __IntegerConstant = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IntegerOperator =
			{
				Fragments._IntegerOperator__OclAny /* 0 */,
				Fragments._IntegerOperator__OclElement /* 1 */,
				Fragments._IntegerOperator__Term /* 2 */,
				Fragments._IntegerOperator__Operator /* 3 */,
				Fragments._IntegerOperator__IntegerOperator /* 4 */
			};
		private static final int /*@NonNull*/ [] __IntegerOperator = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LessThan =
			{
				Fragments._LessThan__OclAny /* 0 */,
				Fragments._LessThan__OclElement /* 1 */,
				Fragments._LessThan__Term /* 2 */,
				Fragments._LessThan__Operator /* 3 */,
				Fragments._LessThan__IntegerOperator /* 4 */,
				Fragments._LessThan__LessThan /* 5 */
			};
		private static final int /*@NonNull*/ [] __LessThan = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Not =
			{
				Fragments._Not__OclAny /* 0 */,
				Fragments._Not__OclElement /* 1 */,
				Fragments._Not__Term /* 2 */,
				Fragments._Not__Operator /* 3 */,
				Fragments._Not__BooleanOperator /* 4 */,
				Fragments._Not__Not /* 5 */
			};
		private static final int /*@NonNull*/ [] __Not = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Operator =
			{
				Fragments._Operator__OclAny /* 0 */,
				Fragments._Operator__OclElement /* 1 */,
				Fragments._Operator__Term /* 2 */,
				Fragments._Operator__Operator /* 3 */
			};
		private static final int /*@NonNull*/ [] __Operator = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Or =
			{
				Fragments._Or__OclAny /* 0 */,
				Fragments._Or__OclElement /* 1 */,
				Fragments._Or__Term /* 2 */,
				Fragments._Or__Operator /* 3 */,
				Fragments._Or__BooleanOperator /* 4 */,
				Fragments._Or__Or /* 5 */
			};
		private static final int /*@NonNull*/ [] __Or = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RisingEdge =
			{
				Fragments._RisingEdge__OclAny /* 0 */,
				Fragments._RisingEdge__OclElement /* 1 */,
				Fragments._RisingEdge__Term /* 2 */,
				Fragments._RisingEdge__Operator /* 3 */,
				Fragments._RisingEdge__BooleanOperator /* 4 */,
				Fragments._RisingEdge__RisingEdge /* 5 */
			};
		private static final int /*@NonNull*/ [] __RisingEdge = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Sort =
			{
				Fragments._Sort__OclAny /* 0 */,
				Fragments._Sort__OclElement /* 1 */,
				Fragments._Sort__Sort /* 2 */
			};
		private static final int /*@NonNull*/ [] __Sort = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Substraction =
			{
				Fragments._Substraction__OclAny /* 0 */,
				Fragments._Substraction__OclElement /* 1 */,
				Fragments._Substraction__Term /* 2 */,
				Fragments._Substraction__Operator /* 3 */,
				Fragments._Substraction__IntegerOperator /* 4 */,
				Fragments._Substraction__Substraction /* 5 */
			};
		private static final int /*@NonNull*/ [] __Substraction = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Term =
			{
				Fragments._Term__OclAny /* 0 */,
				Fragments._Term__OclElement /* 1 */,
				Fragments._Term__Term /* 2 */
			};
		private static final int /*@NonNull*/ [] __Term = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Variable =
			{
				Fragments._Variable__OclAny /* 0 */,
				Fragments._Variable__OclElement /* 1 */,
				Fragments._Variable__Term /* 2 */,
				Fragments._Variable__Variable /* 3 */
			};
		private static final int /*@NonNull*/ [] __Variable = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VariableDeclaration =
			{
				Fragments._VariableDeclaration__OclAny /* 0 */,
				Fragments._VariableDeclaration__OclElement /* 1 */,
				Fragments._VariableDeclaration__VariableDeclaration /* 2 */
			};
		private static final int /*@NonNull*/ [] __VariableDeclaration = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VariableDeclarationType =
			{
				Fragments._VariableDeclarationType__OclAny /* 0 */,
				Fragments._VariableDeclarationType__OclElement /* 1 */,
				Fragments._VariableDeclarationType__OclType /* 2 */,
				Fragments._VariableDeclarationType__OclEnumeration /* 3 */,
				Fragments._VariableDeclarationType__VariableDeclarationType /* 4 */
			};
		private static final int /*@NonNull*/ [] __VariableDeclarationType = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Addition.initFragments(_Addition, __Addition);
			Types._And.initFragments(_And, __And);
			Types._Bool.initFragments(_Bool, __Bool);
			Types._BooleanConstant.initFragments(_BooleanConstant, __BooleanConstant);
			Types._BooleanOperator.initFragments(_BooleanOperator, __BooleanOperator);
			Types._Constant.initFragments(_Constant, __Constant);
			Types._Equality.initFragments(_Equality, __Equality);
			Types._FallingEdge.initFragments(_FallingEdge, __FallingEdge);
			Types._GreaterThan.initFragments(_GreaterThan, __GreaterThan);
			Types._Integer.initFragments(_Integer, __Integer);
			Types._IntegerConstant.initFragments(_IntegerConstant, __IntegerConstant);
			Types._IntegerOperator.initFragments(_IntegerOperator, __IntegerOperator);
			Types._LessThan.initFragments(_LessThan, __LessThan);
			Types._Not.initFragments(_Not, __Not);
			Types._Operator.initFragments(_Operator, __Operator);
			Types._Or.initFragments(_Or, __Or);
			Types._RisingEdge.initFragments(_RisingEdge, __RisingEdge);
			Types._Sort.initFragments(_Sort, __Sort);
			Types._Substraction.initFragments(_Substraction, __Substraction);
			Types._Term.initFragments(_Term, __Term);
			Types._Variable.initFragments(_Variable, __Variable);
			Types._VariableDeclaration.initFragments(_VariableDeclaration, __VariableDeclaration);
			Types._VariableDeclarationType.initFragments(_VariableDeclarationType, __VariableDeclarationType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TermsTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _Addition__Addition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Addition__IntegerOperator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Addition__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Addition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Addition__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Addition__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _And__And = {};
		private static final ExecutorOperation /*@NonNull*/ [] _And__BooleanOperator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _And__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _And__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _And__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _And__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Bool__Bool = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Bool__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Bool__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Bool__Sort = {};

		private static final ExecutorOperation /*@NonNull*/ [] _BooleanConstant__BooleanConstant = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanConstant__Constant = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanConstant__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanConstant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanConstant__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanConstant__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _BooleanOperator__BooleanOperator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanOperator__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanOperator__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanOperator__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanOperator__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Constant__Constant = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Constant__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Constant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Constant__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Constant__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Equality__Equality = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Equality__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Equality__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Equality__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Equality__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _FallingEdge__FallingEdge = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FallingEdge__BooleanOperator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FallingEdge__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _FallingEdge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FallingEdge__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FallingEdge__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _GreaterThan__GreaterThan = {};
		private static final ExecutorOperation /*@NonNull*/ [] _GreaterThan__IntegerOperator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _GreaterThan__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _GreaterThan__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _GreaterThan__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _GreaterThan__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Integer__Integer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Integer__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Integer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Integer__Sort = {};

		private static final ExecutorOperation /*@NonNull*/ [] _IntegerConstant__IntegerConstant = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerConstant__Constant = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerConstant__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerConstant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerConstant__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerConstant__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _IntegerOperator__IntegerOperator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerOperator__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerOperator__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerOperator__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerOperator__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _LessThan__LessThan = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LessThan__IntegerOperator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LessThan__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _LessThan__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LessThan__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LessThan__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Not__Not = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Not__BooleanOperator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Not__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Not__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Not__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Not__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Operator__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Operator__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Operator__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Operator__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Or__Or = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Or__BooleanOperator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Or__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Or__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Or__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Or__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _RisingEdge__RisingEdge = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RisingEdge__BooleanOperator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RisingEdge__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _RisingEdge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RisingEdge__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RisingEdge__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Sort__Sort = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Sort__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Sort__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Substraction__Substraction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Substraction__IntegerOperator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Substraction__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Substraction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Substraction__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Substraction__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Term__Term = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Term__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Term__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Variable__Variable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Variable__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Variable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Variable__Term = {};

		private static final ExecutorOperation /*@NonNull*/ [] _VariableDeclaration__VariableDeclaration = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VariableDeclaration__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _VariableDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VariableDeclarationType__VariableDeclarationType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VariableDeclarationType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _VariableDeclarationType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VariableDeclarationType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VariableDeclarationType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Addition__Addition.initOperations(_Addition__Addition);
			Fragments._Addition__IntegerOperator.initOperations(_Addition__IntegerOperator);
			Fragments._Addition__OclAny.initOperations(_Addition__OclAny);
			Fragments._Addition__OclElement.initOperations(_Addition__OclElement);
			Fragments._Addition__Operator.initOperations(_Addition__Operator);
			Fragments._Addition__Term.initOperations(_Addition__Term);

			Fragments._And__And.initOperations(_And__And);
			Fragments._And__BooleanOperator.initOperations(_And__BooleanOperator);
			Fragments._And__OclAny.initOperations(_And__OclAny);
			Fragments._And__OclElement.initOperations(_And__OclElement);
			Fragments._And__Operator.initOperations(_And__Operator);
			Fragments._And__Term.initOperations(_And__Term);

			Fragments._Bool__Bool.initOperations(_Bool__Bool);
			Fragments._Bool__OclAny.initOperations(_Bool__OclAny);
			Fragments._Bool__OclElement.initOperations(_Bool__OclElement);
			Fragments._Bool__Sort.initOperations(_Bool__Sort);

			Fragments._BooleanConstant__BooleanConstant.initOperations(_BooleanConstant__BooleanConstant);
			Fragments._BooleanConstant__Constant.initOperations(_BooleanConstant__Constant);
			Fragments._BooleanConstant__OclAny.initOperations(_BooleanConstant__OclAny);
			Fragments._BooleanConstant__OclElement.initOperations(_BooleanConstant__OclElement);
			Fragments._BooleanConstant__Operator.initOperations(_BooleanConstant__Operator);
			Fragments._BooleanConstant__Term.initOperations(_BooleanConstant__Term);

			Fragments._BooleanOperator__BooleanOperator.initOperations(_BooleanOperator__BooleanOperator);
			Fragments._BooleanOperator__OclAny.initOperations(_BooleanOperator__OclAny);
			Fragments._BooleanOperator__OclElement.initOperations(_BooleanOperator__OclElement);
			Fragments._BooleanOperator__Operator.initOperations(_BooleanOperator__Operator);
			Fragments._BooleanOperator__Term.initOperations(_BooleanOperator__Term);

			Fragments._Constant__Constant.initOperations(_Constant__Constant);
			Fragments._Constant__OclAny.initOperations(_Constant__OclAny);
			Fragments._Constant__OclElement.initOperations(_Constant__OclElement);
			Fragments._Constant__Operator.initOperations(_Constant__Operator);
			Fragments._Constant__Term.initOperations(_Constant__Term);

			Fragments._Equality__Equality.initOperations(_Equality__Equality);
			Fragments._Equality__OclAny.initOperations(_Equality__OclAny);
			Fragments._Equality__OclElement.initOperations(_Equality__OclElement);
			Fragments._Equality__Operator.initOperations(_Equality__Operator);
			Fragments._Equality__Term.initOperations(_Equality__Term);

			Fragments._FallingEdge__BooleanOperator.initOperations(_FallingEdge__BooleanOperator);
			Fragments._FallingEdge__FallingEdge.initOperations(_FallingEdge__FallingEdge);
			Fragments._FallingEdge__OclAny.initOperations(_FallingEdge__OclAny);
			Fragments._FallingEdge__OclElement.initOperations(_FallingEdge__OclElement);
			Fragments._FallingEdge__Operator.initOperations(_FallingEdge__Operator);
			Fragments._FallingEdge__Term.initOperations(_FallingEdge__Term);

			Fragments._GreaterThan__GreaterThan.initOperations(_GreaterThan__GreaterThan);
			Fragments._GreaterThan__IntegerOperator.initOperations(_GreaterThan__IntegerOperator);
			Fragments._GreaterThan__OclAny.initOperations(_GreaterThan__OclAny);
			Fragments._GreaterThan__OclElement.initOperations(_GreaterThan__OclElement);
			Fragments._GreaterThan__Operator.initOperations(_GreaterThan__Operator);
			Fragments._GreaterThan__Term.initOperations(_GreaterThan__Term);

			Fragments._Integer__Integer.initOperations(_Integer__Integer);
			Fragments._Integer__OclAny.initOperations(_Integer__OclAny);
			Fragments._Integer__OclElement.initOperations(_Integer__OclElement);
			Fragments._Integer__Sort.initOperations(_Integer__Sort);

			Fragments._IntegerConstant__Constant.initOperations(_IntegerConstant__Constant);
			Fragments._IntegerConstant__IntegerConstant.initOperations(_IntegerConstant__IntegerConstant);
			Fragments._IntegerConstant__OclAny.initOperations(_IntegerConstant__OclAny);
			Fragments._IntegerConstant__OclElement.initOperations(_IntegerConstant__OclElement);
			Fragments._IntegerConstant__Operator.initOperations(_IntegerConstant__Operator);
			Fragments._IntegerConstant__Term.initOperations(_IntegerConstant__Term);

			Fragments._IntegerOperator__IntegerOperator.initOperations(_IntegerOperator__IntegerOperator);
			Fragments._IntegerOperator__OclAny.initOperations(_IntegerOperator__OclAny);
			Fragments._IntegerOperator__OclElement.initOperations(_IntegerOperator__OclElement);
			Fragments._IntegerOperator__Operator.initOperations(_IntegerOperator__Operator);
			Fragments._IntegerOperator__Term.initOperations(_IntegerOperator__Term);

			Fragments._LessThan__IntegerOperator.initOperations(_LessThan__IntegerOperator);
			Fragments._LessThan__LessThan.initOperations(_LessThan__LessThan);
			Fragments._LessThan__OclAny.initOperations(_LessThan__OclAny);
			Fragments._LessThan__OclElement.initOperations(_LessThan__OclElement);
			Fragments._LessThan__Operator.initOperations(_LessThan__Operator);
			Fragments._LessThan__Term.initOperations(_LessThan__Term);

			Fragments._Not__BooleanOperator.initOperations(_Not__BooleanOperator);
			Fragments._Not__Not.initOperations(_Not__Not);
			Fragments._Not__OclAny.initOperations(_Not__OclAny);
			Fragments._Not__OclElement.initOperations(_Not__OclElement);
			Fragments._Not__Operator.initOperations(_Not__Operator);
			Fragments._Not__Term.initOperations(_Not__Term);

			Fragments._Operator__OclAny.initOperations(_Operator__OclAny);
			Fragments._Operator__OclElement.initOperations(_Operator__OclElement);
			Fragments._Operator__Operator.initOperations(_Operator__Operator);
			Fragments._Operator__Term.initOperations(_Operator__Term);

			Fragments._Or__BooleanOperator.initOperations(_Or__BooleanOperator);
			Fragments._Or__OclAny.initOperations(_Or__OclAny);
			Fragments._Or__OclElement.initOperations(_Or__OclElement);
			Fragments._Or__Operator.initOperations(_Or__Operator);
			Fragments._Or__Or.initOperations(_Or__Or);
			Fragments._Or__Term.initOperations(_Or__Term);

			Fragments._RisingEdge__BooleanOperator.initOperations(_RisingEdge__BooleanOperator);
			Fragments._RisingEdge__OclAny.initOperations(_RisingEdge__OclAny);
			Fragments._RisingEdge__OclElement.initOperations(_RisingEdge__OclElement);
			Fragments._RisingEdge__Operator.initOperations(_RisingEdge__Operator);
			Fragments._RisingEdge__RisingEdge.initOperations(_RisingEdge__RisingEdge);
			Fragments._RisingEdge__Term.initOperations(_RisingEdge__Term);

			Fragments._Sort__OclAny.initOperations(_Sort__OclAny);
			Fragments._Sort__OclElement.initOperations(_Sort__OclElement);
			Fragments._Sort__Sort.initOperations(_Sort__Sort);

			Fragments._Substraction__IntegerOperator.initOperations(_Substraction__IntegerOperator);
			Fragments._Substraction__OclAny.initOperations(_Substraction__OclAny);
			Fragments._Substraction__OclElement.initOperations(_Substraction__OclElement);
			Fragments._Substraction__Operator.initOperations(_Substraction__Operator);
			Fragments._Substraction__Substraction.initOperations(_Substraction__Substraction);
			Fragments._Substraction__Term.initOperations(_Substraction__Term);

			Fragments._Term__OclAny.initOperations(_Term__OclAny);
			Fragments._Term__OclElement.initOperations(_Term__OclElement);
			Fragments._Term__Term.initOperations(_Term__Term);

			Fragments._Variable__OclAny.initOperations(_Variable__OclAny);
			Fragments._Variable__OclElement.initOperations(_Variable__OclElement);
			Fragments._Variable__Term.initOperations(_Variable__Term);
			Fragments._Variable__Variable.initOperations(_Variable__Variable);

			Fragments._VariableDeclaration__OclAny.initOperations(_VariableDeclaration__OclAny);
			Fragments._VariableDeclaration__OclElement.initOperations(_VariableDeclaration__OclElement);
			Fragments._VariableDeclaration__VariableDeclaration.initOperations(_VariableDeclaration__VariableDeclaration);

			Fragments._VariableDeclarationType__OclAny.initOperations(_VariableDeclarationType__OclAny);
			Fragments._VariableDeclarationType__OclElement.initOperations(_VariableDeclarationType__OclElement);
			Fragments._VariableDeclarationType__OclEnumeration.initOperations(_VariableDeclarationType__OclEnumeration);
			Fragments._VariableDeclarationType__OclType.initOperations(_VariableDeclarationType__OclType);
			Fragments._VariableDeclarationType__VariableDeclarationType.initOperations(_VariableDeclarationType__VariableDeclarationType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TermsTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _Addition = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Operator__input,
			TermsTables.Properties._Operator__output,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Operator__subterm
		};

		private static final ExecutorProperty /*@NonNull*/ [] _And = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Operator__input,
			TermsTables.Properties._Operator__output,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Operator__subterm
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Bool = {
			TermsTables.Properties._Sort__id
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BooleanConstant = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Operator__input,
			TermsTables.Properties._Operator__output,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Operator__subterm,
			TermsTables.Properties._BooleanConstant__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BooleanOperator = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Operator__input,
			TermsTables.Properties._Operator__output,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Operator__subterm
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Constant = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Operator__input,
			TermsTables.Properties._Operator__output,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Operator__subterm
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Equality = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Operator__input,
			TermsTables.Properties._Operator__output,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Operator__subterm
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FallingEdge = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Operator__input,
			TermsTables.Properties._Operator__output,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Operator__subterm
		};

		private static final ExecutorProperty /*@NonNull*/ [] _GreaterThan = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Operator__input,
			TermsTables.Properties._Operator__output,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Operator__subterm
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Integer = {
			TermsTables.Properties._Sort__id
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IntegerConstant = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Operator__input,
			TermsTables.Properties._Operator__output,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Operator__subterm,
			TermsTables.Properties._IntegerConstant__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IntegerOperator = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Operator__input,
			TermsTables.Properties._Operator__output,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Operator__subterm
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LessThan = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Operator__input,
			TermsTables.Properties._Operator__output,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Operator__subterm
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Not = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Operator__input,
			TermsTables.Properties._Operator__output,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Operator__subterm
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Operator = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Operator__input,
			TermsTables.Properties._Operator__output,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Operator__subterm
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Or = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Operator__input,
			TermsTables.Properties._Operator__output,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Operator__subterm
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RisingEdge = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Operator__input,
			TermsTables.Properties._Operator__output,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Operator__subterm
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Sort = {
			TermsTables.Properties._Sort__id
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Substraction = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Operator__input,
			TermsTables.Properties._Operator__output,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Operator__subterm
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Term = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Term__sort
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Variable = {
			TermsTables.Properties._Term__id,
			TermsTables.Properties._Term__sort,
			TermsTables.Properties._Variable__variableDeclaration
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VariableDeclaration = {
			TermsTables.Properties._VariableDeclaration__name,
			TermsTables.Properties._VariableDeclaration__sort,
			TermsTables.Properties._VariableDeclaration__step,
			TermsTables.Properties._VariableDeclaration__variableDeclarationType
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VariableDeclarationType = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Addition__Addition.initProperties(_Addition);
			Fragments._And__And.initProperties(_And);
			Fragments._Bool__Bool.initProperties(_Bool);
			Fragments._BooleanConstant__BooleanConstant.initProperties(_BooleanConstant);
			Fragments._BooleanOperator__BooleanOperator.initProperties(_BooleanOperator);
			Fragments._Constant__Constant.initProperties(_Constant);
			Fragments._Equality__Equality.initProperties(_Equality);
			Fragments._FallingEdge__FallingEdge.initProperties(_FallingEdge);
			Fragments._GreaterThan__GreaterThan.initProperties(_GreaterThan);
			Fragments._Integer__Integer.initProperties(_Integer);
			Fragments._IntegerConstant__IntegerConstant.initProperties(_IntegerConstant);
			Fragments._IntegerOperator__IntegerOperator.initProperties(_IntegerOperator);
			Fragments._LessThan__LessThan.initProperties(_LessThan);
			Fragments._Not__Not.initProperties(_Not);
			Fragments._Operator__Operator.initProperties(_Operator);
			Fragments._Or__Or.initProperties(_Or);
			Fragments._RisingEdge__RisingEdge.initProperties(_RisingEdge);
			Fragments._Sort__Sort.initProperties(_Sort);
			Fragments._Substraction__Substraction.initProperties(_Substraction);
			Fragments._Term__Term.initProperties(_Term);
			Fragments._Variable__Variable.initProperties(_Variable);
			Fragments._VariableDeclaration__VariableDeclaration.initProperties(_VariableDeclaration);
			Fragments._VariableDeclarationType__VariableDeclarationType.initProperties(_VariableDeclarationType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TermsTables::FragmentProperties and all preceding sub-packages.
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

		public static final EcoreExecutorEnumerationLiteral _VariableDeclarationType__input = new EcoreExecutorEnumerationLiteral(TermsPackage.Literals.VARIABLE_DECLARATION_TYPE.getEEnumLiteral("input"), Types._VariableDeclarationType, 0);
		public static final EcoreExecutorEnumerationLiteral _VariableDeclarationType__output = new EcoreExecutorEnumerationLiteral(TermsPackage.Literals.VARIABLE_DECLARATION_TYPE.getEEnumLiteral("output"), Types._VariableDeclarationType, 1);
		public static final EcoreExecutorEnumerationLiteral _VariableDeclarationType__internal = new EcoreExecutorEnumerationLiteral(TermsPackage.Literals.VARIABLE_DECLARATION_TYPE.getEEnumLiteral("internal"), Types._VariableDeclarationType, 2);
		public static final EcoreExecutorEnumerationLiteral _VariableDeclarationType__step = new EcoreExecutorEnumerationLiteral(TermsPackage.Literals.VARIABLE_DECLARATION_TYPE.getEEnumLiteral("step"), Types._VariableDeclarationType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _VariableDeclarationType = {
			_VariableDeclarationType__input,
			_VariableDeclarationType__output,
			_VariableDeclarationType__internal,
			_VariableDeclarationType__step
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._VariableDeclarationType.initLiterals(_VariableDeclarationType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TermsTables::EnumerationLiterals and all preceding sub-packages.
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
