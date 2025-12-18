package SeptimaClase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class InputOutput {
    
    public static void main(String[] args){

        try (BufferedReader br = new BufferedReader(new FileReader("SeptimaClase/mensaje.txt"))){
            String linea;

            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
