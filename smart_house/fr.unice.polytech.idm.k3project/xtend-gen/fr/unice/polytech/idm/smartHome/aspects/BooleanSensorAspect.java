package fr.unice.polytech.idm.smartHome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.idm.smartHome.aspects.BooleanSensorAspectBooleanSensorAspectProperties;
import fr.unice.polytech.idm.smartHome.aspects.SensorAspect;
import smartHome.BooleanSensor;

@Aspect(className = BooleanSensor.class)
@SuppressWarnings("all")
public class BooleanSensorAspect extends SensorAspect {
  public static void setSensorValue(final BooleanSensor _self) {
    final fr.unice.polytech.idm.smartHome.aspects.BooleanSensorAspectBooleanSensorAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.BooleanSensorAspectBooleanSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void setSensorValue()
    if (_self instanceof smartHome.BooleanSensor){
    	fr.unice.polytech.idm.smartHome.aspects.BooleanSensorAspect._privk3_setSensorValue(_self_, (smartHome.BooleanSensor)_self);
    };
  }
  
  public static Object getSensorValue(final BooleanSensor _self) {
    final fr.unice.polytech.idm.smartHome.aspects.BooleanSensorAspectBooleanSensorAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.BooleanSensorAspectBooleanSensorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object getSensorValue()
    if (_self instanceof smartHome.BooleanSensor){
    	result = fr.unice.polytech.idm.smartHome.aspects.BooleanSensorAspect._privk3_getSensorValue(_self_, (smartHome.BooleanSensor)_self);
    };
    return (java.lang.Object)result;
  }
  
  protected static void _privk3_setSensorValue(final BooleanSensorAspectBooleanSensorAspectProperties _self_, final BooleanSensor _self) {
    _self.setValue(Boolean.parseBoolean(SensorAspect.currentSt(_self).split(" ")[1]));
  }
  
  protected static Object _privk3_getSensorValue(final BooleanSensorAspectBooleanSensorAspectProperties _self_, final BooleanSensor _self) {
    return Boolean.valueOf(_self.isValue());
  }
}
