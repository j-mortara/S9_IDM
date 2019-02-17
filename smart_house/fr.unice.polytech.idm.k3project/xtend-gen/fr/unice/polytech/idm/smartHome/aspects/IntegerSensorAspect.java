package fr.unice.polytech.idm.smartHome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.idm.smartHome.aspects.IntegerSensorAspectIntegerSensorAspectProperties;
import fr.unice.polytech.idm.smartHome.aspects.SensorAspect;
import smartHome.IntegerSensor;

@Aspect(className = IntegerSensor.class)
@SuppressWarnings("all")
public class IntegerSensorAspect extends SensorAspect {
  public static void setSensorValue(final IntegerSensor _self) {
    final fr.unice.polytech.idm.smartHome.aspects.IntegerSensorAspectIntegerSensorAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.IntegerSensorAspectIntegerSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void setSensorValue()
    if (_self instanceof smartHome.IntegerSensor){
    	fr.unice.polytech.idm.smartHome.aspects.IntegerSensorAspect._privk3_setSensorValue(_self_, (smartHome.IntegerSensor)_self);
    };
  }
  
  public static Object getSensorValue(final IntegerSensor _self) {
    final fr.unice.polytech.idm.smartHome.aspects.IntegerSensorAspectIntegerSensorAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.IntegerSensorAspectIntegerSensorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object getSensorValue()
    if (_self instanceof smartHome.IntegerSensor){
    	result = fr.unice.polytech.idm.smartHome.aspects.IntegerSensorAspect._privk3_getSensorValue(_self_, (smartHome.IntegerSensor)_self);
    };
    return (java.lang.Object)result;
  }
  
  protected static void _privk3_setSensorValue(final IntegerSensorAspectIntegerSensorAspectProperties _self_, final IntegerSensor _self) {
    _self.setValue(Integer.parseInt(SensorAspect.currentSt(_self).split(" ")[1]));
  }
  
  protected static Object _privk3_getSensorValue(final IntegerSensorAspectIntegerSensorAspectProperties _self_, final IntegerSensor _self) {
    return Integer.valueOf(_self.getValue());
  }
}
