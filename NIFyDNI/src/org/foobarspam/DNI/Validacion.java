package org.foobarspam.DNI;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion{
	public static void main(String[] args) {
		
		//Primer caso Test, primera comprobación de la expresión regular contra DNIs y NIEs buenos y malos
		String regex = "\\b\\d{8}[A-Z&&[^ÑOUI]]|\\b[ZYX]\\d{7}[A-Z&&[^ÑOIU]]\\b";
		String dniBueno = "45669852B";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(dniBueno);
		
	
		String dniMalo = "476545645454B";
		Matcher m2 = p.matcher(dniMalo);
		
		
		String nieBueno = "X4523659A";
		Matcher matcherNieBueno = p.matcher(nieBueno);
		
		String nieMalo = "X4523659Ñ";
		Matcher matcherNieMalo = p.matcher(nieMalo);
		
		System.out.println("\nPrimer caso test, comprobar dos DNI u NIE, uno correcto y otro incorrecto");

		System.out.println("\nEl regex usado es: " + regex+"\n");
		
		//Para el DNI bueno
		if(m.find()){
			System.out.println(dniBueno+" Pasado");
		}else System.out.println("Mal formado");
		
		//Para el DNI malo
		if(m2.find()){
			System.out.println(dniMalo+" Pasado");
		}else System.out.println("Mal formado");

		//Para el NIE bueno
		if(matcherNieBueno.find()){
			System.out.println(nieBueno+" Pasado");
		}else System.out.println("Mal formado");
		
		//Para el NIE malo
		if(matcherNieMalo.find()){
			System.out.println(nieMalo+" Pasado");
		}else System.out.println("Mal formado");

		
		//Segundo caso Test, contra una lista de DNIs y NIEs
		
		System.out.println("\nSegundo caso test, comprobar el regex contra una array de DNIs y NIEs\n");

		Short numeroDNI = 0;
		String[] casosTest = { 
				// casos DNI PASS
		 		"78484464T","72376173A","01817200Q","95882054E","63587725Q",
		 		"26861694V","21616083Q","26868974Y","40135330P","89044648X",
		 		"80117501Z","34168723S","76857238R","66714505S","66499420A",
		 		// casos NIE PASS
		 		"X1234567T", "Y1234567T", "Z1234567T",
		 		// casos NIE FAIL
		 		"J1234567T", "H1234567T", "R1234567T",
		 		"X12345678X", "X1234T", "X1234567I"
		 		};
		
		for(String caso : casosTest){
			numeroDNI ++;
			
			Matcher match = p.matcher(caso);
			
			if(match.find()){
				
				String dniEncontrado = match.group();
				
				if(dniEncontrado == caso){
					System.out.println(numeroDNI.toString() + ": " +dniEncontrado+" Pasado");
				}else System.out.println("El regex no funciona correctamente en el DNI: "+dniEncontrado);
			}else System.out.println(numeroDNI.toString() + ": "+caso+" no esta bien formado");
		}
	
		//Tercer caso Test, crear los DNIs  8 dígitos al azar y una letra Incorrecta
		System.out.println("\nTercer caso test, crear los DNIs con 8 dígitos al azar y una letra Incorrecta\n");

		char[] poolLetrasErroneas = {'I','O','U','Ñ'};
		int numeroDeDNIs = 20 ;
		ArrayList<String> casosTestErroneos = new ArrayList<>();
		
		
		for(int i = 1; i < numeroDeDNIs ; i++){
			String caso = "";
			for(int j=1; j<9; j++){
				Integer caracterAscii = ThreadLocalRandom.current().nextInt(48, 58);
				caso = caso + String.valueOf(Character.toChars(caracterAscii));
			}
			caso = caso + poolLetrasErroneas[ThreadLocalRandom.current().nextInt(0,3)];
			
			casosTestErroneos.add(caso);
		}
		int numeroDni =0;
		for (String dni: casosTestErroneos){
			numeroDni ++;
			Matcher match = p.matcher(dni);
			
			if (match.find()) {
				System.out.println(numeroDni+dni + " ");
			}
			
		}
		
	}
}
