import java.time.LocalDate;
import java.time.Period;

public class Empleado {
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private double salario;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;

    // Constructor
    public Empleado(String cedula, String nombre, String apellido, String genero, double salario, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    // Método para modificar el salario
    public void modificarSalario(double nuevoSalario) {
        this.salario = nuevoSalario;
    }

    // Método para calcular la edad
    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    // Método para calcular la antigüedad
    public int calcularAntiguedad() {
        return Period.between(fechaIngreso, LocalDate.now()).getYears();
    }

    // Método para calcular las prestaciones
    public double calcularPrestaciones() {
        int antiguedad = calcularAntiguedad();
        return (antiguedad * salario) / 12;
    }

    // Método para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Género: " + genero);
        System.out.println("Salario: " + salario);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println("Edad: " + calcularEdad());
        System.out.println("Antigüedad: " + calcularAntiguedad());
        System.out.println("Prestaciones: " + calcularPrestaciones());
    }
}
