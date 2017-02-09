package org.foobarspam.cuentaCorriente;

import java.util.Scanner;

public class Datos {
	
	/*Serie de datos a rellenar*/
	private String nombre = "";
	private String apellidos = "";
	private String direccion = "";
	private String telefono = "";
	private String NIF = "";
	private double saldo = 0d;
	
	
	Scanner sc = new Scanner(System.in);
	
	public String getNombre(String nombre){
		System.out.println("Introduce tu nombre: ");
		nombre = sc.nextLine();
		this.nombre = nombre;
		return nombre;
	}
}
