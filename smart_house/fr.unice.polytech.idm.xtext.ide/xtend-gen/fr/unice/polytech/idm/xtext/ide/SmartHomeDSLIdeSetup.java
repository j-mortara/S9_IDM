/**
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.idm.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.unice.polytech.idm.xtext.SmartHomeDSLRuntimeModule;
import fr.unice.polytech.idm.xtext.SmartHomeDSLStandaloneSetup;
import fr.unice.polytech.idm.xtext.ide.SmartHomeDSLIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class SmartHomeDSLIdeSetup extends SmartHomeDSLStandaloneSetup {
  @Override
  public Injector createInjector() {
    SmartHomeDSLRuntimeModule _smartHomeDSLRuntimeModule = new SmartHomeDSLRuntimeModule();
    SmartHomeDSLIdeModule _smartHomeDSLIdeModule = new SmartHomeDSLIdeModule();
    return Guice.createInjector(Modules2.mixin(_smartHomeDSLRuntimeModule, _smartHomeDSLIdeModule));
  }
}