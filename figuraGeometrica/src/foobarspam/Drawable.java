package foobarspam;

public interface Drawable {
	void draw();
	default void aplicarTema(){
		throw new UnsupportedOperationException("Tema no aplicable para esta figura");
	}; //a las elipses no se les puede aplicar un tema
}