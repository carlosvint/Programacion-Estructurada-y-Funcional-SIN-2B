package SextaClase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//-------------Clase Abstracta Padre---------

abstract class Pago{
    protected double monto;

    public Pago(double monto){
        this.monto = monto;
    }

    abstract double calcularComision();
    abstract String descripcion();

    public double total(){
        return monto + calcularComision();
    }
}


//---------------SUBCLASES----------------

class PagoTarjeta extends Pago {
    private static double comision = 0.02;

    public PagoTarjeta(double monto){
        super(monto);
    }

    @Override
    public double calcularComision() {
        return monto * comision;
    }

    @Override
    public String descripcion(){
        return "Pago con tarjeta";
    }
}


class PagoEfectivo extends Pago {
    private static double comision = 0;

    public PagoEfectivo(double monto){
        super(monto);
    }
    @Override
    public double calcularComision(){
        return monto * comision;
    }
    @Override
    public String descripcion(){
        return "Pago en efectivo";
    }

}


class PagoTransferencia extends Pago {
    private static double comision = 0.015;

    public PagoTransferencia(double monto){
        super(monto);
    }

    @Override
    public double calcularComision(){
        return monto * comision;
    }

    @Override
    public String descripcion(){
        return "Pago con transferencia";
        }
}

// -------------Interfaz Grafica----------

class Ventana extends JFrame {
    public Ventana(){
        setTitle("Checkout");
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton tarjetaButton = new JButton("Pago con Tarjeta");
        JButton transfButton = new JButton("Pago con Transferencia");
        JButton efectivButton = new JButton("Pago con Efectivo");

        tarjetaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                pagar(new PagoTarjeta(200));
            }
        });

        transfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                pagar(new PagoTransferencia(200));
            }
        });

        efectivButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                pagar(new PagoEfectivo(200));
            }
        });

        add(tarjetaButton);
        add(transfButton);
        add(efectivButton);
        setVisible(true);
    }

    public void pagar(Pago p){
        JOptionPane.showMessageDialog(this, 
                p.descripcion() + 
                " | Monto: " + p.monto + 
                " | Comision: " + p.calcularComision() +
                " | Total: " + p.total());
    }
}


public class Main {
    public static void main(String[] args) {
        // Pago[] pagos = new Pago[3];

        // pagos[0] = new PagoTarjeta(100);
        // pagos[1] = new PagoEfectivo(50);
        // pagos[2] = new PagoTransferencia(100);

        // for (Pago p : pagos){
        //     System.out.println(
        //         p.descripcion() + 
        //         "| Monto: " + p.monto + 
        //         "| Comision: " + p.calcularComision() +
        //         "| Total: " + p.total()
        //     );
        // }

        new Ventana();
    }
}