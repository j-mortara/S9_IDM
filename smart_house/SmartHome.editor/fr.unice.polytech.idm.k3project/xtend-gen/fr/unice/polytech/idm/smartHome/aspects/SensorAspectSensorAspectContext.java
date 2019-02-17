package fr.unice.polytech.idm.smartHome.aspects;

import fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectProperties;
import java.util.Map;
import smartHome.Sensor;

@SuppressWarnings("all")
public class SensorAspectSensorAspectContext {
  public final static SensorAspectSensorAspectContext INSTANCE = new SensorAspectSensorAspectContext();
  
  public static SensorAspectSensorAspectProperties getSelf(final Sensor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Sensor, SensorAspectSensorAspectProperties> map = new java.util.WeakHashMap<smartHome.Sensor, fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectProperties>();
  
  public Map<Sensor, SensorAspectSensorAspectProperties> getMap() {
    return map;
  }
}
