package foobarspam;
import java.util.ArrayList;

public class Figuritas {
	
	
	public static void main (String[] args){
		// Main del programa
		
		//Utilizamos una colección de ArrayList para guardar las figuras
		ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
		
		//Declaramos las figuras
		Rectangulo rectangulo1 = new Rectangulo(3, 4);
		Rectangulo rectangulo2 = new Rectangulo("Rectangulo", 4, 5);
		Circulo circulo1 = new Circulo(5);
		Circulo circulo2 = new Circulo("Circulo", 3);
		Cuadrado cuadrado1 = new Cuadrado(4);
		Cuadrado cuadrado2 = new Cuadrado("Cuadrado", 6);
		Elipse elipse1 = new Elipse(3, 5);
		Elipse elipse2 = new Elipse("Elipse", 5, 7);
		
		//Añadimos las figuras en el ArrayList
		figuras.add(rectangulo1);
		figuras.add(rectangulo2);
		figuras.add(cuadrado1);
		figuras.add(cuadrado2);
		figuras.add(circulo1);
		figuras.add(circulo2);
		figuras.add(elipse1);
		figuras.add(elipse2);
		
		//Recorremos el ArrayList para imprimir el contenido
		for(FiguraGeometrica figura : figuras){
			System.out.println("La figura " + figura.getNombre() +
					" tiene un área de: " + figura.area());
		}
		
		// Hay que configurar el arranque de la maquina virtual java con -ea (enable assertions) para que el compilador lea las aserciones
		assert rectangulo1.area() == 12;
		assert rectangulo2.area() == 20;
		assert cuadrado1.area() == 16;
		assert cuadrado2.area() == 36;
		assert circulo1.area() == 78.53981633974483;
		assert circulo2.area() == 28.274333882308138;
		assert elipse1.area() == 47.12388980384689;
		assert elipse2.area() == 109.95574287564276;
	}
	
}
