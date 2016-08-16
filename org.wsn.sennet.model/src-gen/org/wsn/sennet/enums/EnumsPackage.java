/**
 */
package org.wsn.sennet.enums;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.wsn.sennet.enums.EnumsFactory
 * @model kind="package"
 * @generated
 */
public interface EnumsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enums";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.wsn.org/sennet/enums";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sne";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumsPackage eINSTANCE = org.wsn.sennet.enums.impl.EnumsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.wsn.sennet.enums.Fusion <em>Fusion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.enums.Fusion
	 * @see org.wsn.sennet.enums.impl.EnumsPackageImpl#getFusion()
	 * @generated
	 */
	int FUSION = 0;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.enums.Aggregation <em>Aggregation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.enums.Aggregation
	 * @see org.wsn.sennet.enums.impl.EnumsPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 1;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.enums.Position <em>Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.enums.Position
	 * @see org.wsn.sennet.enums.impl.EnumsPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 2;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.enums.RoutingProtocol <em>Routing Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.enums.RoutingProtocol
	 * @see org.wsn.sennet.enums.impl.EnumsPackageImpl#getRoutingProtocol()
	 * @generated
	 */
	int ROUTING_PROTOCOL = 3;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.enums.InterNodeComm <em>Inter Node Comm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.enums.InterNodeComm
	 * @see org.wsn.sennet.enums.impl.EnumsPackageImpl#getInterNodeComm()
	 * @generated
	 */
	int INTER_NODE_COMM = 4;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.enums.LogicalSymbol <em>Logical Symbol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.enums.LogicalSymbol
	 * @see org.wsn.sennet.enums.impl.EnumsPackageImpl#getLogicalSymbol()
	 * @generated
	 */
	int LOGICAL_SYMBOL = 5;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.enums.Leds <em>Leds</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.enums.Leds
	 * @see org.wsn.sennet.enums.impl.EnumsPackageImpl#getLeds()
	 * @generated
	 */
	int LEDS = 6;

	/**
	 * The meta object id for the '{@link org.wsn.sennet.enums.LedStatus <em>Led Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wsn.sennet.enums.LedStatus
	 * @see org.wsn.sennet.enums.impl.EnumsPackageImpl#getLedStatus()
	 * @generated
	 */
	int LED_STATUS = 7;


	/**
	 * Returns the meta object for enum '{@link org.wsn.sennet.enums.Fusion <em>Fusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fusion</em>'.
	 * @see org.wsn.sennet.enums.Fusion
	 * @generated
	 */
	EEnum getFusion();

	/**
	 * Returns the meta object for enum '{@link org.wsn.sennet.enums.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation</em>'.
	 * @see org.wsn.sennet.enums.Aggregation
	 * @generated
	 */
	EEnum getAggregation();

	/**
	 * Returns the meta object for enum '{@link org.wsn.sennet.enums.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position</em>'.
	 * @see org.wsn.sennet.enums.Position
	 * @generated
	 */
	EEnum getPosition();

	/**
	 * Returns the meta object for enum '{@link org.wsn.sennet.enums.RoutingProtocol <em>Routing Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Routing Protocol</em>'.
	 * @see org.wsn.sennet.enums.RoutingProtocol
	 * @generated
	 */
	EEnum getRoutingProtocol();

	/**
	 * Returns the meta object for enum '{@link org.wsn.sennet.enums.InterNodeComm <em>Inter Node Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inter Node Comm</em>'.
	 * @see org.wsn.sennet.enums.InterNodeComm
	 * @generated
	 */
	EEnum getInterNodeComm();

	/**
	 * Returns the meta object for enum '{@link org.wsn.sennet.enums.LogicalSymbol <em>Logical Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Symbol</em>'.
	 * @see org.wsn.sennet.enums.LogicalSymbol
	 * @generated
	 */
	EEnum getLogicalSymbol();

	/**
	 * Returns the meta object for enum '{@link org.wsn.sennet.enums.Leds <em>Leds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Leds</em>'.
	 * @see org.wsn.sennet.enums.Leds
	 * @generated
	 */
	EEnum getLeds();

	/**
	 * Returns the meta object for enum '{@link org.wsn.sennet.enums.LedStatus <em>Led Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Led Status</em>'.
	 * @see org.wsn.sennet.enums.LedStatus
	 * @generated
	 */
	EEnum getLedStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnumsFactory getEnumsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.wsn.sennet.enums.Fusion <em>Fusion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.enums.Fusion
		 * @see org.wsn.sennet.enums.impl.EnumsPackageImpl#getFusion()
		 * @generated
		 */
		EEnum FUSION = eINSTANCE.getFusion();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.enums.Aggregation <em>Aggregation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.enums.Aggregation
		 * @see org.wsn.sennet.enums.impl.EnumsPackageImpl#getAggregation()
		 * @generated
		 */
		EEnum AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.enums.Position <em>Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.enums.Position
		 * @see org.wsn.sennet.enums.impl.EnumsPackageImpl#getPosition()
		 * @generated
		 */
		EEnum POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.enums.RoutingProtocol <em>Routing Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.enums.RoutingProtocol
		 * @see org.wsn.sennet.enums.impl.EnumsPackageImpl#getRoutingProtocol()
		 * @generated
		 */
		EEnum ROUTING_PROTOCOL = eINSTANCE.getRoutingProtocol();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.enums.InterNodeComm <em>Inter Node Comm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.enums.InterNodeComm
		 * @see org.wsn.sennet.enums.impl.EnumsPackageImpl#getInterNodeComm()
		 * @generated
		 */
		EEnum INTER_NODE_COMM = eINSTANCE.getInterNodeComm();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.enums.LogicalSymbol <em>Logical Symbol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.enums.LogicalSymbol
		 * @see org.wsn.sennet.enums.impl.EnumsPackageImpl#getLogicalSymbol()
		 * @generated
		 */
		EEnum LOGICAL_SYMBOL = eINSTANCE.getLogicalSymbol();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.enums.Leds <em>Leds</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.enums.Leds
		 * @see org.wsn.sennet.enums.impl.EnumsPackageImpl#getLeds()
		 * @generated
		 */
		EEnum LEDS = eINSTANCE.getLeds();

		/**
		 * The meta object literal for the '{@link org.wsn.sennet.enums.LedStatus <em>Led Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wsn.sennet.enums.LedStatus
		 * @see org.wsn.sennet.enums.impl.EnumsPackageImpl#getLedStatus()
		 * @generated
		 */
		EEnum LED_STATUS = eINSTANCE.getLedStatus();

	}

} //EnumsPackage
