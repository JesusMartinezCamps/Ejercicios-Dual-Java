package org.foobarspam.furnaceDIGuice.DIGuice;

import org.foobarspam.furnaceDIGuice.hardware.GasHeater;
import org.foobarspam.furnaceDIGuice.hardware.Regulador;
import org.foobarspam.furnaceDIGuice.hardware.RemoteCommandSensor;
import org.foobarspam.furnaceDIGuice.injector.AppInjector;
import org.foobarspam.furnaceDIGuice.interfaces.Heater;
import org.foobarspam.furnaceDIGuice.interfaces.Thermometer;
import org.foobarspam.furnaceDIGuice.otherstuff.Jedi;
import org.foobarspam.furnaceDIGuice.types.RoomTemperature;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ) {
    	
    	final double minTemp = 15.0;
        final double maxTemp = 21.0;
        RoomTemperature temperature = new RoomTemperature(15);

        
        Injector injector = Guice.createInjector(new AppInjector());		
		
        // Heater heater = new GasHeater();
        // Thermometer thermometer = new RemoteCommandSensor();
		// Regulador regulator = new Regulador();
		Regulador regulador = injector.getInstance(Regulador.class);
		
		regulador.setMinTemp(minTemp);
		regulador.setMaxTemp(maxTemp);
		regulador.setTemperature(temperature);
		
        System.out.println( "Arrancando..." );
        
		regulador.regulate();        
        
        ((Jedi) regulador.getHeater()).speak();
        
        /* Jedi yoda = new Jedi();
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        yoda.speak();
        */
    }
}
