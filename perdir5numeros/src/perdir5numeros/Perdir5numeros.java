/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perdir5numeros;

/**
 *
 * @author C
 */
import java.util.Scanner;

public class Perdir5numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);
        boolean equivocado = false;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce tu número: ");
            numeros[i] = sc.nextInt();
            if (i!=0)
                if (numeros[i-1]*2 != numeros[i])
                    equivocado = true;
        }
        System.out.println("Esta es la lista de números introducidos");
        for (int i = 0; i < 5; i++)
            System.out.println(numeros[i]);
        if(equivocado)
            System.out.println("No es el doble.");
    }
}
