package SegundaClase;

/*Pide al usuario su edad y di si es menor, adulto o adulto mayor. 
 * Menor de 18 años es menor de edad.
 * Entre 18 y 65 es adulto.
 * Mayor a 65 es adulto mayor.
*/

import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad por favor: ");
        int edad = sc.nextInt();

        //if --> Si
        //() --> Adentro del parentesis esta la condicion
        //{} --> Que hacer si se cumple la condicion
        // if (edad < 18){
        //     System.out.println("Es menor de edad.");
        //     if (edad > 16){
        //         System.out.println("Ya puedes votar.");
        //     }
        // } else if (edad < 65) {
        //     System.out.println("Es un adulto.");
        // }
        // else {
        //     System.out.println("Es un adulto mayor.");
        // }

        if (edad >= 18 && edad < 65){
            System.out.println("Eres un adulto.");
        }
        else if (edad < 18){
            System.out.println("Eres menor de edad.");
        } else {
            System.out.println("Eres un adulto mayor.");
        }
    }
}
