/**
 */
package smartHome.tests;

import junit.textui.TestRunner;

import smartHome.BooleanSensor;
import smartHome.SmartHomeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Sensor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanSensorTest extends SensorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanSensorTest.class);
	}

	/**
	 * Constructs a new Boolean Sensor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanSensorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanSensor getFixture() {
		return (BooleanSensor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmartHomeFactory.eINSTANCE.createBooleanSensor());
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

} //BooleanSensorTest
