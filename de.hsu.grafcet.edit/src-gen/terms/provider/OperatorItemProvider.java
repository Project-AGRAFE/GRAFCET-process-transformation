/**
 */
package terms.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import terms.Operator;
import terms.TermsFactory;
import terms.TermsPackage;

/**
 * This is the item provider adapter for a {@link terms.Operator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatorItemProvider extends TermItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorItemProvider(AdapterFactory adapterFactory) {
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

			addInputPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Operator_input_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Operator_input_feature",
								"_UI_Operator_type"),
						TermsPackage.Literals.OPERATOR__INPUT, true, false, true, null, null, null));
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
			childrenFeatures.add(TermsPackage.Literals.OPERATOR__SUBTERM);
			childrenFeatures.add(TermsPackage.Literals.OPERATOR__OUTPUT);
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
		Operator operator = (Operator) object;
		return getString("_UI_Operator_type") + " " + operator.getId();
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

		switch (notification.getFeatureID(Operator.class)) {
		case TermsPackage.OPERATOR__SUBTERM:
		case TermsPackage.OPERATOR__OUTPUT:
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
				createChildParameter(TermsPackage.Literals.OPERATOR__SUBTERM, TermsFactory.eINSTANCE.createVariable()));

		newChildDescriptors
				.add(createChildParameter(TermsPackage.Literals.OPERATOR__SUBTERM, TermsFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(TermsPackage.Literals.OPERATOR__SUBTERM, TermsFactory.eINSTANCE.createOr()));

		newChildDescriptors
				.add(createChildParameter(TermsPackage.Literals.OPERATOR__SUBTERM, TermsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(
				createChildParameter(TermsPackage.Literals.OPERATOR__SUBTERM, TermsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(TermsPackage.Literals.OPERATOR__SUBTERM,
				TermsFactory.eINSTANCE.createBooleanConstant()));

		newChildDescriptors.add(
				createChildParameter(TermsPackage.Literals.OPERATOR__SUBTERM, TermsFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(TermsPackage.Literals.OPERATOR__SUBTERM,
				TermsFactory.eINSTANCE.createSubstraction()));

		newChildDescriptors.add(createChildParameter(TermsPackage.Literals.OPERATOR__SUBTERM,
				TermsFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add(
				createChildParameter(TermsPackage.Literals.OPERATOR__SUBTERM, TermsFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add(createChildParameter(TermsPackage.Literals.OPERATOR__SUBTERM,
				TermsFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add(createChildParameter(TermsPackage.Literals.OPERATOR__SUBTERM,
				TermsFactory.eINSTANCE.createRisingEdge()));

		newChildDescriptors.add(createChildParameter(TermsPackage.Literals.OPERATOR__SUBTERM,
				TermsFactory.eINSTANCE.createFallingEdge()));

		newChildDescriptors
				.add(createChildParameter(TermsPackage.Literals.OPERATOR__OUTPUT, TermsFactory.eINSTANCE.createBool()));

		newChildDescriptors.add(
				createChildParameter(TermsPackage.Literals.OPERATOR__OUTPUT, TermsFactory.eINSTANCE.createInteger()));
	}

}
