import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        String numeroMotor = JOptionPane.showInputDialog("Ingrese el número de motor:");
        int numeroVentanas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ventanas:"));
        int cantidadPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de puertas:"));
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        double kilometrajeInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el kilometraje inicial:"));
        double kilometrajeFinal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el kilometraje final:"));

        // Crear un objeto Vehiculo
        Vehiculo vehiculo = new Vehiculo(numeroMotor, numeroVentanas, cantidadPuertas, marca, modelo, kilometrajeInicial, kilometrajeFinal);

        // Mostrar la información del vehículo
        vehiculo.mostrarInformacion();
    }
}
