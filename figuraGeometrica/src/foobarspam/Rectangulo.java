package foobarspam; /*org.foobarspam.figuras*/

public class Rectangulo extends FiguraGeometrica {
	
	/*Variables y constantes*/
	private double altura = 0d;
	private double anchura = 0d;
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
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double getAnchura() {
		return this.anchura;
	}
	
	public void setAnchura(double anchura){
		this.anchura = anchura;
	}
	
	@Override
	public double area() {
		return getAltura() * getAnchura();
	}
	
	public void draw(){
		System.out.println("El "+ this.nombre +" se ha dibujado");
	}
	
	public void aplicarTema(){
		System.out.println("El "+ this.nombre +" tiene un tema bien bonito");
	}
}
