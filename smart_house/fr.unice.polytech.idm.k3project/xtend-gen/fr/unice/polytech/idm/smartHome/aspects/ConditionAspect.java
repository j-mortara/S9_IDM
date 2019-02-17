package fr.unice.polytech.idm.smartHome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.idm.smartHome.aspects.ConditionAspectConditionAspectProperties;
import smartHome.Condition;
import smartHome.Operator;

@Aspect(className = Condition.class)
@SuppressWarnings("all")
public class ConditionAspect {
  @Step
  public static boolean evaluate(final Condition _self) {
    final fr.unice.polytech.idm.smartHome.aspects.ConditionAspectConditionAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.ConditionAspectConditionAspectContext.getSelf(_self);
    Object result = null;
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
    boolean _equals = _self.getOperator().equals(Operator.INFERIOR);
    if (_equals) {
      int _value = _self.getSensor().getValue();
      int _operand = _self.getOperand();
      return (_value < _operand);
    } else {
      boolean _equals_1 = _self.getOperator().equals(Operator.SUPERIOR);
      if (_equals_1) {
        int _value_1 = _self.getSensor().getValue();
        int _operand_1 = _self.getOperand();
        return (_value_1 > _operand_1);
      } else {
        int _value_2 = _self.getSensor().getValue();
        int _operand_2 = _self.getOperand();
        return (_value_2 == _operand_2);
      }
    }
  }
}
