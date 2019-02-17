package fr.unice.polytech.idm.smartHome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.idm.smartHome.aspects.BooleanConditionAspectBooleanConditionAspectProperties;
import fr.unice.polytech.idm.smartHome.aspects.ConditionAspect;
import smartHome.BooleanCondition;
import smartHome.BooleanOperator;

@Aspect(className = BooleanCondition.class)
@SuppressWarnings("all")
public class BooleanConditionAspect extends ConditionAspect {
  @Step
  public static boolean evaluate(final BooleanCondition _self) {
    final fr.unice.polytech.idm.smartHome.aspects.BooleanConditionAspectBooleanConditionAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.BooleanConditionAspectBooleanConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean evaluate()
    if (_self instanceof smartHome.BooleanCondition){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.unice.polytech.idm.smartHome.aspects.BooleanConditionAspect._privk3_evaluate(_self_, (smartHome.BooleanCondition)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "BooleanCondition", "evaluate");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evaluate(final BooleanConditionAspectBooleanConditionAspectProperties _self_, final BooleanCondition _self) {
    boolean _equals = _self.getOperator().equals(BooleanOperator.IS);
    if (_equals) {
      boolean _isValue = _self.getSensor().isValue();
      boolean _isOperand = _self.isOperand();
      return (_isValue == _isOperand);
    } else {
      boolean _isValue_1 = _self.getSensor().isValue();
      boolean _isOperand_1 = _self.isOperand();
      return (_isValue_1 != _isOperand_1);
    }
  }
}
