package foobarspam; /*org.foobarspam.figuras*/

public abstract class FiguraGeometrica {
	
	private String nombre;
	
	public FiguraGeometrica() {
		this.nombre = "desconocido";
	}
		
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre = nombre;
	}
	
	public void setNombre() {
		this.nombre = nombre;
	}
	
	public abstract double area();
}