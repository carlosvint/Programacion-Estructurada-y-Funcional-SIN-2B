package SextaClase;

public abstract class Figura {
    abstract double area();
}

class Circulo extends Figura {
    double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double area(){
        return Math.PI * radio * radio;
    }

    public double perimetro(){
        return Math.PI * radio * 2;
    }
}

class Cuadrado extends Figura {
    double lado;

    public Cuadrado (double lado){
        this.lado = lado;
    }

    @Override
    public double area(){
        return lado * lado;
    }
}

class Triangulo extends Figura {
    double base;
    double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area(){
        return base * altura / 2;
    }
}


// class Main {
//     public static void main(String[] args) {
//         Circulo c = new Circulo(5);
//         mostrarArea(c);
//         Cuadrado d = new Cuadrado(5);
//         Triangulo t = new Triangulo(3, 4);

//         System.out.println("Area: " + c.area());
//         System.out.println("Area: " + d.area());
//         System.out.println("Area: " + t.area());

//         Figura c1 = new Circulo(5);
//         Figura d1 = new Cuadrado(5);
//         Figura t1 = new Triangulo(3, 4);

//         Figura[] figuras = {c, d, t};

//         for (Figura f : figuras){
//             mostrarArea(f);
//         }

//     }

//     public static void mostrarArea(Figura figura){
//         System.out.println("Area: " + figura.area());
//     }
// }