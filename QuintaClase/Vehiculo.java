package QuintaClase;

import QuintaClase.Persona;

public class Vehiculo {
    String marca;
    String modelo;
    int anio;

    public Vehiculo(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrarInfo(){
        System.out.println(marca + " " + modelo + " " + anio);
    }
}


class Auto extends Vehiculo {
    boolean cajuela = true;
    boolean cajuelaCerrada = true;

    public Auto(String marca, String modelo, int anio){
        super(marca, modelo, anio);
    }

    public void abrirCajuela(){
        cajuelaCerrada = false;
        System.out.println("La cajuela se ha abierto");
    }
}

class Camion extends Vehiculo {
    boolean container = false;

    public Camion(String marca, String modelo, int anio){
        super(marca, modelo, anio);
    }

    public void montarContainer(){
        container = true;
        System.out.println("El container se ha montado.");
    }
}

class Moto extends Vehiculo {
    boolean tieneMaletin = true;

    public Moto(String marca, String modelo, int anio){
        super(marca, modelo, anio);
    }

    public void desmontarMaletin(){
        tieneMaletin = false;
        System.out.println("Se ha desmontado el maletin.");
    }
}

// class Main {
//     public static void main(String[] args) {
//         Auto auto = new Auto("Toyota", "Prius", 2010);
//         Camion camion = new Camion("Hino", "Mavesa", 2018);
//         Moto moto = new Moto("Vespa", null, 2008);

//         auto.mostrarInfo();
//         System.out.println("Marca: " + auto.marca);
//         camion.mostrarInfo();
//         moto.mostrarInfo();
//     }
// }