package foobarspam;

public class Elipse extends FiguraGeometrica {

	/*Variables y constantes*/
	private double ejeMenor = 2;
	private double ejeMayor = 3;
	private final double pi = 3.14;
	private final String nombre = "Elipse";
	
	/*Constructor sin parametros*/
	public Elipse() {
		super();
	}
	
	public Elipse(double ejeMenor, double ejeMayor) {
		super();
		this.ejeMenor = ejeMenor;
		this.ejeMayor = ejeMayor;
	}

	public double getEjeMenor() {
		return this.ejeMenor;
	}
	
	public double getEjeMayor() {
		return this.ejeMayor;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	@Override
	public double area() {
		return pi * getEjeMenor() * getEjeMayor();
	}
}
