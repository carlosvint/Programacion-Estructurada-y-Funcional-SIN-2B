package TerceraClase;

public class CuentaBancaria {
    // Atributos
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    //Getter 
    public double getSaldo(){
        return saldo;
    }

    public void depositar(double monto){
        if (monto > 0){
            saldo += monto;
            System.out.println("Deposito exitoso. El nuevo saldo es:" + saldo);
        } else {
            System.out.println("Monto Invalido.");
        }
    }

    public void retirar(double monto){
        if (monto <= saldo){
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

}

class Main{
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Carlos Vintimilla", 200);

        cuenta.depositar(100);
        cuenta.retirar(20);

        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}