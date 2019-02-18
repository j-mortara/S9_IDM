/**
 */
package smartHome.tests;

import junit.textui.TestRunner;

import smartHome.AnalogSensorType;
import smartHome.SmartHomeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Analog Sensor Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalogSensorTypeTest extends SensorTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnalogSensorTypeTest.class);
	}

	/**
	 * Constructs a new Analog Sensor Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogSensorTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Analog Sensor Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AnalogSensorType getFixture() {
		return (AnalogSensorType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmartHomeFactory.eINSTANCE.createAnalogSensorType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AnalogSensorTypeTest
