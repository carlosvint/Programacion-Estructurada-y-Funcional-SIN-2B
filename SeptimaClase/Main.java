package SeptimaClase;

class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String msg){
        super(msg);
    }
}


public class Main {
    public static void verificarEdad(int edad) throws EdadInvalidaException {
        if (edad < 18 & edad > 0){
            throw new EdadInvalidaException("La edad debe ser mayor a 18 años.");
        }

        if (edad < 0){
            throw new EdadInvalidaException("La edad no puede ser negativa");
        }

        if (edad > 200){
            throw new EdadInvalidaException("Debe ingresara una edad valida entre 0 y 130.");
        }

        System.out.println("Edad valida");
    }


    public static void main(String[] args) {
        try {
            verificarEdad(-1);
        }
        catch (EdadInvalidaException e){
            System.out.println(e.getMessage());
        }

    }
}


// public class Main {
//     public static void main(String[] args) {
//         int[] numeros = {0,1};
//         int a = 0;
//         boolean b = false;

//         for (int i=0; i<5; i++){
//             try{
//                 b = true;
//                 System.out.println(numeros[i]);
//                 a += 50;
//             }
//             catch (ArrayIndexOutOfBoundsException e){
//                 System.out.println("El arreglo no tiene esa posicion ");
//             }
//             catch (Exception e){
//                  System.out.println("Mensaje")}
//             finally {
//                 a += 100;
//             }
//         }

//         System.out.println(a);
//         System.out.println(b);

//     }
// }
