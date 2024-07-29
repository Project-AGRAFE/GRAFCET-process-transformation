/**
 */
package de.hsu.grafcet.impl;

import de.hsu.grafcet.Condition;
import de.hsu.grafcet.GrafcetPackage;
import de.hsu.grafcet.GrafcetTables;
import de.hsu.grafcet.StoredAction;
import de.hsu.grafcet.StoredActionType;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager;
import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;
import org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.BagValue.Accumulator;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;
import terms.Operator;
import terms.Sort;
import terms.Term;
import terms.Variable;
import terms.VariableDeclaration;
import terms.VariableDeclarationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stored Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.impl.StoredActionImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.StoredActionImpl#getStoredActionType <em>Stored Action Type</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.StoredActionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoredActionImpl extends ActionImpl implements StoredAction {
	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected Term term;

	/**
	 * The default value of the '{@link #getStoredActionType() <em>Stored Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredActionType()
	 * @generated
	 * @ordered
	 */
	protected static final StoredActionType STORED_ACTION_TYPE_EDEFAULT = StoredActionType.ACTIVATION;

	/**
	 * The cached value of the '{@link #getStoredActionType() <em>Stored Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredActionType()
	 * @generated
	 * @ordered
	 */
	protected StoredActionType storedActionType = STORED_ACTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Term value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoredActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.STORED_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerm(Term newTerm, NotificationChain msgs) {
		Term oldTerm = term;
		term = newTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GrafcetPackage.STORED_ACTION__TERM, oldTerm, newTerm);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(Term newTerm) {
		if (newTerm != term) {
			NotificationChain msgs = null;
			if (term != null)
				msgs = ((InternalEObject) term).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GrafcetPackage.STORED_ACTION__TERM, null, msgs);
			if (newTerm != null)
				msgs = ((InternalEObject) newTerm).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GrafcetPackage.STORED_ACTION__TERM, null, msgs);
			msgs = basicSetTerm(newTerm, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.STORED_ACTION__TERM, newTerm,
					newTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoredActionType getStoredActionType() {
		return storedActionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoredActionType(StoredActionType newStoredActionType) {
		StoredActionType oldStoredActionType = storedActionType;
		storedActionType = newStoredActionType == null ? STORED_ACTION_TYPE_EDEFAULT : newStoredActionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.STORED_ACTION__STORED_ACTION_TYPE,
					oldStoredActionType, storedActionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Term newValue, NotificationChain msgs) {
		Term oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GrafcetPackage.STORED_ACTION__VALUE, oldValue, newValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Term newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GrafcetPackage.STORED_ACTION__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GrafcetPackage.STORED_ACTION__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.STORED_ACTION__VALUE, newValue,
					newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean StoredActionCondType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "StoredAction::StoredActionCondType";
		try {
			/**
			 *
			 * inv StoredActionCondType:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.storedActionType = StoredActionType::event implies
			 *         if self.term.oclIsTypeOf(terms::Variable)
			 *         then false
			 *         else
			 *           self.term.oclAsType(terms::Operator)
			 *           ->closure(term |
			 *             term->selectByKind(terms::Operator).subterm)
			 *           ->select(operator |
			 *             operator.oclIsTypeOf(terms::RisingEdge))
			 *           ->size() +
			 *           self.term.oclAsType(terms::Operator)
			 *           ->closure(term |
			 *             term->selectByKind(terms::Operator).subterm)
			 *           ->select(operator |
			 *             operator.oclIsTypeOf(terms::FallingEdge))
			 *           ->size() > 0
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GrafcetPackage.Literals.STORED_ACTION___STORED_ACTION_COND_TYPE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GrafcetTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_3;
			if (le) {
				symbol_3 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ StoredActionType storedActionType = this.getStoredActionType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_storedActionType = GrafcetTables.ENUMid_StoredActionType
							.getEnumerationLiteralId(ClassUtil.nonNullState(storedActionType.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_storedActionType == GrafcetTables.ELITid_event;
					final /*@Thrown*/ Boolean result;
					if (!eq) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_symbol_2;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_terms_c_c_Variable = idResolver
									.getClass(GrafcetTables.CLSSid_Variable, null);
							final /*@NonInvalid*/ Term term = this.getTerm();
							final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
									.evaluate(executor, term, TYP_terms_c_c_Variable).booleanValue();
							/*@Thrown*/ boolean symbol_2;
							if (oclIsTypeOf) {
								symbol_2 = false;
							} else {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_terms_c_c_Operator_2 = idResolver
										.getClass(GrafcetTables.CLSSid_Operator, null);
								final /*@Thrown*/ Operator oclAsType_0 = (Operator) OclAnyOclAsTypeOperation.INSTANCE
										.evaluate(executor, term, TYP_terms_c_c_Operator_2);
								final /*@Thrown*/ SetValue oclAsSet_1 = OclAnyOclAsSetOperation.INSTANCE
										.evaluate(executor, GrafcetTables.SET_CLSSid_Operator, oclAsType_0);
								final org.eclipse.ocl.pivot.Class TYPE_closure_0_0 = executor.getStaticTypeOfValue(null,
										oclAsSet_1);
								final LibraryIterationExtension IMPL_closure_0_0 = (LibraryIterationExtension) TYPE_closure_0_0
										.lookupImplementation(standardLibrary,
												OCLstdlibTables.Operations._Set__closure);
								final /*@NonNull*/ Object ACC_closure_0_0 = IMPL_closure_0_0.createAccumulatorValue(
										executor, GrafcetTables.SET_CLSSid_Term, GrafcetTables.BAG_CLSSid_Term);
								/**
								 * Implementation of the iterator body.
								 */
								final AbstractBinaryOperation BODY_closure_0_0 = new AbstractBinaryOperation() {
									/**
									 * term->selectByKind(terms::Operator).subterm
									 */
									@Override
									public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
											final /*@Nullable*/ Object oclAsSet_1,
											final /*@NonInvalid*/ Object term_3) {
										final /*@NonInvalid*/ Term symbol_1 = (Term) term_3;
										final /*@Thrown*/ SetValue oclAsSet_2 = OclAnyOclAsSetOperation.INSTANCE
												.evaluate(executor, GrafcetTables.SET_CLSSid_Term, symbol_1);
										final /*@Thrown*/ SetValue selectByKind_0 = (SetValue) CollectionSelectByKindOperation.INSTANCE
												.evaluate(executor, oclAsSet_2, TYP_terms_c_c_Operator_2);
										/*@Thrown*/ Accumulator accumulator = ValueUtil
												.createBagAccumulatorValue(GrafcetTables.BAG_CLSSid_Term);
										Iterator<Object> ITERATOR__1_0 = selectByKind_0.iterator();
										/*@Thrown*/ BagValue collect_0;
										while (true) {
											if (!ITERATOR__1_0.hasNext()) {
												collect_0 = accumulator;
												break;
											}
											/*@NonInvalid*/ Operator _1_0 = (Operator) ITERATOR__1_0.next();
											/**
											 * subterm
											 */
											final /*@NonInvalid*/ List<Term> subterm_0 = _1_0.getSubterm();
											final /*@NonInvalid*/ OrderedSetValue BOXED_subterm_0 = idResolver
													.createOrderedSetOfAll(GrafcetTables.ORD_CLSSid_Term, subterm_0);
											//
											for (Object value : BOXED_subterm_0.flatten().getElements()) {
												accumulator.add(value);
											}
										}
										return collect_0;
									}
								};
								final ExecutorSingleIterationManager MGR_closure_0_0 = new ExecutorSingleIterationManager(
										executor, GrafcetTables.SET_CLSSid_Term, BODY_closure_0_0, oclAsSet_1,
										ACC_closure_0_0);
								final /*@Thrown*/ SetValue closure_0 = (SetValue) IMPL_closure_0_0
										.evaluateIteration(MGR_closure_0_0);
								/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_0 = ValueUtil
										.createSetAccumulatorValue(GrafcetTables.SET_CLSSid_Term);
								Iterator<Object> ITERATOR_operator = closure_0.iterator();
								/*@Thrown*/ SetValue select;
								while (true) {
									if (!ITERATOR_operator.hasNext()) {
										select = accumulator_0;
										break;
									}
									/*@NonInvalid*/ Term operator = (Term) ITERATOR_operator.next();
									/**
									 * operator.oclIsTypeOf(terms::RisingEdge)
									 */
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_terms_c_c_RisingEdge = idResolver
											.getClass(GrafcetTables.CLSSid_RisingEdge, null);
									final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE
											.evaluate(executor, operator, TYP_terms_c_c_RisingEdge).booleanValue();
									//
									if (oclIsTypeOf_0) {
										accumulator_0.add(operator);
									}
								}
								final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
								/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_1 = ValueUtil
										.createSetAccumulatorValue(GrafcetTables.SET_CLSSid_Term);
								Iterator<Object> ITERATOR_operator_0 = closure_0.iterator();
								/*@Thrown*/ SetValue select_0;
								while (true) {
									if (!ITERATOR_operator_0.hasNext()) {
										select_0 = accumulator_1;
										break;
									}
									/*@NonInvalid*/ Term operator_0 = (Term) ITERATOR_operator_0.next();
									/**
									 * operator.oclIsTypeOf(terms::FallingEdge)
									 */
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_terms_c_c_FallingEdge = idResolver
											.getClass(GrafcetTables.CLSSid_FallingEdge, null);
									final /*@NonInvalid*/ boolean oclIsTypeOf_1 = OclAnyOclIsTypeOfOperation.INSTANCE
											.evaluate(executor, operator_0, TYP_terms_c_c_FallingEdge).booleanValue();
									//
									if (oclIsTypeOf_1) {
										accumulator_1.add(operator_0);
									}
								}
								final /*@Thrown*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
										.evaluate(select_0);
								if (size_0 instanceof InvalidValueException) {
									throw (InvalidValueException) size_0;
								}
								final /*@Thrown*/ IntegerValue sum = (IntegerValue) NumericPlusOperation.INSTANCE
										.evaluate(size, size_0);
								final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
										.evaluate(executor, sum, GrafcetTables.INT_0).booleanValue();
								symbol_2 = gt;
							}
							CAUGHT_symbol_2 = symbol_2;
						} catch (Exception e) {
							CAUGHT_symbol_2 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_symbol_2 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_symbol_2 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_symbol_2;
							}
							result = ValueUtil.FALSE_VALUE;
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GrafcetTables.INT_0)
						.booleanValue();
				symbol_3 = logDiagnostic;
			}
			return symbol_3;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean StoredActionVarType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "StoredAction::StoredActionVarType";
		try {
			/**
			 *
			 * inv StoredActionVarType:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.variable.variableDeclaration.sort.oclType() =
			 *         self.value.sort.oclType()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GrafcetPackage.Literals.STORED_ACTION___STORED_ACTION_VAR_TYPE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GrafcetTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			} else {
				final /*@NonInvalid*/ Variable variable = this.getVariable();
				final /*@NonInvalid*/ VariableDeclaration variableDeclaration = variable.getVariableDeclaration();
				final /*@NonInvalid*/ Sort sort = variableDeclaration.getSort();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class oclType = (org.eclipse.ocl.pivot.Class) OclAnyOclTypeOperation.INSTANCE
						.evaluate(executor, sort);
				final /*@NonInvalid*/ Term value = this.getValue();
				final /*@NonInvalid*/ Sort sort_0 = value.getSort();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class oclType_0 = (org.eclipse.ocl.pivot.Class) OclAnyOclTypeOperation.INSTANCE
						.evaluate(executor, sort_0);
				final /*@NonInvalid*/ boolean result = oclType.getTypeId() == oclType_0.getTypeId();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, GrafcetTables.INT_0)
						.booleanValue();
				symbol_0 = logDiagnostic;
			}
			return symbol_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ConditionTermType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Condition::ConditionTermType";
		try {
			/**
			 *
			 * inv ConditionTermType:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.term <> null implies
			 *         self.term.sort.oclIsTypeOf(terms::Bool)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GrafcetPackage.Literals.CONDITION___CONDITION_TERM_TYPE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GrafcetTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Term term = this.getTerm();
					final /*@NonInvalid*/ boolean ne = term != null;
					final /*@Thrown*/ Boolean result;
					if (!ne) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_oclIsTypeOf;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_terms_c_c_Bool_0 = idResolver
									.getClass(GrafcetTables.CLSSid_Bool, null);
							if (term == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://www.example.org/terms\'::Term::sort\'");
							}
							final /*@Thrown*/ Sort sort = term.getSort();
							final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
									.evaluate(executor, sort, TYP_terms_c_c_Bool_0).booleanValue();
							CAUGHT_oclIsTypeOf = oclIsTypeOf;
						} catch (Exception e) {
							CAUGHT_oclIsTypeOf = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_oclIsTypeOf == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_oclIsTypeOf instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_oclIsTypeOf;
							}
							result = ValueUtil.FALSE_VALUE;
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GrafcetTables.INT_0)
						.booleanValue();
				symbol_0 = logDiagnostic;
			}
			return symbol_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ConditionVariableType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Condition::ConditionVariableType";
		try {
			/**
			 *
			 * inv ConditionVariableType:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.term <> null implies
			 *         if self.term.oclIsTypeOf(terms::Variable)
			 *         then
			 *           self.term.oclAsType(terms::Variable).variableDeclaration.variableDeclarationType <> terms::VariableDeclarationType::output
			 *         else
			 *           self.term.oclAsType(terms::Operator)
			 *           ->closure(term |
			 *             term->selectByKind(terms::Operator).subterm)
			 *           ->selectByKind(terms::Variable)
			 *           ->select(var | var.variableDeclaration.variableDeclarationType = terms::VariableDeclarationType::output)
			 *           ->size() = 0
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GrafcetPackage.Literals.CONDITION___CONDITION_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GrafcetTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_2;
			if (le) {
				symbol_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Term term = this.getTerm();
					final /*@NonInvalid*/ boolean ne = term != null;
					final /*@Thrown*/ Boolean result;
					if (!ne) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_symbol_1;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_terms_c_c_Variable_0 = idResolver
									.getClass(GrafcetTables.CLSSid_Variable, null);
							final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
									.evaluate(executor, term, TYP_terms_c_c_Variable_0).booleanValue();
							/*@Thrown*/ boolean symbol_1;
							if (oclIsTypeOf) {
								final /*@Thrown*/ Variable oclAsType = (Variable) OclAnyOclAsTypeOperation.INSTANCE
										.evaluate(executor, term, TYP_terms_c_c_Variable_0);
								final /*@Thrown*/ VariableDeclaration variableDeclaration = oclAsType
										.getVariableDeclaration();
								final /*@Thrown*/ VariableDeclarationType variableDeclarationType = variableDeclaration
										.getVariableDeclarationType();
								final /*@Thrown*/ EnumerationLiteralId BOXED_variableDeclarationType = variableDeclarationType == null
										? null
										: GrafcetTables.ENUMid_VariableDeclarationType.getEnumerationLiteralId(
												ClassUtil.nonNullState(variableDeclarationType.getName()));
								final /*@Thrown*/ boolean ne_0 = BOXED_variableDeclarationType != GrafcetTables.ELITid_output;
								symbol_1 = ne_0;
							} else {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_terms_c_c_Operator_1 = idResolver
										.getClass(GrafcetTables.CLSSid_Operator, null);
								final /*@Thrown*/ Operator oclAsType_0 = (Operator) OclAnyOclAsTypeOperation.INSTANCE
										.evaluate(executor, term, TYP_terms_c_c_Operator_1);
								final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE
										.evaluate(executor, GrafcetTables.SET_CLSSid_Operator, oclAsType_0);
								final org.eclipse.ocl.pivot.Class TYPE_closure_0 = executor.getStaticTypeOfValue(null,
										oclAsSet);
								final LibraryIterationExtension IMPL_closure_0 = (LibraryIterationExtension) TYPE_closure_0
										.lookupImplementation(standardLibrary,
												OCLstdlibTables.Operations._Set__closure);
								final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(
										executor, GrafcetTables.SET_CLSSid_Term, GrafcetTables.BAG_CLSSid_Term);
								/**
								 * Implementation of the iterator body.
								 */
								final AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation() {
									/**
									 * term->selectByKind(terms::Operator).subterm
									 */
									@Override
									public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
											final /*@Nullable*/ Object oclAsSet, final /*@NonInvalid*/ Object term_3) {
										final /*@NonInvalid*/ Term symbol_0 = (Term) term_3;
										final /*@Thrown*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE
												.evaluate(executor, GrafcetTables.SET_CLSSid_Term, symbol_0);
										final /*@Thrown*/ SetValue selectByKind = (SetValue) CollectionSelectByKindOperation.INSTANCE
												.evaluate(executor, oclAsSet_0, TYP_terms_c_c_Operator_1);
										/*@Thrown*/ Accumulator accumulator = ValueUtil
												.createBagAccumulatorValue(GrafcetTables.BAG_CLSSid_Term);
										Iterator<Object> ITERATOR__1 = selectByKind.iterator();
										/*@Thrown*/ BagValue collect;
										while (true) {
											if (!ITERATOR__1.hasNext()) {
												collect = accumulator;
												break;
											}
											/*@NonInvalid*/ Operator _1 = (Operator) ITERATOR__1.next();
											/**
											 * subterm
											 */
											final /*@NonInvalid*/ List<Term> subterm = _1.getSubterm();
											final /*@NonInvalid*/ OrderedSetValue BOXED_subterm = idResolver
													.createOrderedSetOfAll(GrafcetTables.ORD_CLSSid_Term, subterm);
											//
											for (Object value : BOXED_subterm.flatten().getElements()) {
												accumulator.add(value);
											}
										}
										return collect;
									}
								};
								final ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(
										executor, GrafcetTables.SET_CLSSid_Term, BODY_closure_0, oclAsSet,
										ACC_closure_0);
								final /*@Thrown*/ SetValue closure = (SetValue) IMPL_closure_0
										.evaluateIteration(MGR_closure_0);
								final /*@Thrown*/ SetValue selectByKind_0 = (SetValue) CollectionSelectByKindOperation.INSTANCE
										.evaluate(executor, closure, TYP_terms_c_c_Variable_0);
								/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_0 = ValueUtil
										.createSetAccumulatorValue(GrafcetTables.SET_CLSSid_Variable);
								Iterator<Object> ITERATOR_var = selectByKind_0.iterator();
								/*@Thrown*/ SetValue select;
								while (true) {
									if (!ITERATOR_var.hasNext()) {
										select = accumulator_0;
										break;
									}
									/*@NonInvalid*/ Variable var = (Variable) ITERATOR_var.next();
									/**
									 * var.variableDeclaration.variableDeclarationType = terms::VariableDeclarationType::output
									 */
									final /*@NonInvalid*/ VariableDeclaration variableDeclaration_0 = var
											.getVariableDeclaration();
									final /*@NonInvalid*/ VariableDeclarationType variableDeclarationType_0 = variableDeclaration_0
											.getVariableDeclarationType();
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_variableDeclarationType_0 = variableDeclarationType_0 == null
											? null
											: GrafcetTables.ENUMid_VariableDeclarationType.getEnumerationLiteralId(
													ClassUtil.nonNullState(variableDeclarationType_0.getName()));
									final /*@NonInvalid*/ boolean eq = BOXED_variableDeclarationType_0 == GrafcetTables.ELITid_output;
									//
									if (eq) {
										accumulator_0.add(var);
									}
								}
								final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
								final /*@Thrown*/ boolean eq_0 = size.equals(GrafcetTables.INT_0);
								symbol_1 = eq_0;
							}
							CAUGHT_symbol_1 = symbol_1;
						} catch (Exception e) {
							CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_symbol_1 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_symbol_1 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_symbol_1;
							}
							result = ValueUtil.FALSE_VALUE;
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GrafcetTables.INT_0)
						.booleanValue();
				symbol_2 = logDiagnostic;
			}
			return symbol_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GrafcetPackage.STORED_ACTION__TERM:
			return basicSetTerm(null, msgs);
		case GrafcetPackage.STORED_ACTION__VALUE:
			return basicSetValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GrafcetPackage.STORED_ACTION__TERM:
			return getTerm();
		case GrafcetPackage.STORED_ACTION__STORED_ACTION_TYPE:
			return getStoredActionType();
		case GrafcetPackage.STORED_ACTION__VALUE:
			return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GrafcetPackage.STORED_ACTION__TERM:
			setTerm((Term) newValue);
			return;
		case GrafcetPackage.STORED_ACTION__STORED_ACTION_TYPE:
			setStoredActionType((StoredActionType) newValue);
			return;
		case GrafcetPackage.STORED_ACTION__VALUE:
			setValue((Term) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GrafcetPackage.STORED_ACTION__TERM:
			setTerm((Term) null);
			return;
		case GrafcetPackage.STORED_ACTION__STORED_ACTION_TYPE:
			setStoredActionType(STORED_ACTION_TYPE_EDEFAULT);
			return;
		case GrafcetPackage.STORED_ACTION__VALUE:
			setValue((Term) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GrafcetPackage.STORED_ACTION__TERM:
			return term != null;
		case GrafcetPackage.STORED_ACTION__STORED_ACTION_TYPE:
			return storedActionType != STORED_ACTION_TYPE_EDEFAULT;
		case GrafcetPackage.STORED_ACTION__VALUE:
			return value != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Condition.class) {
			switch (derivedFeatureID) {
			case GrafcetPackage.STORED_ACTION__TERM:
				return GrafcetPackage.CONDITION__TERM;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Condition.class) {
			switch (baseFeatureID) {
			case GrafcetPackage.CONDITION__TERM:
				return GrafcetPackage.STORED_ACTION__TERM;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Condition.class) {
			switch (baseOperationID) {
			case GrafcetPackage.CONDITION___CONDITION_TERM_TYPE__DIAGNOSTICCHAIN_MAP:
				return GrafcetPackage.STORED_ACTION___CONDITION_TERM_TYPE__DIAGNOSTICCHAIN_MAP;
			case GrafcetPackage.CONDITION___CONDITION_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP:
				return GrafcetPackage.STORED_ACTION___CONDITION_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GrafcetPackage.STORED_ACTION___STORED_ACTION_COND_TYPE__DIAGNOSTICCHAIN_MAP:
			return StoredActionCondType((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case GrafcetPackage.STORED_ACTION___STORED_ACTION_VAR_TYPE__DIAGNOSTICCHAIN_MAP:
			return StoredActionVarType((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case GrafcetPackage.STORED_ACTION___CONDITION_TERM_TYPE__DIAGNOSTICCHAIN_MAP:
			return ConditionTermType((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case GrafcetPackage.STORED_ACTION___CONDITION_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP:
			return ConditionVariableType((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (storedActionType: ");
		result.append(storedActionType);
		result.append(')');
		return result.toString();
	}

} //StoredActionImpl
