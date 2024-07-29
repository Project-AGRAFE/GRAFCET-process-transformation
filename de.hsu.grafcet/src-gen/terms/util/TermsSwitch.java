/**
 */
package terms.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see terms.TermsPackage
 * @generated
 */
public class TermsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TermsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsSwitch() {
		if (modelPackage == null) {
			modelPackage = TermsPackage.eINSTANCE;
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
		case TermsPackage.TERM: {
			Term term = (Term) theEObject;
			T result = caseTerm(term);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseTerm(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.VARIABLE_DECLARATION: {
			VariableDeclaration variableDeclaration = (VariableDeclaration) theEObject;
			T result = caseVariableDeclaration(variableDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.OPERATOR: {
			Operator operator = (Operator) theEObject;
			T result = caseOperator(operator);
			if (result == null)
				result = caseTerm(operator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.CONSTANT: {
			Constant constant = (Constant) theEObject;
			T result = caseConstant(constant);
			if (result == null)
				result = caseOperator(constant);
			if (result == null)
				result = caseTerm(constant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.SORT: {
			Sort sort = (Sort) theEObject;
			T result = caseSort(sort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.BOOL: {
			Bool bool = (Bool) theEObject;
			T result = caseBool(bool);
			if (result == null)
				result = caseSort(bool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.INTEGER: {
			terms.Integer integer = (terms.Integer) theEObject;
			T result = caseInteger(integer);
			if (result == null)
				result = caseSort(integer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.BOOLEAN_OPERATOR: {
			BooleanOperator booleanOperator = (BooleanOperator) theEObject;
			T result = caseBooleanOperator(booleanOperator);
			if (result == null)
				result = caseOperator(booleanOperator);
			if (result == null)
				result = caseTerm(booleanOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.AND: {
			And and = (And) theEObject;
			T result = caseAnd(and);
			if (result == null)
				result = caseBooleanOperator(and);
			if (result == null)
				result = caseOperator(and);
			if (result == null)
				result = caseTerm(and);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.OR: {
			Or or = (Or) theEObject;
			T result = caseOr(or);
			if (result == null)
				result = caseBooleanOperator(or);
			if (result == null)
				result = caseOperator(or);
			if (result == null)
				result = caseTerm(or);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.NOT: {
			Not not = (Not) theEObject;
			T result = caseNot(not);
			if (result == null)
				result = caseBooleanOperator(not);
			if (result == null)
				result = caseOperator(not);
			if (result == null)
				result = caseTerm(not);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.EQUALITY: {
			Equality equality = (Equality) theEObject;
			T result = caseEquality(equality);
			if (result == null)
				result = caseOperator(equality);
			if (result == null)
				result = caseTerm(equality);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.BOOLEAN_CONSTANT: {
			BooleanConstant booleanConstant = (BooleanConstant) theEObject;
			T result = caseBooleanConstant(booleanConstant);
			if (result == null)
				result = caseConstant(booleanConstant);
			if (result == null)
				result = caseOperator(booleanConstant);
			if (result == null)
				result = caseTerm(booleanConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.INTEGER_OPERATOR: {
			IntegerOperator integerOperator = (IntegerOperator) theEObject;
			T result = caseIntegerOperator(integerOperator);
			if (result == null)
				result = caseOperator(integerOperator);
			if (result == null)
				result = caseTerm(integerOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.ADDITION: {
			Addition addition = (Addition) theEObject;
			T result = caseAddition(addition);
			if (result == null)
				result = caseIntegerOperator(addition);
			if (result == null)
				result = caseOperator(addition);
			if (result == null)
				result = caseTerm(addition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.SUBSTRACTION: {
			Substraction substraction = (Substraction) theEObject;
			T result = caseSubstraction(substraction);
			if (result == null)
				result = caseIntegerOperator(substraction);
			if (result == null)
				result = caseOperator(substraction);
			if (result == null)
				result = caseTerm(substraction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.GREATER_THAN: {
			GreaterThan greaterThan = (GreaterThan) theEObject;
			T result = caseGreaterThan(greaterThan);
			if (result == null)
				result = caseIntegerOperator(greaterThan);
			if (result == null)
				result = caseOperator(greaterThan);
			if (result == null)
				result = caseTerm(greaterThan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.LESS_THAN: {
			LessThan lessThan = (LessThan) theEObject;
			T result = caseLessThan(lessThan);
			if (result == null)
				result = caseIntegerOperator(lessThan);
			if (result == null)
				result = caseOperator(lessThan);
			if (result == null)
				result = caseTerm(lessThan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.INTEGER_CONSTANT: {
			IntegerConstant integerConstant = (IntegerConstant) theEObject;
			T result = caseIntegerConstant(integerConstant);
			if (result == null)
				result = caseConstant(integerConstant);
			if (result == null)
				result = caseOperator(integerConstant);
			if (result == null)
				result = caseTerm(integerConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.RISING_EDGE: {
			RisingEdge risingEdge = (RisingEdge) theEObject;
			T result = caseRisingEdge(risingEdge);
			if (result == null)
				result = caseBooleanOperator(risingEdge);
			if (result == null)
				result = caseOperator(risingEdge);
			if (result == null)
				result = caseTerm(risingEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TermsPackage.FALLING_EDGE: {
			FallingEdge fallingEdge = (FallingEdge) theEObject;
			T result = caseFallingEdge(fallingEdge);
			if (result == null)
				result = caseBooleanOperator(fallingEdge);
			if (result == null)
				result = caseOperator(fallingEdge);
			if (result == null)
				result = caseTerm(fallingEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSort(Sort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBool(Bool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(terms.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOperator(BooleanOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquality(Equality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanConstant(BooleanConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerOperator(IntegerOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddition(Addition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstraction(Substraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThan(GreaterThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThan(LessThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerConstant(IntegerConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rising Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rising Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRisingEdge(RisingEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Falling Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Falling Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFallingEdge(FallingEdge object) {
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

} //TermsSwitch
