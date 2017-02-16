package org.foobarspam.CuentaCorrinte.Testing;

import static org.junit.Assert.*;

import org.foobarspam.CuentaCorriente.CuentaCorriente;
import org.junit.Before;
import org.junit.Test;

public class cuentaCorrienteTest {

	CuentaCorriente cuentaPrueba = new CuentaCorriente();
	
	@Before
	public void setUp(){
		cuentaPrueba = new CuentaCorriente("Jesus", "Martinez", "casa", "653214569", "65324614B", 100);
	}
	
	@Test
	public void saldoNegativotest() {
		cuentaPrueba.setSaldo(50);
		
		assertEquals(false, cuentaPrueba.saldoNegativo());
	}

	@Test
	public void constructorTest(){
		
		assertEquals("Jesus", cuentaPrueba.getNombre());
		assertEquals("Martinez", cuentaPrueba.getApellidos());
		assertEquals("casa", cuentaPrueba.getDireccion());
		assertEquals("653214569", cuentaPrueba.getTelefono());
		assertEquals("65324614B", cuentaPrueba.getNif());
		if (cuentaPrueba.getSaldo() == 100.0){
			System.out.println("OK");
		} else{
			System.out.println("NO OK");
		}
	}
	@Test
	public void sacarDineroTest(){		
		double restarValor = 50;
		
		cuentaPrueba.sacarDinero(restarValor);
		
		assertEquals(50, cuentaPrueba.getSaldo(),0);
	}
	@Test
	public void ingresarDineroTest(){
		double sumarValor = 50;
		cuentaPrueba.ingresarDinero(sumarValor);
	
		assertEquals(150, cuentaPrueba.getSaldo(), 0);
	}
	@Test
	public void saldoNegativoTest(){
		CuentaCorriente cuenta = new CuentaCorriente();
		
		cuenta.setSaldo(-5);
		assertEquals(true, cuenta.saldoNegativo());
		
		cuenta.setSaldo(+10);
		assertEquals(false, cuenta.saldoNegativo());
	}
}
