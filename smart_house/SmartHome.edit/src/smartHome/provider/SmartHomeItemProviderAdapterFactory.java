/**
 */
package smartHome.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import smartHome.util.SmartHomeAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartHomeItemProviderAdapterFactory extends SmartHomeAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartHomeItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartHome.IntegerSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerSensorItemProvider integerSensorItemProvider;

	/**
	 * This creates an adapter for a {@link smartHome.IntegerSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerSensorAdapter() {
		if (integerSensorItemProvider == null) {
			integerSensorItemProvider = new IntegerSensorItemProvider(this);
		}

		return integerSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartHome.BooleanSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanSensorItemProvider booleanSensorItemProvider;

	/**
	 * This creates an adapter for a {@link smartHome.BooleanSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanSensorAdapter() {
		if (booleanSensorItemProvider == null) {
			booleanSensorItemProvider = new BooleanSensorItemProvider(this);
		}

		return booleanSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartHome.Location} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationItemProvider locationItemProvider;

	/**
	 * This creates an adapter for a {@link smartHome.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocationAdapter() {
		if (locationItemProvider == null) {
			locationItemProvider = new LocationItemProvider(this);
		}

		return locationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartHome.SensorType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorTypeItemProvider sensorTypeItemProvider;

	/**
	 * This creates an adapter for a {@link smartHome.SensorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSensorTypeAdapter() {
		if (sensorTypeItemProvider == null) {
			sensorTypeItemProvider = new SensorTypeItemProvider(this);
		}

		return sensorTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartHome.AnalogSensorType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogSensorTypeItemProvider analogSensorTypeItemProvider;

	/**
	 * This creates an adapter for a {@link smartHome.AnalogSensorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnalogSensorTypeAdapter() {
		if (analogSensorTypeItemProvider == null) {
			analogSensorTypeItemProvider = new AnalogSensorTypeItemProvider(this);
		}

		return analogSensorTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartHome.BooleanSensorType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanSensorTypeItemProvider booleanSensorTypeItemProvider;

	/**
	 * This creates an adapter for a {@link smartHome.BooleanSensorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanSensorTypeAdapter() {
		if (booleanSensorTypeItemProvider == null) {
			booleanSensorTypeItemProvider = new BooleanSensorTypeItemProvider(this);
		}

		return booleanSensorTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartHome.SmartHome} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartHomeItemProvider smartHomeItemProvider;

	/**
	 * This creates an adapter for a {@link smartHome.SmartHome}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSmartHomeAdapter() {
		if (smartHomeItemProvider == null) {
			smartHomeItemProvider = new SmartHomeItemProvider(this);
		}

		return smartHomeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartHome.Rule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleItemProvider ruleItemProvider;

	/**
	 * This creates an adapter for a {@link smartHome.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuleAdapter() {
		if (ruleItemProvider == null) {
			ruleItemProvider = new RuleItemProvider(this);
		}

		return ruleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartHome.BooleanCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanConditionItemProvider booleanConditionItemProvider;

	/**
	 * This creates an adapter for a {@link smartHome.BooleanCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanConditionAdapter() {
		if (booleanConditionItemProvider == null) {
			booleanConditionItemProvider = new BooleanConditionItemProvider(this);
		}

		return booleanConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartHome.IntegerCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerConditionItemProvider integerConditionItemProvider;

	/**
	 * This creates an adapter for a {@link smartHome.IntegerCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerConditionAdapter() {
		if (integerConditionItemProvider == null) {
			integerConditionItemProvider = new IntegerConditionItemProvider(this);
		}

		return integerConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartHome.Duration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationItemProvider durationItemProvider;

	/**
	 * This creates an adapter for a {@link smartHome.Duration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDurationAdapter() {
		if (durationItemProvider == null) {
			durationItemProvider = new DurationItemProvider(this);
		}

		return durationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartHome.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link smartHome.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartHome.SensorValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorValueItemProvider sensorValueItemProvider;

	/**
	 * This creates an adapter for a {@link smartHome.SensorValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSensorValueAdapter() {
		if (sensorValueItemProvider == null) {
			sensorValueItemProvider = new SensorValueItemProvider(this);
		}

		return sensorValueItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (integerSensorItemProvider != null) integerSensorItemProvider.dispose();
		if (booleanSensorItemProvider != null) booleanSensorItemProvider.dispose();
		if (locationItemProvider != null) locationItemProvider.dispose();
		if (sensorTypeItemProvider != null) sensorTypeItemProvider.dispose();
		if (analogSensorTypeItemProvider != null) analogSensorTypeItemProvider.dispose();
		if (booleanSensorTypeItemProvider != null) booleanSensorTypeItemProvider.dispose();
		if (smartHomeItemProvider != null) smartHomeItemProvider.dispose();
		if (ruleItemProvider != null) ruleItemProvider.dispose();
		if (booleanConditionItemProvider != null) booleanConditionItemProvider.dispose();
		if (integerConditionItemProvider != null) integerConditionItemProvider.dispose();
		if (durationItemProvider != null) durationItemProvider.dispose();
		if (eventItemProvider != null) eventItemProvider.dispose();
		if (sensorValueItemProvider != null) sensorValueItemProvider.dispose();
	}

}
