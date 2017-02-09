package org.foobarspam.test;

import static org.junit.Assert.*;

import org.foobarspam.punto.MatrizPuntoSilla;
import org.junit.Test;

public class TestMatriz {

	@Test
	public void TestRecorrerMatriz() {
		
		/*Creación de la matriz a testear*/
		int[][] matrizTest={{ 2, 1, 3 }, 
				            { 1, 3, 4 }, 
				            { 7, 5, 6 }};
			            
		/*Creación de la matriz*/
		MatrizPuntoSilla matriz = new MatrizPuntoSilla(matrizTest);
		
		/*Arranque de la funcion recorrerMatriz*/
		matriz.recorrerMatriz();
		
		int total = 9;
		
		assertEquals(total, matriz.getTotalElementos());
	}

}
