/**
 */
package smartHome.tests;

import junit.textui.TestRunner;

import smartHome.IntegerSensor;
import smartHome.SmartHomeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integer Sensor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerSensorTest extends SensorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegerSensorTest.class);
	}

	/**
	 * Constructs a new Integer Sensor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerSensorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Integer Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntegerSensor getFixture() {
		return (IntegerSensor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmartHomeFactory.eINSTANCE.createIntegerSensor());
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

} //IntegerSensorTest
