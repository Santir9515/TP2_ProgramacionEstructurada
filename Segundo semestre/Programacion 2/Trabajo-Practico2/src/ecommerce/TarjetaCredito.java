/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 *
 * @author santi
 */
public class TarjetaCredito implements Pago, PagoConDescuento {

    private String numero;

    public TarjetaCredito(String numero) {
        this.numero = numero;
    }

    @Override
    public double aplicarDescuento(double monto) {
        // Ejemplo: 10% de descuento
        return monto * 0.90;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando $" + monto + " con tarjeta " + numero);
    }
}
