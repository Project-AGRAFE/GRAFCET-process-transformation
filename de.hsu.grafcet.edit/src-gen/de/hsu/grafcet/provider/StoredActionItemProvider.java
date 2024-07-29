/**
 */
package de.hsu.grafcet.provider;

import de.hsu.grafcet.GrafcetPackage;
import de.hsu.grafcet.StoredAction;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import terms.TermsFactory;

/**
 * This is the item provider adapter for a {@link de.hsu.grafcet.StoredAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StoredActionItemProvider extends ActionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoredActionItemProvider(AdapterFactory adapterFactory) {
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

			addStoredActionTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Stored Action Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStoredActionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StoredAction_storedActionType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StoredAction_storedActionType_feature",
								"_UI_StoredAction_type"),
						GrafcetPackage.Literals.STORED_ACTION__STORED_ACTION_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(GrafcetPackage.Literals.CONDITION__TERM);
			childrenFeatures.add(GrafcetPackage.Literals.STORED_ACTION__VALUE);
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
	 * This returns StoredAction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StoredAction"));
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
		StoredAction storedAction = (StoredAction) object;
		return getString("_UI_StoredAction_type") + " " + storedAction.getId();
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

		switch (notification.getFeatureID(StoredAction.class)) {
		case GrafcetPackage.STORED_ACTION__STORED_ACTION_TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case GrafcetPackage.STORED_ACTION__TERM:
		case GrafcetPackage.STORED_ACTION__VALUE:
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

		newChildDescriptors.add(
				createChildParameter(GrafcetPackage.Literals.CONDITION__TERM, TermsFactory.eINSTANCE.createVariable()));

		newChildDescriptors
				.add(createChildParameter(GrafcetPackage.Literals.CONDITION__TERM, TermsFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(GrafcetPackage.Literals.CONDITION__TERM, TermsFactory.eINSTANCE.createOr()));

		newChildDescriptors
				.add(createChildParameter(GrafcetPackage.Literals.CONDITION__TERM, TermsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(
				createChildParameter(GrafcetPackage.Literals.CONDITION__TERM, TermsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.CONDITION__TERM,
				TermsFactory.eINSTANCE.createBooleanConstant()));

		newChildDescriptors.add(
				createChildParameter(GrafcetPackage.Literals.CONDITION__TERM, TermsFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.CONDITION__TERM,
				TermsFactory.eINSTANCE.createSubstraction()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.CONDITION__TERM,
				TermsFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add(
				createChildParameter(GrafcetPackage.Literals.CONDITION__TERM, TermsFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.CONDITION__TERM,
				TermsFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.CONDITION__TERM,
				TermsFactory.eINSTANCE.createRisingEdge()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.CONDITION__TERM,
				TermsFactory.eINSTANCE.createFallingEdge()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.STORED_ACTION__VALUE,
				TermsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(
				createChildParameter(GrafcetPackage.Literals.STORED_ACTION__VALUE, TermsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(
				createChildParameter(GrafcetPackage.Literals.STORED_ACTION__VALUE, TermsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(
				createChildParameter(GrafcetPackage.Literals.STORED_ACTION__VALUE, TermsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.STORED_ACTION__VALUE,
				TermsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.STORED_ACTION__VALUE,
				TermsFactory.eINSTANCE.createBooleanConstant()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.STORED_ACTION__VALUE,
				TermsFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.STORED_ACTION__VALUE,
				TermsFactory.eINSTANCE.createSubstraction()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.STORED_ACTION__VALUE,
				TermsFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.STORED_ACTION__VALUE,
				TermsFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.STORED_ACTION__VALUE,
				TermsFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.STORED_ACTION__VALUE,
				TermsFactory.eINSTANCE.createRisingEdge()));

		newChildDescriptors.add(createChildParameter(GrafcetPackage.Literals.STORED_ACTION__VALUE,
				TermsFactory.eINSTANCE.createFallingEdge()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == GrafcetPackage.Literals.ACTION__VARIABLE
				|| childFeature == GrafcetPackage.Literals.CONDITION__TERM
				|| childFeature == GrafcetPackage.Literals.STORED_ACTION__VALUE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
