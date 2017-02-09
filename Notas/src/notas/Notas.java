/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

/**
 *
 * @author C
 */
import java.util.Scanner;
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nota, suma=0, producto=1 , media=0;
        int totalNotas;
        Scanner sc = new Scanner(System.in);
        float [] arrayNotas;

        System.out.println("Introduce el número de notas que quires introducir");
        totalNotas=sc.nextInt();
        arrayNotas = new float [totalNotas];

        for (int i=0; i<totalNotas; i++){
            System.out.println("Introduce la nota"+(i+1));
            nota=sc.nextFloat();
            arrayNotas[i]=nota;
            suma=suma+nota;
            producto=producto*arrayNotas[i];
            media=suma/(i+1);
        }
        for (int i=0;i<totalNotas;i++){
            System.out.println("La nota introducida en la posición: "+(i+1)+" es "+arrayNotas[i]);
        }
        System.out.println("La suma de todas ellas es "+suma+" el producto es: "+producto+" y la media es: "+media);
        }
    }

