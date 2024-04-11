import java.util.Scanner;
public class CalculoFiguras {

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
            System.out.print("Opción: ");
            opcionOperacion = scanner.nextInt();
        } while (opcionOperacion < 1 || opcionOperacion > 2);

        double resultado ;

        switch (opcionFigura) {
            case 1:
                if (opcionOperacion == 1) {
                    System.out.print("Area: ");
                    double radio = scanner.nextDouble();
                    resultado = Math.PI * Math.pow(radio, 2);
                    System.out.println("Área del circulo: " + resultado);
                } else {
                    System.out.print("Perimetro: ");
                    double radio = scanner.nextDouble();
                    resultado = 2 * Math.PI * radio;
                    System.out.println("Perímetro del circulo: " + resultado);
                }
                break;
            case 2:
                if (opcionOperacion == 1) {
                    System.out.print("Area: ");
                    double lado = scanner.nextDouble();
                    resultado = Math.pow(lado, 2);
                    System.out.println("Área del cuadrado: " + resultado);
                } else {
                    System.out.print("Perimetro: ");
                    double lado = scanner.nextDouble();
                    resultado = 4 * lado;
                    System.out.println("Perímetro del cuadrado: " + resultado);
                }
                break;
            case 3:
                if (opcionOperacion == 1) {
                    System.out.print("Base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double altura = scanner.nextDouble();
                    resultado = (base * altura) / 2;
                    System.out.println("Área del triangulo: " + resultado);
                } else {
                    System.out.print("Base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Lado 1: ");
                    double lado1 = scanner.nextDouble();
                    System.out.print("Lado 2: ");
                    double lado2 = scanner.nextDouble();
                    resultado = base + lado1 + lado2;
                    System.out.println("Perímetro del triangulo: " + resultado);
                }
                break;
            case 4:
                if (opcionOperacion == 1) {
                    System.out.print("Base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double altura = scanner.nextDouble();
                    resultado = base * altura;
                    System.out.println("Área del rectangulo: " + resultado);
                } else {
                    System.out.print("Base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double altura = scanner.nextDouble();
                    resultado = 2 * (base + altura);
                    System.out.println("Perímetro del rectangulo: " + resultado);
                }
                break;
            case 5:
                if (opcionOperacion == 1) {
                    System.out.print("Apotema: ");
                    double apotema = scanner.nextDouble();
                    System.out.print("Lado: ");
                    double lado = scanner.nextDouble();
                    resultado = (5 * lado * apotema) / 2;
                    System.out.println("Área del pentágono: " + resultado);
                } else {
                    System.out.println("Perimetro:");
                    double lado = scanner.nextDouble();
                    resultado = 5 * lado;
                    System.out.println("Perímetro del pentágono: " + resultado);
                }
                    break;

                    default:
                        System.out.println("Opción inválida.");
                }



        }

    }
