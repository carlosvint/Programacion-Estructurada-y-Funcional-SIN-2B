package SextaClase;

public class Animal {
    public void hablar(){
        System.out.println("El animal hace un sonido.");
    }
}

class Perro extends Animal {
    @Override
    public void hablar(){
        System.out.println("Guau guau!");
    }
}

class Gato extends Animal {
    @Override
    public void hablar(){
        System.out.println("Miau!");
    }
}

// class Main {
//     public static void main(String[] args) {
//         Animal p = new Perro();
//         Animal g = new Gato();

//         p.hablar();
//         g.hablar();

//     }
// }