/**
 */
package de.hsu.grafcet.impl;

import de.hsu.grafcet.Condition;
import de.hsu.grafcet.GrafcetPackage;
import de.hsu.grafcet.GrafcetTables;
import de.hsu.grafcet.TimeCondition;
import de.hsu.grafcet.TimeConditionType;
import de.hsu.grafcet.TimeUnit;
import de.hsu.grafcet.Transition;
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
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
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
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.impl.TransitionImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.TransitionImpl#getDelayTime <em>Delay Time</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.TransitionImpl#getResetTime <em>Reset Time</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.TransitionImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.TransitionImpl#getTimeConditionType <em>Time Condition Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends NodeImpl implements Transition {
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
	 * The default value of the '{@link #getDelayTime() <em>Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayTime()
	 * @generated
	 * @ordered
	 */
	protected static final int DELAY_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDelayTime() <em>Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayTime()
	 * @generated
	 * @ordered
	 */
	protected int delayTime = DELAY_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResetTime() <em>Reset Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetTime()
	 * @generated
	 * @ordered
	 */
	protected static final int RESET_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResetTime() <em>Reset Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetTime()
	 * @generated
	 * @ordered
	 */
	protected int resetTime = RESET_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit UNIT_EDEFAULT = TimeUnit.SECOND;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeConditionType() <em>Time Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConditionType()
	 * @generated
	 * @ordered
	 */
	protected static final TimeConditionType TIME_CONDITION_TYPE_EDEFAULT = TimeConditionType.NONE;

	/**
	 * The cached value of the '{@link #getTimeConditionType() <em>Time Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConditionType()
	 * @generated
	 * @ordered
	 */
	protected TimeConditionType timeConditionType = TIME_CONDITION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.TRANSITION;
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
					GrafcetPackage.TRANSITION__TERM, oldTerm, newTerm);
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
						EOPPOSITE_FEATURE_BASE - GrafcetPackage.TRANSITION__TERM, null, msgs);
			if (newTerm != null)
				msgs = ((InternalEObject) newTerm).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GrafcetPackage.TRANSITION__TERM, null, msgs);
			msgs = basicSetTerm(newTerm, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.TRANSITION__TERM, newTerm, newTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDelayTime() {
		return delayTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelayTime(int newDelayTime) {
		int oldDelayTime = delayTime;
		delayTime = newDelayTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.TRANSITION__DELAY_TIME, oldDelayTime,
					delayTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResetTime() {
		return resetTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetTime(int newResetTime) {
		int oldResetTime = resetTime;
		resetTime = newResetTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.TRANSITION__RESET_TIME, oldResetTime,
					resetTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(TimeUnit newUnit) {
		TimeUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.TRANSITION__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConditionType getTimeConditionType() {
		return timeConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeConditionType(TimeConditionType newTimeConditionType) {
		TimeConditionType oldTimeConditionType = timeConditionType;
		timeConditionType = newTimeConditionType == null ? TIME_CONDITION_TYPE_EDEFAULT : newTimeConditionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.TRANSITION__TIME_CONDITION_TYPE,
					oldTimeConditionType, timeConditionType));
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
		case GrafcetPackage.TRANSITION__TERM:
			return basicSetTerm(null, msgs);
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
		case GrafcetPackage.TRANSITION__TERM:
			return getTerm();
		case GrafcetPackage.TRANSITION__DELAY_TIME:
			return getDelayTime();
		case GrafcetPackage.TRANSITION__RESET_TIME:
			return getResetTime();
		case GrafcetPackage.TRANSITION__UNIT:
			return getUnit();
		case GrafcetPackage.TRANSITION__TIME_CONDITION_TYPE:
			return getTimeConditionType();
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
		case GrafcetPackage.TRANSITION__TERM:
			setTerm((Term) newValue);
			return;
		case GrafcetPackage.TRANSITION__DELAY_TIME:
			setDelayTime((Integer) newValue);
			return;
		case GrafcetPackage.TRANSITION__RESET_TIME:
			setResetTime((Integer) newValue);
			return;
		case GrafcetPackage.TRANSITION__UNIT:
			setUnit((TimeUnit) newValue);
			return;
		case GrafcetPackage.TRANSITION__TIME_CONDITION_TYPE:
			setTimeConditionType((TimeConditionType) newValue);
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
		case GrafcetPackage.TRANSITION__TERM:
			setTerm((Term) null);
			return;
		case GrafcetPackage.TRANSITION__DELAY_TIME:
			setDelayTime(DELAY_TIME_EDEFAULT);
			return;
		case GrafcetPackage.TRANSITION__RESET_TIME:
			setResetTime(RESET_TIME_EDEFAULT);
			return;
		case GrafcetPackage.TRANSITION__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case GrafcetPackage.TRANSITION__TIME_CONDITION_TYPE:
			setTimeConditionType(TIME_CONDITION_TYPE_EDEFAULT);
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
		case GrafcetPackage.TRANSITION__TERM:
			return term != null;
		case GrafcetPackage.TRANSITION__DELAY_TIME:
			return delayTime != DELAY_TIME_EDEFAULT;
		case GrafcetPackage.TRANSITION__RESET_TIME:
			return resetTime != RESET_TIME_EDEFAULT;
		case GrafcetPackage.TRANSITION__UNIT:
			return unit != UNIT_EDEFAULT;
		case GrafcetPackage.TRANSITION__TIME_CONDITION_TYPE:
			return timeConditionType != TIME_CONDITION_TYPE_EDEFAULT;
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
			case GrafcetPackage.TRANSITION__TERM:
				return GrafcetPackage.CONDITION__TERM;
			default:
				return -1;
			}
		}
		if (baseClass == TimeCondition.class) {
			switch (derivedFeatureID) {
			case GrafcetPackage.TRANSITION__DELAY_TIME:
				return GrafcetPackage.TIME_CONDITION__DELAY_TIME;
			case GrafcetPackage.TRANSITION__RESET_TIME:
				return GrafcetPackage.TIME_CONDITION__RESET_TIME;
			case GrafcetPackage.TRANSITION__UNIT:
				return GrafcetPackage.TIME_CONDITION__UNIT;
			case GrafcetPackage.TRANSITION__TIME_CONDITION_TYPE:
				return GrafcetPackage.TIME_CONDITION__TIME_CONDITION_TYPE;
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
				return GrafcetPackage.TRANSITION__TERM;
			default:
				return -1;
			}
		}
		if (baseClass == TimeCondition.class) {
			switch (baseFeatureID) {
			case GrafcetPackage.TIME_CONDITION__DELAY_TIME:
				return GrafcetPackage.TRANSITION__DELAY_TIME;
			case GrafcetPackage.TIME_CONDITION__RESET_TIME:
				return GrafcetPackage.TRANSITION__RESET_TIME;
			case GrafcetPackage.TIME_CONDITION__UNIT:
				return GrafcetPackage.TRANSITION__UNIT;
			case GrafcetPackage.TIME_CONDITION__TIME_CONDITION_TYPE:
				return GrafcetPackage.TRANSITION__TIME_CONDITION_TYPE;
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
				return GrafcetPackage.TRANSITION___CONDITION_TERM_TYPE__DIAGNOSTICCHAIN_MAP;
			case GrafcetPackage.CONDITION___CONDITION_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP:
				return GrafcetPackage.TRANSITION___CONDITION_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP;
			default:
				return -1;
			}
		}
		if (baseClass == TimeCondition.class) {
			switch (baseOperationID) {
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
		case GrafcetPackage.TRANSITION___CONDITION_TERM_TYPE__DIAGNOSTICCHAIN_MAP:
			return ConditionTermType((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case GrafcetPackage.TRANSITION___CONDITION_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (delayTime: ");
		result.append(delayTime);
		result.append(", resetTime: ");
		result.append(resetTime);
		result.append(", unit: ");
		result.append(unit);
		result.append(", timeConditionType: ");
		result.append(timeConditionType);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
