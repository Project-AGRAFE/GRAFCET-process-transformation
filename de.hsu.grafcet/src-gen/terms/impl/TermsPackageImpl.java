/**
 */
package terms.impl;

import de.hsu.grafcet.GrafcetPackage;

import de.hsu.grafcet.impl.GrafcetPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import terms.Addition;
import terms.And;
import terms.Bool;
import terms.BooleanConstant;
import terms.BooleanOperator;
import terms.Constant;
import terms.Equality;
import terms.FallingEdge;
import terms.GreaterThan;
import terms.IntegerConstant;
import terms.IntegerOperator;
import terms.LessThan;
import terms.Not;
import terms.Operator;
import terms.Or;
import terms.RisingEdge;
import terms.Sort;
import terms.Substraction;
import terms.Term;
import terms.TermsFactory;
import terms.TermsPackage;
import terms.Variable;
import terms.VariableDeclaration;
import terms.VariableDeclarationType;

import terms.util.TermsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermsPackageImpl extends EPackageImpl implements TermsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass risingEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fallingEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableDeclarationTypeEEnum = null;

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
	 * @see terms.TermsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TermsPackageImpl() {
		super(eNS_URI, TermsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TermsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TermsPackage init() {
		if (isInited)
			return (TermsPackage) EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTermsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TermsPackageImpl theTermsPackage = registeredTermsPackage instanceof TermsPackageImpl
				? (TermsPackageImpl) registeredTermsPackage
				: new TermsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GrafcetPackage.eNS_URI);
		GrafcetPackageImpl theGrafcetPackage = (GrafcetPackageImpl) (registeredPackage instanceof GrafcetPackageImpl
				? registeredPackage
				: GrafcetPackage.eINSTANCE);

		// Create package meta-data objects
		theTermsPackage.createPackageContents();
		theGrafcetPackage.createPackageContents();

		// Initialize created meta-data
		theTermsPackage.initializePackageContents();
		theGrafcetPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theTermsPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return TermsValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theTermsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TermsPackage.eNS_URI, theTermsPackage);
		return theTermsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Sort() {
		return (EReference) termEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerm_Id() {
		return (EAttribute) termEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_VariableDeclaration() {
		return (EReference) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariable__SortVariable__DiagnosticChain_Map() {
		return variableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration() {
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclaration_Sort() {
		return (EReference) variableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDeclaration_Name() {
		return (EAttribute) variableDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDeclaration_VariableDeclarationType() {
		return (EAttribute) variableDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclaration_Step() {
		return (EReference) variableDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDeclaration__StepVarDeclSetStep__DiagnosticChain_Map() {
		return variableDeclarationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_Subterm() {
		return (EReference) operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_Output() {
		return (EReference) operatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_Input() {
		return (EReference) operatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperator__OperatorSort__DiagnosticChain_Map() {
		return operatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperator__OperatorInputType__DiagnosticChain_Map() {
		return operatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSort() {
		return sortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSort_Id() {
		return (EAttribute) sortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBool() {
		return boolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger() {
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanOperator() {
		return booleanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooleanOperator__InputOutputTypesBoolOp__DiagnosticChain_Map() {
		return booleanOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnd__InputSizeAnd__DiagnosticChain_Map() {
		return andEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOr__InputSizeOr__DiagnosticChain_Map() {
		return orEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNot__InputSizeNot__DiagnosticChain_Map() {
		return notEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquality() {
		return equalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEquality__InputSizeInputOutputTypesEq__DiagnosticChain_Map() {
		return equalityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanConstant() {
		return booleanConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanConstant_Value() {
		return (EAttribute) booleanConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooleanConstant__InputSizeOutputTypesBoolConst__DiagnosticChain_Map() {
		return booleanConstantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerOperator() {
		return integerOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntegerOperator__InputSizeTypesIntOp__DiagnosticChain_Map() {
		return integerOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddition() {
		return additionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAddition__OutputTypesAdd__DiagnosticChain_Map() {
		return additionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstraction() {
		return substractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubstraction__OutputTypesSubstr__DiagnosticChain_Map() {
		return substractionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterThan() {
		return greaterThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGreaterThan__OutputTypesGreat__DiagnosticChain_Map() {
		return greaterThanEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessThan() {
		return lessThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLessThan__OutputTypesLess__DiagnosticChain_Map() {
		return lessThanEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerConstant() {
		return integerConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerConstant_Value() {
		return (EAttribute) integerConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntegerConstant__InputSizeOutputTypesIntConts__DiagnosticChain_Map() {
		return integerConstantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRisingEdge() {
		return risingEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRisingEdge__InputSizeRisingEdge__DiagnosticChain_Map() {
		return risingEdgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFallingEdge() {
		return fallingEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFallingEdge__InputSizeFallingEdge__DiagnosticChain_Map() {
		return fallingEdgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariableDeclarationType() {
		return variableDeclarationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsFactory getTermsFactory() {
		return (TermsFactory) getEFactoryInstance();
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
		termEClass = createEClass(TERM);
		createEReference(termEClass, TERM__SORT);
		createEAttribute(termEClass, TERM__ID);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__VARIABLE_DECLARATION);
		createEOperation(variableEClass, VARIABLE___SORT_VARIABLE__DIAGNOSTICCHAIN_MAP);

		variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
		createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__SORT);
		createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__NAME);
		createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__VARIABLE_DECLARATION_TYPE);
		createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__STEP);
		createEOperation(variableDeclarationEClass, VARIABLE_DECLARATION___STEP_VAR_DECL_SET_STEP__DIAGNOSTICCHAIN_MAP);

		operatorEClass = createEClass(OPERATOR);
		createEReference(operatorEClass, OPERATOR__SUBTERM);
		createEReference(operatorEClass, OPERATOR__OUTPUT);
		createEReference(operatorEClass, OPERATOR__INPUT);
		createEOperation(operatorEClass, OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP);
		createEOperation(operatorEClass, OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP);

		constantEClass = createEClass(CONSTANT);

		sortEClass = createEClass(SORT);
		createEAttribute(sortEClass, SORT__ID);

		boolEClass = createEClass(BOOL);

		integerEClass = createEClass(INTEGER);

		booleanOperatorEClass = createEClass(BOOLEAN_OPERATOR);
		createEOperation(booleanOperatorEClass, BOOLEAN_OPERATOR___INPUT_OUTPUT_TYPES_BOOL_OP__DIAGNOSTICCHAIN_MAP);

		andEClass = createEClass(AND);
		createEOperation(andEClass, AND___INPUT_SIZE_AND__DIAGNOSTICCHAIN_MAP);

		orEClass = createEClass(OR);
		createEOperation(orEClass, OR___INPUT_SIZE_OR__DIAGNOSTICCHAIN_MAP);

		notEClass = createEClass(NOT);
		createEOperation(notEClass, NOT___INPUT_SIZE_NOT__DIAGNOSTICCHAIN_MAP);

		equalityEClass = createEClass(EQUALITY);
		createEOperation(equalityEClass, EQUALITY___INPUT_SIZE_INPUT_OUTPUT_TYPES_EQ__DIAGNOSTICCHAIN_MAP);

		booleanConstantEClass = createEClass(BOOLEAN_CONSTANT);
		createEAttribute(booleanConstantEClass, BOOLEAN_CONSTANT__VALUE);
		createEOperation(booleanConstantEClass,
				BOOLEAN_CONSTANT___INPUT_SIZE_OUTPUT_TYPES_BOOL_CONST__DIAGNOSTICCHAIN_MAP);

		integerOperatorEClass = createEClass(INTEGER_OPERATOR);
		createEOperation(integerOperatorEClass, INTEGER_OPERATOR___INPUT_SIZE_TYPES_INT_OP__DIAGNOSTICCHAIN_MAP);

		additionEClass = createEClass(ADDITION);
		createEOperation(additionEClass, ADDITION___OUTPUT_TYPES_ADD__DIAGNOSTICCHAIN_MAP);

		substractionEClass = createEClass(SUBSTRACTION);
		createEOperation(substractionEClass, SUBSTRACTION___OUTPUT_TYPES_SUBSTR__DIAGNOSTICCHAIN_MAP);

		greaterThanEClass = createEClass(GREATER_THAN);
		createEOperation(greaterThanEClass, GREATER_THAN___OUTPUT_TYPES_GREAT__DIAGNOSTICCHAIN_MAP);

		lessThanEClass = createEClass(LESS_THAN);
		createEOperation(lessThanEClass, LESS_THAN___OUTPUT_TYPES_LESS__DIAGNOSTICCHAIN_MAP);

		integerConstantEClass = createEClass(INTEGER_CONSTANT);
		createEAttribute(integerConstantEClass, INTEGER_CONSTANT__VALUE);
		createEOperation(integerConstantEClass,
				INTEGER_CONSTANT___INPUT_SIZE_OUTPUT_TYPES_INT_CONTS__DIAGNOSTICCHAIN_MAP);

		risingEdgeEClass = createEClass(RISING_EDGE);
		createEOperation(risingEdgeEClass, RISING_EDGE___INPUT_SIZE_RISING_EDGE__DIAGNOSTICCHAIN_MAP);

		fallingEdgeEClass = createEClass(FALLING_EDGE);
		createEOperation(fallingEdgeEClass, FALLING_EDGE___INPUT_SIZE_FALLING_EDGE__DIAGNOSTICCHAIN_MAP);

		// Create enums
		variableDeclarationTypeEEnum = createEEnum(VARIABLE_DECLARATION_TYPE);
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
		GrafcetPackage theGrafcetPackage = (GrafcetPackage) EPackage.Registry.INSTANCE
				.getEPackage(GrafcetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variableEClass.getESuperTypes().add(this.getTerm());
		operatorEClass.getESuperTypes().add(this.getTerm());
		constantEClass.getESuperTypes().add(this.getOperator());
		boolEClass.getESuperTypes().add(this.getSort());
		integerEClass.getESuperTypes().add(this.getSort());
		booleanOperatorEClass.getESuperTypes().add(this.getOperator());
		andEClass.getESuperTypes().add(this.getBooleanOperator());
		orEClass.getESuperTypes().add(this.getBooleanOperator());
		notEClass.getESuperTypes().add(this.getBooleanOperator());
		equalityEClass.getESuperTypes().add(this.getOperator());
		booleanConstantEClass.getESuperTypes().add(this.getConstant());
		integerOperatorEClass.getESuperTypes().add(this.getOperator());
		additionEClass.getESuperTypes().add(this.getIntegerOperator());
		substractionEClass.getESuperTypes().add(this.getIntegerOperator());
		greaterThanEClass.getESuperTypes().add(this.getIntegerOperator());
		lessThanEClass.getESuperTypes().add(this.getIntegerOperator());
		integerConstantEClass.getESuperTypes().add(this.getConstant());
		risingEdgeEClass.getESuperTypes().add(this.getBooleanOperator());
		fallingEdgeEClass.getESuperTypes().add(this.getBooleanOperator());

		// Initialize classes, features, and operations; add parameters
		initEClass(termEClass, Term.class, "Term", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerm_Sort(), this.getSort(), null, "sort", null, 1, 1, Term.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTerm_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_VariableDeclaration(), this.getVariableDeclaration(), null, "variableDeclaration",
				null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getVariable__SortVariable__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"SortVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDeclaration_Sort(), this.getSort(), null, "sort", null, 1, 1,
				VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableDeclaration_VariableDeclarationType(), this.getVariableDeclarationType(),
				"variableDeclarationType", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDeclaration_Step(), theGrafcetPackage.getInitializableType(), null, "step", null, 0,
				1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVariableDeclaration__StepVarDeclSetStep__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "StepVarDeclSetStep", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperator_Subterm(), this.getTerm(), null, "subterm", null, 0, -1, Operator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperator_Output(), this.getSort(), null, "output", null, 1, 1, Operator.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getOperator_Input(), this.getSort(), null, "input", null, 0, -1, Operator.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getOperator__OperatorSort__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"OperatorSort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOperator__OperatorInputType__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"OperatorInputType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sortEClass, Sort.class, "Sort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSort_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Sort.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolEClass, Bool.class, "Bool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerEClass, terms.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanOperatorEClass, BooleanOperator.class, "BooleanOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBooleanOperator__InputOutputTypesBoolOp__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "InputOutputTypesBoolOp", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAnd__InputSizeAnd__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "InputSizeAnd", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getOr__InputSizeOr__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "InputSizeOr", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getNot__InputSizeNot__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "InputSizeNot", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(equalityEClass, Equality.class, "Equality", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getEquality__InputSizeInputOutputTypesEq__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"InputSizeInputOutputTypesEq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanConstantEClass, BooleanConstant.class, "BooleanConstant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanConstant_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1,
				BooleanConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getBooleanConstant__InputSizeOutputTypesBoolConst__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "InputSizeOutputTypesBoolConst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(integerOperatorEClass, IntegerOperator.class, "IntegerOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIntegerOperator__InputSizeTypesIntOp__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"InputSizeTypesIntOp", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAddition__OutputTypesAdd__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"OutputTypesAdd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(substractionEClass, Substraction.class, "Substraction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSubstraction__OutputTypesSubstr__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"OutputTypesSubstr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getGreaterThan__OutputTypesGreat__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"OutputTypesGreat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lessThanEClass, LessThan.class, "LessThan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getLessThan__OutputTypesLess__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"OutputTypesLess", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(integerConstantEClass, IntegerConstant.class, "IntegerConstant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerConstant_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerConstant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getIntegerConstant__InputSizeOutputTypesIntConts__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "InputSizeOutputTypesIntConts", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(risingEdgeEClass, RisingEdge.class, "RisingEdge", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRisingEdge__InputSizeRisingEdge__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"InputSizeRisingEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fallingEdgeEClass, FallingEdge.class, "FallingEdge", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getFallingEdge__InputSizeFallingEdge__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"InputSizeFallingEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(variableDeclarationTypeEEnum, VariableDeclarationType.class, "VariableDeclarationType");
		addEEnumLiteral(variableDeclarationTypeEEnum, VariableDeclarationType.INPUT);
		addEEnumLiteral(variableDeclarationTypeEEnum, VariableDeclarationType.OUTPUT);
		addEEnumLiteral(variableDeclarationTypeEEnum, VariableDeclarationType.INTERNAL);
		addEEnumLiteral(variableDeclarationTypeEEnum, VariableDeclarationType.STEP);

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
		addAnnotation(variableEClass, source, new String[] { "constraints", "SortVariable" });
		addAnnotation(variableDeclarationEClass, source, new String[] { "constraints", "StepVarDeclSetStep" });
		addAnnotation(operatorEClass, source, new String[] { "constraints", "OperatorInputType" });
		addAnnotation(booleanOperatorEClass, source, new String[] { "constraints", "InputOutputTypesBoolOp" });
		addAnnotation(andEClass, source, new String[] { "constraints", "InputSizeAnd" });
		addAnnotation(orEClass, source, new String[] { "constraints", "InputSizeOr" });
		addAnnotation(notEClass, source, new String[] { "constraints", "InputSizeNot" });
		addAnnotation(equalityEClass, source, new String[] { "constraints", "InputSizeInputOutputTypesEq" });
		addAnnotation(booleanConstantEClass, source, new String[] { "constraints", "InputSizeOutputTypesBoolConst" });
		addAnnotation(integerOperatorEClass, source, new String[] { "constraints", "InputSizeTypesIntOp" });
		addAnnotation(additionEClass, source, new String[] { "constraints", "OutputTypesAdd" });
		addAnnotation(substractionEClass, source, new String[] { "constraints", "OutputTypesSubstr" });
		addAnnotation(greaterThanEClass, source, new String[] { "constraints", "OutputTypesGreat" });
		addAnnotation(lessThanEClass, source, new String[] { "constraints", "OutputTypesLess" });
		addAnnotation(integerConstantEClass, source, new String[] { "constraints", "InputSizeOutputTypesIntConts" });
		addAnnotation(risingEdgeEClass, source, new String[] { "constraints", "InputSizeRisingEdge" });
		addAnnotation(fallingEdgeEClass, source, new String[] { "constraints", "InputSizeFallingEdge" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getVariable__SortVariable__DiagnosticChain_Map(), source,
				new String[] { "body", "self.sort = self.variableDeclaration.sort" });
		addAnnotation(getVariableDeclaration__StepVarDeclSetStep__DiagnosticChain_Map(), source, new String[] { "body",
				"self.variableDeclarationType = VariableDeclarationType::step implies step <> null and self.sort.oclIsKindOf(Bool)" });
		addAnnotation(getOperator__OperatorSort__DiagnosticChain_Map(), source,
				new String[] { "body", "self.sort = self.output" });
		addAnnotation(getOperator__OperatorInputType__DiagnosticChain_Map(), source,
				new String[] { "body", "self.subterm->collect(subterm|subterm.sort) = self.input->asSequence()" });
		addAnnotation(getBooleanOperator__InputOutputTypesBoolOp__DiagnosticChain_Map(), source, new String[] { "body",
				"self.output.oclIsKindOf(Bool) and  self.input->forAll(c | c.oclIsKindOf(Bool))" });
		addAnnotation(getAnd__InputSizeAnd__DiagnosticChain_Map(), source,
				new String[] { "body", "self.input-> size() = 2" });
		addAnnotation(getOr__InputSizeOr__DiagnosticChain_Map(), source,
				new String[] { "body", "self.input-> size() = 2" });
		addAnnotation(getNot__InputSizeNot__DiagnosticChain_Map(), source,
				new String[] { "body", "self.input-> size() = 1" });
		addAnnotation(getEquality__InputSizeInputOutputTypesEq__DiagnosticChain_Map(), source, new String[] { "body",
				"self.input-> size() >= 2 and self.output.oclIsKindOf(Bool) and self.input->forAll(c,d|c.oclIsTypeOf(d.oclType()) or d.oclIsTypeOf(c.oclType()))" });
		addAnnotation(getBooleanConstant__InputSizeOutputTypesBoolConst__DiagnosticChain_Map(), source,
				new String[] { "body", "self.input-> size() = 0 and self.output.oclIsTypeOf(Bool)" });
		addAnnotation(getIntegerOperator__InputSizeTypesIntOp__DiagnosticChain_Map(), source, new String[] { "body",
				"self.input-> size() = 2 and self.input->forAll(c | c.oclIsKindOf(_\'Integer\'))" });
		addAnnotation(getAddition__OutputTypesAdd__DiagnosticChain_Map(), source,
				new String[] { "body", "self.output.oclIsKindOf(_\'Integer\')" });
		addAnnotation(getSubstraction__OutputTypesSubstr__DiagnosticChain_Map(), source,
				new String[] { "body", "self.output.oclIsKindOf(_\'Integer\')" });
		addAnnotation(getGreaterThan__OutputTypesGreat__DiagnosticChain_Map(), source,
				new String[] { "body", "self.output.oclIsKindOf(Bool)" });
		addAnnotation(getLessThan__OutputTypesLess__DiagnosticChain_Map(), source,
				new String[] { "body", "self.output.oclIsKindOf(Bool)" });
		addAnnotation(getIntegerConstant__InputSizeOutputTypesIntConts__DiagnosticChain_Map(), source,
				new String[] { "body", "self.input->size() = 0 and self.output.oclIsTypeOf(_\'Integer\')" });
		addAnnotation(getRisingEdge__InputSizeRisingEdge__DiagnosticChain_Map(), source,
				new String[] { "body", "self.input->size() = 1" });
		addAnnotation(getFallingEdge__InputSizeFallingEdge__DiagnosticChain_Map(), source,
				new String[] { "body", "self.input->size() = 1" });
	}

} //TermsPackageImpl
