// package CuartaClase;

// public interface Vehiculo {
//     void encender();
//     void apagar();
// }

// interface Terrestre {
//     void simularFriccion();
// }

// class Auto implements Vehiculo, Terrestre{
//     //Atributo
//     String modelo;
//     String marca;
//     boolean encendido = false;

//     public Auto(){

//     }

//     public void encender(){
//         encendido = true;
//         System.out.println("El auto se ha encendido");
//     }

//     public void apagar(){
//         encendido = false;
//         System.out.println("El auto se ha apagado");
//     }
    
//     public void simularFriccion(){
//         System.out.println("El auto tiene 4 llantas entonces se calcula la friccion para cada llanta");
//     }

// }

// class Moto implements Vehiculo {
//     public void encender() {
//         System.out.println("Moto encendida");
//     }
//     public void apagar() {
//         System.out.println("Moto apagada");
//     }
// }

// // class Main{
// //     public static void main(String[] args) {
// //         // Auto a1 = new Auto();
// //         // Moto m1 = new Moto();

// //         // a1.encender();
// //         // m1.encender();

// //         Vehiculo[] vehiculos = new Vehiculo[5];
        
// //         Vehiculo v1 = new Auto();
// //         Vehiculo v2 = new Moto();

// //         v1.encender();
// //         v2.encender();

// //         Terrestre t1 = new Auto();
// //         t1.simularFriccion();

// //     }
// // }