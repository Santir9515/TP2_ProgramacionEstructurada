/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico2;

/**
 *
 * @author santi
 */
public class TrabajoPractico4 {

    public static void main(String[] args) {

        // Instanciar usando constructor completo
        Empleado e1 = new Empleado(1, "Santiago Rodríguez", "Analista", 250000);
        Empleado e2 = new Empleado(2, "Franco Díaz", "Dev Senior", 300000);

        // Instanciar usando constructor reducido
        Empleado e3 = new Empleado("Jonathan Pérez", "Soporte");
        Empleado e4 = new Empleado("Maximiliano López", "Tester");

        // Aplicar aumentos
        e1.actualizarSalario(10);       // +10%
        e2.actualizarSalario(50000);    // +50.000 fijo
        e3.actualizarSalario(5);        // +5%
        e4.actualizarSalario(20000);    // +20.000

        // Mostrar empleados
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // Mostrar total de empleados creados
        System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}


// ==========================
//   CLASE EMPLEADO COMPLETA
// ==========================

class Empleado {

    // Atributos privados
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático para contar empleados
    private static int totalEmpleados = 0;

    // Constructor 1 (recibe todos los atributos)
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;

        totalEmpleados++;
    }

    // Constructor 2 (solo nombre y puesto)
    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;

        // ID automático
        this.id = ++totalEmpleados;

        // Salario por defecto
        this.salario = 150000;
    }

    // Aumento por porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // Aumento por monto fijo
    public void actualizarSalario(int montoFijo) {
        this.salario += montoFijo;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    // Método toString()
    @Override
    public String toString() {
        return "Empleado {" +
               "id=" + id +
               ", nombre='" + nombre + '\'' +
               ", puesto='" + puesto + '\'' +
               ", salario=" + salario +
               '}';
    }

    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}


