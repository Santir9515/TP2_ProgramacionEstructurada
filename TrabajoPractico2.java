
package trabajo.practico2;
import java.util.*;
/**
 *
 * @author santi
 */
public class TrabajoPractico2 {

    private static final Scanner sc = new Scanner(System.in);
    
    private static final double DESCUENTO_ESPECIAL = 0.10;
    
    public static void main(String[] args) {
        while (true){
            System.out.println("1. Verificación de año bisiesto");
            System.out.println("2. Determinar el Mayor de Tres Números");
            System.out.println("3. Clasificación de Edad");
            System.out.println("4. Calculadora de Descuento según categoría (A/B/C)");
            System.out.println("5. Suma de Números Pares (while, 0 para terminar)");
            System.out.println("6. Contador de Positivos, Negativos y Ceros (for, 10 números)");
            System.out.println("7. Validación de Nota entre 0 y 10 (do-while)");
            System.out.println("8. Precio Final con impuesto y descuento (función)");
            System.out.println("9. Costo de envío y total de compra (composición de funciones)");
            System.out.println("10. Actualización de stock (función)");
            System.out.println("11. Descuento especial con variable global");
            System.out.println("12. Array de precios: modificar y mostrar (for-each)");
            System.out.println("13. Impresión recursiva de array antes/después de modificar");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");


        int op = leerEnteroSeguro();
        System.out.println();
        switch (op) {
            case 1 -> ejercicio1();
            case 2 -> ejercicio2();
            case 3 -> ejercicio3();
            case 4 -> ejercicio4();
            case 5 -> ejercicio5();
            case 6 -> ejercicio6();
            case 7 -> ejercicio7();
            case 8 -> ejercicio8();
            case 9 -> ejercicio9();
            case 10 -> ejercicio10();
            case 11 -> ejercicio11();
            case 12 -> ejercicio12();
            case 13 -> ejercicio13();
            case 0 -> {
                System.out.println("Hasta luego !");
                return;
                }
            default -> System.out.println("Opción inválida. Intente nuevamente");
            }
        }
    } 
    
    private static int leerEnteroSeguro(){
        while (!sc.hasNextInt()){
            System.out.print("Ingrese un entero válido: ");
            sc.next();
        }
        int v = sc.nextInt();
        sc.nextLine();
        return v;
    }
    
    private static double leerDoubleSeguro() {
        while (!sc.hasNextDouble()){
            System.out.print("Ingrese un número valido: ");
            sc.next();
        }
        double v = sc.nextDouble();
        sc.nextLine();
        return v;
    }
    
    
    /*Ejercicio 1*/
    private static void ejercicio1() {
        System.out.print("Ingrese un año: ");
        int anio = leerEnteroSeguro();
        boolean bisiesto = esBisiesto(anio);
        if (bisiesto){
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }
    
    private static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
    
    /* Ejercicio 2 */
    private static void ejercicio2() {
        System.out.print("Ingrese el primer número: ");
        int a = leerEnteroSeguro();
        System.out.print("Ingrese el segundo número: ");
        int b = leerEnteroSeguro();
        System.out.print("Ingrese el tercer número: ");
        int c = leerEnteroSeguro();
        int mayor = Math.max(a, Math.max(b, c));
        System.out.println("El mayor es: " + mayor);
    }
    
    /* Ejercicio 3 */
    private static void ejercicio3() {
        System.out.print("Ingrese su edad: ");
        int edad = leerEnteroSeguro();
        String etapa;
        if (edad < 12) etapa = "Niño";
        else if (edad <= 17) etapa = "Adolescente";
        else if (edad <= 59) etapa = "Adulto";
        else etapa = "Adulto mayor";
        System.out.println("Eres un " + etapa + ".");
    }
    
    /* Ejercicio 4 */
    private static void ejercicio4() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = leerDoubleSeguro();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String cat = sc.nextLine().trim().toUpperCase();
        double porcentaje;
        switch (cat) {
            case "A" -> porcentaje = 10.0;
            case "B" -> porcentaje = 15.0;
            case "C" -> porcentaje = 20.0;
            default -> {
                System.out.println("Categoría inválida. Debe ser A, B o C.");
            return;
            }
        }
        double descuento = precio * (porcentaje / 100.0);
        double finalP = precio - descuento;
        System.out.println("Descuento aplicado: " + ((int) porcentaje) + "%");
        System.out.println("Precio final: " + finalP);
    }
    
