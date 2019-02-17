package fr.unice.polytech.idm.smartHome.aspects;

import fr.unice.polytech.idm.smartHome.aspects.LocationAspectLocationAspectProperties;
import java.util.Map;
import smartHome.Location;

@SuppressWarnings("all")
public class LocationAspectLocationAspectContext {
  public final static LocationAspectLocationAspectContext INSTANCE = new LocationAspectLocationAspectContext();
  
  public static LocationAspectLocationAspectProperties getSelf(final Location _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.idm.smartHome.aspects.LocationAspectLocationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Location, LocationAspectLocationAspectProperties> map = new java.util.WeakHashMap<smartHome.Location, fr.unice.polytech.idm.smartHome.aspects.LocationAspectLocationAspectProperties>();
  
  public Map<Location, LocationAspectLocationAspectProperties> getMap() {
    return map;
  }
}
