/**
 */
package smartHome;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartHome.IntegerSensor#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see smartHome.SmartHomePackage#getIntegerSensor()
 * @model
 * @generated
 */
public interface IntegerSensor extends Sensor {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see smartHome.SmartHomePackage#getIntegerSensor_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link smartHome.IntegerSensor#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerSensor
