package QuintaClase;

public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    protected String profesion;
    private String estadoCivil;
    private String nacionalidad;

    public Persona(String nombre, String apellido, int edad, String estadoCivil, String nacionalidad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.nacionalidad = nacionalidad;
    }

    public void presentarse(){
        System.out.println("Hola, mi nombre es " + nombre + " " + apellido + " tengo " + edad + " años y vengo de " + nacionalidad + ".");
    }

    public void crearCuenta(){
        System.out.println("La cuenta de " + nombre + " " + apellido + " ha sido creada.");
    }
}

class Estudiante extends Persona {
    String carrera;

    public Estudiante(String nombre, String apellido, int edad, String estadoCivil, String nacionalidad, String carrera){
        super(nombre, apellido, edad, estadoCivil, nacionalidad);
        this.carrera = carrera;
        this.profesion = "Estudiante";
    }

    public void inscribirMateria(String materia){
        System.out.println("Se ha inscrito al estudiante " + nombre + " " + apellido + " en la materia de " +materia);
    }
}

class Profesor extends Persona {
    boolean tiempoCompleto;

    public Profesor(String nombre, String apellido, int edad, String estadoCivil, String nacionalidad, boolean tiempoCompleto){
        super(nombre, apellido, edad, estadoCivil, nacionalidad);
        this.tiempoCompleto = tiempoCompleto;
        this.profesion = "Profesor";
    }

    public void darClase(String materia){
        System.out.println("El profesor ha iniciado la clase de " + materia);
    }
}

class ProfesorMaestria extends Profesor {
    String programaMaestria;

    public ProfesorMaestria(String nombre, String apellido, int edad, String estadoCivil, String nacionalidad, 
        boolean tiempoCompleto, String programaMaestria){
        super(nombre, apellido, edad, estadoCivil, nacionalidad, tiempoCompleto);
        this.programaMaestria = programaMaestria;
    }
}

class Main{
    public static void main(String[] args) {
        ProfesorMaestria pm1 = new ProfesorMaestria("Carlos", "Vintimilla", 30, "Soltero", "Ecuador", false, "Ciberseguridad");
        pm1.presentarse();
        pm1.crearCuenta();
        pm1.darClase("Tratamiento de Datos");

        System.out.println("Es tiempo completo: " + pm1.tiempoCompleto);
        System.out.println("Profesion: " + pm1.profesion);

        ProfesorMaestria pm2 = new ProfesorMaestria("Carlos", "Vintimilla", 30, "Soltero", "Ecuador", false, "Ciberseguridad");

        System.out.println("Resultado equals: " + pm1.equals(pm1));
        System.out.println("Resultado Class: " + pm2.getClass());

    }
}