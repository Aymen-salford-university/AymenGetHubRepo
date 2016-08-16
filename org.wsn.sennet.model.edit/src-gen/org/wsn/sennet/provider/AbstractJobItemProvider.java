/**
 */
package org.wsn.sennet.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.wsn.sennet.AbstractJob;
import org.wsn.sennet.SennetFactory;
import org.wsn.sennet.SennetPackage;

/**
 * This is the item provider adapter for a {@link org.wsn.sennet.AbstractJob} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractJobItemProvider extends IdentifiableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractJobItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SennetPackage.Literals.ABSTRACT_JOB__JOB_TARGET_NODE);
			childrenFeatures.add(SennetPackage.Literals.ABSTRACT_JOB__JOB_TARGET_NETWORK);
			childrenFeatures.add(SennetPackage.Literals.ABSTRACT_JOB__START_END_TRIGGER);
			childrenFeatures.add(SennetPackage.Literals.ABSTRACT_JOB__JOBACTION);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AbstractJob abstractJob = (AbstractJob)object;
		return getString("_UI_AbstractJob_type") + " " + abstractJob.getId();
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

		switch (notification.getFeatureID(AbstractJob.class)) {
			case SennetPackage.ABSTRACT_JOB__JOB_TARGET_NODE:
			case SennetPackage.ABSTRACT_JOB__JOB_TARGET_NETWORK:
			case SennetPackage.ABSTRACT_JOB__START_END_TRIGGER:
			case SennetPackage.ABSTRACT_JOB__JOBACTION:
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

		newChildDescriptors.add
			(createChildParameter
				(SennetPackage.Literals.ABSTRACT_JOB__JOB_TARGET_NODE,
				 SennetFactory.eINSTANCE.createSensorNode()));

		newChildDescriptors.add
			(createChildParameter
				(SennetPackage.Literals.ABSTRACT_JOB__JOB_TARGET_NODE,
				 SennetFactory.eINSTANCE.createClusterHeadNode()));

		newChildDescriptors.add
			(createChildParameter
				(SennetPackage.Literals.ABSTRACT_JOB__JOB_TARGET_NODE,
				 SennetFactory.eINSTANCE.createSinkNode()));

		newChildDescriptors.add
			(createChildParameter
				(SennetPackage.Literals.ABSTRACT_JOB__JOB_TARGET_NODE,
				 SennetFactory.eINSTANCE.createComputationNode()));

		newChildDescriptors.add
			(createChildParameter
				(SennetPackage.Literals.ABSTRACT_JOB__JOB_TARGET_NETWORK,
				 SennetFactory.eINSTANCE.createFlatNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(SennetPackage.Literals.ABSTRACT_JOB__JOB_TARGET_NETWORK,
				 SennetFactory.eINSTANCE.createClusteredNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(SennetPackage.Literals.ABSTRACT_JOB__START_END_TRIGGER,
				 SennetFactory.eINSTANCE.createStartJobTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(SennetPackage.Literals.ABSTRACT_JOB__START_END_TRIGGER,
				 SennetFactory.eINSTANCE.createReceiveMessageTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(SennetPackage.Literals.ABSTRACT_JOB__START_END_TRIGGER,
				 SennetFactory.eINSTANCE.createRecieveSerialMsgTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(SennetPackage.Literals.ABSTRACT_JOB__START_END_TRIGGER,
				 SennetFactory.eINSTANCE.createStopJobTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(SennetPackage.Literals.ABSTRACT_JOB__START_END_TRIGGER,
				 SennetFactory.eINSTANCE.createPushButtomTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(SennetPackage.Literals.ABSTRACT_JOB__JOBACTION,
				 SennetFactory.eINSTANCE.createReadNodeMemoryAction()));

		newChildDescriptors.add
			(createChildParameter
				(SennetPackage.Literals.ABSTRACT_JOB__JOBACTION,
				 SennetFactory.eINSTANCE.createWriteNodeMemoryAction()));

		newChildDescriptors.add
			(createChildParameter
				(SennetPackage.Literals.ABSTRACT_JOB__JOBACTION,
				 SennetFactory.eINSTANCE.createSendMessageAction()));

		newChildDescriptors.add
			(createChildParameter
				(SennetPackage.Literals.ABSTRACT_JOB__JOBACTION,
				 SennetFactory.eINSTANCE.createBlinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(SennetPackage.Literals.ABSTRACT_JOB__JOBACTION,
				 SennetFactory.eINSTANCE.createSendSerialPortMsgAction()));
	}

}
