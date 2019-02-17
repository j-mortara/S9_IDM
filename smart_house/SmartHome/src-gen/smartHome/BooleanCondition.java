/**
 */
package smartHome;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartHome.BooleanCondition#getSensor <em>Sensor</em>}</li>
 *   <li>{@link smartHome.BooleanCondition#isOperand <em>Operand</em>}</li>
 *   <li>{@link smartHome.BooleanCondition#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see smartHome.SmartHomePackage#getBooleanCondition()
 * @model
 * @generated
 */
public interface BooleanCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(BooleanSensor)
	 * @see smartHome.SmartHomePackage#getBooleanCondition_Sensor()
	 * @model required="true"
	 * @generated
	 */
	BooleanSensor getSensor();

	/**
	 * Sets the value of the '{@link smartHome.BooleanCondition#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(BooleanSensor value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' attribute.
	 * @see #setOperand(boolean)
	 * @see smartHome.SmartHomePackage#getBooleanCondition_Operand()
	 * @model required="true"
	 * @generated
	 */
	boolean isOperand();

	/**
	 * Sets the value of the '{@link smartHome.BooleanCondition#isOperand <em>Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' attribute.
	 * @see #isOperand()
	 * @generated
	 */
	void setOperand(boolean value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link smartHome.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see smartHome.BooleanOperator
	 * @see #setOperator(BooleanOperator)
	 * @see smartHome.SmartHomePackage#getBooleanCondition_Operator()
	 * @model required="true"
	 * @generated
	 */
	BooleanOperator getOperator();

	/**
	 * Sets the value of the '{@link smartHome.BooleanCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see smartHome.BooleanOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanOperator value);

} // BooleanCondition
