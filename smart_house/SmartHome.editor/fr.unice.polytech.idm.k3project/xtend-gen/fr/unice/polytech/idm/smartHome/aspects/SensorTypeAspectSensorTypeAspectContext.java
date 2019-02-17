package fr.unice.polytech.idm.smartHome.aspects;

import fr.unice.polytech.idm.smartHome.aspects.SensorTypeAspectSensorTypeAspectProperties;
import java.util.Map;
import smartHome.SensorType;

@SuppressWarnings("all")
public class SensorTypeAspectSensorTypeAspectContext {
  public final static SensorTypeAspectSensorTypeAspectContext INSTANCE = new SensorTypeAspectSensorTypeAspectContext();
  
  public static SensorTypeAspectSensorTypeAspectProperties getSelf(final SensorType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.idm.smartHome.aspects.SensorTypeAspectSensorTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SensorType, SensorTypeAspectSensorTypeAspectProperties> map = new java.util.WeakHashMap<smartHome.SensorType, fr.unice.polytech.idm.smartHome.aspects.SensorTypeAspectSensorTypeAspectProperties>();
  
  public Map<SensorType, SensorTypeAspectSensorTypeAspectProperties> getMap() {
    return map;
  }
}
