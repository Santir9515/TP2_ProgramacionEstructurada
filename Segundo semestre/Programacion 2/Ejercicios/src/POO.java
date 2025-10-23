/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */
public class POO {

    /*Actividad 1 – Registro de Estudiantes*/
    static class Estudiante {
        private String nombre;
        private String apellido;
        private String curso;
        private double calificacion;

        public Estudiante(String nombre, String apellido, String curso, double calificacion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.curso = curso;
            this.calificacion = calificacion;
        }

        public void mostrarInfo() {
            System.out.println("=== Información del Estudiante ===");
            System.out.println("Nombre: " + nombre + " " + apellido);
            System.out.println("Curso: " + curso);
            System.out.println("Calificación: " + calificacion);
            System.out.println();
        }

        public void subirCalificacion(double puntos) {
            calificacion += puntos;
            System.out.println("La calificación ha aumentado en " + puntos + " puntos.");
        }

        public void bajarCalificacion(double puntos) {
            calificacion -= puntos;
            System.out.println("La calificación ha disminuido en " + puntos + " puntos.");
        }
    }

    /*Actividad 2 – Registro de Mascotas*/
    static class Mascota {
        private String nombre;
        private String especie;
        private int edad;

        public Mascota(String nombre, String especie, int edad) {
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
        }

        public void mostrarInfo() {
            System.out.println("=== Información de la Mascota ===");
            System.out.println("Nombre: " + nombre);
            System.out.println("Especie: " + especie);
            System.out.println("Edad: " + edad + " años");
            System.out.println();
        }

        public void cumplirAnios() {
            edad++;
            System.out.println(nombre + " ha cumplido un año más. Ahora tiene " + edad + " años.");
        }
    }

    /*Actividad 3 – Encapsulamiento con la Clase Libro */
    static class Libro {
        private String titulo;
        private String autor;
        private int anioPublicacion;

        public Libro(String titulo, String autor, int anioPublicacion) {
            this.titulo = titulo;
            this.autor = autor;
            this.anioPublicacion = anioPublicacion;
        }

        // Getters
        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getAnioPublicacion() {
            return anioPublicacion;
        }

        // Setter con validación
        public void setAnioPublicacion(int anioPublicacion) {
            if (anioPublicacion > 0 && anioPublicacion <= 2025) {
                this.anioPublicacion = anioPublicacion;
                System.out.println("Año de publicación actualizado correctamente.");
            } else {
                System.out.println("Error: año de publicación inválido (" + anioPublicacion + ").");
            }
        }

        // Mostrar información
        public void mostrarInfo() {
            System.out.println("=== Información del Libro ===");
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Año de Publicación: " + anioPublicacion);
            System.out.println();
        }
        
     /* Actividad 4 */
        static class Gallina {
            private int idGallina;
            private int edad; // en meses
            private int huevosPuestos;

            public Gallina(int idGallina, int edad, int huevosPuestos) {
                this.idGallina = idGallina;
                this.edad = edad;
                this.huevosPuestos = huevosPuestos;
            }
            public void ponerHuevo() {
                huevosPuestos++;
                System.out.println("Gallina #" + idGallina + " ha puesto un huevo. Total: " + huevosPuestos);
            }
            
            public void envejecer() {
                edad++;
                System.out.println("Gallina #" + idGallina + " ha envejecido un mes. Edad actual: " + edad + " meses.");
            }
            
            public void mostrarEstado(){
                System.out.println("Estado de la Gallina #" + idGallina);
                System.out.println("Edad: " + edad + " meses");
                System.out.println("Huevos puestos: " + huevosPuestos);
                System.out.println();
            }
            
            
        }

    /*Método principal*/
    public static void main(String[] args) {

        // --- Actividad 1 ---
        Estudiante estudiante1 = new Estudiante("Santiago", "Rodríguez", "Programación", 8.5);

        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(0.5);
        estudiante1.mostrarInfo();
        estudiante1.bajarCalificacion(1.0);
        estudiante1.mostrarInfo();

        // --- Actividad 2 ---
        Mascota mascota1 = new Mascota("Luna", "Perro", 3);

        mascota1.mostrarInfo();
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();

        // --- Actividad 3 ---
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);

        libro1.mostrarInfo();
        libro1.setAnioPublicacion(3000);  // Año inválido
        libro1.setAnioPublicacion(2020);  // Año válido
        libro1.mostrarInfo();
        
        
        //--- Actividad 4 ---
        
        Gallina gallina1 = new Gallina(1, 6, 10);
        Gallina gallina2 = new Gallina(2,4,8);
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();        
        
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina1.mostrarEstado();
        
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.mostrarEstado();
        
    }
  }
}
