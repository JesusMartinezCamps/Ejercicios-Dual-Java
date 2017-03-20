package foobarspam;

import java.util.ArrayList;

public class Drawables {
	
	public static void dibujar(ArrayList<Drawable> figuras){
		for (Drawable figura : figuras) {
			figura.draw();
		}
	}
	
	public static void elegirTema(ArrayList<Drawable> figuras){
		
		for(Drawable figura : figuras){
			try{
				figura.aplicarTema();
			}catch (UnsupportedOperationException e){
				System.out.println("Error capturado: No puede tener un tema");
			}
		}
	}
}
