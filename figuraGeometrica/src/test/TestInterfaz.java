package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import foobarspam.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestInterfaz {
	
	private static ArrayList<Drawable> figuras;
	
	@BeforeClass
	public static void setUpBeforeClass(){
		
		figuras = new ArrayList<>();
		
		Rectangulo rectangulo1 = new Rectangulo("rectangulo",3, 4);
		Circulo circulo = new Circulo("circulo",5);
		Cuadrado cuadrado = new Cuadrado("cuadrado",4);
		Elipse elipse = new Elipse("elipse",3, 5);
		Rectangulo rectangulo2 = new Rectangulo(7, 5);
		
		figuras.add(rectangulo1);
		figuras.add(rectangulo2);
		figuras.add(circulo);
		figuras.add(cuadrado);
		figuras.add(elipse);
		
		assertEquals(5, figuras.size());
	}
	
	@Test
	public void testArrayLenght() {
		assertEquals(5, figuras.size());
	}
	
	@Test
	public void testTipoObjeto(){
		assertTrue(figuras.get(0) instanceof Drawable);
		assertTrue(figuras.get(1) instanceof Drawable);
		assertTrue(figuras.get(2) instanceof Drawable);
		assertTrue(figuras.get(3) instanceof Drawable);
		assertTrue(figuras.get(4) instanceof Drawable);
	}
	
	@Test
	public void testDraw(){
		Drawables.dibujar(figuras);
	}
	
	@Test
	public void testTheme(){
		Drawables.elegirTema(figuras);
	}
	
	@Test
	public void testPolimorfismo(){
		Drawable circulito = new Circulo("circulo", 5);
		
		assertTrue(circulito instanceof Drawable);
		assertTrue(circulito instanceof Circulo);
		
		circulito.draw();
		
		circulito.aplicarTema();
		
		Circulo vistaCirculo;
		vistaCirculo = (Circulo) circulito;
		
		assertEquals(Math.PI * Math.pow(5, 2), vistaCirculo.area(), 0.1);
	}

}