package fr.unice.polytech.idm.smartHome.aspects;

import fr.unice.polytech.idm.smartHome.aspects.BooleanSensorAspectBooleanSensorAspectProperties;
import java.util.Map;
import smartHome.BooleanSensor;

@SuppressWarnings("all")
public class BooleanSensorAspectBooleanSensorAspectContext {
  public final static BooleanSensorAspectBooleanSensorAspectContext INSTANCE = new BooleanSensorAspectBooleanSensorAspectContext();
  
  public static BooleanSensorAspectBooleanSensorAspectProperties getSelf(final BooleanSensor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.idm.smartHome.aspects.BooleanSensorAspectBooleanSensorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanSensor, BooleanSensorAspectBooleanSensorAspectProperties> map = new java.util.WeakHashMap<smartHome.BooleanSensor, fr.unice.polytech.idm.smartHome.aspects.BooleanSensorAspectBooleanSensorAspectProperties>();
  
  public Map<BooleanSensor, BooleanSensorAspectBooleanSensorAspectProperties> getMap() {
    return map;
  }
}
