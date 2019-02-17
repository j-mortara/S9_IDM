/**
 */
package smartHome;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Home</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartHome.SmartHome#getLocations <em>Locations</em>}</li>
 *   <li>{@link smartHome.SmartHome#getSensorTypes <em>Sensor Types</em>}</li>
 *   <li>{@link smartHome.SmartHome#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see smartHome.SmartHomePackage#getSmartHome()
 * @model
 * @generated
 */
public interface SmartHome extends EObject {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link smartHome.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see smartHome.SmartHomePackage#getSmartHome_Locations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Sensor Types</b></em>' containment reference list.
	 * The list contents are of type {@link smartHome.SensorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Types</em>' containment reference list.
	 * @see smartHome.SmartHomePackage#getSmartHome_SensorTypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SensorType> getSensorTypes();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link smartHome.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see smartHome.SmartHomePackage#getSmartHome_Rules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // SmartHome
