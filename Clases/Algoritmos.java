package Clases;  

public class Algoritmos {  

    // Método para verificar si un número es par  
    public static boolean esPar(int numero) {  
        return numero % 2 == 0;  
    }  

    // Método para verificar si un número es primo  
    public static boolean esPrimo(int numero) {  
        if (numero <= 1) return false;  
        for (int i = 2; i <= Math.sqrt(numero); i++) {  
            if (numero % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    }  

    // Método para invertir un String  
    public static String stringEnReversa(String texto) {  
        if (texto == null) return null;  
        StringBuilder textoReverso = new StringBuilder(texto);  
        return textoReverso.reverse().toString();  
    }  

    // Método para verificar si un String es palíndromo  
    public static boolean esPalindromo(String texto) {  
        if (texto == null || texto.isEmpty()) return false;  
        String textoLimpio = texto.replaceAll("s+", "").toLowerCase();  
        return textoLimpio.equals(stringEnReversa(textoLimpio));  
    }  

    // Método para imprimir la secuencia FizzBuzz  
    public static void secuenciaFizzBuzz(int numero) {  
        for (int i = 1; i <= numero; i++) {  
            if (i % 3 == 0 && i % 5 == 0) {  
                System.out.print("FizzBuzz ");  
            } else if (i % 3 == 0) {  
                System.out.print("Fizz ");  
            } else if (i % 5 == 0) {  
                System.out.print("Buzz ");  
            } else {  
                System.out.print(i + " ");  
            }  
        }  
        System.out.println();  
    }  
}  