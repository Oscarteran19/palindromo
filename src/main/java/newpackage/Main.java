/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @oscar teran
 */
public class Main {
   

    /*recordar siempre que el system out es el inicio para dar la impresion de la indicacion en este caso*/
    public static void main(String[] args) {
        System.out.println("Ingrese la oración a evaluar:");

    /*este funciona para darle la entrada como usuario*/
        Scanner entrada = new Scanner(System.in);
        String oracion = entrada.nextLine();


    /* el if es para ver si se cumple la "regla" o lo que se pide en este caso si es un palindromo o no, if es si cumple o no cumple*/
        if (esPalindromo(oracion)) {
            System.out.println("La oración es un palíndromo.");
        } else {
            System.out.println("La oración no es un palíndromo.");
        }
    }

    // Función para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String cadena) {

        // Elimina espacios en blanco y convierte todo a minúsculas
        cadena = cadena.replaceAll("\\s+", "").toLowerCase();
        
        int longitud = cadena.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
   

