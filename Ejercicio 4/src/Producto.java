public class Producto {
    private String nombre;
    private double precio;
    private boolean tieneIva;

    // Constructor
    public Producto(String nombre, double precio, boolean tieneIva) {
        this.nombre = nombre;
        this.precio = precio;
        this.tieneIva = tieneIva;
    }

    // Método para calcular el IVA
    public double calcularIva() {
        if (!tieneIva) {
            return 0; // Si no tiene IVA, retorna 0
        }

        // Aplicar porcentaje de IVA según el precio
        if (precio <= 500) {
            return precio * 0.12;
        } else if (precio <= 1500) {
            return precio * 0.14;
        } else {
            return precio * 0.15;
        }
    }

    // Método para mostrar la información del producto
    public void mostrarInformacion() {
        double iva = calcularIva();
        double precioFinal = precio + iva;

        System.out.println("Nombre del Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Tiene IVA: " + (tieneIva ? "Sí" : "No"));
        System.out.println("IVA calculado: " + iva);
        System.out.println("Precio Final: " + precioFinal);
    }
}
