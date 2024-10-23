package Clases;

public class Aplicacion {

    public static void main(String[] args) {  
        // Ejemplo de uso del método esPar  
        int numeroA = 10;  
        System.out.println( "El "+ numeroA + " es par : " + Algoritmos.esPar(numeroA));  

        // Ejemplo de uso del método esPrimo  
        int numeroB = 7;  
        System.out.println("El" + numeroB + " es primo : " + Algoritmos.esPrimo(numeroB));  

        // Ejemplo de uso del método stringEnReversa  
        String ejemploC = "Hola";  
        System.out.println("El reverso de " + ejemploC + " es: " + Algoritmos.stringEnReversa(ejemploC));  

        // Ejemplo de uso del método esPalindromo  
        String ejemploD = "Anita lava la tina";  
        System.out.println("El" + ejemploD + " es palindromo : " + Algoritmos.esPalindromo(ejemploD));  

        // Ejemplo de uso del método secuenciaFizzBuzz  
        int numeroE = 15;  
        System.out.println("Secuencia FizzBuzz hasta " + numeroE + ":");  
        Algoritmos.secuenciaFizzBuzz(numeroE);  
    }  
}  

