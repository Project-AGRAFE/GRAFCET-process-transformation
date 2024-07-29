/**
 */
package terms.impl;

import de.hsu.grafcet.InitializableType;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import terms.Sort;
import terms.TermsPackage;
import terms.TermsTables;
import terms.VariableDeclaration;
import terms.VariableDeclarationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link terms.impl.VariableDeclarationImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link terms.impl.VariableDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link terms.impl.VariableDeclarationImpl#getVariableDeclarationType <em>Variable Declaration Type</em>}</li>
 *   <li>{@link terms.impl.VariableDeclarationImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationImpl extends MinimalEObjectImpl.Container implements VariableDeclaration {
	/**
	 * The cached value of the '{@link #getSort() <em>Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected Sort sort;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableDeclarationType() <em>Variable Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDeclarationType()
	 * @generated
	 * @ordered
	 */
	protected static final VariableDeclarationType VARIABLE_DECLARATION_TYPE_EDEFAULT = VariableDeclarationType.INPUT;

	/**
	 * The cached value of the '{@link #getVariableDeclarationType() <em>Variable Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDeclarationType()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclarationType variableDeclarationType = VARIABLE_DECLARATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected InitializableType step;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.VARIABLE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort getSort() {
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSort(Sort newSort, NotificationChain msgs) {
		Sort oldSort = sort;
		sort = newSort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TermsPackage.VARIABLE_DECLARATION__SORT, oldSort, newSort);
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
	public void setSort(Sort newSort) {
		if (newSort != sort) {
			NotificationChain msgs = null;
			if (sort != null)
				msgs = ((InternalEObject) sort).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TermsPackage.VARIABLE_DECLARATION__SORT, null, msgs);
			if (newSort != null)
				msgs = ((InternalEObject) newSort).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TermsPackage.VARIABLE_DECLARATION__SORT, null, msgs);
			msgs = basicSetSort(newSort, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.VARIABLE_DECLARATION__SORT, newSort,
					newSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.VARIABLE_DECLARATION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationType getVariableDeclarationType() {
		return variableDeclarationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDeclarationType(VariableDeclarationType newVariableDeclarationType) {
		VariableDeclarationType oldVariableDeclarationType = variableDeclarationType;
		variableDeclarationType = newVariableDeclarationType == null ? VARIABLE_DECLARATION_TYPE_EDEFAULT
				: newVariableDeclarationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TermsPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATION_TYPE, oldVariableDeclarationType,
					variableDeclarationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializableType getStep() {
		if (step != null && step.eIsProxy()) {
			InternalEObject oldStep = (InternalEObject) step;
			step = (InitializableType) eResolveProxy(oldStep);
			if (step != oldStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TermsPackage.VARIABLE_DECLARATION__STEP,
							oldStep, step));
			}
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializableType basicGetStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(InitializableType newStep) {
		InitializableType oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.VARIABLE_DECLARATION__STEP, oldStep,
					step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean StepVarDeclSetStep(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "VariableDeclaration::StepVarDeclSetStep";
		try {
			/**
			 *
			 * inv StepVarDeclSetStep:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.variableDeclarationType = VariableDeclarationType::step implies step <> null and
			 *         self.sort.oclIsKindOf(Bool)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					TermsPackage.Literals.VARIABLE_DECLARATION___STEP_VAR_DECL_SET_STEP__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, TermsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_terms_c_c_Bool = idResolver
							.getClass(TermsTables.CLSSid_Bool, null);
					final /*@NonInvalid*/ VariableDeclarationType variableDeclarationType = this
							.getVariableDeclarationType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_variableDeclarationType = variableDeclarationType == null
							? null
							: TermsTables.ENUMid_VariableDeclarationType
									.getEnumerationLiteralId(ClassUtil.nonNullState(variableDeclarationType.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_variableDeclarationType == TermsTables.ELITid_step;
					final /*@Thrown*/ Boolean result;
					if (!eq) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ InitializableType step = this.getStep();
						final /*@NonInvalid*/ boolean ne = step != null;
						final /*@NonInvalid*/ Boolean and;
						if (!ne) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ Sort sort = this.getSort();
							final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
									.evaluate(executor, sort, TYP_terms_c_c_Bool).booleanValue();
							if (!oclIsKindOf) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						if (and == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (and == null) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
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
		case TermsPackage.VARIABLE_DECLARATION__SORT:
			return basicSetSort(null, msgs);
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
		case TermsPackage.VARIABLE_DECLARATION__SORT:
			return getSort();
		case TermsPackage.VARIABLE_DECLARATION__NAME:
			return getName();
		case TermsPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATION_TYPE:
			return getVariableDeclarationType();
		case TermsPackage.VARIABLE_DECLARATION__STEP:
			if (resolve)
				return getStep();
			return basicGetStep();
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
		case TermsPackage.VARIABLE_DECLARATION__SORT:
			setSort((Sort) newValue);
			return;
		case TermsPackage.VARIABLE_DECLARATION__NAME:
			setName((String) newValue);
			return;
		case TermsPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATION_TYPE:
			setVariableDeclarationType((VariableDeclarationType) newValue);
			return;
		case TermsPackage.VARIABLE_DECLARATION__STEP:
			setStep((InitializableType) newValue);
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
		case TermsPackage.VARIABLE_DECLARATION__SORT:
			setSort((Sort) null);
			return;
		case TermsPackage.VARIABLE_DECLARATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TermsPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATION_TYPE:
			setVariableDeclarationType(VARIABLE_DECLARATION_TYPE_EDEFAULT);
			return;
		case TermsPackage.VARIABLE_DECLARATION__STEP:
			setStep((InitializableType) null);
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
		case TermsPackage.VARIABLE_DECLARATION__SORT:
			return sort != null;
		case TermsPackage.VARIABLE_DECLARATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TermsPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATION_TYPE:
			return variableDeclarationType != VARIABLE_DECLARATION_TYPE_EDEFAULT;
		case TermsPackage.VARIABLE_DECLARATION__STEP:
			return step != null;
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
		case TermsPackage.VARIABLE_DECLARATION___STEP_VAR_DECL_SET_STEP__DIAGNOSTICCHAIN_MAP:
			return StepVarDeclSetStep((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", variableDeclarationType: ");
		result.append(variableDeclarationType);
		result.append(')');
		return result.toString();
	}

} //VariableDeclarationImpl
