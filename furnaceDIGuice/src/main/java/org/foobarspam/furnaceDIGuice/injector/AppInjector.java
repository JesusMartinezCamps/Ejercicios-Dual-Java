package org.foobarspam.furnaceDIGuice.injector;

import org.foobarspam.furnaceDIGuice.hardware.GasHeater;
import org.foobarspam.furnaceDIGuice.hardware.RemoteCommandSensor;
import org.foobarspam.furnaceDIGuice.interfaces.Heater;
import org.foobarspam.furnaceDIGuice.interfaces.Thermometer;
import org.foobarspam.furnaceDIGuice.otherstuff.Jedi;

import com.google.inject.AbstractModule;

public class AppInjector extends AbstractModule {

	@Override
	protected void configure() {
		//bind the service to implementation class
		bind(Heater.class).to(GasHeater.class);
		// para seleccionar el tipo de servicio mediante BindingAnnotation:
		bind(Heater.class).annotatedWith(Force.class).to(Jedi.class);
		bind(Thermometer.class).to(RemoteCommandSensor.class);
	}

}
