/**
 */
package smartHome.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smartHome.IntegerCondition;
import smartHome.IntegerOperator;
import smartHome.IntegerSensor;
import smartHome.SmartHomePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartHome.impl.IntegerConditionImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link smartHome.impl.IntegerConditionImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link smartHome.impl.IntegerConditionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerConditionImpl extends ConditionImpl implements IntegerCondition {
	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected IntegerSensor sensor;

	/**
	 * The default value of the '{@link #getOperand() <em>Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected static final int OPERAND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected int operand = OPERAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final IntegerOperator OPERATOR_EDEFAULT = IntegerOperator.INFERIOR;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected IntegerOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHomePackage.Literals.INTEGER_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerSensor getSensor() {
		if (sensor != null && sensor.eIsProxy()) {
			InternalEObject oldSensor = (InternalEObject) sensor;
			sensor = (IntegerSensor) eResolveProxy(oldSensor);
			if (sensor != oldSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SmartHomePackage.INTEGER_CONDITION__SENSOR, oldSensor, sensor));
			}
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerSensor basicGetSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensor(IntegerSensor newSensor) {
		IntegerSensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.INTEGER_CONDITION__SENSOR, oldSensor,
					sensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOperand() {
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand(int newOperand) {
		int oldOperand = operand;
		operand = newOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.INTEGER_CONDITION__OPERAND,
					oldOperand, operand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(IntegerOperator newOperator) {
		IntegerOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.INTEGER_CONDITION__OPERATOR,
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
		case SmartHomePackage.INTEGER_CONDITION__SENSOR:
			if (resolve)
				return getSensor();
			return basicGetSensor();
		case SmartHomePackage.INTEGER_CONDITION__OPERAND:
			return getOperand();
		case SmartHomePackage.INTEGER_CONDITION__OPERATOR:
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
		case SmartHomePackage.INTEGER_CONDITION__SENSOR:
			setSensor((IntegerSensor) newValue);
			return;
		case SmartHomePackage.INTEGER_CONDITION__OPERAND:
			setOperand((Integer) newValue);
			return;
		case SmartHomePackage.INTEGER_CONDITION__OPERATOR:
			setOperator((IntegerOperator) newValue);
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
		case SmartHomePackage.INTEGER_CONDITION__SENSOR:
			setSensor((IntegerSensor) null);
			return;
		case SmartHomePackage.INTEGER_CONDITION__OPERAND:
			setOperand(OPERAND_EDEFAULT);
			return;
		case SmartHomePackage.INTEGER_CONDITION__OPERATOR:
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
		case SmartHomePackage.INTEGER_CONDITION__SENSOR:
			return sensor != null;
		case SmartHomePackage.INTEGER_CONDITION__OPERAND:
			return operand != OPERAND_EDEFAULT;
		case SmartHomePackage.INTEGER_CONDITION__OPERATOR:
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

} //IntegerConditionImpl
