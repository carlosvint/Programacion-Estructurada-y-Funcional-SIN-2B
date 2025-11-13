package SegundaClase;

/*Crea un programa que lea una temperatura en grados Celsius e imprima su equivalente en Fahrenheit. 
Fórmula: F = C * 9/5 + 32 
1. Pedir al usuario que ingrese la temperatura en grados Celsius.
2. Transformar la temperatura en double.
3. Convertir a fahrenheit e imprimir el resultado.*/

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Celsius:");
        // Tomar la temperatura como string y transformar a double
        String input = sc.nextLine();
        double temperatura = Double.parseDouble(input);

        // Tomar la temperatura directamente del scanner
        // double temperatura = sc.nextDouble();
        // Convertir de celsius a fahrenheit
        double f = temperatura * 9/5 + 32;

        System.out.println(temperatura + " grados Celsius son " + f + " grados Fahrenheit.");
    }
}
