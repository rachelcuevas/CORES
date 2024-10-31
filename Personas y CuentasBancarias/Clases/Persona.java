package Clases;  

import java.util.ArrayList;  

public class Persona {  

    /* Atributos de clase (quitar static) */  
    private String nombre; // Cambiar a instancia  
    private int edad; // Cambiar a instancia  
    private ArrayList<CuentaBancaria> cuentasBancarias;   

    /* Constructor */  
    public Persona(String nombre, int edad) {  
        this.nombre = nombre;   
        this.edad = edad;  
        this.cuentasBancarias = new ArrayList<>();  
    }  

    /* Getters y setters */  
    public String getNombre() {  
        return nombre;  
    }  
    public void setNombre(String nombre) {  
        this.nombre = nombre;  
    }  

    public Integer getEdad() {  
        return edad;  
    }  
    public void setEdad(Integer edad) {  
        this.edad = edad;  
    }  

    @Override  
    public String toString() {  
        return "Nombre: " + nombre + ", Edad: " + edad;   
    }  
    public void agregarCuenta(CuentaBancaria cuenta) {  
        cuentasBancarias.add(cuenta);  
    }  

    public void despliegaInformacion() {  
        System.out.println("Nombre: " + nombre + ", Edad: " + edad); // Agregado para imprimir nombre y edad  
    }  
}