package org.foobarspam.ejercicio1.main;

public class Tiendas {
	    public static void main(String[] args) {
	    	/*Atributos*/
	        double[] ventas = {650, 8000, 930, 1020.99,320.35 };
	        double mayor = 0;
	        double menor = 0;
	        double total = 0;
	        int posicionMayor = 1;
	        int posicionMenor = 1;
	        menor = ventas[0];
	       
	        for (int i = 0; i < ventas.length; i++) {
	            if (ventas[i] >= mayor) {
	                mayor = ventas[i];
	                posicionMayor += i;
	            }
	            if (ventas[i] <= menor) {
	                menor = ventas[i];
	                posicionMenor += i ;
	            }
	            total += ventas[i];
	        }
	       
	        System.out.println("La tienda que menos ha vendido fue la " + posicionMenor + ", que vendió " + menor + " €");
	        System.out.println("La tienda que mas ha vendido fue la " + posicionMayor + ", que vendió " + mayor + " €");
	        System.out.println("El total de las ventas es: " + total + " €");
	    }
	}