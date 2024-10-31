package Clases;  

import java.util.ArrayList;  
import java.util.Random;  

public class CuentaBancaria {  

    /* ATRIBUTOS DE CLASE */  
    private Double saldo;  
    private Persona titular;  
    private int numeroCuenta;  
    private static ArrayList<CuentaBancaria> listasDeCuentaBancarias = new ArrayList<>();  

    /* CONSTRUCTOR */  
    public CuentaBancaria(Double saldo, Persona titular) {  
        this.saldo = saldo;  
        this.titular = titular;  
        this.numeroCuenta = generarNumeroCuenta(); // Generar número de cuenta al crear la cuenta  
        this.titular.agregarCuenta(this);  
        
        // Agregar la nueva cuenta a la lista de cuentas  
        listasDeCuentaBancarias.add(this); // 'this' se refiere a la instancia actual  
    }  

    private int generarNumeroCuenta() {  
        Random random = new Random();  
        return 100000 + random.nextInt(900000);  
    }  

    // Método para mostrar todas las cuentas  
    public static void mostrarCuentas() {  
        for (CuentaBancaria cuenta : listasDeCuentaBancarias) {  
            System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());  
        }  
    }  

    /* METODOS GETTERS Y SETTERS */  
    
    public Double getSaldo() {  
        return saldo;  
    }  

    public void setSaldo(double saldo) {  
        this.saldo = saldo;  
    }  

    public Persona getTitular() {  
        return titular;  
    }  
    
    public void setTitular(Persona titular) {  
        this.titular = titular;  
    }  

    public int getNumeroCuenta() {  
        return numeroCuenta;  
    }  

    /* DEPOSITAR */  
    public void depositar(double monto) {  
        if (monto > 0) {  
            saldo += monto;  
            System.out.println("Depósito exitoso: " + monto + ". Nuevo saldo: " + saldo);  
        } else {  
            System.out.println("El monto debe ser mayor a 0");  
        }  
    }  

    @Override  
    public String toString() {  
        return "Número de Cuenta: " + numeroCuenta + ", Saldo: " + saldo;  
    }  

    /* RETIRAR */  
    public void retirar(double monto) {  
        if (saldo >= monto) {  
            saldo -= monto;  
            System.out.println("Retiro exitoso: " + monto + ". Nuevo saldo: " + saldo);  
        } else {  
            System.out.println("El monto debe ser menor o igual al saldo disponible");  
        }  
    }  

    /* DESPLIEGA INFORMACION */  
    public void despliegaInformacion() {  
        System.out.println("Nombre del titular: " + titular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo disponible: " + saldo);
    }  
    
    /* IMPRIME INFO DE TODAS LAS CUENTAS */  
    public static void imprimeInformacionDeTodasLasCuentas() {  
        for (CuentaBancaria cuenta : listasDeCuentaBancarias) {  
            System.out.println(cuenta);  
        }  
    }  
}  