package fr.unice.polytech.idm.smartHome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.idm.smartHome.aspects.LocationAspectLocationAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;
import smartHome.Location;

@Aspect(className = Location.class)
@SuppressWarnings("all")
public class LocationAspect {
  public static void printInfo(final Location _self) {
    final fr.unice.polytech.idm.smartHome.aspects.LocationAspectLocationAspectProperties _self_ = fr.unice.polytech.idm.smartHome.aspects.LocationAspectLocationAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void printInfo()
    if (_self instanceof smartHome.Location){
    	fr.unice.polytech.idm.smartHome.aspects.LocationAspect._privk3_printInfo(_self_, (smartHome.Location)_self);
    };
  }
  
  protected static void _privk3_printInfo(final LocationAspectLocationAspectProperties _self_, final Location _self) {
    InputOutput.<String>println("LocationAspect");
  }
}
