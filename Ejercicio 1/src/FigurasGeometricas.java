import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FigurasGeometricas {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Triángulo
            System.out.println("Ingrese la base del triángulo:");
            double baseTriangulo = Double.parseDouble(reader.readLine());
            System.out.println("Ingrese la altura del triángulo:");
            double alturaTriangulo = Double.parseDouble(reader.readLine());
            double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
            double ladoTriangulo = Math.sqrt(Math.pow(baseTriangulo / 2, 2) + Math.pow(alturaTriangulo, 2)); // Lado de los dos lados iguales
            double perimetroTriangulo = baseTriangulo + 2 * ladoTriangulo;
            System.out.println("Área del triángulo: " + areaTriangulo);
            System.out.println("Perímetro del triángulo: " + perimetroTriangulo);

            // Cuadrado
            System.out.println("\nIngrese el lado del cuadrado:");
            double ladoCuadrado = Double.parseDouble(reader.readLine());
            double areaCuadrado = Math.pow(ladoCuadrado, 2);
            double perimetroCuadrado = 4 * ladoCuadrado;
            System.out.println("Área del cuadrado: " + areaCuadrado);
            System.out.println("Perímetro del cuadrado: " + perimetroCuadrado);

            // Rectángulo
            System.out.println("\nIngrese la base del rectángulo:");
            double baseRectangulo = Double.parseDouble(reader.readLine());
            System.out.println("Ingrese la altura del rectángulo:");
            double alturaRectangulo = Double.parseDouble(reader.readLine());
            double areaRectangulo = baseRectangulo * alturaRectangulo;
            double perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);
            System.out.println("Área del rectángulo: " + areaRectangulo);
            System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);

        } catch (IOException e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido.");
        }
    }
}