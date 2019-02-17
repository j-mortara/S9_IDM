package fr.unice.polytech.idm.smartHome.aspects;

import fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspectSmartHomeAspectProperties;
import java.util.Map;
import smartHome.SmartHome;

@SuppressWarnings("all")
public class SmartHomeAspectSmartHomeAspectContext {
  public final static SmartHomeAspectSmartHomeAspectContext INSTANCE = new SmartHomeAspectSmartHomeAspectContext();
  
  public static SmartHomeAspectSmartHomeAspectProperties getSelf(final SmartHome _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspectSmartHomeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SmartHome, SmartHomeAspectSmartHomeAspectProperties> map = new java.util.WeakHashMap<smartHome.SmartHome, fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspectSmartHomeAspectProperties>();
  
  public Map<SmartHome, SmartHomeAspectSmartHomeAspectProperties> getMap() {
    return map;
  }
}
