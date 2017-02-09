package org.foobarspam.Estacion;
import org.foobarspam.Bicicleta.*;
import org.foobarspam.tarjeta.*;

public class Estacion {

	/*Atributos*/
	private int id = 0;
	private String direccion = null;
	private int numeroAnclajes = 0;
	private Bicicleta anclajes[] = null;
	private int anclajesLibres = 0;
	
	
	/*Constructor*/
	public Estacion(int id, String direccion, int numeroAnclajes){
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
		this.anclajes = new Bicicleta[numeroAnclajes];
	}

	/*getters*/
	public int getId(){
		return this.id;
	}
	public String getDireccion(){
		return this.direccion;
	}
	public int getNumeroAnclajes(){
		return this.numeroAnclajes;
	}
	public int getAnclajesLibres(){
		return this.anclajesLibres;
	}
	public void setAnclajesLibres(int anclajesLibres){
		this.anclajesLibres = this.anclajesLibres + anclajesLibres;
	}
	public Bicicleta[] getAnclajes() {
		return this.anclajes;
	}
	
	/*Interfaz pública*/
	public void consultarEstacion(){
		System.out.println(" id: "+getId()+"\n direccion: "+getDireccion()+"\n numeroAnclajes: "+getNumeroAnclajes());
	}
	
	public int anclajesLibres(){
		int contador = 0;
		for (Bicicleta bicicleta : getAnclajes()){
			if (bicicleta == null){
				contador += 1;
			}
		}
		return contador;
	}

	public void anclarBicicleta(Bicicleta bicicleta){
		int posicion = 0;
		int numeroAnclaje = posicion +1;
		for(Bicicleta anclaje : getAnclajes()){
			if(anclaje == null){
				anclajes[posicion] = bicicleta;
				mostrarAnclaje(bicicleta, numeroAnclaje);
				break;
			}else{
				posicion ++;
				numeroAnclaje ++;
			}
		}
	}
	public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje){
		System.out.println("Bicicleta anclada: "+bicicleta.getId()+" anclada en el anclaje: "+numeroAnclaje);
	}
	
	public void consultarAnclajes(){
		int contador = 0;
		for(Bicicleta anclaje : getAnclajes()){
			if(anclaje == null){
				System.out.println("Anclaje: "+contador+" Estado: Libre");
			}else{
				System.out.println("Anclaje: "+contador+" Estado: "+getAnclajes()[contador].getId());
			}
			contador ++;
		}
	}
	public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
		if(tarjetaUsuario.getEstado() == true){
			return true;
		}else{
			return false;
		}
	}
	
	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario){
		int contador = 1;
		System.out.println("bicicletaRetirada: "+getAnclajes()[contador-1].getId()+" del anclaje: "+contador);
		anclajes[0] = null;
	}
	
}
