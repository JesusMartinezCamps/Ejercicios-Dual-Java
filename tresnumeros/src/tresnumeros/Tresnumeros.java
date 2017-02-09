/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresnumeros;

/**
 *
 * @author C
 */
import java.util.Scanner;
public class Tresnumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Introduce el primer número");
        n1=sc.nextInt();
        System.out.println("Introduce el segundo número");
        n2=sc.nextInt();
        System.out.println("Introduce el tercer número");
        n3=sc.nextInt();
        
        if(n1>n2){
            if(n1>n3){              //n1 mayor
                if (n2<n3){         //n1 mayor n2 menor
                    System.out.println("El mayor es el primer número y el más pequeño es el segundo tercer");
                }
                else{               //n1 mayor n3 menor
                    System.out.println("El mayor es el primer número y el más pequeño es el tercer número");
                }
            }
            else{                   //n1>n2 y n3>n1
                System.out.println("El mayor es el tercer número y el más pequeño es el segundo número");
                }
        }
        else{ // n2>n1
            if (n2>n3){
                if (n1>n3){ // n2>n1 y n1>n3
                    System.out.println("El mayor es el segundo númro y el más pequeño es el tercer número");
                }
                else{
                    System.out.println("El mayor es el segundo número y el más pequeño es el primer número");
                }
            }
            else{ // n2 >n1 y n3>n2
                System.out.println("El mayor es el tercer número y el más pequeño es el primer número ");
            }
        }   
    }
    
}
