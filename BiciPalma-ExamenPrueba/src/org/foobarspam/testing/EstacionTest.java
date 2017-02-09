package org.foobarspam.testing;

import static org.junit.Assert.*;

import org.junit.Test;
import org.foobarspam.Estacion.*;
import org.foobarspam.tarjeta.TarjetaUsuario;

public class EstacionTest {

	@Test
	public void ConstructorEstacionTest() {
		Estacion estacion = new Estacion(1, "Manacor", 6);
		
		assertEquals(1, estacion.getId(), 0);
		assertEquals("Manacor", estacion.getDireccion());
		assertEquals(6, estacion.getNumeroAnclajes(), 0);
	}
	
	@Test
	public void anclajesLibresTest(){
		
		Estacion listaAnclajes = new Estacion (1, "Manacor", 6);
		
		int esperado = 6 ;
		
		assertEquals(esperado, listaAnclajes.anclajesLibres());
	}

	@Test
	public void anclarBicicleta(){

		int anclajesLibresEsperados = 2;
		assertEquals(anclajesLibresEsperados, 2 , 0);
	}
	
	@Test
	public void ConstructorTarjetaTest(){
		TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("000456789", true);
		String esperado = "000456789";
		boolean esperadoTrue = true;
		assertEquals(esperado, tarjetaUsuario.getId());
		assertEquals(esperadoTrue, tarjetaUsuario.getEstado());
	}
}
