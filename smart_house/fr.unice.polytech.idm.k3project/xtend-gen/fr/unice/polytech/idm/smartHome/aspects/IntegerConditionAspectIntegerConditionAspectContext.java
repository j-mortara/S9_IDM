package fr.unice.polytech.idm.smartHome.aspects;

import fr.unice.polytech.idm.smartHome.aspects.IntegerConditionAspectIntegerConditionAspectProperties;
import java.util.Map;
import smartHome.IntegerCondition;

@SuppressWarnings("all")
public class IntegerConditionAspectIntegerConditionAspectContext {
  public final static IntegerConditionAspectIntegerConditionAspectContext INSTANCE = new IntegerConditionAspectIntegerConditionAspectContext();
  
  public static IntegerConditionAspectIntegerConditionAspectProperties getSelf(final IntegerCondition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.idm.smartHome.aspects.IntegerConditionAspectIntegerConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerCondition, IntegerConditionAspectIntegerConditionAspectProperties> map = new java.util.WeakHashMap<smartHome.IntegerCondition, fr.unice.polytech.idm.smartHome.aspects.IntegerConditionAspectIntegerConditionAspectProperties>();
  
  public Map<IntegerCondition, IntegerConditionAspectIntegerConditionAspectProperties> getMap() {
    return map;
  }
}
