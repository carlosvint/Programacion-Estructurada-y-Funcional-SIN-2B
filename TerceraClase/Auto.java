package TerceraClase;

import java.util.Scanner;

public class Auto {
    //Atributos
    public String marca;
    public String modelo;
    public int anio;
    private double precio;
    private String owner = "AutosEC.com";
    public String placa;
    private boolean tieneMultas = false;
    public boolean publicado = false;

    public Auto(){
        //Constructor Vacio
    }

    //Constructor -> Me permite construir un objeto con informacion minima.
    public Auto(String marcaAuto, String modeloAuto, int anioAuto, double precio){
        //This se autoreferencia. Es decir, referenciamos al objeto que estamos construyendo en este caso al objeto Auto.
        this.marca = marcaAuto;
        this.modelo = modeloAuto;
        this.anio = anioAuto;
        this.precio = precio;
    }


    //Metodos
    void publicar(){
        publicado = true;
        System.out.println("Se ha publicado el auto: " + marca + modelo + anio + " en la pagina web.");
    }

    void vender(String newOwner){
        owner = newOwner;
    }

    void quitarWeb(){
        publicado = false;
        System.out.println("El auto: " + marca + modelo + anio + "ya no se encuentra en la pagina web.");
    }

    private double calcularGanancia(){
        return precio * 0.02;
    }

    public double pasarGananciaContabilidad(){
        double ganancia = calcularGanancia();
        System.out.println("Se ha transferido a contabilidad la ganancia de: " + ganancia);
        return ganancia;
    }

    // Getters 
    public double getPrecio(){
        return precio;
    }

    //Setters
    public void setPrecio(double precio){
        if(precio > 0){
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo");
        }
    }
}

// class Main {
//     public static void main(String[] args){
//         Auto toyota = new Auto();
//         toyota.marca = "Toyota";
//         toyota.modelo = "4Runner";
//         toyota.anio = 2008;

//         Auto fiat = new Auto();
//         fiat.marca = "Fiat";
//         fiat.modelo = "1";
//         fiat.anio = 2012; 

//         Auto toyota2 = new Auto();
//         toyota2.modelo = "Fortuner";

//         toyota.publicar();
//         fiat.publicar();

//         for (String autoInfo: new String[]{"Honda,Civic,2020", "Ford,Focus,2018", "Chevrolet,Malibu,2019"}){
//             Auto auto = new Auto();
//             auto.marca = autoInfo.split(",")[0];
//             auto.modelo = autoInfo.split(",")[1];
//             auto.anio = Integer.parseInt(autoInfo.split(",")[2]);

//             auto.publicar();

//         }

//         Auto honda = new Auto("Honda", "Civic", 2002, 15000);
//         honda.publicar();
//         honda.quitarWeb();


//         for (String autoInfo : new String[]{"Honda,Civic,2020,20000", "Ford,Focus,2018,18000", "Chevrolet,Malibu,2019,22000"}) {
//             Auto auto = new Auto(autoInfo.split(",")[0], autoInfo.split(",")[1], Integer.parseInt(autoInfo.split(",")[2]), Double.parseDouble(autoInfo.split(",")[3]));
//             auto.publicar();
//             // auto.precio = 100;
//             System.out.println("Marca: " + auto.marca + " Modelo: " + auto.modelo + " Año: " + auto.anio + " Precio " + auto.getPrecio());
//         }

//         Scanner sc = new Scanner(System.in);
//         Auto auto = new Auto();
//         System.out.println("Ingrese los datos de su auto:");
//         System.out.println("Marca:");
//         String marca = sc.nextLine();
//         auto.marca = marca;
//         System.out.println("Modelo:");
//         String modelo = sc.nextLine();
//         auto.modelo = modelo;
//         System.out.println("Año:");
//         int anio = sc.nextInt();
//         auto.anio = anio;
//         System.out.println("Precio:");
//         double precio = sc.nextDouble();
//         auto.setPrecio(precio);

//         auto.publicar();

//         auto.getPrecio();
//     }
// }