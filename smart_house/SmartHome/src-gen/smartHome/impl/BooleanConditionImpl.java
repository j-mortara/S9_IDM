/**
 */
package smartHome.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import smartHome.BooleanCondition;
import smartHome.BooleanOperator;
import smartHome.BooleanSensor;
import smartHome.SmartHomePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartHome.impl.BooleanConditionImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link smartHome.impl.BooleanConditionImpl#isOperand <em>Operand</em>}</li>
 *   <li>{@link smartHome.impl.BooleanConditionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanConditionImpl extends ConditionImpl implements BooleanCondition {
	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected BooleanSensor sensor;

	/**
	 * The default value of the '{@link #isOperand() <em>Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperand()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPERAND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOperand() <em>Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperand()
	 * @generated
	 * @ordered
	 */
	protected boolean operand = OPERAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanOperator OPERATOR_EDEFAULT = BooleanOperator.IS;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected BooleanOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHomePackage.Literals.BOOLEAN_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanSensor getSensor() {
		if (sensor != null && sensor.eIsProxy()) {
			InternalEObject oldSensor = (InternalEObject) sensor;
			sensor = (BooleanSensor) eResolveProxy(oldSensor);
			if (sensor != oldSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SmartHomePackage.BOOLEAN_CONDITION__SENSOR, oldSensor, sensor));
			}
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanSensor basicGetSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensor(BooleanSensor newSensor) {
		BooleanSensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.BOOLEAN_CONDITION__SENSOR, oldSensor,
					sensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOperand() {
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand(boolean newOperand) {
		boolean oldOperand = operand;
		operand = newOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.BOOLEAN_CONDITION__OPERAND,
					oldOperand, operand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(BooleanOperator newOperator) {
		BooleanOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.BOOLEAN_CONDITION__OPERATOR,
					oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmartHomePackage.BOOLEAN_CONDITION__SENSOR:
			if (resolve)
				return getSensor();
			return basicGetSensor();
		case SmartHomePackage.BOOLEAN_CONDITION__OPERAND:
			return isOperand();
		case SmartHomePackage.BOOLEAN_CONDITION__OPERATOR:
			return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SmartHomePackage.BOOLEAN_CONDITION__SENSOR:
			setSensor((BooleanSensor) newValue);
			return;
		case SmartHomePackage.BOOLEAN_CONDITION__OPERAND:
			setOperand((Boolean) newValue);
			return;
		case SmartHomePackage.BOOLEAN_CONDITION__OPERATOR:
			setOperator((BooleanOperator) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SmartHomePackage.BOOLEAN_CONDITION__SENSOR:
			setSensor((BooleanSensor) null);
			return;
		case SmartHomePackage.BOOLEAN_CONDITION__OPERAND:
			setOperand(OPERAND_EDEFAULT);
			return;
		case SmartHomePackage.BOOLEAN_CONDITION__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SmartHomePackage.BOOLEAN_CONDITION__SENSOR:
			return sensor != null;
		case SmartHomePackage.BOOLEAN_CONDITION__OPERAND:
			return operand != OPERAND_EDEFAULT;
		case SmartHomePackage.BOOLEAN_CONDITION__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operand: ");
		result.append(operand);
		result.append(", operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //BooleanConditionImpl
