package fr.unice.polytech.idm.smartHome.aspects;

import fr.unice.polytech.idm.smartHome.aspects.IntegerSensorAspectIntegerSensorAspectProperties;
import java.util.Map;
import smartHome.IntegerSensor;

@SuppressWarnings("all")
public class IntegerSensorAspectIntegerSensorAspectContext {
  public final static IntegerSensorAspectIntegerSensorAspectContext INSTANCE = new IntegerSensorAspectIntegerSensorAspectContext();
  
  public static IntegerSensorAspectIntegerSensorAspectProperties getSelf(final IntegerSensor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.idm.smartHome.aspects.IntegerSensorAspectIntegerSensorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerSensor, IntegerSensorAspectIntegerSensorAspectProperties> map = new java.util.WeakHashMap<smartHome.IntegerSensor, fr.unice.polytech.idm.smartHome.aspects.IntegerSensorAspectIntegerSensorAspectProperties>();
  
  public Map<IntegerSensor, IntegerSensorAspectIntegerSensorAspectProperties> getMap() {
    return map;
  }
}
