/**
 */
package de.hsu.grafcet.provider;

import de.hsu.grafcet.Grafcet;
import de.hsu.grafcet.GrafcetFactory;
import de.hsu.grafcet.GrafcetPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.hsu.grafcet.Grafcet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GrafcetItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addControlGrafcetPropertyDescriptor(object);
			addProcessGrafcetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Grafcet_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Grafcet_name_feature", "_UI_Grafcet_type"),
						GrafcetPackage.Literals.GRAFCET__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Control Grafcet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlGrafcetPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Grafcet_controlGrafcet_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Grafcet_controlGrafcet_feature",
								"_UI_Grafcet_type"),
						GrafcetPackage.Literals.GRAFCET__CONTROL_GRAFCET, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Process Grafcet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessGrafcetPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Grafcet_processGrafcet_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Grafcet_processGrafcet_feature",
								"_UI_Grafcet_type"),
						GrafcetPackage.Literals.GRAFCET__PROCESS_GRAFCET, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GrafcetPackage.Literals.GRAFCET__VARIABLE_DECLARATION_CONTAINER);
			childrenFeatures.add(GrafcetPackage.Literals.GRAFCET__PARTIAL_GRAFCETS);
			childrenFeatures.add(GrafcetPackage.Literals.GRAFCET__STEPS);
			childrenFeatures.add(GrafcetPackage.Literals.GRAFCET__TRANSITIONS);
			childrenFeatures.add(GrafcetPackage.Literals.GRAFCET__SYNCHRONIZATIONS);
			childrenFeatures.add(GrafcetPackage.Literals.GRAFCET__MACROSTEPS);
			childrenFeatures.add(GrafcetPackage.Literals.GRAFCET__ARCS);
			childrenFeatures.add(GrafcetPackage.Literals.GRAFCET__ACTION_TYPES);
			childrenFeatures.add(GrafcetPackage.Literals.GRAFCET__ACTION_LINKS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Grafcet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Grafcet"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Grafcet) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Grafcet_type")
				: getString("_UI_Grafcet_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Grafcet.class)) {
		case GrafcetPackage.GRAFCET__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case GrafcetPackage.GRAFCET__VARIABLE_DECLARATION_CONTAINER:
		case GrafcetPackage.GRAFCET__PARTIAL_GRAFCETS:
		case GrafcetPackage.GRAFCET__STEPS:
		case GrafcetPackage.GRAFCET__TRANSITIONS:
		case GrafcetPackage.GRAFCET__SYNCHRONIZATIONS:
		case GrafcetPackage.GRAFCET__MACROSTEPS:
		case GrafcetPackage.GRAFCET__ARCS:
		case GrafcetPackage.GRAFCET__ACTION_TYPES:
		case GrafcetPackage.GRAFCET__ACTION_LINKS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__VARIABLE_DECLARATION_CONTAINER,
				GrafcetFactory.eINSTANCE.createVariableDeclarationContainer()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__PARTIAL_GRAFCETS,
				GrafcetFactory.eINSTANCE.createGrafcet()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__PARTIAL_GRAFCETS,
				GrafcetFactory.eINSTANCE.createPartialGrafcet()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__PARTIAL_GRAFCETS,
				GrafcetFactory.eINSTANCE.createMacrostepExpansion()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__PARTIAL_GRAFCETS,
				GrafcetFactory.eINSTANCE.createProcessGrafcet()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__PARTIAL_GRAFCETS,
				GrafcetFactory.eINSTANCE.createControlGrafcet()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__STEPS,
				GrafcetFactory.eINSTANCE.createInitializableType()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__STEPS,
				GrafcetFactory.eINSTANCE.createEnclosingStep()));

		newChildDescriptors.add(
				createChildParameter(GrafcetPackage.Literals.GRAFCET__STEPS, GrafcetFactory.eINSTANCE.createStep()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__TRANSITIONS,
				GrafcetFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__SYNCHRONIZATIONS,
				GrafcetFactory.eINSTANCE.createSynchronization()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__MACROSTEPS,
				GrafcetFactory.eINSTANCE.createMacrostep()));

		newChildDescriptors
				.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__ARCS, GrafcetFactory.eINSTANCE.createArc()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__ACTION_TYPES,
				GrafcetFactory.eINSTANCE.createActionType()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__ACTION_TYPES,
				GrafcetFactory.eINSTANCE.createForcingOrder()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__ACTION_TYPES,
				GrafcetFactory.eINSTANCE.createAction()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__ACTION_TYPES,
				GrafcetFactory.eINSTANCE.createStoredAction()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__ACTION_TYPES,
				GrafcetFactory.eINSTANCE.createContinuousAction()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.GRAFCET__ACTION_LINKS,
				GrafcetFactory.eINSTANCE.createActionLink()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GrafcetEditPlugin.INSTANCE;
	}

}
