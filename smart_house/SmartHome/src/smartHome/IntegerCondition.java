/**
 */
package smartHome;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartHome.IntegerCondition#getSensor <em>Sensor</em>}</li>
 *   <li>{@link smartHome.IntegerCondition#getOperand <em>Operand</em>}</li>
 *   <li>{@link smartHome.IntegerCondition#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see smartHome.SmartHomePackage#getIntegerCondition()
 * @model
 * @generated
 */
public interface IntegerCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(IntegerSensor)
	 * @see smartHome.SmartHomePackage#getIntegerCondition_Sensor()
	 * @model required="true"
	 * @generated
	 */
	IntegerSensor getSensor();

	/**
	 * Sets the value of the '{@link smartHome.IntegerCondition#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(IntegerSensor value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' attribute.
	 * @see #setOperand(int)
	 * @see smartHome.SmartHomePackage#getIntegerCondition_Operand()
	 * @model required="true"
	 * @generated
	 */
	int getOperand();

	/**
	 * Sets the value of the '{@link smartHome.IntegerCondition#getOperand <em>Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' attribute.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(int value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link smartHome.IntegerOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see smartHome.IntegerOperator
	 * @see #setOperator(IntegerOperator)
	 * @see smartHome.SmartHomePackage#getIntegerCondition_Operator()
	 * @model required="true"
	 * @generated
	 */
	IntegerOperator getOperator();

	/**
	 * Sets the value of the '{@link smartHome.IntegerCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see smartHome.IntegerOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(IntegerOperator value);

} // IntegerCondition
