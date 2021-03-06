package foobarspam; /*org.foobarspam.figuras*/

public abstract class FiguraGeometrica implements Drawable{
	
	private String nombre;
	
	public FiguraGeometrica() {
		this.nombre = "desconocido";
	}
		
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double area();
}