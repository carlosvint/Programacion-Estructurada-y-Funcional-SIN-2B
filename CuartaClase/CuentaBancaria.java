package CuartaClase;

public class CuentaBancaria{
    // Atributos
    private double saldo;
    public String tipo;
    public boolean activa = false;
    private Cliente titular;
    public static int contadorCuentas = 0;
    public static String nombreBanco = "Banco UIDE";

    // Constructor
    public CuentaBancaria(double saldoInicial, String tipo){
        this.saldo = saldoInicial;
        this.tipo = tipo;
        this.contadorCuentas ++;
    }

    // Getters
    public double getSaldo(){
        return saldo;
    }

    // Funciones de clase: retirar y depositar

    public void depositar(double monto){
        if (monto > 0){
            saldo += monto;
            System.out.println("Su nuevo saldo es: " + saldo);
        }
    }

    public void retirar(double monto){
        if (monto <= saldo){
            saldo -= monto;
        }
    }

}


class Cliente{
    //Atributos
    private String nombre;
    private String apellido;
    public boolean activo = false;
    public CuentaBancaria[] cuentas;

    public Cliente(String nombre, String apellido, int NumeroMaximoCuentasBancarias){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentas = new CuentaBancaria[NumeroMaximoCuentasBancarias];
        this.activo = true;
    }
    
    public void crearCuenta(double saldoInicial, String tipo){
        
        int lleno = 0;

        // arreglo tiene tamaño 8 = [0, 1, 2, 3, 4, 5, 6, 7]
        // arreglo vacio tamaño 2 = [null, null]
        // arreglo = [CuentaBancaria, null]
        // arreglo = [CuentaBancaria, CuentaBancaria]

        for (int i = 0; i < cuentas.length; i++){
            if (cuentas[i] == null){
                CuentaBancaria cuenta = new CuentaBancaria(saldoInicial, tipo);
                cuentas[i] = cuenta;
                System.out.println("La cuenta de " + tipo + " se ha creado exitosamente con un saldo inicial de: " + saldoInicial);
                break;
            } else {
                lleno ++;
            }
        }

        if (lleno == cuentas.length){
            System.out.println("El cliente ha alcanzado el numero maximo de cuentas permitidas.");
        }

    }
    
    public void depositarEnCuenta(double monto, String tipoCuenta){
        // arreglo = [CuentaBancaria Ahorros, Cuenta Bancaria Corriente, null] 

        int index = 0;

        for (CuentaBancaria cuenta : cuentas){
            if (cuenta == null){
                index ++;
                continue;
            } else {
                if (cuenta.tipo.equals(tipoCuenta)){
                    cuenta.depositar(monto);
                    break;
                } else {
                    index ++;
                }
            }
        }

        if (index == cuentas.length){
            System.out.println("El cliente no tiene ese tipo de cuenta.");
        }
        }
    }


// class Main{
//     public static void main(String[] args) {
//         Cliente c1 = new Cliente("Carlos", "Vintimilla", 2);
//         c1.crearCuenta(200, "Ahorros");
//         System.out.println(CuentaBancaria.contadorCuentas);
//         c1.depositarEnCuenta(20, "Ahorro Programado");
//         c1.crearCuenta(200, "Corriente");
//         System.out.println(CuentaBancaria.contadorCuentas);
//         c1.crearCuenta(200, "Ahorros");


//         Cliente c2 = new Cliente("Alberto", "Carrasco", 4);
//         c2.crearCuenta(1000, "Ahorros");
//         c2.depositarEnCuenta(20, "Ahorro Programado");

//         System.out.println(CuentaBancaria.contadorCuentas);
//         System.out.println(c1.cuentas[0].contadorCuentas);
//         System.out.println(c2.cuentas[0].nombreBanco);

//         c2.cuentas[0].nombreBanco = "Banco Universidad Internacional";
//         System.out.println(c1.cuentas[0].nombreBanco);        

//         System.out.println(c1.cuentas.length);  
//         System.out.println(c2.cuentas.length);        
      


//     }
// }