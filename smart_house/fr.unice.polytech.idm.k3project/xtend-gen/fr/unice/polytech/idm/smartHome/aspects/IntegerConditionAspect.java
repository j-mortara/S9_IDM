package fr.unice.polytech.idm.smartHome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.idm.smartHome.aspects.ConditionAspect;
import fr.unice.polytech.idm.smartHome.aspects.IntegerConditionAspectIntegerConditionAspectProperties;
import smartHome.IntegerCondition;
import smartHome.IntegerOperator;

@Aspect(className = IntegerCondition.class)
@SuppressWarnings("all")
public class IntegerConditionAspect extends ConditionAspect {
  @Step
  public static boolean evaluate(final IntegerCondition _self) {
    final fr.unice.polytech.idm.smartHome.aspects.IntegerConditionAspectIntegerConditionAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.IntegerConditionAspectIntegerConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean evaluate()
    if (_self instanceof smartHome.IntegerCondition){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.unice.polytech.idm.smartHome.aspects.IntegerConditionAspect._privk3_evaluate(_self_, (smartHome.IntegerCondition)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "IntegerCondition", "evaluate");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evaluate(final IntegerConditionAspectIntegerConditionAspectProperties _self_, final IntegerCondition _self) {
    boolean _equals = _self.getOperator().equals(IntegerOperator.INFERIOR);
    if (_equals) {
      int _value = _self.getSensor().getValue();
      int _operand = _self.getOperand();
      return (_value < _operand);
    } else {
      boolean _equals_1 = _self.getOperator().equals(IntegerOperator.SUPERIOR);
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
