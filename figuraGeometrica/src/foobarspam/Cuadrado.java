package foobarspam;

public class Cuadrado extends FiguraGeometrica {

	/*Variables y constantes*/
	private double lado = 0d;
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

	public Cuadrado(String nombre, double lado){
		super(nombre);
		this.lado = lado;
	}
	/*Metodo que devuelve el lado*/
	public double getLado() {
		return this.lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double area() {
		return getLado() * getLado();
	}
	
	public void draw(){
		System.out.println("El "+ this.nombre +" se ha dibujado");
	}
	
	@Override
	public void aplicarTema(){
		System.out.println("El "+ this.nombre +" tiene un tema bien bonito");
	}
	
}
