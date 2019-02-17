package fr.unice.polytech.idm.smartHome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectProperties;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import smartHome.Sensor;

@Aspect(className = Sensor.class)
@SuppressWarnings("all")
public abstract class SensorAspect {
  @Step
  public static void initSensor(final Sensor _self) {
    final fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initSensor()
    if (_self instanceof smartHome.Sensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.idm.smartHome.aspects.SensorAspect._privk3_initSensor(_self_, (smartHome.Sensor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Sensor", "initSensor");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  public static void sensorStep(final Sensor _self, final int currentStep) {
    final fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void sensorStep(int)
    if (_self instanceof smartHome.Sensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.idm.smartHome.aspects.SensorAspect._privk3_sensorStep(_self_, (smartHome.Sensor)_self,currentStep);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {currentStep}, command, "Sensor", "sensorStep");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Abstract
  public static void setSensorValue(final Sensor _self) {
    final fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    	// BeginInjectInto fr.unice.polytech.idm.smartHome.aspects.SensorAspect#void setSensorValue() from fr.unice.polytech.idm.smartHome.aspects.IntegerSensorAspect
    		if (_self instanceof smartHome.IntegerSensor){
    			fr.unice.polytech.idm.smartHome.aspects.IntegerSensorAspect.setSensorValue((smartHome.IntegerSensor)_self);
    		} else
    		// EndInjectInto fr.unice.polytech.idm.smartHome.aspects.SensorAspect#void setSensorValue() from fr.unice.polytech.idm.smartHome.aspects.IntegerSensorAspect
    	// BeginInjectInto fr.unice.polytech.idm.smartHome.aspects.SensorAspect#void setSensorValue() from fr.unice.polytech.idm.smartHome.aspects.BooleanSensorAspect
    		if (_self instanceof smartHome.BooleanSensor){
    			fr.unice.polytech.idm.smartHome.aspects.BooleanSensorAspect.setSensorValue((smartHome.BooleanSensor)_self);
    		} else
    		// EndInjectInto fr.unice.polytech.idm.smartHome.aspects.SensorAspect#void setSensorValue() from fr.unice.polytech.idm.smartHome.aspects.BooleanSensorAspect
    // #DispatchPointCut_before# void setSensorValue()
    if (_self instanceof smartHome.Sensor){
    	fr.unice.polytech.idm.smartHome.aspects.SensorAspect._privk3_setSensorValue(_self_, (smartHome.Sensor)_self);
    };
  }
  
  @Abstract
  public static Object getSensorValue(final Sensor _self) {
    final fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto fr.unice.polytech.idm.smartHome.aspects.SensorAspect#Object getSensorValue() from fr.unice.polytech.idm.smartHome.aspects.IntegerSensorAspect
    		if (_self instanceof smartHome.IntegerSensor){
    			result = fr.unice.polytech.idm.smartHome.aspects.IntegerSensorAspect.getSensorValue((smartHome.IntegerSensor)_self);
    		} else
    		// EndInjectInto fr.unice.polytech.idm.smartHome.aspects.SensorAspect#Object getSensorValue() from fr.unice.polytech.idm.smartHome.aspects.IntegerSensorAspect
    	// BeginInjectInto fr.unice.polytech.idm.smartHome.aspects.SensorAspect#Object getSensorValue() from fr.unice.polytech.idm.smartHome.aspects.BooleanSensorAspect
    		if (_self instanceof smartHome.BooleanSensor){
    			result = fr.unice.polytech.idm.smartHome.aspects.BooleanSensorAspect.getSensorValue((smartHome.BooleanSensor)_self);
    		} else
    		// EndInjectInto fr.unice.polytech.idm.smartHome.aspects.SensorAspect#Object getSensorValue() from fr.unice.polytech.idm.smartHome.aspects.BooleanSensorAspect
    // #DispatchPointCut_before# Object getSensorValue()
    if (_self instanceof smartHome.Sensor){
    	result = fr.unice.polytech.idm.smartHome.aspects.SensorAspect._privk3_getSensorValue(_self_, (smartHome.Sensor)_self);
    };
    return (java.lang.Object)result;
  }
  
  protected static String currentSt(final Sensor _self) {
    final fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String currentSt()
    if (_self instanceof smartHome.Sensor){
    	result = fr.unice.polytech.idm.smartHome.aspects.SensorAspect._privk3_currentSt(_self_, (smartHome.Sensor)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static void currentSt(final Sensor _self, final String currentSt) {
    final fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentSt(String)
    if (_self instanceof smartHome.Sensor){
    	fr.unice.polytech.idm.smartHome.aspects.SensorAspect._privk3_currentSt(_self_, (smartHome.Sensor)_self,currentSt);
    };
  }
  
  private static String nextSt(final Sensor _self) {
    final fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String nextSt()
    if (_self instanceof smartHome.Sensor){
    	result = fr.unice.polytech.idm.smartHome.aspects.SensorAspect._privk3_nextSt(_self_, (smartHome.Sensor)_self);
    };
    return (java.lang.String)result;
  }
  
  private static void nextSt(final Sensor _self, final String nextSt) {
    final fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void nextSt(String)
    if (_self instanceof smartHome.Sensor){
    	fr.unice.polytech.idm.smartHome.aspects.SensorAspect._privk3_nextSt(_self_, (smartHome.Sensor)_self,nextSt);
    };
  }
  
  private static BufferedReader br(final Sensor _self) {
    final fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# BufferedReader br()
    if (_self instanceof smartHome.Sensor){
    	result = fr.unice.polytech.idm.smartHome.aspects.SensorAspect._privk3_br(_self_, (smartHome.Sensor)_self);
    };
    return (java.io.BufferedReader)result;
  }
  
  private static void br(final Sensor _self, final BufferedReader br) {
    final fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void br(BufferedReader)
    if (_self instanceof smartHome.Sensor){
    	fr.unice.polytech.idm.smartHome.aspects.SensorAspect._privk3_br(_self_, (smartHome.Sensor)_self,br);
    };
  }
  
  protected static void _privk3_initSensor(final SensorAspectSensorAspectProperties _self_, final Sensor _self) {
    try {
      InputOutput.<String>println("SensorAspect");
      String _dataFile = _self.getDataFile();
      File _file = new File(_dataFile);
      FileReader _fileReader = new FileReader(_file);
      BufferedReader _bufferedReader = new BufferedReader(_fileReader);
      SensorAspect.br(_self, _bufferedReader);
      SensorAspect.currentSt(_self, SensorAspect.br(_self).readLine());
      SensorAspect.nextSt(_self, SensorAspect.br(_self).readLine());
      SensorAspect.setSensorValue(_self);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static void _privk3_sensorStep(final SensorAspectSensorAspectProperties _self_, final Sensor _self, final int currentStep) {
    try {
      String _nextSt = SensorAspect.nextSt(_self);
      boolean _tripleNotEquals = (_nextSt != null);
      if (_tripleNotEquals) {
        boolean _equals = Integer.valueOf(Integer.parseInt(SensorAspect.nextSt(_self).split(" ")[0])).equals(Integer.valueOf(currentStep));
        if (_equals) {
          SensorAspect.currentSt(_self, SensorAspect.nextSt(_self));
          SensorAspect.nextSt(_self, SensorAspect.br(_self).readLine());
          SensorAspect.setSensorValue(_self);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static void _privk3_setSensorValue(final SensorAspectSensorAspectProperties _self_, final Sensor _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static Object _privk3_getSensorValue(final SensorAspectSensorAspectProperties _self_, final Sensor _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static String _privk3_currentSt(final SensorAspectSensorAspectProperties _self_, final Sensor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentSt") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentSt;
  }
  
  protected static void _privk3_currentSt(final SensorAspectSensorAspectProperties _self_, final Sensor _self, final String currentSt) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentSt")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentSt);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentSt = currentSt;
    }
  }
  
  protected static String _privk3_nextSt(final SensorAspectSensorAspectProperties _self_, final Sensor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getNextSt") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.nextSt;
  }
  
  protected static void _privk3_nextSt(final SensorAspectSensorAspectProperties _self_, final Sensor _self, final String nextSt) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setNextSt")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, nextSt);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.nextSt = nextSt;
    }
  }
  
  protected static BufferedReader _privk3_br(final SensorAspectSensorAspectProperties _self_, final Sensor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getBr") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.io.BufferedReader) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.br;
  }
  
  protected static void _privk3_br(final SensorAspectSensorAspectProperties _self_, final Sensor _self, final BufferedReader br) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setBr")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, br);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.br = br;
    }
  }
}
