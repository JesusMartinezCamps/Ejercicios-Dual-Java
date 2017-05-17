package org.foobarspam.furnaceDIGuice.hardware;

import org.foobarspam.furnaceDIGuice.injector.Force;
import org.foobarspam.furnaceDIGuice.interfaces.Heater;
import org.foobarspam.furnaceDIGuice.interfaces.Thermometer;
import org.foobarspam.furnaceDIGuice.types.RegulatorDisplayCodes;
import org.foobarspam.furnaceDIGuice.types.RoomTemperature;
import org.fooberarspam.furnaceDIGuice.consumer.Regulator;

import com.google.inject.Inject;
import com.google.inject.Singleton;

public class Regulador implements Regulator {
	
	private Thermometer thermometer = null;
	private Heater heater = null;
	private double minTemp = 0;
	private double maxTemp = 0;
	private RoomTemperature temperature;
	
	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}

	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}

	public void setTemperature(RoomTemperature temperature) {
		this.temperature = temperature;
	}
	
	public Heater getHeater(){
		return this.heater;
	}

	// setter injection
	/* @Inject
	public void setService(Heater heater, Thermometer thermometer){
		this.heater = heater;
		this.thermometer = thermometer;
	}*/
	
	@Inject
	public void Regulador(Thermometer thermometer, @Force Heater heater){
		// con la BindingAnnotation @Force selecciono la implementacion Jedi
		// del servicio, aunque me obliga a crear una interfaz mas
		this.heater = heater;
		this.thermometer = thermometer;
		
	}
	
	public void regulate(){
			RegulatorDisplayCodes code;
			while(thermometer.read(temperature) < maxTemp){
				code = RegulatorDisplayCodes.HEATING;				
				heater.engage(temperature);
				message(code, temperature);
			}
			while (thermometer.read(temperature) > minTemp){
				code = RegulatorDisplayCodes.WAITING;
				heater.disengage(temperature);			
				message(code, temperature);
			}
	}

	public void message(RegulatorDisplayCodes code, RoomTemperature temperature){
		switch(code){
			case HEATING:
				System.out.println("Calentando => temperatura "+ temperature.getTemperature());
				break;
			case WAITING:
				System.out.println("Apagado => temperatura " + temperature.getTemperature());
				break;
			default:
				System.out.println("Algo raro sucede...");
				break;
		}
	}
}
