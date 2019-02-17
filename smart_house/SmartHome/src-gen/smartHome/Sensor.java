/**
 */
package smartHome;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartHome.Sensor#getSensorType <em>Sensor Type</em>}</li>
 *   <li>{@link smartHome.Sensor#getDataFile <em>Data File</em>}</li>
 *   <li>{@link smartHome.Sensor#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see smartHome.SmartHomePackage#getSensor()
 * @model abstract="true"
 * @generated
 */
public interface Sensor extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Type</em>' reference.
	 * @see #setSensorType(SensorType)
	 * @see smartHome.SmartHomePackage#getSensor_SensorType()
	 * @model required="true"
	 * @generated
	 */
	SensorType getSensorType();

	/**
	 * Sets the value of the '{@link smartHome.Sensor#getSensorType <em>Sensor Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Type</em>' reference.
	 * @see #getSensorType()
	 * @generated
	 */
	void setSensorType(SensorType value);

	/**
	 * Returns the value of the '<em><b>Data File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data File</em>' attribute.
	 * @see #setDataFile(String)
	 * @see smartHome.SmartHomePackage#getSensor_DataFile()
	 * @model required="true"
	 * @generated
	 */
	String getDataFile();

	/**
	 * Sets the value of the '{@link smartHome.Sensor#getDataFile <em>Data File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data File</em>' attribute.
	 * @see #getDataFile()
	 * @generated
	 */
	void setDataFile(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see smartHome.SmartHomePackage#getSensor_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smartHome.Sensor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Sensor
