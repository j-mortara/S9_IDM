package fr.unice.polytech.idm.smartHome.aspects;

import fr.unice.polytech.idm.smartHome.aspects.BooleanConditionAspectBooleanConditionAspectProperties;
import java.util.Map;
import smartHome.BooleanCondition;

@SuppressWarnings("all")
public class BooleanConditionAspectBooleanConditionAspectContext {
  public final static BooleanConditionAspectBooleanConditionAspectContext INSTANCE = new BooleanConditionAspectBooleanConditionAspectContext();
  
  public static BooleanConditionAspectBooleanConditionAspectProperties getSelf(final BooleanCondition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.idm.smartHome.aspects.BooleanConditionAspectBooleanConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanCondition, BooleanConditionAspectBooleanConditionAspectProperties> map = new java.util.WeakHashMap<smartHome.BooleanCondition, fr.unice.polytech.idm.smartHome.aspects.BooleanConditionAspectBooleanConditionAspectProperties>();
  
  public Map<BooleanCondition, BooleanConditionAspectBooleanConditionAspectProperties> getMap() {
    return map;
  }
}
