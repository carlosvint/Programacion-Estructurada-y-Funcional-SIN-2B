package SegundaClase;

/*Pide un número entero y muestra su tabla de multiplicar del 1 al 10 usando un for. */

import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        // Para cada entero i igual a 1 y menor o igual a 10, aumenta en uno
        for (int i = 0; i <= 10; i++){
            //Multiplicar i por nuestro numero
            if (i == 0){
                continue;
            }
            int resultado = i * numero;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
