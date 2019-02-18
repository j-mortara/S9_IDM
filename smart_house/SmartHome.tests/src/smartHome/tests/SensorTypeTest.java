/**
 */
package smartHome.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import smartHome.SensorType;
import smartHome.SmartHomeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sensor Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorTypeTest extends TestCase {

	/**
	 * The fixture for this Sensor Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SensorTypeTest.class);
	}

	/**
	 * Constructs a new Sensor Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sensor Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SensorType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sensor Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorType getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmartHomeFactory.eINSTANCE.createSensorType());
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

} //SensorTypeTest
