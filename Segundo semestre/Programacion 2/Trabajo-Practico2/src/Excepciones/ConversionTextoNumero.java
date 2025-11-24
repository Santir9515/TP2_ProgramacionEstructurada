/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class ConversionTextoNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            String texto = sc.nextLine();
            int valor = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + valor);
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto ingresado no es un entero válido.");
        } finally {
            sc.close();
        }
    }
}
