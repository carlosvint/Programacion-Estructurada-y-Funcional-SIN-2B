package QuintaClase;

import java.util.Objects;

public class Animal {
    String nombre;
    int edad;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object O){
        if (this == O) return true;
        if (!(O instanceof Animal)) return false;

        Animal animal = (Animal) O;
        return edad == animal.edad && Objects.equals(nombre, animal.nombre);
    }
}

// class Main {
//     public static void main(String[] args) {
//         Animal a1 = new Animal("Perro", 2);
//         Animal a2 = new Animal("Perro", 2);

//         System.out.println(a1.equals(a2));
//     }
// }