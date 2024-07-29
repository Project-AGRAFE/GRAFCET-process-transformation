/**
 */
package terms.util;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

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
import terms.TermsPackage;
import terms.Variable;
import terms.VariableDeclaration;
import terms.VariableDeclarationType;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see terms.TermsPackage
 * @generated
 */
public class TermsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TermsValidator INSTANCE = new TermsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "terms";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sort Variable' of 'Variable'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VARIABLE__SORT_VARIABLE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Step Var Decl Set Step' of 'Variable Declaration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VARIABLE_DECLARATION__STEP_VAR_DECL_SET_STEP = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Operator Sort' of 'Operator'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATOR__OPERATOR_SORT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Operator Input Type' of 'Operator'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATOR__OPERATOR_INPUT_TYPE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Output Types Bool Op' of 'Boolean Operator'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BOOLEAN_OPERATOR__INPUT_OUTPUT_TYPES_BOOL_OP = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Size And' of 'And'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AND__INPUT_SIZE_AND = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Size Or' of 'Or'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OR__INPUT_SIZE_OR = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Size Not' of 'Not'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NOT__INPUT_SIZE_NOT = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Size Input Output Types Eq' of 'Equality'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EQUALITY__INPUT_SIZE_INPUT_OUTPUT_TYPES_EQ = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Size Output Types Bool Const' of 'Boolean Constant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BOOLEAN_CONSTANT__INPUT_SIZE_OUTPUT_TYPES_BOOL_CONST = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Size Types Int Op' of 'Integer Operator'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTEGER_OPERATOR__INPUT_SIZE_TYPES_INT_OP = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Output Types Add' of 'Addition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADDITION__OUTPUT_TYPES_ADD = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Output Types Substr' of 'Substraction'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSTRACTION__OUTPUT_TYPES_SUBSTR = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Output Types Great' of 'Greater Than'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GREATER_THAN__OUTPUT_TYPES_GREAT = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Output Types Less' of 'Less Than'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LESS_THAN__OUTPUT_TYPES_LESS = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Size Output Types Int Conts' of 'Integer Constant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTEGER_CONSTANT__INPUT_SIZE_OUTPUT_TYPES_INT_CONTS = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Size Rising Edge' of 'Rising Edge'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RISING_EDGE__INPUT_SIZE_RISING_EDGE = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Size Falling Edge' of 'Falling Edge'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FALLING_EDGE__INPUT_SIZE_FALLING_EDGE = 18;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 18;

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
	public TermsValidator() {
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
		return TermsPackage.eINSTANCE;
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
		case TermsPackage.TERM:
			return validateTerm((Term) value, diagnostics, context);
		case TermsPackage.VARIABLE:
			return validateVariable((Variable) value, diagnostics, context);
		case TermsPackage.VARIABLE_DECLARATION:
			return validateVariableDeclaration((VariableDeclaration) value, diagnostics, context);
		case TermsPackage.OPERATOR:
			return validateOperator((Operator) value, diagnostics, context);
		case TermsPackage.CONSTANT:
			return validateConstant((Constant) value, diagnostics, context);
		case TermsPackage.SORT:
			return validateSort((Sort) value, diagnostics, context);
		case TermsPackage.BOOL:
			return validateBool((Bool) value, diagnostics, context);
		case TermsPackage.INTEGER:
			return validateInteger((terms.Integer) value, diagnostics, context);
		case TermsPackage.BOOLEAN_OPERATOR:
			return validateBooleanOperator((BooleanOperator) value, diagnostics, context);
		case TermsPackage.AND:
			return validateAnd((And) value, diagnostics, context);
		case TermsPackage.OR:
			return validateOr((Or) value, diagnostics, context);
		case TermsPackage.NOT:
			return validateNot((Not) value, diagnostics, context);
		case TermsPackage.EQUALITY:
			return validateEquality((Equality) value, diagnostics, context);
		case TermsPackage.BOOLEAN_CONSTANT:
			return validateBooleanConstant((BooleanConstant) value, diagnostics, context);
		case TermsPackage.INTEGER_OPERATOR:
			return validateIntegerOperator((IntegerOperator) value, diagnostics, context);
		case TermsPackage.ADDITION:
			return validateAddition((Addition) value, diagnostics, context);
		case TermsPackage.SUBSTRACTION:
			return validateSubstraction((Substraction) value, diagnostics, context);
		case TermsPackage.GREATER_THAN:
			return validateGreaterThan((GreaterThan) value, diagnostics, context);
		case TermsPackage.LESS_THAN:
			return validateLessThan((LessThan) value, diagnostics, context);
		case TermsPackage.INTEGER_CONSTANT:
			return validateIntegerConstant((IntegerConstant) value, diagnostics, context);
		case TermsPackage.RISING_EDGE:
			return validateRisingEdge((RisingEdge) value, diagnostics, context);
		case TermsPackage.FALLING_EDGE:
			return validateFallingEdge((FallingEdge) value, diagnostics, context);
		case TermsPackage.VARIABLE_DECLARATION_TYPE:
			return validateVariableDeclarationType((VariableDeclarationType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerm(Term term, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(term, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variable, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVariable_SortVariable(variable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SortVariable constraint of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable_SortVariable(Variable variable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return variable.SortVariable(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableDeclaration(VariableDeclaration variableDeclaration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variableDeclaration, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVariableDeclaration_StepVarDeclSetStep(variableDeclaration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the StepVarDeclSetStep constraint of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableDeclaration_StepVarDeclSetStep(VariableDeclaration variableDeclaration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return variableDeclaration.StepVarDeclSetStep(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorInputType(operator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorSort(operator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OperatorSort constraint of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator_OperatorSort(Operator operator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return operator.OperatorSort(diagnostics, context);
	}

	/**
	 * Validates the OperatorInputType constraint of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator_OperatorInputType(Operator operator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return operator.OperatorInputType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstant(Constant constant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(constant, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(constant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(constant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(constant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(constant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(constant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(constant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(constant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(constant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorInputType(constant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorSort(constant, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSort(Sort sort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBool(Bool bool, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bool, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(terms.Integer integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanOperator(BooleanOperator booleanOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(booleanOperator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorInputType(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorSort(booleanOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBooleanOperator_InputOutputTypesBoolOp(booleanOperator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputOutputTypesBoolOp constraint of '<em>Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanOperator_InputOutputTypesBoolOp(BooleanOperator booleanOperator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return booleanOperator.InputOutputTypesBoolOp(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnd(And and, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(and, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorInputType(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorSort(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBooleanOperator_InputOutputTypesBoolOp(and, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAnd_InputSizeAnd(and, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputSizeAnd constraint of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnd_InputSizeAnd(And and, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return and.InputSizeAnd(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOr(Or or, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(or, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorInputType(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorSort(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBooleanOperator_InputOutputTypesBoolOp(or, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOr_InputSizeOr(or, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputSizeOr constraint of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOr_InputSizeOr(Or or, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return or.InputSizeOr(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNot(Not not, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(not, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorInputType(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorSort(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBooleanOperator_InputOutputTypesBoolOp(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNot_InputSizeNot(not, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputSizeNot constraint of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNot_InputSizeNot(Not not, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return not.InputSizeNot(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquality(Equality equality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(equality, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorInputType(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorSort(equality, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEquality_InputSizeInputOutputTypesEq(equality, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputSizeInputOutputTypesEq constraint of '<em>Equality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquality_InputSizeInputOutputTypesEq(Equality equality, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return equality.InputSizeInputOutputTypesEq(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanConstant(BooleanConstant booleanConstant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(booleanConstant, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorInputType(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorSort(booleanConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBooleanConstant_InputSizeOutputTypesBoolConst(booleanConstant, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputSizeOutputTypesBoolConst constraint of '<em>Boolean Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanConstant_InputSizeOutputTypesBoolConst(BooleanConstant booleanConstant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return booleanConstant.InputSizeOutputTypesBoolConst(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerOperator(IntegerOperator integerOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integerOperator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorInputType(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorSort(integerOperator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntegerOperator_InputSizeTypesIntOp(integerOperator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputSizeTypesIntOp constraint of '<em>Integer Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerOperator_InputSizeTypesIntOp(IntegerOperator integerOperator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return integerOperator.InputSizeTypesIntOp(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddition(Addition addition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(addition, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorInputType(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorSort(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntegerOperator_InputSizeTypesIntOp(addition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAddition_OutputTypesAdd(addition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OutputTypesAdd constraint of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddition_OutputTypesAdd(Addition addition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return addition.OutputTypesAdd(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstraction(Substraction substraction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(substraction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(substraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(substraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(substraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(substraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(substraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(substraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(substraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(substraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorInputType(substraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorSort(substraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntegerOperator_InputSizeTypesIntOp(substraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSubstraction_OutputTypesSubstr(substraction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OutputTypesSubstr constraint of '<em>Substraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstraction_OutputTypesSubstr(Substraction substraction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return substraction.OutputTypesSubstr(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGreaterThan(GreaterThan greaterThan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(greaterThan, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorInputType(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorSort(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntegerOperator_InputSizeTypesIntOp(greaterThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGreaterThan_OutputTypesGreat(greaterThan, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OutputTypesGreat constraint of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGreaterThan_OutputTypesGreat(GreaterThan greaterThan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return greaterThan.OutputTypesGreat(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLessThan(LessThan lessThan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lessThan, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorInputType(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorSort(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntegerOperator_InputSizeTypesIntOp(lessThan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLessThan_OutputTypesLess(lessThan, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OutputTypesLess constraint of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLessThan_OutputTypesLess(LessThan lessThan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lessThan.OutputTypesLess(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerConstant(IntegerConstant integerConstant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integerConstant, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(integerConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(integerConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(integerConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(integerConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(integerConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(integerConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(integerConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(integerConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorInputType(integerConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorSort(integerConstant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntegerConstant_InputSizeOutputTypesIntConts(integerConstant, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputSizeOutputTypesIntConts constraint of '<em>Integer Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerConstant_InputSizeOutputTypesIntConts(IntegerConstant integerConstant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return integerConstant.InputSizeOutputTypesIntConts(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRisingEdge(RisingEdge risingEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(risingEdge, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(risingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(risingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(risingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(risingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(risingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(risingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(risingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(risingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorInputType(risingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorSort(risingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBooleanOperator_InputOutputTypesBoolOp(risingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRisingEdge_InputSizeRisingEdge(risingEdge, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputSizeRisingEdge constraint of '<em>Rising Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRisingEdge_InputSizeRisingEdge(RisingEdge risingEdge, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return risingEdge.InputSizeRisingEdge(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFallingEdge(FallingEdge fallingEdge, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fallingEdge, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(fallingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(fallingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(fallingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(fallingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(fallingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(fallingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(fallingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(fallingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorInputType(fallingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperator_OperatorSort(fallingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBooleanOperator_InputOutputTypesBoolOp(fallingEdge, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFallingEdge_InputSizeFallingEdge(fallingEdge, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputSizeFallingEdge constraint of '<em>Falling Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFallingEdge_InputSizeFallingEdge(FallingEdge fallingEdge, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return fallingEdge.InputSizeFallingEdge(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableDeclarationType(VariableDeclarationType variableDeclarationType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //TermsValidator
