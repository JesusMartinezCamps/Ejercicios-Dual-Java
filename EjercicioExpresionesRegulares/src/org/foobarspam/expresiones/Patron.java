package org.foobarspam.expresiones;

//Se importan las librerias necesarias para las expresiones regulares
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Patron {

	public static void main(String[] args) {
		String expresion = "[d{9,}]";
		
		String telefono = "971458264";
		Patron.encontrarPatron(expresion, telefono);
		
		telefono = "9714565254";
		Patron.encontrarPatron(expresion, telefono);

		telefono = "98373827";
		Patron.encontrarPatron(expresion, telefono);

	}

	
	public static void encontrarPatron(String expresion, String telefono){
		Pattern p = Pattern.compile(expresion);
		 
		Matcher m = p.matcher(telefono);
		 
		// Se imprime la expresion con el numero de telefono
		System.out.println("\nExpresion:" + expresion);
		System.out.println("Telefono:" + telefono);
		
		
		boolean encontrado = false;
		while (m.find()) {
			System.out.println("Numeros encontrados:" + m.group() +", Empieza en:" + m.start() +", " 
			+ "termina en:" + m.end());

			encontrado = true;
		}
			 
		if (!encontrado) {
		System.out.println("No hay numeros encontrados");
		}
	}
}
