package fr.unice.polytech.idm.smartHome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.idm.smartHome.aspects.ConditionAspectConditionAspectProperties;
import smartHome.Condition;

@Aspect(className = Condition.class)
@SuppressWarnings("all")
public abstract class ConditionAspect {
  @Step
  @Abstract
  public static boolean evaluate(final Condition _self) {
    final fr.unice.polytech.idm.smartHome.aspects.ConditionAspectConditionAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.ConditionAspectConditionAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto fr.unice.polytech.idm.smartHome.aspects.ConditionAspect#boolean evaluate() from fr.unice.polytech.idm.smartHome.aspects.IntegerConditionAspect
    		if (_self instanceof smartHome.IntegerCondition){
    			result = fr.unice.polytech.idm.smartHome.aspects.IntegerConditionAspect.evaluate((smartHome.IntegerCondition)_self);
    		} else
    		// EndInjectInto fr.unice.polytech.idm.smartHome.aspects.ConditionAspect#boolean evaluate() from fr.unice.polytech.idm.smartHome.aspects.IntegerConditionAspect
    	// BeginInjectInto fr.unice.polytech.idm.smartHome.aspects.ConditionAspect#boolean evaluate() from fr.unice.polytech.idm.smartHome.aspects.BooleanConditionAspect
    		if (_self instanceof smartHome.BooleanCondition){
    			result = fr.unice.polytech.idm.smartHome.aspects.BooleanConditionAspect.evaluate((smartHome.BooleanCondition)_self);
    		} else
    		// EndInjectInto fr.unice.polytech.idm.smartHome.aspects.ConditionAspect#boolean evaluate() from fr.unice.polytech.idm.smartHome.aspects.BooleanConditionAspect
    // #DispatchPointCut_before# boolean evaluate()
    if (_self instanceof smartHome.Condition){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.unice.polytech.idm.smartHome.aspects.ConditionAspect._privk3_evaluate(_self_, (smartHome.Condition)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Condition", "evaluate");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evaluate(final ConditionAspectConditionAspectProperties _self_, final Condition _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
