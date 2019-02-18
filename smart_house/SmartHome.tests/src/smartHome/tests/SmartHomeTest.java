/**
 */
package smartHome.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import smartHome.SmartHome;
import smartHome.SmartHomeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Smart Home</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartHomeTest extends TestCase {

	/**
	 * The fixture for this Smart Home test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartHome fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SmartHomeTest.class);
	}

	/**
	 * Constructs a new Smart Home test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartHomeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Smart Home test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SmartHome fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Smart Home test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartHome getFixture() {
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
		setFixture(SmartHomeFactory.eINSTANCE.createSmartHome());
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

} //SmartHomeTest
