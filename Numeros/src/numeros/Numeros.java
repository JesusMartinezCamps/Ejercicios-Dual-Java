/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

/**
 *
 * @author C
 */
import java.util.Scanner;
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número");
        numero=sc.nextInt();
        
        if (numero>0){
            System.out.println("El número es positivo");
        }
        else{
            if (numero<0){
                System.out.println("El número es negativo");
            }
            else{
                System.out.println("Es un 0");
            }
        }
    }
}
