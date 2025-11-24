/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 *
 * @author santi
 */
public class MainEcommerce {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Santiago", "santiago@gmail.com");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse", 5000));
        pedido.agregarProducto(new Producto("Teclado", 8000));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        // Pago con tarjeta
        PagoConDescuento medioPago = new TarjetaCredito("1111-2222-3333-4444");
        double totalConDescuento = medioPago.aplicarDescuento(total);
        System.out.println("Total con descuento (tarjeta): $" + totalConDescuento);

        ((Pago) medioPago).procesarPago(totalConDescuento);

        // Cambio de estado
        pedido.cambiarEstado("PAGADO");
        pedido.cambiarEstado("ENVIADO");
    }
}
