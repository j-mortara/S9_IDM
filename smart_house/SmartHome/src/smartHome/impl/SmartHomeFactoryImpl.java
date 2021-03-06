/**
 */
package smartHome.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import smartHome.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartHomeFactoryImpl extends EFactoryImpl implements SmartHomeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmartHomeFactory init() {
		try {
			SmartHomeFactory theSmartHomeFactory = (SmartHomeFactory)EPackage.Registry.INSTANCE.getEFactory(SmartHomePackage.eNS_URI);
			if (theSmartHomeFactory != null) {
				return theSmartHomeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmartHomeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartHomeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SmartHomePackage.INTEGER_SENSOR: return createIntegerSensor();
			case SmartHomePackage.BOOLEAN_SENSOR: return createBooleanSensor();
			case SmartHomePackage.LOCATION: return createLocation();
			case SmartHomePackage.SENSOR_TYPE: return createSensorType();
			case SmartHomePackage.ANALOG_SENSOR_TYPE: return createAnalogSensorType();
			case SmartHomePackage.BOOLEAN_SENSOR_TYPE: return createBooleanSensorType();
			case SmartHomePackage.SMART_HOME: return createSmartHome();
			case SmartHomePackage.RULE: return createRule();
			case SmartHomePackage.BOOLEAN_CONDITION: return createBooleanCondition();
			case SmartHomePackage.INTEGER_CONDITION: return createIntegerCondition();
			case SmartHomePackage.DURATION: return createDuration();
			case SmartHomePackage.EVENT: return createEvent();
			case SmartHomePackage.SENSOR_VALUE: return createSensorValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SmartHomePackage.INTEGER_OPERATOR:
				return createIntegerOperatorFromString(eDataType, initialValue);
			case SmartHomePackage.BOOLEAN_OPERATOR:
				return createBooleanOperatorFromString(eDataType, initialValue);
			case SmartHomePackage.DURATION_UNIT:
				return createDurationUnitFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SmartHomePackage.INTEGER_OPERATOR:
				return convertIntegerOperatorToString(eDataType, instanceValue);
			case SmartHomePackage.BOOLEAN_OPERATOR:
				return convertBooleanOperatorToString(eDataType, instanceValue);
			case SmartHomePackage.DURATION_UNIT:
				return convertDurationUnitToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerSensor createIntegerSensor() {
		IntegerSensorImpl integerSensor = new IntegerSensorImpl();
		return integerSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanSensor createBooleanSensor() {
		BooleanSensorImpl booleanSensor = new BooleanSensorImpl();
		return booleanSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType createSensorType() {
		SensorTypeImpl sensorType = new SensorTypeImpl();
		return sensorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogSensorType createAnalogSensorType() {
		AnalogSensorTypeImpl analogSensorType = new AnalogSensorTypeImpl();
		return analogSensorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanSensorType createBooleanSensorType() {
		BooleanSensorTypeImpl booleanSensorType = new BooleanSensorTypeImpl();
		return booleanSensorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartHome createSmartHome() {
		SmartHomeImpl smartHome = new SmartHomeImpl();
		return smartHome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanCondition createBooleanCondition() {
		BooleanConditionImpl booleanCondition = new BooleanConditionImpl();
		return booleanCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerCondition createIntegerCondition() {
		IntegerConditionImpl integerCondition = new IntegerConditionImpl();
		return integerCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorValue createSensorValue() {
		SensorValueImpl sensorValue = new SensorValueImpl();
		return sensorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerOperator createIntegerOperatorFromString(EDataType eDataType, String initialValue) {
		IntegerOperator result = IntegerOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator createBooleanOperatorFromString(EDataType eDataType, String initialValue) {
		BooleanOperator result = BooleanOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationUnit createDurationUnitFromString(EDataType eDataType, String initialValue) {
		DurationUnit result = DurationUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartHomePackage getSmartHomePackage() {
		return (SmartHomePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmartHomePackage getPackage() {
		return SmartHomePackage.eINSTANCE;
	}

} //SmartHomeFactoryImpl
