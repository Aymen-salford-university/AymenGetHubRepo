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

import org.wsn.sennet.NetworkDataProcessing;
import org.wsn.sennet.SennetPackage;

/**
 * This is the item provider adapter for a {@link org.wsn.sennet.NetworkDataProcessing} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkDataProcessingItemProvider extends NetworkLevelJobItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDataProcessingItemProvider(AdapterFactory adapterFactory) {
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

			addNetworkDataProcessingPropertyDescriptor(object);
			addSensingSamplingRatePropertyDescriptor(object);
			addDataProcessingRatePropertyDescriptor(object);
			addNodeIDListPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Network Data Processing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkDataProcessingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkDataProcessing_networkDataProcessing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkDataProcessing_networkDataProcessing_feature", "_UI_NetworkDataProcessing_type"),
				 SennetPackage.Literals.NETWORK_DATA_PROCESSING__NETWORK_DATA_PROCESSING,
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
				 getString("_UI_NetworkDataProcessing_sensingSamplingRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkDataProcessing_sensingSamplingRate_feature", "_UI_NetworkDataProcessing_type"),
				 SennetPackage.Literals.NETWORK_DATA_PROCESSING__SENSING_SAMPLING_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Processing Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataProcessingRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkDataProcessing_dataProcessingRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkDataProcessing_dataProcessingRate_feature", "_UI_NetworkDataProcessing_type"),
				 SennetPackage.Literals.NETWORK_DATA_PROCESSING__DATA_PROCESSING_RATE,
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
				 getString("_UI_NetworkDataProcessing_nodeIDList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkDataProcessing_nodeIDList_feature", "_UI_NetworkDataProcessing_type"),
				 SennetPackage.Literals.NETWORK_DATA_PROCESSING__NODE_ID_LIST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns NetworkDataProcessing.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NetworkDataProcessing"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		NetworkDataProcessing networkDataProcessing = (NetworkDataProcessing)object;
		return getString("_UI_NetworkDataProcessing_type") + " " + networkDataProcessing.getId();
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

		switch (notification.getFeatureID(NetworkDataProcessing.class)) {
			case SennetPackage.NETWORK_DATA_PROCESSING__NETWORK_DATA_PROCESSING:
			case SennetPackage.NETWORK_DATA_PROCESSING__SENSING_SAMPLING_RATE:
			case SennetPackage.NETWORK_DATA_PROCESSING__DATA_PROCESSING_RATE:
			case SennetPackage.NETWORK_DATA_PROCESSING__NODE_ID_LIST:
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
