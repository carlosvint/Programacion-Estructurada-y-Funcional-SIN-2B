package CuartaClase;

public interface Configuracion {
    int MAX_USUARIOS = 100;     // constante
    String SISTEMA = "Producción"; // constante

    void iniciar();
}

class Servidor implements Configuracion {

    public void iniciar() {
        System.out.println("Iniciando servidor...");
        System.out.println("Máximo permitido: " + MAX_USUARIOS);
        System.out.println("Sistema: " + SISTEMA);
    }
}

class ServidorWeb implements Configuracion{
    public void iniciar(){
        System.out.println("Máximo permitido: " + MAX_USUARIOS);
    }
}