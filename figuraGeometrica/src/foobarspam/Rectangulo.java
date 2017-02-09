package foobarspam; /*org.foobarspam.figuras*/

public class Rectangulo extends FiguraGeometrica {
	
	/*Variables y constantes*/
	private double altura = 4;
	private double anchura = 3;
	private String nombre = "Rectangulo";
	
	/*Constructor sin parametros*/
	public Rectangulo() {
		super(); /*se invoca al constructor de la clase superior*/
	}
	
	/*Constructor con los dos paramtros*/
	public Rectangulo(double altura, double anchura) {
		super();
		this.altura = altura;
		this.anchura = anchura;
	}
	
	/*Constructor con los dos parametros más el string de nombre*/
	public Rectangulo(String nombre, double altura, double anchura) {
		super(nombre);
		this.altura = altura;
		this.anchura = anchura;
	}
	
	/*Metodos que devuelven la altura y la anchura*/
	public double getAltura() {
		return this.altura;
	}
	
	public double getAnchura() {
		return this.anchura;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	/*
	 * public void setAltura(double altura){
		this.altura = altura; 
	}
	*/
	
	/*
	 * public void setAnchura(double anchura){
		this.anchura = anchura;
	}
	*/
	
	@Override
	public double area() {
		return getAltura() * getAnchura();
	}
}
