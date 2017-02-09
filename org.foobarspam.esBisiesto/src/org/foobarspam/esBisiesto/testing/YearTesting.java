package org.foobarspam.esBisiesto.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import org.foobarspam.esBisiesto.year.*;

public class YearTesting {

	/*Año bisiesto si:
	 * Es divisible entre 4
	 * En caso de divisible entre 100:
	 * 		Tambien lo debe de ser de 400
	 */
	
	@Test
	public void test_esBisiesto_positivo(){
		Year any = new Year (2000);
		assertEquals("Test año positivo", true, any.positivo());
	}
	
	@Test
	public void test_esBisiesto_cuatro() {
		Year any = new Year(2008);
		assertEquals("Test año divisible por 4", true, any.terminaCuatro());
	}
	
	@Test
	public void test_esBisiesto_cienYcuatrocientos() {
		/*Se comprueba, en caso de ser divisible por 100 que tambien lo sea por cuatrocientos*/
		Year any = new Year(2000);
		assertEquals("Test año acabado en 100 y 400", true, any.terminaCienYcuatrocientos());
	}
	
	@Test
	public void test_esBisiesto() {
		/*Cumple divisible 4 y divisible 100, si lo es por 100 también debe serlo por 400*/
		Year any = new Year(2000);
		assertEquals("Test año es bisiesto", true, any.esBisiesto());
	}
	
}
