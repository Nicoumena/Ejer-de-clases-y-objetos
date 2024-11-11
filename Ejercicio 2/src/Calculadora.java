public class Calculadora {
    // Método para sumar dos números
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar dos números
    public double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dos números
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir dos números (con verificación para evitar división por cero)
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return Double.NaN;
        }
        return a / b;
    }

    // Método para calcular el perímetro de un triángulo (suma de sus tres lados)
    public double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }
}
