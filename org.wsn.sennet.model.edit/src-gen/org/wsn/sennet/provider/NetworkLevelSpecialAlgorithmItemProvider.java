/**
 */
package org.wsn.sennet.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.wsn.sennet.NetworkLevelSpecialAlgorithm;
import org.wsn.sennet.SennetPackage;

/**
 * This is the item provider adapter for a {@link org.wsn.sennet.NetworkLevelSpecialAlgorithm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkLevelSpecialAlgorithmItemProvider extends NetworkLevelJobItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkLevelSpecialAlgorithmItemProvider(AdapterFactory adapterFactory) {
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

			addSpecialAlgorithmJobPropertyDescriptor(object);
			addSensingSamplingRatePropertyDescriptor(object);
			addAlgorithmSamplingRatePropertyDescriptor(object);
			addNodeIDListPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Special Algorithm Job feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecialAlgorithmJobPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkLevelSpecialAlgorithm_specialAlgorithmJob_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkLevelSpecialAlgorithm_specialAlgorithmJob_feature", "_UI_NetworkLevelSpecialAlgorithm_type"),
				 SennetPackage.Literals.NETWORK_LEVEL_SPECIAL_ALGORITHM__SPECIAL_ALGORITHM_JOB,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sensing Sampling Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSensingSamplingRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkLevelSpecialAlgorithm_sensingSamplingRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkLevelSpecialAlgorithm_sensingSamplingRate_feature", "_UI_NetworkLevelSpecialAlgorithm_type"),
				 SennetPackage.Literals.NETWORK_LEVEL_SPECIAL_ALGORITHM__SENSING_SAMPLING_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Algorithm Sampling Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlgorithmSamplingRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkLevelSpecialAlgorithm_algorithmSamplingRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkLevelSpecialAlgorithm_algorithmSamplingRate_feature", "_UI_NetworkLevelSpecialAlgorithm_type"),
				 SennetPackage.Literals.NETWORK_LEVEL_SPECIAL_ALGORITHM__ALGORITHM_SAMPLING_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node ID List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeIDListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkLevelSpecialAlgorithm_nodeIDList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkLevelSpecialAlgorithm_nodeIDList_feature", "_UI_NetworkLevelSpecialAlgorithm_type"),
				 SennetPackage.Literals.NETWORK_LEVEL_SPECIAL_ALGORITHM__NODE_ID_LIST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns NetworkLevelSpecialAlgorithm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NetworkLevelSpecialAlgorithm"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		NetworkLevelSpecialAlgorithm networkLevelSpecialAlgorithm = (NetworkLevelSpecialAlgorithm)object;
		return getString("_UI_NetworkLevelSpecialAlgorithm_type") + " " + networkLevelSpecialAlgorithm.getId();
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

		switch (notification.getFeatureID(NetworkLevelSpecialAlgorithm.class)) {
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__SPECIAL_ALGORITHM_JOB:
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__SENSING_SAMPLING_RATE:
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__ALGORITHM_SAMPLING_RATE:
			case SennetPackage.NETWORK_LEVEL_SPECIAL_ALGORITHM__NODE_ID_LIST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
