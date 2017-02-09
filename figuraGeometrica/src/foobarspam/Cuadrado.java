package foobarspam;

public class Cuadrado extends FiguraGeometrica {

	/*Variables y constantes*/
	private double lado = 5;
	private final String nombre = "Cuadrado";
		
	/*Constructor sin parametros*/
	public Cuadrado(){
		super();
	}
	
	/*Constructor con el parametro de altura*/
	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	/*Metodo que devuelve el lado*/
	public double getLado() {
		return this.lado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public double area() {
		return getLado() * getLado();
	}
	
}
