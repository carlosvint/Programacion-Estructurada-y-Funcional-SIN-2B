package QuintaClase;

public abstract class CuentaBancaria {
    double saldo;
    String nombre;
    String idCuenta;

    public CuentaBancaria(double saldo, String nombre, String idCuenta){
        this.saldo = saldo;
        this.nombre = nombre;
        this.idCuenta = idCuenta;
    }

    public abstract void retirar(double monto);

    public abstract void depositar(double monto);

    public void mostrarInfo(){
        System.out.println("Cuenta #: " + idCuenta);
    }
}

interface MetodosCiberseguridad {
    void autenticarDobleFactor();
    void encriptarDatos();
}

class CuentaAhorros extends CuentaBancaria implements MetodosCiberseguridad {

    public CuentaAhorros(double saldo, String nombre, String idCuenta){
        super(saldo, nombre, idCuenta);
    }

    public void autenticarDobleFactor(){
        System.out.println("Autenticacion de doble factor realizada.");
    }
    
    public void encriptarDatos(){
        System.out.println("Datos encriptados correctamente.");
    }

    @Override
    public void retirar(double monto){
        saldo -= monto;
    }

    @Override
    public void depositar(double monto){
        saldo += monto;
    }
}