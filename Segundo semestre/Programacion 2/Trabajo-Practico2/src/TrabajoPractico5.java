/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */
public class TrabajoPractico5 {
    
    //PASAPORTE – FOTO – TITULAR
    class Foto {
    private String imagen;
    private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
}

    class Titular {
        private String nombre;
        private String dni;
        private Pasaporte pasaporte; 

        public Titular(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public void setPasaporte(Pasaporte pasaporte) {
            this.pasaporte = pasaporte;
        }

        public Pasaporte getPasaporte() {
            return pasaporte;
        }
    }

    class Pasaporte {
        private String numero;
        private String fechaEmision;
        private Foto foto;
        private Titular titular;

        public Pasaporte(String numero, String fechaEmision, Titular titular, Foto foto) {
            this.numero = numero;
            this.fechaEmision = fechaEmision;
            this.foto = foto;
            this.titular = titular;
            titular.setPasaporte(this);
        }
    }
    
  //CELULAR – BATERÍA – USUARIO
    class Bateria {
        private String modelo;
        private int capacidad;

        public Bateria(String modelo, int capacidad) {
            this.modelo = modelo;
            this.capacidad = capacidad;
        }
    }

    class Usuario {
        private String nombre;
        private String dni;
        private Celular celular;

        public Usuario(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public void setCelular(Celular celular) {
            this.celular = celular;
        }

        public Celular getCelular() {
            return celular;
        }
    }

    class Celular {
        private String imei;
        private String marca;
        private String modelo;
        private Bateria bateria;
        private Usuario usuario;

        public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
            this.imei = imei;
            this.marca = marca;
            this.modelo = modelo;
            this.bateria = bateria;
            this.usuario = usuario;
            usuario.setCelular(this);
        }
    }

    //LIBRO – AUTOR – EDITORIAL
    class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    }

    class Editorial {
        private String nombre;
        private String direccion;

        public Editorial(String nombre, String direccion) {
            this.nombre = nombre;
            this.direccion = direccion;
        }
    }

    class Libro {
        private String titulo;
        private String isbn;
        private Autor autor;
        private Editorial editorial;

        public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
            this.titulo = titulo;
            this.isbn = isbn;
            this.autor = autor;
            this.editorial = editorial;
        }
    }
// TARJETA DE CRÉDITO – CLIENTE – BANCO
    class Cliente {
        private String nombre;
        private String dni;
        private TarjetaDeCredito tarjeta;

        public Cliente(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public void setTarjeta(TarjetaDeCredito tarjeta) {
            this.tarjeta = tarjeta;
        }

        public TarjetaDeCredito getTarjeta() {
            return tarjeta;
        }
    }

    class Banco {
        private String nombre;
        private String cuit;

        public Banco(String nombre, String cuit) {
            this.nombre = nombre;
            this.cuit = cuit;
        }
    }

    class TarjetaDeCredito {
        private String numero;
        private String fechaVencimiento;
        private Cliente cliente;
        private Banco banco;

        public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
            this.numero = numero;
            this.fechaVencimiento = fechaVencimiento;
            this.cliente = cliente;
            this.banco = banco;
            cliente.setTarjeta(this);
        }
    }
// COMPUTADORA – PLACA MADRE – PROPIETARIO
    class PlacaMadre {
        private String modelo;
        private String chipset;

        public PlacaMadre(String modelo, String chipset) {
            this.modelo = modelo;
            this.chipset = chipset;
        }
    }

    class Propietario {
        private String nombre;
        private String dni;
        private Computadora computadora;

        public Propietario(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public void setComputadora(Computadora computadora) {
            this.computadora = computadora;
        }

        public Computadora getComputadora() {
            return computadora;
        }
    }

    class Computadora {
        private String marca;
        private String numeroSerie;
        private PlacaMadre placaMadre;
        private Propietario propietario;

        public Computadora(String marca, String numeroSerie, Propietario propietario, String modeloPlaca, String chipset) {
            this.marca = marca;
            this.numeroSerie = numeroSerie;
            this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
            this.propietario = propietario;
            propietario.setComputadora(this);
        }
    }
// RESERVA – CLIENTE – MESA
    class ClienteReserva {
        private String nombre;
        private String telefono;

        public ClienteReserva(String nombre, String telefono) {
            this.nombre = nombre;
            this.telefono = telefono;
        }
    }

    class Mesa {
        private int numero;
        private int capacidad;

        public Mesa(int numero, int capacidad) {
            this.numero = numero;
            this.capacidad = capacidad;
        }
    }

    class Reserva {
        private String fecha;
        private String hora;
        private ClienteReserva cliente;
        private Mesa mesa;

        public Reserva(String fecha, String hora, ClienteReserva cliente, Mesa mesa) {
            this.fecha = fecha;
            this.hora = hora;
            this.cliente = cliente;
            this.mesa = mesa;
        }
    }
// VEHÍCULO – MOTOR – CONDUCTOR
    class Motor {
        private String tipo;
        private String numeroSerie;

        public Motor(String tipo, String numeroSerie) {
            this.tipo = tipo;
            this.numeroSerie = numeroSerie;
        }
    }

    class Conductor {
        private String nombre;
        private String licencia;
        private Vehiculo vehiculo;

        public Conductor(String nombre, String licencia) {
            this.nombre = nombre;
            this.licencia = licencia;
        }

        public void setVehiculo(Vehiculo vehiculo) {
            this.vehiculo = vehiculo;
        }

        public Vehiculo getVehiculo() {
            return vehiculo;
        }
    }

    class Vehiculo {
        private String patente;
        private String modelo;
        private Motor motor;
        private Conductor conductor;

        public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
            this.patente = patente;
            this.modelo = modelo;
            this.motor = motor;
            this.conductor = conductor;
            conductor.setVehiculo(this);
        }
    }
