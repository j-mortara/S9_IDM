/**
 */
package smartHome.tests;

import junit.textui.TestRunner;

import smartHome.BooleanCondition;
import smartHome.SmartHomeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanConditionTest extends ConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanConditionTest.class);
	}

	/**
	 * Constructs a new Boolean Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanCondition getFixture() {
		return (BooleanCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmartHomeFactory.eINSTANCE.createBooleanCondition());
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

} //BooleanConditionTest
