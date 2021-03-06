/**
 */
package smartHome;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see smartHome.SmartHomeFactory
 * @model kind="package"
 * @generated
 */
public interface SmartHomePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smartHome";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/smartHome";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smartHome";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmartHomePackage eINSTANCE = smartHome.impl.SmartHomePackageImpl.init();

	/**
	 * The meta object id for the '{@link smartHome.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.SensorImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Sensor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SENSOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Data File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DATA_FILE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = 2;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.IntegerSensorImpl <em>Integer Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.IntegerSensorImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getIntegerSensor()
	 * @generated
	 */
	int INTEGER_SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Sensor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SENSOR__SENSOR_TYPE = SENSOR__SENSOR_TYPE;

	/**
	 * The feature id for the '<em><b>Data File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SENSOR__DATA_FILE = SENSOR__DATA_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SENSOR__VALUE = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.BooleanSensorImpl <em>Boolean Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.BooleanSensorImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getBooleanSensor()
	 * @generated
	 */
	int BOOLEAN_SENSOR = 2;

	/**
	 * The feature id for the '<em><b>Sensor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR__SENSOR_TYPE = SENSOR__SENSOR_TYPE;

	/**
	 * The feature id for the '<em><b>Data File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR__DATA_FILE = SENSOR__DATA_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR__VALUE = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.LocationImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__SENSORS = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.SensorTypeImpl <em>Sensor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.SensorTypeImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Sensor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sensor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.AnalogSensorTypeImpl <em>Analog Sensor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.AnalogSensorTypeImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getAnalogSensorType()
	 * @generated
	 */
	int ANALOG_SENSOR_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SENSOR_TYPE__NAME = SENSOR_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Analog Sensor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SENSOR_TYPE_FEATURE_COUNT = SENSOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Analog Sensor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SENSOR_TYPE_OPERATION_COUNT = SENSOR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.BooleanSensorTypeImpl <em>Boolean Sensor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.BooleanSensorTypeImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getBooleanSensorType()
	 * @generated
	 */
	int BOOLEAN_SENSOR_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR_TYPE__NAME = SENSOR_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Boolean Sensor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR_TYPE_FEATURE_COUNT = SENSOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Sensor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR_TYPE_OPERATION_COUNT = SENSOR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.SmartHomeImpl <em>Smart Home</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.SmartHomeImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getSmartHome()
	 * @generated
	 */
	int SMART_HOME = 7;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__LOCATIONS = 0;

	/**
	 * The feature id for the '<em><b>Sensor Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__SENSOR_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__RULES = 2;

	/**
	 * The number of structural features of the '<em>Smart Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Smart Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.RuleImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getRule()
	 * @generated
	 */
	int RULE = 8;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EVENT = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DURATION = 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.ConditionImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 9;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.BooleanConditionImpl <em>Boolean Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.BooleanConditionImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getBooleanCondition()
	 * @generated
	 */
	int BOOLEAN_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION__SENSOR = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION__OPERAND = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION__OPERATOR = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Boolean Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.IntegerConditionImpl <em>Integer Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.IntegerConditionImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getIntegerCondition()
	 * @generated
	 */
	int INTEGER_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONDITION__SENSOR = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONDITION__OPERAND = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONDITION__OPERATOR = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integer Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Integer Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.DurationImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 12;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.EventImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.SensorValueImpl <em>Sensor Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.SensorValueImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getSensorValue()
	 * @generated
	 */
	int SENSOR_VALUE = 14;

	/**
	 * The number of structural features of the '<em>Sensor Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sensor Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartHome.IntegerOperator <em>Integer Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.IntegerOperator
	 * @see smartHome.impl.SmartHomePackageImpl#getIntegerOperator()
	 * @generated
	 */
	int INTEGER_OPERATOR = 15;

	/**
	 * The meta object id for the '{@link smartHome.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.BooleanOperator
	 * @see smartHome.impl.SmartHomePackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 16;

	/**
	 * The meta object id for the '{@link smartHome.DurationUnit <em>Duration Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.DurationUnit
	 * @see smartHome.impl.SmartHomePackageImpl#getDurationUnit()
	 * @generated
	 */
	int DURATION_UNIT = 17;


	/**
	 * Returns the meta object for class '{@link smartHome.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see smartHome.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the reference '{@link smartHome.Sensor#getSensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor Type</em>'.
	 * @see smartHome.Sensor#getSensorType()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_SensorType();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Sensor#getDataFile <em>Data File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data File</em>'.
	 * @see smartHome.Sensor#getDataFile()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_DataFile();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Sensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartHome.Sensor#getName()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Name();

	/**
	 * Returns the meta object for class '{@link smartHome.IntegerSensor <em>Integer Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Sensor</em>'.
	 * @see smartHome.IntegerSensor
	 * @generated
	 */
	EClass getIntegerSensor();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.IntegerSensor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see smartHome.IntegerSensor#getValue()
	 * @see #getIntegerSensor()
	 * @generated
	 */
	EAttribute getIntegerSensor_Value();

	/**
	 * Returns the meta object for class '{@link smartHome.BooleanSensor <em>Boolean Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Sensor</em>'.
	 * @see smartHome.BooleanSensor
	 * @generated
	 */
	EClass getBooleanSensor();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.BooleanSensor#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see smartHome.BooleanSensor#isValue()
	 * @see #getBooleanSensor()
	 * @generated
	 */
	EAttribute getBooleanSensor_Value();

	/**
	 * Returns the meta object for class '{@link smartHome.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see smartHome.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartHome.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link smartHome.Location#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see smartHome.Location#getSensors()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Sensors();

	/**
	 * Returns the meta object for class '{@link smartHome.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Type</em>'.
	 * @see smartHome.SensorType
	 * @generated
	 */
	EClass getSensorType();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.SensorType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartHome.SensorType#getName()
	 * @see #getSensorType()
	 * @generated
	 */
	EAttribute getSensorType_Name();

	/**
	 * Returns the meta object for class '{@link smartHome.AnalogSensorType <em>Analog Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Sensor Type</em>'.
	 * @see smartHome.AnalogSensorType
	 * @generated
	 */
	EClass getAnalogSensorType();

	/**
	 * Returns the meta object for class '{@link smartHome.BooleanSensorType <em>Boolean Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Sensor Type</em>'.
	 * @see smartHome.BooleanSensorType
	 * @generated
	 */
	EClass getBooleanSensorType();

	/**
	 * Returns the meta object for class '{@link smartHome.SmartHome <em>Smart Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Home</em>'.
	 * @see smartHome.SmartHome
	 * @generated
	 */
	EClass getSmartHome();

	/**
	 * Returns the meta object for the containment reference list '{@link smartHome.SmartHome#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see smartHome.SmartHome#getLocations()
	 * @see #getSmartHome()
	 * @generated
	 */
	EReference getSmartHome_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link smartHome.SmartHome#getSensorTypes <em>Sensor Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor Types</em>'.
	 * @see smartHome.SmartHome#getSensorTypes()
	 * @see #getSmartHome()
	 * @generated
	 */
	EReference getSmartHome_SensorTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link smartHome.SmartHome#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see smartHome.SmartHome#getRules()
	 * @see #getSmartHome()
	 * @generated
	 */
	EReference getSmartHome_Rules();

	/**
	 * Returns the meta object for class '{@link smartHome.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see smartHome.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference list '{@link smartHome.Rule#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see smartHome.Rule#getConditions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Conditions();

	/**
	 * Returns the meta object for the containment reference '{@link smartHome.Rule#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see smartHome.Rule#getEvent()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Event();

	/**
	 * Returns the meta object for the containment reference '{@link smartHome.Rule#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see smartHome.Rule#getDuration()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Duration();

	/**
	 * Returns the meta object for class '{@link smartHome.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see smartHome.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link smartHome.BooleanCondition <em>Boolean Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Condition</em>'.
	 * @see smartHome.BooleanCondition
	 * @generated
	 */
	EClass getBooleanCondition();

	/**
	 * Returns the meta object for the reference '{@link smartHome.BooleanCondition#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see smartHome.BooleanCondition#getSensor()
	 * @see #getBooleanCondition()
	 * @generated
	 */
	EReference getBooleanCondition_Sensor();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.BooleanCondition#isOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operand</em>'.
	 * @see smartHome.BooleanCondition#isOperand()
	 * @see #getBooleanCondition()
	 * @generated
	 */
	EAttribute getBooleanCondition_Operand();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.BooleanCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see smartHome.BooleanCondition#getOperator()
	 * @see #getBooleanCondition()
	 * @generated
	 */
	EAttribute getBooleanCondition_Operator();

	/**
	 * Returns the meta object for class '{@link smartHome.IntegerCondition <em>Integer Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Condition</em>'.
	 * @see smartHome.IntegerCondition
	 * @generated
	 */
	EClass getIntegerCondition();

	/**
	 * Returns the meta object for the reference '{@link smartHome.IntegerCondition#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see smartHome.IntegerCondition#getSensor()
	 * @see #getIntegerCondition()
	 * @generated
	 */
	EReference getIntegerCondition_Sensor();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.IntegerCondition#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operand</em>'.
	 * @see smartHome.IntegerCondition#getOperand()
	 * @see #getIntegerCondition()
	 * @generated
	 */
	EAttribute getIntegerCondition_Operand();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.IntegerCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see smartHome.IntegerCondition#getOperator()
	 * @see #getIntegerCondition()
	 * @generated
	 */
	EAttribute getIntegerCondition_Operator();

	/**
	 * Returns the meta object for class '{@link smartHome.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see smartHome.Duration
	 * @generated
	 */
	EClass getDuration();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Duration#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see smartHome.Duration#getUnit()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Unit();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Duration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see smartHome.Duration#getValue()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Value();

	/**
	 * Returns the meta object for class '{@link smartHome.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see smartHome.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Event#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see smartHome.Event#getDescription()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Description();

	/**
	 * Returns the meta object for class '{@link smartHome.SensorValue <em>Sensor Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Value</em>'.
	 * @see smartHome.SensorValue
	 * @generated
	 */
	EClass getSensorValue();

	/**
	 * Returns the meta object for enum '{@link smartHome.IntegerOperator <em>Integer Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Integer Operator</em>'.
	 * @see smartHome.IntegerOperator
	 * @generated
	 */
	EEnum getIntegerOperator();

	/**
	 * Returns the meta object for enum '{@link smartHome.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see smartHome.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the meta object for enum '{@link smartHome.DurationUnit <em>Duration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Duration Unit</em>'.
	 * @see smartHome.DurationUnit
	 * @generated
	 */
	EEnum getDurationUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmartHomeFactory getSmartHomeFactory();

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
		 * The meta object literal for the '{@link smartHome.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.SensorImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Sensor Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__SENSOR_TYPE = eINSTANCE.getSensor_SensorType();

		/**
		 * The meta object literal for the '<em><b>Data File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__DATA_FILE = eINSTANCE.getSensor_DataFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__NAME = eINSTANCE.getSensor_Name();

		/**
		 * The meta object literal for the '{@link smartHome.impl.IntegerSensorImpl <em>Integer Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.IntegerSensorImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getIntegerSensor()
		 * @generated
		 */
		EClass INTEGER_SENSOR = eINSTANCE.getIntegerSensor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_SENSOR__VALUE = eINSTANCE.getIntegerSensor_Value();

		/**
		 * The meta object literal for the '{@link smartHome.impl.BooleanSensorImpl <em>Boolean Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.BooleanSensorImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getBooleanSensor()
		 * @generated
		 */
		EClass BOOLEAN_SENSOR = eINSTANCE.getBooleanSensor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_SENSOR__VALUE = eINSTANCE.getBooleanSensor_Value();

		/**
		 * The meta object literal for the '{@link smartHome.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.LocationImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__SENSORS = eINSTANCE.getLocation_Sensors();

		/**
		 * The meta object literal for the '{@link smartHome.impl.SensorTypeImpl <em>Sensor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.SensorTypeImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getSensorType()
		 * @generated
		 */
		EClass SENSOR_TYPE = eINSTANCE.getSensorType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_TYPE__NAME = eINSTANCE.getSensorType_Name();

		/**
		 * The meta object literal for the '{@link smartHome.impl.AnalogSensorTypeImpl <em>Analog Sensor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.AnalogSensorTypeImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getAnalogSensorType()
		 * @generated
		 */
		EClass ANALOG_SENSOR_TYPE = eINSTANCE.getAnalogSensorType();

		/**
		 * The meta object literal for the '{@link smartHome.impl.BooleanSensorTypeImpl <em>Boolean Sensor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.BooleanSensorTypeImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getBooleanSensorType()
		 * @generated
		 */
		EClass BOOLEAN_SENSOR_TYPE = eINSTANCE.getBooleanSensorType();

		/**
		 * The meta object literal for the '{@link smartHome.impl.SmartHomeImpl <em>Smart Home</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.SmartHomeImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getSmartHome()
		 * @generated
		 */
		EClass SMART_HOME = eINSTANCE.getSmartHome();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_HOME__LOCATIONS = eINSTANCE.getSmartHome_Locations();

		/**
		 * The meta object literal for the '<em><b>Sensor Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_HOME__SENSOR_TYPES = eINSTANCE.getSmartHome_SensorTypes();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_HOME__RULES = eINSTANCE.getSmartHome_Rules();

		/**
		 * The meta object literal for the '{@link smartHome.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.RuleImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__CONDITIONS = eINSTANCE.getRule_Conditions();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__EVENT = eINSTANCE.getRule_Event();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__DURATION = eINSTANCE.getRule_Duration();

		/**
		 * The meta object literal for the '{@link smartHome.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.ConditionImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link smartHome.impl.BooleanConditionImpl <em>Boolean Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.BooleanConditionImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getBooleanCondition()
		 * @generated
		 */
		EClass BOOLEAN_CONDITION = eINSTANCE.getBooleanCondition();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_CONDITION__SENSOR = eINSTANCE.getBooleanCondition_Sensor();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CONDITION__OPERAND = eINSTANCE.getBooleanCondition_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CONDITION__OPERATOR = eINSTANCE.getBooleanCondition_Operator();

		/**
		 * The meta object literal for the '{@link smartHome.impl.IntegerConditionImpl <em>Integer Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.IntegerConditionImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getIntegerCondition()
		 * @generated
		 */
		EClass INTEGER_CONDITION = eINSTANCE.getIntegerCondition();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_CONDITION__SENSOR = eINSTANCE.getIntegerCondition_Sensor();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CONDITION__OPERAND = eINSTANCE.getIntegerCondition_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CONDITION__OPERATOR = eINSTANCE.getIntegerCondition_Operator();

		/**
		 * The meta object literal for the '{@link smartHome.impl.DurationImpl <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.DurationImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getDuration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__UNIT = eINSTANCE.getDuration_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__VALUE = eINSTANCE.getDuration_Value();

		/**
		 * The meta object literal for the '{@link smartHome.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.EventImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DESCRIPTION = eINSTANCE.getEvent_Description();

		/**
		 * The meta object literal for the '{@link smartHome.impl.SensorValueImpl <em>Sensor Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.SensorValueImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getSensorValue()
		 * @generated
		 */
		EClass SENSOR_VALUE = eINSTANCE.getSensorValue();

		/**
		 * The meta object literal for the '{@link smartHome.IntegerOperator <em>Integer Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.IntegerOperator
		 * @see smartHome.impl.SmartHomePackageImpl#getIntegerOperator()
		 * @generated
		 */
		EEnum INTEGER_OPERATOR = eINSTANCE.getIntegerOperator();

		/**
		 * The meta object literal for the '{@link smartHome.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.BooleanOperator
		 * @see smartHome.impl.SmartHomePackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

		/**
		 * The meta object literal for the '{@link smartHome.DurationUnit <em>Duration Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.DurationUnit
		 * @see smartHome.impl.SmartHomePackageImpl#getDurationUnit()
		 * @generated
		 */
		EEnum DURATION_UNIT = eINSTANCE.getDurationUnit();

	}

} //SmartHomePackage
