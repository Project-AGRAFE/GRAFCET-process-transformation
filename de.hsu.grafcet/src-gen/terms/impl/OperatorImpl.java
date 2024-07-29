/**
 */
package terms.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionAsSequenceOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;
import terms.Operator;
import terms.Sort;
import terms.Term;
import terms.TermsPackage;
import terms.TermsTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link terms.impl.OperatorImpl#getSubterm <em>Subterm</em>}</li>
 *   <li>{@link terms.impl.OperatorImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link terms.impl.OperatorImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperatorImpl extends TermImpl implements Operator {
	/**
	 * The cached value of the '{@link #getSubterm() <em>Subterm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubterm()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> subterm;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Sort output;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Sort> input;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getSubterm() {
		if (subterm == null) {
			subterm = new EObjectContainmentEList<Term>(Term.class, this, TermsPackage.OPERATOR__SUBTERM);
		}
		return subterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Sort newOutput, NotificationChain msgs) {
		Sort oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TermsPackage.OPERATOR__OUTPUT, oldOutput, newOutput);
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
	public void setOutput(Sort newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject) output).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TermsPackage.OPERATOR__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject) newOutput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TermsPackage.OPERATOR__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.OPERATOR__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sort> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<Sort>(Sort.class, this, TermsPackage.OPERATOR__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OperatorSort(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Operator::OperatorSort";
		try {
			/**
			 *
			 * inv OperatorSort:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.sort = self.output
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					TermsPackage.Literals.OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, TermsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			} else {
				final /*@NonInvalid*/ Sort sort = this.getSort();
				final /*@NonInvalid*/ Sort output = this.getOutput();
				final /*@NonInvalid*/ boolean result = sort.equals(output);
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, TermsTables.INT_0)
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
	public boolean OperatorInputType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Operator::OperatorInputType";
		try {
			/**
			 *
			 * inv OperatorInputType:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.subterm->collect(subterm | subterm.sort) =
			 *         self.input->asSequence()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					TermsPackage.Literals.OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, TermsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			} else {
				final /*@NonInvalid*/ List<Term> subterm = this.getSubterm();
				final /*@NonInvalid*/ OrderedSetValue BOXED_subterm = idResolver
						.createOrderedSetOfAll(TermsTables.ORD_CLSSid_Term, subterm);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createSequenceAccumulatorValue(TermsTables.SEQ_CLSSid_Sort);
				Iterator<Object> ITERATOR_subterm_0 = BOXED_subterm.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR_subterm_0.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ Term subterm_0 = (Term) ITERATOR_subterm_0.next();
					/**
					 * subterm.sort
					 */
					final /*@NonInvalid*/ Sort sort = subterm_0.getSort();
					//
					accumulator.add(sort);
				}
				final /*@NonInvalid*/ List<Sort> input = this.getInput();
				final /*@NonInvalid*/ OrderedSetValue BOXED_input = idResolver
						.createOrderedSetOfAll(TermsTables.ORD_CLSSid_Sort, input);
				final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
						.evaluate(BOXED_input);
				final /*@NonInvalid*/ boolean result = collect.equals(asSequence);
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, TermsTables.INT_0)
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TermsPackage.OPERATOR__SUBTERM:
			return ((InternalEList<?>) getSubterm()).basicRemove(otherEnd, msgs);
		case TermsPackage.OPERATOR__OUTPUT:
			return basicSetOutput(null, msgs);
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
		case TermsPackage.OPERATOR__SUBTERM:
			return getSubterm();
		case TermsPackage.OPERATOR__OUTPUT:
			return getOutput();
		case TermsPackage.OPERATOR__INPUT:
			return getInput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TermsPackage.OPERATOR__SUBTERM:
			getSubterm().clear();
			getSubterm().addAll((Collection<? extends Term>) newValue);
			return;
		case TermsPackage.OPERATOR__OUTPUT:
			setOutput((Sort) newValue);
			return;
		case TermsPackage.OPERATOR__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends Sort>) newValue);
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
		case TermsPackage.OPERATOR__SUBTERM:
			getSubterm().clear();
			return;
		case TermsPackage.OPERATOR__OUTPUT:
			setOutput((Sort) null);
			return;
		case TermsPackage.OPERATOR__INPUT:
			getInput().clear();
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
		case TermsPackage.OPERATOR__SUBTERM:
			return subterm != null && !subterm.isEmpty();
		case TermsPackage.OPERATOR__OUTPUT:
			return output != null;
		case TermsPackage.OPERATOR__INPUT:
			return input != null && !input.isEmpty();
		}
		return super.eIsSet(featureID);
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
		case TermsPackage.OPERATOR___OPERATOR_SORT__DIAGNOSTICCHAIN_MAP:
			return OperatorSort((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case TermsPackage.OPERATOR___OPERATOR_INPUT_TYPE__DIAGNOSTICCHAIN_MAP:
			return OperatorInputType((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OperatorImpl
