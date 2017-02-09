package pruebacopia;

import java.util.Scanner;

/**
 *
 * @author toshiba
 */
public class Pruebacopia {

    // Declaración de variables de ambito global, para toda la clase
    static double radi;
    static final double pi = 3.1415;
    static double longitud, area, volum;

    /**
     * Método para leer el valor de un radio introducido por el usuario
     */
    public static void leerRadio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu el valor del radi positiu que vols:");
        radi = sc.nextDouble();
        sc.close(); //cierra la variable sc para liberar memoria
    }

    public static void tratarRadio() {
        while (radi <= 0) {//separam les dues condicions d'entrada al bucle
            if (radi == 0) {//si el radi és zero li ho direm a l'usuari
                System.out.println("El radi introduït és zero.");
                System.out.println(); //per afegir una línea en blanc
                //i estigui més separat
            } else {//aquí només entra si el radi és negatiu, perquè està dins
                //el while perquè o bé el radi era zero, que ho hem tracta abans
                // o bé el radi era negatiu i ho tractam a l'else
                System.out.println("El radi introduït és negatiu.");
                System.out.println(); //per afegir una línea en blanc
                //i estigui més separat
            }
            //Aquesta instrucciól'hem de fer tant si el radi és negatiu com si és zero
            leerRadio();
        }
    }

    public static double calcularLongitud() {
        double resultat;
        resultat = 2 * pi * radi;
        return resultat;
    }

    public static double calcularArea() {
        double resultat;
        resultat = pi * radi * radi;
        return resultat;
    }

    public static double calcularVolum() {
        double resultat;
        resultat = (4 / 3) * pi * radi * radi * radi;
        return resultat;
    }
    public static void imprimirResultados(){
    System.out.println(); //per afegir una línea en blanc
        //i estigui més separat
        System.out.println("El valor de la  longitud de la circumferència"
                + " de radi: " + radi + " és: " + longitud);
        System.out.println("L'área del cercle de radi: " + radi + " és: " + area);
        System.out.println("El volum de l'esferea de radi: " + radi + " és: " + volum);
}

    public static void main(String[] args) {

        leerRadio();
        tratarRadio();
        longitud = calcularLongitud();
        area = calcularArea();
        volum = calcularVolum();
        imprimirResultados();
    }
}
