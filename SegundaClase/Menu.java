package SegundaClase;

/*Crea un programa que:

Tenga un arreglo de enteros con valores predefinidos.

Muestre un menú con opciones (usando switch-case):

1.Mostrar todos los números

2.Mostrar solo pares

3.Mostrar solo impares

4.Calcular la suma total

5.Salir

Ejecute la acción correspondiente según la opción que el usuario elija. */

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
        int opcion;

        System.out.println("Menu:");
        System.out.println("1. Mostrar todos los numeros"); 
        System.out.println("2. Mostrar solo pares");
        System.out.println("3. Mostrar solo impares");
        System.out.println("4. Calcular la suma total");
        System.out.println("5. Salir");
        System.out.print("Elija una opcion (1-5): ");

        opcion = sc.nextInt();

        //Si la opcion es 
        switch (opcion) {
            case 1:
                System.out.println("Todos los numeros:");
                // Para cada entero num en el arreglo numeros
                for (int num : numeros){
                    //Vamos a imprimir el num 
                    System.out.println(num);
                }
                break;
            case 2:
                System.out.println("Numeros pares:");
                for (int num : numeros){
                    if (num % 2 == 0){
                        System.out.println(num);
                    }
                }
                break;
            case 3:
                System.out.println("Numeros impares:");
                for (int num : numeros){
                    if (num % 2 != 0){
                        System.out.println(num);
                    }
                }
                break;
            case 4:
                // Definimos una variable para almacenar la suma
                int suma = 0;
                // Para cada numero num en el arreglo numeros
                for (int num : numeros){
                    // Vamos a sumar el num a la variable suma
                    suma += num;
                }
                System.out.println("La suma total es: " + suma);
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion invalida.");
        }

    }
}
