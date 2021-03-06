package fr.unice.polytech.idm.smartHome.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import smartHome.Location
import smartHome.Sensor
import smartHome.SensorType
import smartHome.SmartHome
import static extension fr.unice.polytech.idm.smartHome.aspects.SensorAspect.*
import static extension fr.unice.polytech.idm.smartHome.aspects.SmartHomeAspect.*
import static extension fr.unice.polytech.idm.smartHome.aspects.LocationAspect.*
import static extension fr.unice.polytech.idm.smartHome.aspects.RuleAspect.*
import static extension fr.unice.polytech.idm.smartHome.aspects.ConditionAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Step
import smartHome.Rule
import smartHome.Condition
import smartHome.Operator
import smartHome.BooleanCondition
import smartHome.IntegerCondition
import smartHome.BooleanOperator
import smartHome.IntegerOperator
import smartHome.IntegerSensor
import smartHome.BooleanSensor

@Aspect(className=Sensor)
abstract class SensorAspect {
	var protected String currentSt;
	var String nextSt;
	var BufferedReader br;
	
	@Step
	def void initSensor(){
		println("SensorAspect");
		_self.br = new BufferedReader(new FileReader(new File(_self.dataFile)));
		_self.currentSt = _self.br.readLine();
		_self.nextSt = _self.br.readLine();
		_self.setSensorValue();
	}
	@Step
	def void sensorStep(int currentStep){
		if(_self.nextSt !== null){
			if(Integer.parseInt(_self.nextSt.split(" ").get(0)).equals(currentStep)){		
				_self.currentSt = _self.nextSt;				
				_self.nextSt = _self.br.readLine();
				_self.setSensorValue();
				
			}
		}
	}
	
	def abstract void setSensorValue(); 
	def abstract Object getSensorValue();
}

@Aspect(className=IntegerSensor)
class IntegerSensorAspect extends SensorAspect {
	def void setSensorValue(){
		_self.value = Integer.parseInt(_self.currentSt.split(" ").get(1));
	}
	def Object getSensorValue(){
		return _self.value;
	}
}

@Aspect(className=BooleanSensor)
class BooleanSensorAspect extends SensorAspect {
	def void setSensorValue(){
		_self.value = Boolean.parseBoolean(_self.currentSt.split(" ").get(1));
	}
	def Object getSensorValue(){
		return _self.value;
	}
}

@Aspect(className=Location) 
class LocationAspect {
	def void printInfo(){
		println("LocationAspect");
	}
}

@Aspect(className=SensorType)
class SensorTypeAspect {
	def void printInfo(){
		println("SensorTypeAspect");
	}
}

@Aspect(className=Rule)
class RuleAspect {
	
	var int timeTrue; 
	
	@Step
	def boolean evaluateRule(){
		var boolean ruleRespected = _self.conditions.stream.allMatch[evaluate() == true];
		if(ruleRespected){
			_self.timeTrue = _self.timeTrue + 1;
		} else {
			_self.timeTrue = 0;
		}
		if(_self.timeTrue >= _self.duration.value){
//			_self.triggerEvent();
			return true;
		}
		return false;
	}
	
	@Step
	def void triggerEvent(){
		println("Event triggered : " + _self.event.description);
	}
	
}

@Aspect(className=Condition)
abstract class ConditionAspect {
	@Step
	abstract def boolean evaluate();
}

@Aspect(className=BooleanCondition)
class BooleanConditionAspect extends ConditionAspect {
	@Step
	def boolean evaluate() {
		if(_self.operator.equals(BooleanOperator.IS)){
			return _self.sensor.value == _self.operand;
		} else {
			return _self.sensor.value != _self.operand;
		}
	}
}
@Aspect(className=IntegerCondition)
class IntegerConditionAspect extends ConditionAspect {
	@Step
	def boolean evaluate() {
		if(_self.operator.equals(IntegerOperator.INFERIOR)){
			return _self.sensor.value < _self.operand;
		} else if(_self.operator.equals(IntegerOperator.SUPERIOR)){
			return _self.sensor.value > _self.operand;
		} else {
			return _self.sensor.value == _self.operand;
		}
	}
}
@Aspect(className=SmartHome)
class SmartHomeAspect {
	
	var int time;
	
//	@InitializeModel
	def void initialize(){
		println("SmartHomeAspect init");
		_self.time = 0;
		for(Location location : _self.locations){
			for(Sensor sensor : location.sensors){
				sensor.initSensor();
			}
			
		}
	}
	
	@Main
	def void exec(){
		_self.initialize()
		println("SmartHomeAspect exec");
		while(_self.time < 30){
			println("===== Time : " + _self.time + " =====");
			for(Location location : _self.locations){
				for(Sensor sensor : location.sensors){
					println("Sensor " + sensor.name + " value : " + sensor.getSensorValue());
					sensor.sensorStep(_self.time);
				}				
			}
			for(Rule rule : _self.rules){
				println("Rule \""+ rule.event.description + "\" value : " + rule.evaluateRule());
			}
			_self.time = _self.time + 1;			
		}
	}
}