package fr.unice.polytech.idm.smartHome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.unice.polytech.idm.smartHome.aspects.RuleAspect;
import fr.unice.polytech.idm.smartHome.aspects.SensorAspect;
import fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspectSmartHomeAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import smartHome.Location;
import smartHome.Rule;
import smartHome.Sensor;
import smartHome.SmartHome;

@Aspect(className = SmartHome.class)
@SuppressWarnings("all")
public class SmartHomeAspect {
  public static void initialize(final SmartHome _self) {
    final fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspectSmartHomeAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspectSmartHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initialize()
    if (_self instanceof smartHome.SmartHome){
    	fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspect._privk3_initialize(_self_, (smartHome.SmartHome)_self);
    };
  }
  
  @Main
  public static void exec(final SmartHome _self) {
    final fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspectSmartHomeAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspectSmartHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec()
    if (_self instanceof smartHome.SmartHome){
    	fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspect._privk3_exec(_self_, (smartHome.SmartHome)_self);
    };
  }
  
  private static int time(final SmartHome _self) {
    final fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspectSmartHomeAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspectSmartHomeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int time()
    if (_self instanceof smartHome.SmartHome){
    	result = fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspect._privk3_time(_self_, (smartHome.SmartHome)_self);
    };
    return (int)result;
  }
  
  private static void time(final SmartHome _self, final int time) {
    final fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspectSmartHomeAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspectSmartHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void time(int)
    if (_self instanceof smartHome.SmartHome){
    	fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspect._privk3_time(_self_, (smartHome.SmartHome)_self,time);
    };
  }
  
  protected static void _privk3_initialize(final SmartHomeAspectSmartHomeAspectProperties _self_, final SmartHome _self) {
    InputOutput.<String>println("SmartHomeAspect init");
    SmartHomeAspect.time(_self, 0);
    EList<Location> _locations = _self.getLocations();
    for (final Location location : _locations) {
      EList<Sensor> _sensors = location.getSensors();
      for (final Sensor sensor : _sensors) {
        SensorAspect.initSensor(sensor);
      }
    }
  }
  
  protected static void _privk3_exec(final SmartHomeAspectSmartHomeAspectProperties _self_, final SmartHome _self) {
    SmartHomeAspect.initialize(_self);
    InputOutput.<String>println("SmartHomeAspect exec");
    while ((SmartHomeAspect.time(_self) < 30)) {
      {
        int _time = SmartHomeAspect.time(_self);
        String _plus = ("===== Time : " + Integer.valueOf(_time));
        String _plus_1 = (_plus + " =====");
        InputOutput.<String>println(_plus_1);
        EList<Location> _locations = _self.getLocations();
        for (final Location location : _locations) {
          EList<Sensor> _sensors = location.getSensors();
          for (final Sensor sensor : _sensors) {
            {
              String _name = sensor.getName();
              String _plus_2 = ("Sensor " + _name);
              String _plus_3 = (_plus_2 + " value : ");
              int _value = sensor.getValue();
              String _plus_4 = (_plus_3 + Integer.valueOf(_value));
              InputOutput.<String>println(_plus_4);
              SensorAspect.sensorStep(sensor, SmartHomeAspect.time(_self));
            }
          }
        }
        EList<Rule> _rules = _self.getRules();
        for (final Rule rule : _rules) {
          RuleAspect.evaluateRule(rule);
        }
        int _time_1 = SmartHomeAspect.time(_self);
        int _plus_2 = (_time_1 + 1);
        SmartHomeAspect.time(_self, _plus_2);
      }
    }
  }
  
  protected static int _privk3_time(final SmartHomeAspectSmartHomeAspectProperties _self_, final SmartHome _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTime") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.time;
  }
  
  protected static void _privk3_time(final SmartHomeAspectSmartHomeAspectProperties _self_, final SmartHome _self, final int time) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, time);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.time = time;
    }
  }
}
