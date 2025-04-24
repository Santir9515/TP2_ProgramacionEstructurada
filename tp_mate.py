# Función que se encarga de mostrar el resultado de una operación bit a bit
# Recibe tres parámetros:
# - nombre_operacion: un string con el nombre de la operación (por ejemplo, "AND")
# - resultado: el resultado en número decimal de la operación bit a bit
# - bit_resultado: el mismo resultado pero convertido a formato binario (usando bin())
def mostrar_resultado(nombre_operacion, resultado, bit_resultado):
    print(f"{nombre_operacion}:")  # Imprime el nombre de la operación como encabezado
    print(f"  Decimal: {resultado}")  # Muestra el resultado en forma decimal (ej. 5)
    print(f"  Binario: {bit_resultado}")  # Muestra el resultado en binario (ej. 0b101)
    print()  # Imprime una línea en blanco para separar visualmente los resultados

# Función principal que contiene la lógica del programa
def main():
    # Mensaje de bienvenida al iniciar el programa
    print("=== Calculadora de Operaciones Bit a Bit ===")

    try:
        # Solicita al usuario que ingrese el primer número
        # input() devuelve un string, por eso usamos int() para convertirlo a entero
        num1 = int(input("Ingrese el primer número entero: "))

        # Solicita el segundo número entero de la misma manera
        num2 = int(input("Ingrese el segundo número entero: "))

        # --- OPERACIONES BIT A BIT ---
        # A continuación realizamos tres operaciones bit a bit entre los dos números:

        # Operación AND: devuelve 1 solo si ambos bits correspondientes son 1
        resultado_and = num1 & num2

        # Operación OR: devuelve 1 si al menos uno de los bits es 1
        resultado_or = num1 | num2

        # Operación XOR (exclusiva): devuelve 1 si los bits son diferentes
        resultado_xor = num1 ^ num2

        # Imprime un encabezado para los resultados
        print("\n--- Resultados ---")

        # Para cada operación, mostramos el resultado llamando a la función 'mostrar_resultado'
        # Convertimos el resultado a binario con bin() para mostrar cómo se ve en forma binaria

        mostrar_resultado("AND", resultado_and, bin(resultado_and))
        mostrar_resultado("OR", resultado_or, bin(resultado_or))
        mostrar_resultado("XOR", resultado_xor, bin(resultado_xor))

    except ValueError:
        # Si el usuario ingresa algo que no es un número (por ejemplo letras),
        # se lanza una excepción ValueError, que capturamos para evitar que el programa se rompa
        print("Error: Por favor, ingrese solo números enteros.")

# Esta línea es un estándar

if __name__ == "__main__":
    main()