package org.foobarspam.tarjeta;

public class TarjetaUsuario {

	private String id = null;
	private Boolean estado = false;
	
	public TarjetaUsuario(String id, Boolean estado){
		this.id = id;
		this.estado = estado;
	}
	
	public String getId(){
		return this.id;
	}
	public boolean getEstado(){
		return this.estado;
	}
					 
}
