/**
 */
package smartHome;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartHome.Condition#getSensor <em>Sensor</em>}</li>
 *   <li>{@link smartHome.Condition#getOperand <em>Operand</em>}</li>
 *   <li>{@link smartHome.Condition#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see smartHome.SmartHomePackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see smartHome.SmartHomePackage#getCondition_Sensor()
	 * @model required="true"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link smartHome.Condition#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

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
	 * @see smartHome.SmartHomePackage#getCondition_Operand()
	 * @model required="true"
	 * @generated
	 */
	int getOperand();

	/**
	 * Sets the value of the '{@link smartHome.Condition#getOperand <em>Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' attribute.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(int value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link smartHome.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see smartHome.Operator
	 * @see #setOperator(Operator)
	 * @see smartHome.SmartHomePackage#getCondition_Operator()
	 * @model required="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link smartHome.Condition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see smartHome.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

} // Condition