package org.fooberarspam.furnaceDIGuice.consumer;

import org.foobarspam.furnaceDIGuice.types.RegulatorDisplayCodes;
import org.foobarspam.furnaceDIGuice.types.RoomTemperature;

public interface Regulator {

	public void regulate();
	public void message(RegulatorDisplayCodes code, RoomTemperature temperature);
}
