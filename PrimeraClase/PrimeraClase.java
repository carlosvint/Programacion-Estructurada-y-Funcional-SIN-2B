package PrimeraClase;
import java.util.Scanner;


class PrimeraClase {
    /*
     * Aqui adentro puedo definir todos los atributos que van a caracterizar a esta clase.
     * Tambien puedo definir los metodos que van a hacer que esta clase haga cosas.
     * VARIABLE -> ES UN ATRIBUTO QUE ALMACENA UN VALOR
     * METODO -> ES UNA FUNCION QUE HACE QUE LA CLASE REALICE UNA ACCION
     * CLASE -> ES UN MOLDE PARA CREAR OBJETOS
     */

    public static void main(String[] args){
        // System.out.println("Hola Mundo");
        // int resultado = sumar(5, 6);
        // System.out.println("El resultado de la suma es: " + resultado);
        // double resultadoMultiplicacion = multiplicar(2.2, 3.3);
        // System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion);
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println(bienvenida(nombre));

        scanner.close();
    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static String bienvenida(String nombre){
        return "Bienvenid@ " + nombre + " a la clase de programacion en Java!";
    }
}