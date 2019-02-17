package fr.unice.polytech.idm.smartHome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.idm.smartHome.aspects.ConditionAspect;
import fr.unice.polytech.idm.smartHome.aspects.RuleAspectRuleAspectProperties;
import java.util.function.Predicate;
import org.eclipse.xtext.xbase.lib.InputOutput;
import smartHome.Condition;
import smartHome.Rule;

@Aspect(className = Rule.class)
@SuppressWarnings("all")
public class RuleAspect {
  @Step
  public static void evaluateRule(final Rule _self) {
    final fr.unice.polytech.idm.smartHome.aspects.RuleAspectRuleAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.RuleAspectRuleAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateRule()
    if (_self instanceof smartHome.Rule){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.idm.smartHome.aspects.RuleAspect._privk3_evaluateRule(_self_, (smartHome.Rule)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Rule", "evaluateRule");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  public static void triggerEvent(final Rule _self) {
    final fr.unice.polytech.idm.smartHome.aspects.RuleAspectRuleAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.RuleAspectRuleAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void triggerEvent()
    if (_self instanceof smartHome.Rule){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.idm.smartHome.aspects.RuleAspect._privk3_triggerEvent(_self_, (smartHome.Rule)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Rule", "triggerEvent");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static int timeTrue(final Rule _self) {
    final fr.unice.polytech.idm.smartHome.aspects.RuleAspectRuleAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.RuleAspectRuleAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int timeTrue()
    if (_self instanceof smartHome.Rule){
    	result = fr.unice.polytech.idm.smartHome.aspects.RuleAspect._privk3_timeTrue(_self_, (smartHome.Rule)_self);
    };
    return (int)result;
  }
  
  private static void timeTrue(final Rule _self, final int timeTrue) {
    final fr.unice.polytech.idm.smartHome.aspects.RuleAspectRuleAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.RuleAspectRuleAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void timeTrue(int)
    if (_self instanceof smartHome.Rule){
    	fr.unice.polytech.idm.smartHome.aspects.RuleAspect._privk3_timeTrue(_self_, (smartHome.Rule)_self,timeTrue);
    };
  }
  
  protected static void _privk3_evaluateRule(final RuleAspectRuleAspectProperties _self_, final Rule _self) {
    final Predicate<Condition> _function = (Condition it) -> {
      boolean _evaluate = ConditionAspect.evaluate(it);
      return (_evaluate == true);
    };
    boolean ruleRespected = _self.getConditions().stream().allMatch(_function);
    if (ruleRespected) {
      int _timeTrue = RuleAspect.timeTrue(_self);
      int _plus = (_timeTrue + 1);
      RuleAspect.timeTrue(_self, _plus);
    } else {
      RuleAspect.timeTrue(_self, 0);
    }
    int _timeTrue_1 = RuleAspect.timeTrue(_self);
    int _value = _self.getDuration().getValue();
    boolean _greaterEqualsThan = (_timeTrue_1 >= _value);
    if (_greaterEqualsThan) {
      RuleAspect.triggerEvent(_self);
    }
  }
  
  protected static void _privk3_triggerEvent(final RuleAspectRuleAspectProperties _self_, final Rule _self) {
    String _description = _self.getEvent().getDescription();
    String _plus = ("Event triggered : " + _description);
    InputOutput.<String>println(_plus);
  }
  
  protected static int _privk3_timeTrue(final RuleAspectRuleAspectProperties _self_, final Rule _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTimeTrue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.timeTrue;
  }
  
  protected static void _privk3_timeTrue(final RuleAspectRuleAspectProperties _self_, final Rule _self, final int timeTrue) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTimeTrue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, timeTrue);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.timeTrue = timeTrue;
    }
  }
}
