/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordennumeros;

/**
 *
 * @author C
 */
import java.util.Scanner;
public class OrdenNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int totalValores=5;
        int valor;
        int[] arraytotalValores=new int[totalValores];
        
        for(int i=0; i<totalValores; i++ ){
            System.out.println("Introduce un valor");
            valor=sc.nextInt();
            arraytotalValores[i]=valor;
        }
        
        for(int i=(totalValores-1); i>=0 ; i--){
            System.out.println("El valor de la posición "+i+" es el: "+arraytotalValores[i]);
            
    }
        
    }
    
}
