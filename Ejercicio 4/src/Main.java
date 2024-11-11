import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
        int tieneIvaOption = JOptionPane.showConfirmDialog(null, "¿El producto tiene IVA?", "IVA", JOptionPane.YES_NO_OPTION);
        boolean tieneIva = (tieneIvaOption == JOptionPane.YES_OPTION);

        // Crear un objeto Producto
        Producto producto = new Producto(nombre, precio, tieneIva);

        // Mostrar la información del producto
        producto.mostrarInformacion();
    }
}
