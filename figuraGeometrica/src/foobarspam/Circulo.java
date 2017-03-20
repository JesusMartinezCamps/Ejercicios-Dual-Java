package foobarspam;

public class Circulo extends FiguraGeometrica{
	
	/*Variables y constantes*/
	private double radio = 5;
	private final double  pi = 3.14;
	private final String nombre = "Circulo";
	
	/*Constructor sin parametros*/
	public Circulo() {
		super();
	}

	public Circulo(String nombre, double radio){
		super(nombre);
		this.radio = radio;
	}
	/*Constructor con el parametro de radio*/
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	/*Encargado de pasar el parametro radio*/
	public double getRadio() {
		return this.radio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public double area() {
		return pi * getRadio() * getRadio();
	}
	public void draw(){
		System.out.println("El "+ this.nombre +" se ha dibujado");
	}
	
	@Override
	public void aplicarTema(){
		System.out.println("El "+ this.nombre +" tiene un tema bien bonito");
	}
}
