package org.foobarspam.CuentaCorriente;

public class CuentaCorriente {
	/*Atributos*/
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String nif;
    private double saldo = 0;

    /*Constructores*/
    public CuentaCorriente(String nombre, String apellidos, String direccion,
            String telefono, String nif, double saldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nif = nif;
        this.saldo = saldo;
    }
    public CuentaCorriente(){
    	
    }
    /*Getter and Setters*/
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getNif() {
        return this.nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacarDinero(double resta) {
        setSaldo(getSaldo() - resta);
    }
    public void ingresarDinero(double suma) {
        setSaldo(getSaldo() + suma);
    }
    
    /*Interfaz publica*/
    public void consultarCuenta() {
        System.out.println("Nombre :" + nombre);
        System.out.println("Apellidos :" + apellidos);
        System.out.println("Dirección :" + direccion);
        System.out.println("Telefono :" + telefono);
        System.out.println("nif :" + nif);
        System.out.println("Saldo :" + saldo);
    }

    public Boolean saldoNegativo() {
        if (getSaldo() < 0) {
            return true;
        } else {
            return false;
        }
    }
}

