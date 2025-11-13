package SegundaClase;

/*Crea un programa que calcule el área y perímetro de un círculo.

Pide al usuario el radio (usa Scanner).

Convierte el radio de String a double.

Usa expresiones matemáticas y muestra los resultados con dos decimales. */

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        String input = sc.nextLine();

        //Transformar el string a double
        double radio = Double.parseDouble(input);
        // int radioInt = Integer.parseInt(input);
        // String radioStr = String.valueOf(radio);

        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        //Imprimir el resultado
        System.out.println("El perimetro es: " + String.format("%.2f", perimetro));
        System.out.printf("El area es: %.2f\n", area);

    }
    
}
