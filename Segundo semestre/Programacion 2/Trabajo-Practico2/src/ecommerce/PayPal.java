/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 *
 * @author santi
 */
public class PayPal implements Pago, PagoConDescuento {

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public double aplicarDescuento(double monto) {
        // Ejemplo: 5% de descuento
        return monto * 0.95;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando $" + monto + " con PayPal de " + email);
    }
}