    /* Ejercicio 5 */
    private static void ejercicio5() {
        int suma = 0;
        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            int n = leerEnteroSeguro();
            if (n == 0) break;
            if (n % 2 == 0) suma += n;
        }
        System.out.println("La suma de los números pares es: " + suma);
    }
    
    /* Ejercicio 6*/
    private static void ejercicio6() {
        int pos = 0, neg = 0, cer = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int n = leerEnteroSeguro();
            if (n > 0) pos++;
            else if (n < 0) neg++;
            else cer++;
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cer);
    }
    
    
    /* Ejercicio 7 */
    private static void ejercicio7() {
        int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = leerEnteroSeguro();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");
    }
    
    
    /* Ejercicio 8 */
    
    private static void ejercicio8() {
        System.out.print("Ingrese el precio base del producto: ");
        double base = leerDoubleSeguro();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double imp = leerDoubleSeguro();
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double desc = leerDoubleSeguro();
        double precioFinal = calcularPrecioFinal(base, imp, desc);
        System.out.println("El precio final del producto es: " + precioFinal);
    }
    public static double calcularPrecioFinal(double precioBase, double impuestoPct, double descuentoPct) {
        double imp = precioBase * (impuestoPct / 100.0);
        double desc = precioBase * (descuentoPct / 100.0);
        return precioBase + imp - desc;
    }
    
    /*Ejercicio 9 */
    private static void ejercicio9() {
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = leerDoubleSeguro();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = leerDoubleSeguro();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.nextLine().trim();


        double costoEnvio = calcularCostoEnvio(peso, zona);
        if (costoEnvio < 0) {
            System.out.println("Zona inválida. Use 'Nacional' o 'Internacional'.");
            return;
        }
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona == null) return -1;
        String z = zona.trim().toLowerCase();
        double precioKg;
        if (z.equals("nacional")) precioKg = 5.0;
        else if (z.equals("internacional")) precioKg = 10.0;
        else return -1; // inválida
        return precioKg * Math.max(0.0, peso);
        }


    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    /* Ejercicio 10 */
    private static void ejercicio10() {
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = leerEnteroSeguro();
        System.out.print("Ingrese la cantidad vendida: ");
        int cantVendida = leerEnteroSeguro();
        System.out.print("Ingrese la cantidad recibida: ");
        int cantRecibida = leerEnteroSeguro();
        int nuevoStock = actualizarStock(stockActual, cantVendida, cantRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - Math.max(0, cantidadVendida) + Math.max(0, cantidadRecibida);
    }
    
    /* Ejercicio 11 */
    
    private static void ejercicio11() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = leerDoubleSeguro();
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    
    /* Ejercicio 12 */
    
    private static void ejercicio12() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        for (double p : precios) System.out.println("Precio: $" + p);

        // Modificar (por ejemplo, el índice 2 -> 129.99)
        int indice = 2;
        precios[indice] = 129.99;
        
        System.out.println("\nPrecios modificados:");
        for (double p : precios) System.out.println("Precio: $" + p);
    }
    
    /* Ejercicio 13 */
    private static void ejercicio13() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);


        // Modificar (por ejemplo, el índice 2 -> 129.99)
        int indice = 2;
        precios[indice] = 129.99;


        System.out.println("\nPrecios modificados:");
        imprimirRecursivo(precios, 0);
    }


    private static void imprimirRecursivo(double[] arr, int i) {
        if (i >= arr.length) return;
        System.out.println("Precio: $" + arr[i]);
        imprimirRecursivo(arr, i + 1);
    }
}



