package fr.unice.polytech.idm.smartHome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.idm.smartHome.aspects.SensorTypeAspectSensorTypeAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;
import smartHome.SensorType;

@Aspect(className = SensorType.class)
@SuppressWarnings("all")
public class SensorTypeAspect {
  public static void printInfo(final SensorType _self) {
    final fr.unice.polytech.idm.smartHome.aspects.SensorTypeAspectSensorTypeAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.SensorTypeAspectSensorTypeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void printInfo()
    if (_self instanceof smartHome.SensorType){
    	fr.unice.polytech.idm.smartHome.aspects.SensorTypeAspect._privk3_printInfo(_self_, (smartHome.SensorType)_self);
    };
  }
  
  protected static void _privk3_printInfo(final SensorTypeAspectSensorTypeAspectProperties _self_, final SensorType _self) {
    InputOutput.<String>println("SensorTypeAspect");
  }
}
