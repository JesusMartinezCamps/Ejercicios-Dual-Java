package foobarspam; /*org.foobarspam.figuras*/

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		/*assertEquals(12, Rectangulo.area);*/
		
		
		/*Test de Rectangulo*/
		Rectangulo rectanguloPrueba = new Rectangulo(4, 3);
		
		if(rectanguloPrueba.area() == 12){
			System.out.println("Rectangulo Ok.");
		}
		
		/*Test de Cuadrado*/
		Cuadrado cuadradoPrueba = new Cuadrado(5);
		
		if(cuadradoPrueba.area() == 25) {
			System.out.println("Cuadrado Ok.");
		}
		
		/*Test de Elipse*/
		Elipse elipsePrueba = new Elipse(3, 2);
		
		if(elipsePrueba.area() == 18.84) {
			System.out.println("Elipse Ok.");
		}
		
		/*Test del Circulo*/
		Circulo circuloPrueba = new Circulo(5);
					
		if(circuloPrueba.area() == 78.5) {
			System.out.println("Circulo Ok.");
		}
		
		
		/*Creacion del array*/
		/*Siendo  FiguraGeometrica	la clase padre, por lo que se pueden meter todas las clases que deriven de ella*/
		ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
		
		
		/*Creación de los objetos que se guardaran en el Array*/
		Rectangulo rectanguloArray = new Rectangulo(4, 5);
		Cuadrado cuadradoArray = new Cuadrado(6);
		Elipse elipseArray = new Elipse(7, 3);
		Circulo circuloArray = new Circulo(8);

		
		/*Guardado de los objetos en el array*/
		figuras.add(rectanguloArray);
		figuras.add(cuadradoArray);
		figuras.add(elipseArray);
		figuras.add(circuloArray);
		
		
		/*Recorrido de la array*/
		for (FiguraGeometrica cadaFigura : figuras){
			System.out.println("Area del " + cadaFigura.getNombre() + " = " + cadaFigura.area());
		}
	}
}
