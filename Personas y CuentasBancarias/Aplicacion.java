import Clases.Persona;
import Clases.CuentaBancaria;

public class Aplicacion {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona ("Simon", 18);
        Persona persona2 = new Persona("Alexander", 28);
        Persona persona4 = new Persona("Alejandro", 26);

        CuentaBancaria cuenta1 = new CuentaBancaria(2500.00, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(10000.99, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(100.50, persona4);



        /*DEPOSITAR */
        cuenta1.depositar(30000.90);
        cuenta2.depositar(40000.90);
        cuenta3.depositar(5000.67);

        cuenta1.retirar(1267.89);
        cuenta2.retirar(4578.99);
        cuenta3.retirar(68123.4);

        /*  IMPRIMIR SALDO ACTUAL */
        persona1.despliegaInformacion();
        persona2.despliegaInformacion();
        persona4.despliegaInformacion();


        System.out.println("Todas las cuentas bancarias: ");
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}