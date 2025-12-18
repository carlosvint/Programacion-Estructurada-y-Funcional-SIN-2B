package SeptimaClase;

public class Numeros {
    public static void main(String[] args) {
        int n = 0;
        try {
            n = convertir("1");
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
         }

        System.out.println(n);
    }


    public static int convertir(String texto) throws NumberFormatException {
        return Integer.parseInt(texto);
    }
}
