/**
 */
package smartHome.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import smartHome.Condition;
import smartHome.SmartHomePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHomePackage.Literals.CONDITION;
	}

} //ConditionImpl
