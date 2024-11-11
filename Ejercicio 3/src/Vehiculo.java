import javax.swing.JOptionPane;

public class Vehiculo {
    private String numeroMotor;
    private int numeroVentanas;
    private int cantidadPuertas;
    private String marca;
    private String modelo;
    private double kilometrajeInicial;
    private double kilometrajeFinal;

    // Constructor
    public Vehiculo(String numeroMotor, int numeroVentanas, int cantidadPuertas, String marca, String modelo, double kilometrajeInicial, double kilometrajeFinal) {
        this.numeroMotor = numeroMotor;
        this.numeroVentanas = numeroVentanas;
        this.cantidadPuertas = cantidadPuertas;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometrajeInicial = kilometrajeInicial;
        this.kilometrajeFinal = kilometrajeFinal;
    }

    // Método para calcular kilómetros recorridos
    public double calcularKilometrosRecorridos() {
        return kilometrajeFinal - kilometrajeInicial;
    }

    // Método para mostrar la información
    public void mostrarInformacion() {
        String informacion = "Número de Motor: " + numeroMotor +
                "\nNúmero de Ventanas: " + numeroVentanas +
                "\nCantidad de Puertas: " + cantidadPuertas +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nKilometraje Inicial: " + kilometrajeInicial +
                "\nKilometraje Final: " + kilometrajeFinal +
                "\nKilómetros Recorridos: " + calcularKilometrosRecorridos();

        JOptionPane.showMessageDialog(null, informacion, "Información del Vehículo", JOptionPane.INFORMATION_MESSAGE);
    }
}
