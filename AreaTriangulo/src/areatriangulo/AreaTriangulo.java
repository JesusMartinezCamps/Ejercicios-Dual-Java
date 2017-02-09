/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areatriangulo;

/**
 *
 * @author C
 */
import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] args) {    
    float base, altura, resultado;
    Scanner sc = new Scanner(System.in);
    try{
        System.out.println("Introduce la base");
                base=sc.nextFloat();
        System.out.println("Introduce la altura");
                altura=sc.nextFloat();
        resultado=(altura * base)/2;
        System.out.println("El resultado de la base "+base+" y la altura "+altura+" es: "+resultado);
    }catch (Exception e){
        System.out.println("Se ha producido un error");
    }
    sc.close();
}
}