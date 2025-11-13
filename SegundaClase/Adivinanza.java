package SegundaClase;

import java.util.Random;

/* Pide al usuario que adivine un número secreto. Tiene 3 intentos, si adivina imprimimos "Ganaste" caso contrario se imprime Perdiste */

/* 1. Guardar en una variable la adivinanza.
 * 2. Evaluar si la adivinanza es igual al numero secreto.
 * 3. Si la adivinanza es igual al numero secreto imprimos Ganaste.
 * 4. Caso contrario, bajamos un intento y volvemos a preguntar.
 * 5. Si ya no quedan intentos entonces imprimimos perdiste.
 */


import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 3;
        int numeroSecreto = 7; //Quemar el numero secreto. Pero podemos generar un numero al azar utilizando las librerias random.
                        
        // El programa debe seguir corriendo hasta que el usuario adivine o hasta que se acaben los intentos.
        // Mientras se cumpla una condicion se ejecuta el codigo
        while (intentos > 0){
            System.out.println("Adivina un numero del 1 al 10: ");
            int adivinanza = sc.nextInt();
            if (adivinanza == numeroSecreto){
                System.out.println("Ganaste");
                break;
            }else if (intentos > 1){
                intentos--;
                System.out.println("Ese no es el numero secreto. Te quedan " + intentos + " intentos.");
            }else {
                intentos--;
                System.out.println("Ya no te quedan intentos. Perdiste.");
            }
        }

    }
    
}
