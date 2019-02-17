package fr.unice.polytech.idm.smartHome.aspects;

import fr.unice.polytech.idm.smartHome.aspects.RuleAspectRuleAspectProperties;
import java.util.Map;
import smartHome.Rule;

@SuppressWarnings("all")
public class RuleAspectRuleAspectContext {
  public final static RuleAspectRuleAspectContext INSTANCE = new RuleAspectRuleAspectContext();
  
  public static RuleAspectRuleAspectProperties getSelf(final Rule _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.idm.smartHome.aspects.RuleAspectRuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Rule, RuleAspectRuleAspectProperties> map = new java.util.WeakHashMap<smartHome.Rule, fr.unice.polytech.idm.smartHome.aspects.RuleAspectRuleAspectProperties>();
  
  public Map<Rule, RuleAspectRuleAspectProperties> getMap() {
    return map;
  }
}
