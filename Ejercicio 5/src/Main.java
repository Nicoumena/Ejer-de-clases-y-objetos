import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Ingreso de datos del empleado
        String cedula = "";
        while (true) {
            System.out.print("Ingrese la cédula del empleado (solo números): ");
            cedula = scanner.nextLine();
            if (cedula.matches("\\d+")) {
                break;
            } else {
                System.out.println("Cédula inválida. Debe ser un número.");
            }
        }

        String nombre = "";
        while (true) {
            System.out.print("Ingrese el nombre del empleado: ");
            nombre = scanner.nextLine();
            if (!nombre.isEmpty()) {
                break;
            } else {
                System.out.println("El nombre no puede estar vacío.");
            }
        }

        String apellido = "";
        while (true) {
            System.out.print("Ingrese el apellido del empleado: ");
            apellido = scanner.nextLine();
            if (!apellido.isEmpty()) {
                break;
            } else {
                System.out.println("El apellido no puede estar vacío.");
            }
        }

        String genero = "";
        while (true) {
            System.out.print("Ingrese el género del empleado (Masculino/Femenino): ");
            genero = scanner.nextLine();
            if (genero.equalsIgnoreCase("Masculino") || genero.equalsIgnoreCase("Femenino")) {
                break;
            } else {
                System.out.println("Género inválido. Debe ser 'Masculino' o 'Femenino'.");
            }
        }

        double salario = -1;
        while (salario <= 0) {
            System.out.print("Ingrese el salario del empleado (número positivo): ");
            if (scanner.hasNextDouble()) {
                salario = scanner.nextDouble();
                if (salario <= 0) {
                    System.out.println("El salario debe ser un número positivo.");
                }
            } else {
                System.out.println("Entrada inválida. El salario debe ser un número.");
                scanner.next(); // Limpiar el buffer
            }
        }

        // Validación de fecha de nacimiento no posterior a la fecha actual
        LocalDate fechaNacimiento = null;
        while (fechaNacimiento == null) {
            System.out.print("Ingrese la fecha de nacimiento del empleado (yyyy-MM-dd): ");
            String fechaNacimientoStr = scanner.next();
            try {
                fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);
                if (fechaNacimiento.isAfter(LocalDate.now())) {
                    System.out.println("La fecha de nacimiento no puede ser posterior a la fecha actual.");
                    fechaNacimiento = null;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Fecha inválida. Debe estar en formato yyyy-MM-dd.");
            }
        }

        // Validación de fecha de ingreso no posterior a la fecha actual
        LocalDate fechaIngreso = null;
        while (fechaIngreso == null) {
            System.out.print("Ingrese la fecha de ingreso del empleado (yyyy-MM-dd): ");
            String fechaIngresoStr = scanner.next();
            try {
                fechaIngreso = LocalDate.parse(fechaIngresoStr, formatter);
                if (fechaIngreso.isAfter(LocalDate.now())) {
                    System.out.println("La fecha de ingreso no puede ser posterior a la fecha actual.");
                    fechaIngreso = null;
                } else if (fechaIngreso.isBefore(fechaNacimiento)) {
                    System.out.println("La fecha de ingreso no puede ser antes de la fecha de nacimiento.");
                    fechaIngreso = null;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Fecha inválida. Debe estar en formato yyyy-MM-dd.");
            }
        }

        // Crear un objeto de la clase Empleado
        Empleado empleado = new Empleado(cedula, nombre, apellido, genero, salario, fechaNacimiento, fechaIngreso);

        // Menú de opciones
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Modificar salario");
            System.out.println("2. Calcular edad");
            System.out.println("3. Calcular prestaciones");
            System.out.println("4. Mostrar información del empleado");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Modificar salario
                    System.out.print("Ingrese el nuevo salario: ");
                    salario = scanner.nextDouble();
                    empleado.modificarSalario(salario);
                    System.out.println("Salario actualizado.");
                    break;
                case 2:
                    // Calcular y mostrar edad
                    System.out.println("Edad del empleado: " + empleado.calcularEdad());
                    break;
                case 3:
                    // Calcular y mostrar prestaciones
                    System.out.println("Prestaciones del empleado: " + empleado.calcularPrestaciones());
                    break;
                case 4:
                    // Mostrar información del empleado
                    empleado.mostrarInformacion();
                    break;
                case 5:
                    // Salir del programa
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
