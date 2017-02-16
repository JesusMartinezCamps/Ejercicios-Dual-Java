package org.foobarspam.ejercicio2.main;
import java.util.Arrays;
import java.util.Random;
public class OrdenarArray {


    public static void main(String[] args) {
    	int[] vector = new int[30];
        Random numeroAleatorio = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = numeroAleatorio.nextInt(20) + 1;
        }

        Arrays.sort(vector);
        for (int numero : vector) {
            System.out.println(numero);
        }
    }
}
