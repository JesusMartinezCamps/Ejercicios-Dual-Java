package org.foobarspam.CuentaCorriente.Ejercicio83;

import org.foobarspam.CuentaCorriente.CuentaCorriente;

public class Ejercicio83 {

    public static void main(String[] args) {

        CuentaCorriente cuenta = new CuentaCorriente();

        cuenta.setNombre("Diego");
        cuenta.setApellidos("Barja Conde");
        cuenta.setDireccion("A Valenzá");
        cuenta.setTelefono("666444555");
        cuenta.setNif("444444444F");
        cuenta.setSaldo(5000);
        cuenta.sacarDinero(5001);
        cuenta.consultarCuenta();

        if (cuenta.saldoNegativo()) {
            System.out.println("No queda dinero en esta cuenta");
        } else {
            System.out.println("Hay dinero en la cuenta");
        }

        // declaramos otro objeto:

        System.out.println();
        CuentaCorriente cuenta1 = new CuentaCorriente("Jose", "Pérez López",
                "Ourense", "690906990", "555555555F", 6457);
        cuenta1.consultarCuenta();
    }
}
