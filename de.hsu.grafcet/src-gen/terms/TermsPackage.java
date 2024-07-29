/**
 */
package terms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see terms.TermsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface TermsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "terms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/terms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "terms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TermsPackage eINSTANCE = terms.impl.TermsPackageImpl.init();

	/**
	 * The meta object id for the '{@link terms.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.TermImpl
	 * @see terms.impl.TermsPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 0;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__SORT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__ID = 1;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link terms.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.VariableImpl
	 * @see terms.impl.TermsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SORT = TERM__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ID = TERM__ID;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VARIABLE_DECLARATION = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Sort Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___SORT_VARIABLE__DIAGNOSTICCHAIN_MAP = TERM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = TERM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link terms.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.VariableDeclarationImpl
	 * @see terms.impl.TermsPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 2;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__SORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Variable Declaration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__VARIABLE_DECLARATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__STEP = 3;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Step Var Decl Set Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION___STEP_VAR_DECL_SET_STEP__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link terms.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.OperatorImpl
	 * @see terms.impl.TermsPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 3;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__SORT = TERM__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__ID = TERM__ID;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__SUBTERM = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OUTPUT = TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__INPUT = TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = TERM_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Operator Sort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = TERM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Operator Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = TERM_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = TERM_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link terms.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.ConstantImpl
	 * @see terms.impl.TermsPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 4;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__SORT = OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__ID = OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__SUBTERM = OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__OUTPUT = OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__INPUT = OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Operator Sort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operator Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terms.impl.SortImpl <em>Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.SortImpl
	 * @see terms.impl.TermsPackageImpl#getSort()
	 * @generated
	 */
	int SORT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__ID = 0;

	/**
	 * The number of structural features of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link terms.impl.BoolImpl <em>Bool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.BoolImpl
	 * @see terms.impl.TermsPackageImpl#getBool()
	 * @generated
	 */
	int BOOL = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL__ID = SORT__ID;

	/**
	 * The number of structural features of the '<em>Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_FEATURE_COUNT = SORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION_COUNT = SORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terms.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.IntegerImpl
	 * @see terms.impl.TermsPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__ID = SORT__ID;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = SORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = SORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terms.impl.BooleanOperatorImpl <em>Boolean Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.BooleanOperatorImpl
	 * @see terms.impl.TermsPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 8;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__SORT = OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__ID = OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__SUBTERM = OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__OUTPUT = OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__INPUT = OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Operator Sort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operator Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Output Types Bool Op</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR___INPUT_OUTPUT_TYPES_BOOL_OP__DIAGNOSTICCHAIN_MAP = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link terms.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.AndImpl
	 * @see terms.impl.TermsPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 9;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__SORT = BOOLEAN_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ID = BOOLEAN_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__SUBTERM = BOOLEAN_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OUTPUT = BOOLEAN_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__INPUT = BOOLEAN_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Operator Sort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operator Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Output Types Bool Op</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND___INPUT_OUTPUT_TYPES_BOOL_OP__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___INPUT_OUTPUT_TYPES_BOOL_OP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Size And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND___INPUT_SIZE_AND__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BOOLEAN_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link terms.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.OrImpl
	 * @see terms.impl.TermsPackageImpl#getOr()
	 * @generated
	 */
	int OR = 10;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__SORT = BOOLEAN_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__ID = BOOLEAN_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__SUBTERM = BOOLEAN_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OUTPUT = BOOLEAN_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__INPUT = BOOLEAN_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Operator Sort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operator Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Output Types Bool Op</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR___INPUT_OUTPUT_TYPES_BOOL_OP__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___INPUT_OUTPUT_TYPES_BOOL_OP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Size Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR___INPUT_SIZE_OR__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BOOLEAN_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link terms.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.NotImpl
	 * @see terms.impl.TermsPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 11;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__SORT = BOOLEAN_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__ID = BOOLEAN_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__SUBTERM = BOOLEAN_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__OUTPUT = BOOLEAN_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__INPUT = BOOLEAN_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Operator Sort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operator Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Output Types Bool Op</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT___INPUT_OUTPUT_TYPES_BOOL_OP__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___INPUT_OUTPUT_TYPES_BOOL_OP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Size Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT___INPUT_SIZE_NOT__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = BOOLEAN_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link terms.impl.EqualityImpl <em>Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.EqualityImpl
	 * @see terms.impl.TermsPackageImpl#getEquality()
	 * @generated
	 */
	int EQUALITY = 12;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__SORT = OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__ID = OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__SUBTERM = OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__OUTPUT = OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__INPUT = OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Operator Sort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operator Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Size Input Output Types Eq</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY___INPUT_SIZE_INPUT_OUTPUT_TYPES_EQ__DIAGNOSTICCHAIN_MAP = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link terms.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.BooleanConstantImpl
	 * @see terms.impl.TermsPackageImpl#getBooleanConstant()
	 * @generated
	 */
	int BOOLEAN_CONSTANT = 13;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__SORT = CONSTANT__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__ID = CONSTANT__ID;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__SUBTERM = CONSTANT__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__OUTPUT = CONSTANT__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__INPUT = CONSTANT__INPUT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Operator Sort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = CONSTANT___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operator Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = CONSTANT___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Size Output Types Bool Const</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT___INPUT_SIZE_OUTPUT_TYPES_BOOL_CONST__DIAGNOSTICCHAIN_MAP = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link terms.impl.IntegerOperatorImpl <em>Integer Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.IntegerOperatorImpl
	 * @see terms.impl.TermsPackageImpl#getIntegerOperator()
	 * @generated
	 */
	int INTEGER_OPERATOR = 14;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR__SORT = OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR__ID = OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR__SUBTERM = OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR__OUTPUT = OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR__INPUT = OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Integer Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Operator Sort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operator Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Size Types Int Op</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR___INPUT_SIZE_TYPES_INT_OP__DIAGNOSTICCHAIN_MAP = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link terms.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.AdditionImpl
	 * @see terms.impl.TermsPackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 15;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__SORT = INTEGER_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__ID = INTEGER_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__OUTPUT = INTEGER_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__INPUT = INTEGER_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Operator Sort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = INTEGER_OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operator Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = INTEGER_OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Size Types Int Op</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___INPUT_SIZE_TYPES_INT_OP__DIAGNOSTICCHAIN_MAP = INTEGER_OPERATOR___INPUT_SIZE_TYPES_INT_OP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Output Types Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___OUTPUT_TYPES_ADD__DIAGNOSTICCHAIN_MAP = INTEGER_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_OPERATION_COUNT = INTEGER_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link terms.impl.SubstractionImpl <em>Substraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.SubstractionImpl
	 * @see terms.impl.TermsPackageImpl#getSubstraction()
	 * @generated
	 */
	int SUBSTRACTION = 16;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION__SORT = INTEGER_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION__ID = INTEGER_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION__OUTPUT = INTEGER_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION__INPUT = INTEGER_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Substraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Operator Sort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = INTEGER_OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operator Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = INTEGER_OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Size Types Int Op</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION___INPUT_SIZE_TYPES_INT_OP__DIAGNOSTICCHAIN_MAP = INTEGER_OPERATOR___INPUT_SIZE_TYPES_INT_OP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Output Types Substr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION___OUTPUT_TYPES_SUBSTR__DIAGNOSTICCHAIN_MAP = INTEGER_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Substraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION_OPERATION_COUNT = INTEGER_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link terms.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.GreaterThanImpl
	 * @see terms.impl.TermsPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 17;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__SORT = INTEGER_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__ID = INTEGER_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__OUTPUT = INTEGER_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__INPUT = INTEGER_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Operator Sort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = INTEGER_OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operator Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = INTEGER_OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Size Types Int Op</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___INPUT_SIZE_TYPES_INT_OP__DIAGNOSTICCHAIN_MAP = INTEGER_OPERATOR___INPUT_SIZE_TYPES_INT_OP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Output Types Great</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___OUTPUT_TYPES_GREAT__DIAGNOSTICCHAIN_MAP = INTEGER_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATION_COUNT = INTEGER_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link terms.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.LessThanImpl
	 * @see terms.impl.TermsPackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 18;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__SORT = INTEGER_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__ID = INTEGER_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__OUTPUT = INTEGER_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__INPUT = INTEGER_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Operator Sort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = INTEGER_OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operator Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = INTEGER_OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Size Types Int Op</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___INPUT_SIZE_TYPES_INT_OP__DIAGNOSTICCHAIN_MAP = INTEGER_OPERATOR___INPUT_SIZE_TYPES_INT_OP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Output Types Less</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___OUTPUT_TYPES_LESS__DIAGNOSTICCHAIN_MAP = INTEGER_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATION_COUNT = INTEGER_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link terms.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.IntegerConstantImpl
	 * @see terms.impl.TermsPackageImpl#getIntegerConstant()
	 * @generated
	 */
	int INTEGER_CONSTANT = 19;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__SORT = CONSTANT__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__ID = CONSTANT__ID;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__SUBTERM = CONSTANT__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__OUTPUT = CONSTANT__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__INPUT = CONSTANT__INPUT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Operator Sort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = CONSTANT___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operator Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = CONSTANT___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Size Output Types Int Conts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT___INPUT_SIZE_OUTPUT_TYPES_INT_CONTS__DIAGNOSTICCHAIN_MAP = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link terms.impl.RisingEdgeImpl <em>Rising Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.RisingEdgeImpl
	 * @see terms.impl.TermsPackageImpl#getRisingEdge()
	 * @generated
	 */
	int RISING_EDGE = 20;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISING_EDGE__SORT = BOOLEAN_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISING_EDGE__ID = BOOLEAN_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISING_EDGE__SUBTERM = BOOLEAN_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISING_EDGE__OUTPUT = BOOLEAN_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISING_EDGE__INPUT = BOOLEAN_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Rising Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISING_EDGE_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Operator Sort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISING_EDGE___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operator Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISING_EDGE___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Output Types Bool Op</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISING_EDGE___INPUT_OUTPUT_TYPES_BOOL_OP__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___INPUT_OUTPUT_TYPES_BOOL_OP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Size Rising Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISING_EDGE___INPUT_SIZE_RISING_EDGE__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rising Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISING_EDGE_OPERATION_COUNT = BOOLEAN_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link terms.impl.FallingEdgeImpl <em>Falling Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.impl.FallingEdgeImpl
	 * @see terms.impl.TermsPackageImpl#getFallingEdge()
	 * @generated
	 */
	int FALLING_EDGE = 21;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLING_EDGE__SORT = BOOLEAN_OPERATOR__SORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLING_EDGE__ID = BOOLEAN_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLING_EDGE__SUBTERM = BOOLEAN_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLING_EDGE__OUTPUT = BOOLEAN_OPERATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLING_EDGE__INPUT = BOOLEAN_OPERATOR__INPUT;

	/**
	 * The number of structural features of the '<em>Falling Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLING_EDGE_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Operator Sort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLING_EDGE___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operator Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLING_EDGE___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Output Types Bool Op</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLING_EDGE___INPUT_OUTPUT_TYPES_BOOL_OP__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR___INPUT_OUTPUT_TYPES_BOOL_OP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Input Size Falling Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLING_EDGE___INPUT_SIZE_FALLING_EDGE__DIAGNOSTICCHAIN_MAP = BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Falling Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLING_EDGE_OPERATION_COUNT = BOOLEAN_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link terms.VariableDeclarationType <em>Variable Declaration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terms.VariableDeclarationType
	 * @see terms.impl.TermsPackageImpl#getVariableDeclarationType()
	 * @generated
	 */
	int VARIABLE_DECLARATION_TYPE = 22;

	/**
	 * Returns the meta object for class '{@link terms.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see terms.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the reference '{@link terms.Term#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sort</em>'.
	 * @see terms.Term#getSort()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Sort();

	/**
	 * Returns the meta object for the attribute '{@link terms.Term#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see terms.Term#getId()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_Id();

	/**
	 * Returns the meta object for class '{@link terms.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see terms.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link terms.Variable#getVariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Declaration</em>'.
	 * @see terms.Variable#getVariableDeclaration()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_VariableDeclaration();

	/**
	 * Returns the meta object for the '{@link terms.Variable#SortVariable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Sort Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sort Variable</em>' operation.
	 * @see terms.Variable#SortVariable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVariable__SortVariable__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link terms.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see terms.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link terms.VariableDeclaration#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort</em>'.
	 * @see terms.VariableDeclaration#getSort()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Sort();

	/**
	 * Returns the meta object for the attribute '{@link terms.VariableDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see terms.VariableDeclaration#getName()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Name();

	/**
	 * Returns the meta object for the attribute '{@link terms.VariableDeclaration#getVariableDeclarationType <em>Variable Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Declaration Type</em>'.
	 * @see terms.VariableDeclaration#getVariableDeclarationType()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_VariableDeclarationType();

	/**
	 * Returns the meta object for the reference '{@link terms.VariableDeclaration#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step</em>'.
	 * @see terms.VariableDeclaration#getStep()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Step();

	/**
	 * Returns the meta object for the '{@link terms.VariableDeclaration#StepVarDeclSetStep(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Step Var Decl Set Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step Var Decl Set Step</em>' operation.
	 * @see terms.VariableDeclaration#StepVarDeclSetStep(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVariableDeclaration__StepVarDeclSetStep__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link terms.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see terms.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link terms.Operator#getSubterm <em>Subterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subterm</em>'.
	 * @see terms.Operator#getSubterm()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Subterm();

	/**
	 * Returns the meta object for the containment reference '{@link terms.Operator#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see terms.Operator#getOutput()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Output();

	/**
	 * Returns the meta object for the reference list '{@link terms.Operator#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see terms.Operator#getInput()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Input();

	/**
	 * Returns the meta object for the '{@link terms.Operator#OperatorSort(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Operator Sort</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operator Sort</em>' operation.
	 * @see terms.Operator#OperatorSort(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperator__OperatorSort__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link terms.Operator#OperatorInputType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Operator Input Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operator Input Type</em>' operation.
	 * @see terms.Operator#OperatorInputType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperator__OperatorInputType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link terms.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see terms.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link terms.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort</em>'.
	 * @see terms.Sort
	 * @generated
	 */
	EClass getSort();

	/**
	 * Returns the meta object for the attribute '{@link terms.Sort#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see terms.Sort#getId()
	 * @see #getSort()
	 * @generated
	 */
	EAttribute getSort_Id();

	/**
	 * Returns the meta object for class '{@link terms.Bool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool</em>'.
	 * @see terms.Bool
	 * @generated
	 */
	EClass getBool();

	/**
	 * Returns the meta object for class '{@link terms.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see terms.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for class '{@link terms.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operator</em>'.
	 * @see terms.BooleanOperator
	 * @generated
	 */
	EClass getBooleanOperator();

	/**
	 * Returns the meta object for the '{@link terms.BooleanOperator#InputOutputTypesBoolOp(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Input Output Types Bool Op</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Output Types Bool Op</em>' operation.
	 * @see terms.BooleanOperator#InputOutputTypesBoolOp(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBooleanOperator__InputOutputTypesBoolOp__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link terms.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see terms.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the '{@link terms.And#InputSizeAnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Input Size And</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Size And</em>' operation.
	 * @see terms.And#InputSizeAnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAnd__InputSizeAnd__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link terms.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see terms.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for the '{@link terms.Or#InputSizeOr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Input Size Or</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Size Or</em>' operation.
	 * @see terms.Or#InputSizeOr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOr__InputSizeOr__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link terms.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see terms.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the '{@link terms.Not#InputSizeNot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Input Size Not</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Size Not</em>' operation.
	 * @see terms.Not#InputSizeNot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNot__InputSizeNot__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link terms.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality</em>'.
	 * @see terms.Equality
	 * @generated
	 */
	EClass getEquality();

	/**
	 * Returns the meta object for the '{@link terms.Equality#InputSizeInputOutputTypesEq(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Input Size Input Output Types Eq</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Size Input Output Types Eq</em>' operation.
	 * @see terms.Equality#InputSizeInputOutputTypesEq(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEquality__InputSizeInputOutputTypesEq__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link terms.BooleanConstant <em>Boolean Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Constant</em>'.
	 * @see terms.BooleanConstant
	 * @generated
	 */
	EClass getBooleanConstant();

	/**
	 * Returns the meta object for the attribute '{@link terms.BooleanConstant#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see terms.BooleanConstant#isValue()
	 * @see #getBooleanConstant()
	 * @generated
	 */
	EAttribute getBooleanConstant_Value();

	/**
	 * Returns the meta object for the '{@link terms.BooleanConstant#InputSizeOutputTypesBoolConst(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Input Size Output Types Bool Const</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Size Output Types Bool Const</em>' operation.
	 * @see terms.BooleanConstant#InputSizeOutputTypesBoolConst(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBooleanConstant__InputSizeOutputTypesBoolConst__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link terms.IntegerOperator <em>Integer Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Operator</em>'.
	 * @see terms.IntegerOperator
	 * @generated
	 */
	EClass getIntegerOperator();

	/**
	 * Returns the meta object for the '{@link terms.IntegerOperator#InputSizeTypesIntOp(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Input Size Types Int Op</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Size Types Int Op</em>' operation.
	 * @see terms.IntegerOperator#InputSizeTypesIntOp(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIntegerOperator__InputSizeTypesIntOp__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link terms.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see terms.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for the '{@link terms.Addition#OutputTypesAdd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Output Types Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output Types Add</em>' operation.
	 * @see terms.Addition#OutputTypesAdd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAddition__OutputTypesAdd__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link terms.Substraction <em>Substraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substraction</em>'.
	 * @see terms.Substraction
	 * @generated
	 */
	EClass getSubstraction();

	/**
	 * Returns the meta object for the '{@link terms.Substraction#OutputTypesSubstr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Output Types Substr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output Types Substr</em>' operation.
	 * @see terms.Substraction#OutputTypesSubstr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSubstraction__OutputTypesSubstr__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link terms.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see terms.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for the '{@link terms.GreaterThan#OutputTypesGreat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Output Types Great</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output Types Great</em>' operation.
	 * @see terms.GreaterThan#OutputTypesGreat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGreaterThan__OutputTypesGreat__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link terms.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see terms.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the meta object for the '{@link terms.LessThan#OutputTypesLess(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Output Types Less</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output Types Less</em>' operation.
	 * @see terms.LessThan#OutputTypesLess(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLessThan__OutputTypesLess__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link terms.IntegerConstant <em>Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Constant</em>'.
	 * @see terms.IntegerConstant
	 * @generated
	 */
	EClass getIntegerConstant();

	/**
	 * Returns the meta object for the attribute '{@link terms.IntegerConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see terms.IntegerConstant#getValue()
	 * @see #getIntegerConstant()
	 * @generated
	 */
	EAttribute getIntegerConstant_Value();

	/**
	 * Returns the meta object for the '{@link terms.IntegerConstant#InputSizeOutputTypesIntConts(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Input Size Output Types Int Conts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Size Output Types Int Conts</em>' operation.
	 * @see terms.IntegerConstant#InputSizeOutputTypesIntConts(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIntegerConstant__InputSizeOutputTypesIntConts__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link terms.RisingEdge <em>Rising Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rising Edge</em>'.
	 * @see terms.RisingEdge
	 * @generated
	 */
	EClass getRisingEdge();

	/**
	 * Returns the meta object for the '{@link terms.RisingEdge#InputSizeRisingEdge(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Input Size Rising Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Size Rising Edge</em>' operation.
	 * @see terms.RisingEdge#InputSizeRisingEdge(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRisingEdge__InputSizeRisingEdge__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link terms.FallingEdge <em>Falling Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Falling Edge</em>'.
	 * @see terms.FallingEdge
	 * @generated
	 */
	EClass getFallingEdge();

	/**
	 * Returns the meta object for the '{@link terms.FallingEdge#InputSizeFallingEdge(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Input Size Falling Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Size Falling Edge</em>' operation.
	 * @see terms.FallingEdge#InputSizeFallingEdge(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFallingEdge__InputSizeFallingEdge__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link terms.VariableDeclarationType <em>Variable Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Declaration Type</em>'.
	 * @see terms.VariableDeclarationType
	 * @generated
	 */
	EEnum getVariableDeclarationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TermsFactory getTermsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link terms.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.TermImpl
		 * @see terms.impl.TermsPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__SORT = eINSTANCE.getTerm_Sort();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__ID = eINSTANCE.getTerm_Id();

		/**
		 * The meta object literal for the '{@link terms.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.VariableImpl
		 * @see terms.impl.TermsPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Variable Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__VARIABLE_DECLARATION = eINSTANCE.getVariable_VariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Sort Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE___SORT_VARIABLE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getVariable__SortVariable__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.VariableDeclarationImpl
		 * @see terms.impl.TermsPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__SORT = eINSTANCE.getVariableDeclaration_Sort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Variable Declaration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__VARIABLE_DECLARATION_TYPE = eINSTANCE
				.getVariableDeclaration_VariableDeclarationType();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__STEP = eINSTANCE.getVariableDeclaration_Step();

		/**
		 * The meta object literal for the '<em><b>Step Var Decl Set Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DECLARATION___STEP_VAR_DECL_SET_STEP__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getVariableDeclaration__StepVarDeclSetStep__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.OperatorImpl
		 * @see terms.impl.TermsPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Subterm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__SUBTERM = eINSTANCE.getOperator_Subterm();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__OUTPUT = eINSTANCE.getOperator_Output();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__INPUT = eINSTANCE.getOperator_Input();

		/**
		 * The meta object literal for the '<em><b>Operator Sort</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getOperator__OperatorSort__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Operator Input Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getOperator__OperatorInputType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.ConstantImpl
		 * @see terms.impl.TermsPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link terms.impl.SortImpl <em>Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.SortImpl
		 * @see terms.impl.TermsPackageImpl#getSort()
		 * @generated
		 */
		EClass SORT = eINSTANCE.getSort();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORT__ID = eINSTANCE.getSort_Id();

		/**
		 * The meta object literal for the '{@link terms.impl.BoolImpl <em>Bool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.BoolImpl
		 * @see terms.impl.TermsPackageImpl#getBool()
		 * @generated
		 */
		EClass BOOL = eINSTANCE.getBool();

		/**
		 * The meta object literal for the '{@link terms.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.IntegerImpl
		 * @see terms.impl.TermsPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '{@link terms.impl.BooleanOperatorImpl <em>Boolean Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.BooleanOperatorImpl
		 * @see terms.impl.TermsPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EClass BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

		/**
		 * The meta object literal for the '<em><b>Input Output Types Bool Op</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_OPERATOR___INPUT_OUTPUT_TYPES_BOOL_OP__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getBooleanOperator__InputOutputTypesBoolOp__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.AndImpl
		 * @see terms.impl.TermsPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '<em><b>Input Size And</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AND___INPUT_SIZE_AND__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAnd__InputSizeAnd__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.OrImpl
		 * @see terms.impl.TermsPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '<em><b>Input Size Or</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OR___INPUT_SIZE_OR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOr__InputSizeOr__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.NotImpl
		 * @see terms.impl.TermsPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Input Size Not</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOT___INPUT_SIZE_NOT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNot__InputSizeNot__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.impl.EqualityImpl <em>Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.EqualityImpl
		 * @see terms.impl.TermsPackageImpl#getEquality()
		 * @generated
		 */
		EClass EQUALITY = eINSTANCE.getEquality();

		/**
		 * The meta object literal for the '<em><b>Input Size Input Output Types Eq</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EQUALITY___INPUT_SIZE_INPUT_OUTPUT_TYPES_EQ__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEquality__InputSizeInputOutputTypesEq__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.BooleanConstantImpl
		 * @see terms.impl.TermsPackageImpl#getBooleanConstant()
		 * @generated
		 */
		EClass BOOLEAN_CONSTANT = eINSTANCE.getBooleanConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CONSTANT__VALUE = eINSTANCE.getBooleanConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Input Size Output Types Bool Const</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_CONSTANT___INPUT_SIZE_OUTPUT_TYPES_BOOL_CONST__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getBooleanConstant__InputSizeOutputTypesBoolConst__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.impl.IntegerOperatorImpl <em>Integer Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.IntegerOperatorImpl
		 * @see terms.impl.TermsPackageImpl#getIntegerOperator()
		 * @generated
		 */
		EClass INTEGER_OPERATOR = eINSTANCE.getIntegerOperator();

		/**
		 * The meta object literal for the '<em><b>Input Size Types Int Op</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTEGER_OPERATOR___INPUT_SIZE_TYPES_INT_OP__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getIntegerOperator__InputSizeTypesIntOp__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.AdditionImpl
		 * @see terms.impl.TermsPackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '<em><b>Output Types Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITION___OUTPUT_TYPES_ADD__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAddition__OutputTypesAdd__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.impl.SubstractionImpl <em>Substraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.SubstractionImpl
		 * @see terms.impl.TermsPackageImpl#getSubstraction()
		 * @generated
		 */
		EClass SUBSTRACTION = eINSTANCE.getSubstraction();

		/**
		 * The meta object literal for the '<em><b>Output Types Substr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSTRACTION___OUTPUT_TYPES_SUBSTR__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getSubstraction__OutputTypesSubstr__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.GreaterThanImpl
		 * @see terms.impl.TermsPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '<em><b>Output Types Great</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GREATER_THAN___OUTPUT_TYPES_GREAT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getGreaterThan__OutputTypesGreat__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.LessThanImpl
		 * @see terms.impl.TermsPackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

		/**
		 * The meta object literal for the '<em><b>Output Types Less</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LESS_THAN___OUTPUT_TYPES_LESS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getLessThan__OutputTypesLess__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.IntegerConstantImpl
		 * @see terms.impl.TermsPackageImpl#getIntegerConstant()
		 * @generated
		 */
		EClass INTEGER_CONSTANT = eINSTANCE.getIntegerConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CONSTANT__VALUE = eINSTANCE.getIntegerConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Input Size Output Types Int Conts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTEGER_CONSTANT___INPUT_SIZE_OUTPUT_TYPES_INT_CONTS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getIntegerConstant__InputSizeOutputTypesIntConts__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.impl.RisingEdgeImpl <em>Rising Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.RisingEdgeImpl
		 * @see terms.impl.TermsPackageImpl#getRisingEdge()
		 * @generated
		 */
		EClass RISING_EDGE = eINSTANCE.getRisingEdge();

		/**
		 * The meta object literal for the '<em><b>Input Size Rising Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RISING_EDGE___INPUT_SIZE_RISING_EDGE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getRisingEdge__InputSizeRisingEdge__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.impl.FallingEdgeImpl <em>Falling Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.impl.FallingEdgeImpl
		 * @see terms.impl.TermsPackageImpl#getFallingEdge()
		 * @generated
		 */
		EClass FALLING_EDGE = eINSTANCE.getFallingEdge();

		/**
		 * The meta object literal for the '<em><b>Input Size Falling Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FALLING_EDGE___INPUT_SIZE_FALLING_EDGE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getFallingEdge__InputSizeFallingEdge__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link terms.VariableDeclarationType <em>Variable Declaration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terms.VariableDeclarationType
		 * @see terms.impl.TermsPackageImpl#getVariableDeclarationType()
		 * @generated
		 */
		EEnum VARIABLE_DECLARATION_TYPE = eINSTANCE.getVariableDeclarationType();

	}

} //TermsPackage
