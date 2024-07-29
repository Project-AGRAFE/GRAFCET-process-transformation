/**
 */
package de.hsu.grafcet.provider;

import de.hsu.grafcet.Condition;
import de.hsu.grafcet.GrafcetPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import terms.TermsFactory;

/**
 * This is the item provider adapter for a {@link de.hsu.grafcet.Condition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
	 * This returns Condition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Condition"));
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
		return getString("_UI_Condition_type");
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

		switch (notification.getFeatureID(Condition.class)) {
		case GrafcetPackage.CONDITION__TERM:
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
