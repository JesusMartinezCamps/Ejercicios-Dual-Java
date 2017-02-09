package org.foobarspam.esBisiesto.year;

public class Year {

	private int year = 0;
	
	/*Constructor que recibe un año*/
	public Year(int year){
		this.year = year;
	}
	
	/*getters y setters*/
	public int getYear(){
		return this.year;
	}
	
	/*
	 * Tests
	 */
	
	/*Es un año positivo*/
	public Boolean positivo(){
		return getYear() > 0;
	}
	
	/*El metodo esBisiesto terminado en 4*/
	public Boolean terminaCuatro(){
		return getYear() % 4 == 0;
	}
	
	/*Comprueba si el año termina en 100*/
	public Boolean terminaCien(){
		return getYear() % 100 == 0;
	}
	
	public Boolean terminaCienYcuatrocientos(){
		return getYear() % 100 == 0 & getYear() % 400 == 0;
	}
	/*Determina si es bisiesto porque se cumplen las anteriores condiciones*/
	public Boolean esBisiesto(){
		if(getYear() % 100 == 0){
			if(getYear() % 400 == 0){
				return true;
			}else{
				return false;
			}
		}if(getYear() % 4 == 0){
			return true;
		}else{
			return false;
		}
	}
}
