package SextaClase;

public interface Volador {
    void volar();
}

interface Nadador {
    void nadar();
}


class Pato implements Volador, Nadador {

    public void volar(){
        System.out.println("El pato esta volando.");
    }

    public void nadar(){
        System.out.println("El pato esta nadando.");
    }
}

class Pez implements Nadador {
    public void nadar(){
        System.out.println("El pez esta nadando.");
    }
}

// class Main {
//     public static void main(String[] args){
//         Pato p1 = new Pato();
//         Nadador p2 = new Pato();
//         Nadador z1 = new Pez();

//         p1.volar();
//         p2.nadar();
//         z1.nadar();

//         nadarRioArriba(p1);

//         }

//     public static void nadarRioArriba(Nadador nadador){
//         System.out.println("El animal nadador esta yendo rio arriba.");
//     }
// }