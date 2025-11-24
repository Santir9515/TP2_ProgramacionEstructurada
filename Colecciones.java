/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico2;

import java.util.ArrayList;

public class Colecciones {

    // ======================
    // Enum CategoriaProducto
    // ======================
    public enum CategoriaProducto {
        ALIMENTOS("Productos comestibles"),
        ELECTRONICA("Dispositivos electrónicos"),
        ROPA("Prendas de vestir"),
        HOGAR("Artículos para el hogar");

        private final String descripcion;

        CategoriaProducto(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }

    // ======================
    // Clase Producto
    // ======================
    public static class Producto {

        private String id;
        private String nombre;
        private double precio;
        private int cantidad;
        private CategoriaProducto categoria;

        public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
            this.id = id;
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
            this.categoria = categoria;
        }

        public void mostrarInfo() {
            System.out.println("ID: " + id);
            System.out.println("Nombre: " + nombre);
            System.out.println("Precio: $" + precio);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Categoría: " + categoria + " - " + categoria.getDescripcion());
            System.out.println("----------------------------");
        }

        public String getId() {
            return id;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public double getPrecio() {
            return precio;
        }

        public CategoriaProducto getCategoria() {
            return categoria;
        }
    }

    // ======================
    // Clase Inventario
    // ======================
    public static class Inventario {

        private ArrayList<Producto> productos = new ArrayList<>();

        public void agregarProducto(Producto p) {
            productos.add(p);
        }

        public void listarProductos() {
            for (Producto p : productos) {
                p.mostrarInfo();
            }
        }

        public Producto buscarProductoPorId(String id) {
            for (Producto p : productos) {
                if (p.getId().equalsIgnoreCase(id)) {
                    return p;
                }
            }
            return null;
        }

        public void eliminarProducto(String id) {
            productos.removeIf(p -> p.getId().equalsIgnoreCase(id));
        }

        public void actualizarStock(String id, int nuevaCantidad) {
            Producto p = buscarProductoPorId(id);
            if (p != null) {
                p.setCantidad(nuevaCantidad);
            }
        }

        public void filtrarPorCategoria(CategoriaProducto categoria) {
            for (Producto p : productos) {
                if (p.getCategoria() == categoria) {
                    p.mostrarInfo();
                }
            }
        }

        public int obtenerTotalStock() {
            int total = 0;
            for (Producto p : productos) {
                total += p.getCantidad();
            }
            return total;
        }

        public Producto obtenerProductoConMayorStock() {
            if (productos.isEmpty()) {
                return null;
            }
            Producto mayor = productos.get(0);
            for (Producto p : productos) {
                if (p.getCantidad() > mayor.getCantidad()) {
                    mayor = p;
                }
            }
            return mayor;
        }

        public void filtrarProductosPorPrecio(double min, double max) {
            for (Producto p : productos) {
                if (p.getPrecio() >= min && p.getPrecio() <= max) {
                    p.mostrarInfo();
                }
            }
        }

        public void mostrarCategoriasDisponibles() {
            for (CategoriaProducto c : CategoriaProducto.values()) {
                System.out.println(c + " → " + c.getDescripcion());
            }
        }
    }

    // ======================
    // Método main
    // ======================
    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        // 1. Crear 5 productos
        Producto p1 = new Producto("P1", "Yerba Mate", 1500, 20, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P2", "Mouse Logitech", 9000, 8, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P3", "Remera Nike", 12000, 15, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P4", "Sartén antiadherente", 4500, 12, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P5", "Auriculares Sony", 25000, 5, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar productos
        System.out.println("LISTA DE PRODUCTOS");
        inventario.listarProductos();

        // 3. Buscar por ID
        System.out.println("BUSCAR PRODUCTO P3");
        Producto buscado = inventario.buscarProductoPorId("P3");
        if (buscado != null) {
            buscado.mostrarInfo();
        }

        // 4. Filtrar por categoría
        System.out.println("PRODUCTOS ELECTRÓNICA");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // 5. Eliminar un producto
        inventario.eliminarProducto("P5");

        // 6. Actualizar stock
        inventario.actualizarStock("P1", 30);

        // 7. Total de stock
        System.out.println("Total stock general: " + inventario.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("Producto con más stock:");
        Producto masStock = inventario.obtenerProductoConMayorStock();
        if (masStock != null) {
            masStock.mostrarInfo();
        }

        // 9. Filtrar por precio
        System.out.println("Productos entre $1000 y $3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Categorías disponibles
        System.out.println("Categorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
    }
}
