/**
 */
package de.hsu.grafcet.util;

import de.hsu.grafcet.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hsu.grafcet.GrafcetPackage
 * @generated
 */
public class GrafcetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GrafcetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GrafcetPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrafcetSwitch<Adapter> modelSwitch = new GrafcetSwitch<Adapter>() {
		@Override
		public Adapter caseGrafcet(Grafcet object) {
			return createGrafcetAdapter();
		}

		@Override
		public Adapter caseVariableDeclarationContainer(VariableDeclarationContainer object) {
			return createVariableDeclarationContainerAdapter();
		}

		@Override
		public Adapter casePartialGrafcet(PartialGrafcet object) {
			return createPartialGrafcetAdapter();
		}

		@Override
		public Adapter caseMacrostepExpansion(MacrostepExpansion object) {
			return createMacrostepExpansionAdapter();
		}

		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseInitializableType(InitializableType object) {
			return createInitializableTypeAdapter();
		}

		@Override
		public Adapter caseEnclosingStep(EnclosingStep object) {
			return createEnclosingStepAdapter();
		}

		@Override
		public Adapter caseStep(Step object) {
			return createStepAdapter();
		}

		@Override
		public Adapter caseTransition(Transition object) {
			return createTransitionAdapter();
		}

		@Override
		public Adapter caseSynchronization(Synchronization object) {
			return createSynchronizationAdapter();
		}

		@Override
		public Adapter caseMacrostep(Macrostep object) {
			return createMacrostepAdapter();
		}

		@Override
		public Adapter caseEntryStep(EntryStep object) {
			return createEntryStepAdapter();
		}

		@Override
		public Adapter caseExitStep(ExitStep object) {
			return createExitStepAdapter();
		}

		@Override
		public Adapter caseArc(Arc object) {
			return createArcAdapter();
		}

		@Override
		public Adapter caseActionType(ActionType object) {
			return createActionTypeAdapter();
		}

		@Override
		public Adapter caseForcingOrder(ForcingOrder object) {
			return createForcingOrderAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseStoredAction(StoredAction object) {
			return createStoredActionAdapter();
		}

		@Override
		public Adapter caseContinuousAction(ContinuousAction object) {
			return createContinuousActionAdapter();
		}

		@Override
		public Adapter caseActionLink(ActionLink object) {
			return createActionLinkAdapter();
		}

		@Override
		public Adapter caseTimeCondition(TimeCondition object) {
			return createTimeConditionAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseProcessGrafcet(ProcessGrafcet object) {
			return createProcessGrafcetAdapter();
		}

		@Override
		public Adapter caseControlGrafcet(ControlGrafcet object) {
			return createControlGrafcetAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.Grafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.Grafcet
	 * @generated
	 */
	public Adapter createGrafcetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.VariableDeclarationContainer <em>Variable Declaration Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.VariableDeclarationContainer
	 * @generated
	 */
	public Adapter createVariableDeclarationContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.PartialGrafcet <em>Partial Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.PartialGrafcet
	 * @generated
	 */
	public Adapter createPartialGrafcetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.MacrostepExpansion <em>Macrostep Expansion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.MacrostepExpansion
	 * @generated
	 */
	public Adapter createMacrostepExpansionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.InitializableType <em>Initializable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.InitializableType
	 * @generated
	 */
	public Adapter createInitializableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.EnclosingStep <em>Enclosing Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.EnclosingStep
	 * @generated
	 */
	public Adapter createEnclosingStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.Synchronization
	 * @generated
	 */
	public Adapter createSynchronizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.Macrostep <em>Macrostep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.Macrostep
	 * @generated
	 */
	public Adapter createMacrostepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.EntryStep <em>Entry Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.EntryStep
	 * @generated
	 */
	public Adapter createEntryStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.ExitStep <em>Exit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.ExitStep
	 * @generated
	 */
	public Adapter createExitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.Arc
	 * @generated
	 */
	public Adapter createArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.ActionType
	 * @generated
	 */
	public Adapter createActionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.ForcingOrder <em>Forcing Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.ForcingOrder
	 * @generated
	 */
	public Adapter createForcingOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.StoredAction <em>Stored Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.StoredAction
	 * @generated
	 */
	public Adapter createStoredActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.ContinuousAction <em>Continuous Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.ContinuousAction
	 * @generated
	 */
	public Adapter createContinuousActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.ActionLink <em>Action Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.ActionLink
	 * @generated
	 */
	public Adapter createActionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.TimeCondition <em>Time Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.TimeCondition
	 * @generated
	 */
	public Adapter createTimeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.ProcessGrafcet <em>Process Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.ProcessGrafcet
	 * @generated
	 */
	public Adapter createProcessGrafcetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hsu.grafcet.ControlGrafcet <em>Control Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hsu.grafcet.ControlGrafcet
	 * @generated
	 */
	public Adapter createControlGrafcetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GrafcetAdapterFactory