//DOCUMENTO – FIRMA DIGITAL – USUARIO
    class Usuario {
        private String nombre;
        private String email;

        public Usuario(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }
    }

    class FirmaDigital {
        private String codigoHash;
        private String fecha;
        private Usuario usuario;

        public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
            this.codigoHash = codigoHash;
            this.fecha = fecha;
            this.usuario = usuario;
        }
    }

    class Documento {
        private String titulo;
        private String contenido;
        private FirmaDigital firmaDigital;

        public Documento(String titulo, String contenido, FirmaDigital firmaDigital) {
            this.titulo = titulo;
            this.contenido = contenido;
            this.firmaDigital = firmaDigital;
        }
    }
// CITA MÉDICA – PACIENTE – PROFESIONAL
    class Paciente {
        private String nombre;
        private String obraSocial;

        public Paciente(String nombre, String obraSocial) {
            this.nombre = nombre;
            this.obraSocial = obraSocial;
        }
    }

    class Profesional {
        private String nombre;
        private String especialidad;

        public Profesional(String nombre, String especialidad) {
            this.nombre = nombre;
            this.especialidad = especialidad;
        }
    }

    class CitaMedica {
        private String fecha;
        private String hora;
        private Paciente paciente;
        private Profesional profesional;

        public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
            this.fecha = fecha;
            this.hora = hora;
            this.paciente = paciente;
            this.profesional = profesional;
        }
    }
//CUENTA BANCARIA – CLAVE – TITULAR
    class ClaveSeguridad {
        private String codigo;
        private String ultimaModificacion;

        public ClaveSeguridad(String codigo, String ultimaModificacion) {
            this.codigo = codigo;
            this.ultimaModificacion = ultimaModificacion;
        }
    }

    class TitularCuenta {
        private String nombre;
        private String dni;
        private CuentaBancaria cuenta;

        public TitularCuenta(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public void setCuenta(CuentaBancaria cuenta) {
            this.cuenta = cuenta;
        }

        public CuentaBancaria getCuenta() {
            return cuenta;
        }
    }

    class CuentaBancaria {
        private String cbu;
        private double saldo;
        private ClaveSeguridad claveSeguridad;
        private TitularCuenta titular;

        public CuentaBancaria(String cbu, double saldo, TitularCuenta titular, String cod, String fecha) {
            this.cbu = cbu;
            this.saldo = saldo;
            this.claveSeguridad = new ClaveSeguridad(cod, fecha);
            this.titular = titular;
            titular.setCuenta(this);
        }
    }
//REPRODUCTOR – CANCIÓN – ARTISTA
    class Artista {
        private String nombre;
        private String genero;

        public Artista(String nombre, String genero) {
            this.nombre = nombre;
            this.genero = genero;
        }
    }

    class Cancion {
        private String titulo;
        private Artista artista;

        public Cancion(String titulo, Artista artista) {
            this.titulo = titulo;
            this.artista = artista;
        }

        public String getTitulo() {
            return titulo;
        }
    }

    class Reproductor {
        public void reproducir(Cancion cancion) {
            System.out.println("Reproduciendo: " + cancion.getTitulo());
        }
    }
//CALCULADORA – IMPUESTO – CONTRIBUYENTE
    class Contribuyente {
        private String nombre;
        private String cuil;

        public Contribuyente(String nombre, String cuil) {
            this.nombre = nombre;
            this.cuil = cuil;
        }
    }

    class Impuesto {
        private double monto;
        private Contribuyente contribuyente;

        public Impuesto(double monto, Contribuyente contribuyente) {
            this.monto = monto;
            this.contribuyente = contribuyente;
        }

        public double getMonto() {
            return monto;
        }
    }

    class Calculadora {
        public void calcular(Impuesto impuesto) {
            System.out.println("Calculando impuesto sobre: " + impuesto.getMonto());
        }
    }
//GENERADOR QR – CÓDIGO QR – USUARIO
    class UsuarioQR {
        private String nombre;
        private String email;

        public UsuarioQR(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }
    }

    class CodigoQR {
        private String valor;
        private UsuarioQR usuario;

        public CodigoQR(String valor, UsuarioQR usuario) {
            this.valor = valor;
            this.usuario = usuario;
        }
    }

    class GeneradorQR {
        public void generar(String valor, UsuarioQR usuario) {
            CodigoQR qr = new CodigoQR(valor, usuario);
            System.out.println("QR generado: " + valor);
        }
    }
//EDITOR DE VIDEO – PROYECTO – RENDER
    class Proyecto {
        private String nombre;
        private int duracion;

        public Proyecto(String nombre, int duracion) {
            this.nombre = nombre;
            this.duracion = duracion;
        }
    }

    class Render {
        private String formato;
        private Proyecto proyecto;

        public Render(String formato, Proyecto proyecto) {
            this.formato = formato;
            this.proyecto = proyecto;
        }
    }

    class EditorVideo {
        public void exportar(String formato, Proyecto proyecto) {
            Render render = new Render(formato, proyecto);
            System.out.println("Render realizado en formato: " + formato);
        }
    }
}
