package org.foobarspam.punto;

public class MatrizPuntoSilla {

	private int matriz[][]= new int [3][3];
	private int total = 0;
	
	/*Constructor*/
	public MatrizPuntoSilla(int[][] matriz){
		this.matriz = matriz;
	}
	
	/*Getter setters*/
	
	public int getTotalElementos(){
		return this.total;
	}
	public void setTotal(int total){
		this.total = total;
	}
	
	/*Interfaz publica programa*/
	public void recorrerMatriz(){
		for(int fila = 0 ; fila < matriz.length ; fila++){
			for(int columna = 0 ; columna < matriz.length ; columna++){
				setTotal(getTotalElementos()+1);
			}
		}
	}
}
