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
	
	public Elipse(String nombre, double ejeMenor, double ejeMayor){
		super(nombre);
		this.ejeMenor = ejeMenor;
		this.ejeMayor = ejeMayor;
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
	
	public void setEjeMenor(double ejeMenor){
		this.ejeMenor = ejeMenor;
	}
	public void setEjeMayor(double ejeMayor){
		this.ejeMayor = ejeMayor;
	}
	@Override
	public double area() {
		return pi * getEjeMenor() * getEjeMayor();
	}
	
	public void draw(){
		System.out.println("El "+ this.nombre +" se ha dibujado");
	}
}
