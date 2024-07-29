/**
 */
package terms.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;
import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import terms.Equality;
import terms.Sort;
import terms.TermsPackage;
import terms.TermsTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EqualityImpl extends OperatorImpl implements Equality {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.EQUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean InputSizeInputOutputTypesEq(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Equality::InputSizeInputOutputTypesEq";
		try {
			/**
			 *
			 * inv InputSizeInputOutputTypesEq:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.input->size() >= 2 and
			 *         self.output.oclIsKindOf(Bool) and
			 *         self.input->forAll(c, d |
			 *           (
			 *             c.oclIsTypeOf(d.oclType()) or
			 *             d.oclIsTypeOf(c.oclType())
			 *           ))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					TermsPackage.Literals.EQUALITY___INPUT_SIZE_INPUT_OUTPUT_TYPES_EQ__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, TermsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_4;
			if (le) {
				symbol_4 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_terms_c_c_Bool_0 = idResolver
							.getClass(TermsTables.CLSSid_Bool, null);
					final /*@NonInvalid*/ List<Sort> input_0 = this.getInput();
					final /*@NonInvalid*/ OrderedSetValue BOXED_input_0 = idResolver
							.createOrderedSetOfAll(TermsTables.ORD_CLSSid_Sort, input_0);
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_input_0);
					final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
							.evaluate(executor, size, TermsTables.INT_2).booleanValue();
					final /*@NonInvalid*/ Boolean and;
					if (!ge) {
						and = ValueUtil.FALSE_VALUE;
					} else {
						final /*@NonInvalid*/ Sort output = this.getOutput();
						final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
								.evaluate(executor, output, TYP_terms_c_c_Bool_0).booleanValue();
						if (!oclIsKindOf) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							and = ValueUtil.TRUE_VALUE;
						}
					}
					final /*@Thrown*/ Boolean result;
					if (and == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							final org.eclipse.ocl.pivot.Class TYPE_forAll_0 = executor.getStaticTypeOfValue(null,
									BOXED_input_0);
							final LibraryIterationExtension IMPL_forAll_0 = (LibraryIterationExtension) TYPE_forAll_0
									.lookupImplementation(standardLibrary,
											OCLstdlibTables.Operations._Collection__0_forAll);
							final /*@NonNull*/ Object ACC_forAll_0 = IMPL_forAll_0.createAccumulatorValue(executor,
									TypeId.BOOLEAN, TypeId.BOOLEAN);
							/**
							 * Implementation of the iterator body.
							 */
							final AbstractSimpleOperation BODY_forAll_0 = new AbstractSimpleOperation() {
								/**
								 * c.oclIsTypeOf(d.oclType()) or d.oclIsTypeOf(c.oclType())
								 */
								@Override
								public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
										final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
									final /*@NonInvalid*/ OrderedSetValue BOXED_input_0 = (OrderedSetValue) sourceAndArgumentValues[0];
									final /*@NonInvalid*/ Object c = sourceAndArgumentValues[1];
									final /*@NonInvalid*/ Object d = sourceAndArgumentValues[2];
									/*@Caught*/ Object CAUGHT_or;
									try {
										/*@Caught*/ Object CAUGHT_oclIsTypeOf;
										try {
											final /*@NonInvalid*/ Sort symbol_0 = (Sort) c;
											final /*@NonInvalid*/ Sort symbol_1 = (Sort) d;
											final /*@Thrown*/ org.eclipse.ocl.pivot.Class oclType = (org.eclipse.ocl.pivot.Class) OclAnyOclTypeOperation.INSTANCE
													.evaluate(executor, symbol_1);
											if (oclType instanceof InvalidValueException) {
												throw (InvalidValueException) oclType;
											}
											final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
													.evaluate(executor, symbol_0, oclType).booleanValue();
											CAUGHT_oclIsTypeOf = oclIsTypeOf;
										} catch (Exception e) {
											CAUGHT_oclIsTypeOf = ValueUtil.createInvalidValue(e);
										}
										final /*@Thrown*/ Boolean or;
										if (CAUGHT_oclIsTypeOf == ValueUtil.TRUE_VALUE) {
											or = ValueUtil.TRUE_VALUE;
										} else {
											/*@Caught*/ Object CAUGHT_oclIsTypeOf_0;
											try {
												final /*@NonInvalid*/ Sort symbol_2 = (Sort) d;
												final /*@NonInvalid*/ Sort symbol_3 = (Sort) c;
												final /*@Thrown*/ org.eclipse.ocl.pivot.Class oclType_0 = (org.eclipse.ocl.pivot.Class) OclAnyOclTypeOperation.INSTANCE
														.evaluate(executor, symbol_3);
												if (oclType_0 instanceof InvalidValueException) {
													throw (InvalidValueException) oclType_0;
												}
												final /*@Thrown*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE
														.evaluate(executor, symbol_2, oclType_0).booleanValue();
												CAUGHT_oclIsTypeOf_0 = oclIsTypeOf_0;
											} catch (Exception e) {
												CAUGHT_oclIsTypeOf_0 = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_oclIsTypeOf_0 == ValueUtil.TRUE_VALUE) {
												or = ValueUtil.TRUE_VALUE;
											} else {
												if (CAUGHT_oclIsTypeOf instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_oclIsTypeOf;
												}
												if (CAUGHT_oclIsTypeOf_0 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_oclIsTypeOf_0;
												}
												or = ValueUtil.FALSE_VALUE;
											}
										}
										CAUGHT_or = or;
									} catch (Exception e) {
										CAUGHT_or = ValueUtil.createInvalidValue(e);
									}
									return CAUGHT_or;
								}
							};
							final ExecutorMultipleIterationManager MGR_forAll_0 = new ExecutorMultipleIterationManager(
									executor, 2, TypeId.BOOLEAN, BODY_forAll_0, BOXED_input_0, ACC_forAll_0);
							final /*@Thrown*/ Boolean forAll = (Boolean) IMPL_forAll_0.evaluateIteration(MGR_forAll_0);
							CAUGHT_forAll = forAll;
						} catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_forAll instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_forAll;
							}
							if ((and == null) || (CAUGHT_forAll == null)) {
								result = null;
							} else {
								result = ValueUtil.TRUE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, TermsTables.INT_0)
						.booleanValue();
				symbol_4 = logDiagnostic;
			}
			return symbol_4;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TermsPackage.EQUALITY___INPUT_SIZE_INPUT_OUTPUT_TYPES_EQ__DIAGNOSTICCHAIN_MAP:
			return InputSizeInputOutputTypesEq((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EqualityImpl
