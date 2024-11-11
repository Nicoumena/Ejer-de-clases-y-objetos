import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        String[] opciones = {"Suma", "Resta", "Multiplicación", "División", "Perímetro de Triángulo"};
        String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una operación", "Calculadora",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (opcion != null) {
            switch (opcion) {
                case "Suma":
                    double aSuma = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
                    double bSuma = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                    double resultadoSuma = calculadora.sumar(aSuma, bSuma);
                    JOptionPane.showMessageDialog(null, "Resultado de la suma: " + resultadoSuma);
                    break;

                case "Resta":
                    double aResta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
                    double bResta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                    double resultadoResta = calculadora.restar(aResta, bResta);
                    JOptionPane.showMessageDialog(null, "Resultado de la resta: " + resultadoResta);
                    break;

                case "Multiplicación":
                    double aMultiplicacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
                    double bMultiplicacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                    double resultadoMultiplicacion = calculadora.multiplicar(aMultiplicacion, bMultiplicacion);
                    JOptionPane.showMessageDialog(null, "Resultado de la multiplicación: " + resultadoMultiplicacion);
                    break;

                case "División":
                    double aDivision = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
                    double bDivision = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                    double resultadoDivision = calculadora.dividir(aDivision, bDivision);
                    if (!Double.isNaN(resultadoDivision)) {
                        JOptionPane.showMessageDialog(null, "Resultado de la división: " + resultadoDivision);
                    }
                    break;

                case "Perímetro de Triángulo":
                    double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer lado del triángulo:"));
                    double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo lado del triángulo:"));
                    double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer lado del triángulo:"));
                    double perimetro = calculadora.calcularPerimetroTriangulo(lado1, lado2, lado3);
                    JOptionPane.showMessageDialog(null, "Perímetro del triángulo: " + perimetro);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Operación no válida.");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna operación.");
        }
    }
}
