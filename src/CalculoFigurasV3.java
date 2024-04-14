import java.util.Scanner;
public class CalculoFigurasV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcionFigura;
        do {
            System.out.println("Elija la figura geométrica:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.print("Opción: ");
            opcionFigura = scanner.nextInt();
        } while (opcionFigura < 1 || opcionFigura > 5);

        int opcionOperacion;
        do {
            System.out.println("\nElija la operación:");
            System.out.println("1. Calcular área");
            System.out.println("2. Calcular perímetro");
            System.out.println("3. Calcular potencia");
            System.out.print("Opción: ");
            opcionOperacion = scanner.nextInt();
        } while (opcionOperacion < 1 || opcionOperacion > 3);

        switch (opcionOperacion) {
            case 1:
                calcularFigura(opcionFigura, "Área", scanner);
                break;
            case 2:
                calcularFigura(opcionFigura, "Perímetro", scanner);
                break;
            case 3:
                System.out.print("Base: ");
                double base = scanner.nextDouble();
                System.out.print("Exponente: ");
                int exponente = scanner.nextInt();
                double resultadoPotencia = calcularPotencia(base, exponente);
                System.out.println("Potencia: " + resultadoPotencia);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public static void calcularFigura(int opcionFigura, String tipoOperacion, Scanner scanner) {
        double resultado;
        switch (opcionFigura) {
            case 1:
                System.out.print("Radio: ");
                double radio = scanner.nextDouble();
                if (tipoOperacion.equals("Área")) {
                    resultado = Math.PI * Math.pow(radio, 2);
                    System.out.println("Área del círculo: " + resultado);
                } else {
                    resultado = 2 * Math.PI * radio;
                    System.out.println("Perímetro del círculo: " + resultado);
                }
                break;
            case 2:
                System.out.print("Lado: ");
                double ladoCuadrado = scanner.nextDouble();
                if (tipoOperacion.equals("Área")) {
                    resultado = Math.pow(ladoCuadrado, 2);
                    System.out.println("Área del cuadrado: " + resultado);
                } else {
                    resultado = 4 * ladoCuadrado;
                    System.out.println("Perímetro del cuadrado: " + resultado);
                }
                break;
            case 3:
                if (tipoOperacion.equals("Área")) {
                    System.out.print("Base: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double alturaTriangulo = scanner.nextDouble();
                    resultado = (baseTriangulo * alturaTriangulo) / 2;
                    System.out.println("Área del triángulo: " + resultado);
                } else {
                    System.out.print("Base: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Lado 1: ");
                    double lado1 = scanner.nextDouble();
                    System.out.print("Lado 2: ");
                    double lado2 = scanner.nextDouble();
                    resultado = baseTriangulo + lado1 + lado2;
                    System.out.println("Perímetro del triángulo: " + resultado);
                }
                break;
            case 4:
                if (tipoOperacion.equals("Área")) {
                    System.out.print("Base: ");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double alturaRectangulo = scanner.nextDouble();
                    resultado = baseRectangulo * alturaRectangulo;
                    System.out.println("Área del rectángulo: " + resultado);
                } else {
                    System.out.print("Base: ");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double alturaRectangulo = scanner.nextDouble();
                    resultado = 2 * (baseRectangulo + alturaRectangulo);
                    System.out.println("Perímetro del rectángulo: " + resultado);
                }
                break;
            case 5:
                if (tipoOperacion.equals("Área")) {
                    System.out.print("Apotema: ");
                    double apotemaPentagono = scanner.nextDouble();
                    System.out.print("Lado: ");
                    double ladoPentagono = scanner.nextDouble();
                    resultado = (5 * ladoPentagono * apotemaPentagono) / 2;
                    System.out.println("Área del pentágono: " + resultado);
                } else {
                    System.out.print("Lado: ");
                    double ladoPentagono = scanner.nextDouble();
                    resultado = 5 * ladoPentagono;
                    System.out.println("Perímetro del pentágono: " + resultado);
                }
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public static double calcularPotencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente > 0) {
            return base * calcularPotencia(base, exponente - 1);
        } else {
            return 1 / (base * calcularPotencia(base, -exponente - 1));
        }
    }

}