import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String p = "Proves";

        int opcio;
        do {
            System.out.println("1. Comparar números");
            System.out.println("2. Calcular ecuación de segundo grado");
            System.out.println("3. Crear orden");
            System.out.println("0. Acabar");

            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    compararNumeros(scan);
                    break;
                case 2:
                    calcularEcuacionSegundoGrado();
                    break;
                case 3:
                    crearOrden();
                    break;
                case 0:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 3");
            }
        } while (opcio != 0);
    }

    private static void compararNumeros(Scanner scan) {
        System.out.println("Introduce el primer número: ");
        int num1 = scan.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = scan.nextInt();
        if (Comparador.max(num1, num2)) {
            System.out.println("El primer número es mayor.");
        } else {
            System.out.println("El segundo número es mayor o igual.");
        }
    }

    private static void calcularEcuacionSegundoGrado() {
        double a = 2;
        double b = 3;
        double c = 1;
        Calculadora.calcEquacioSegongrau(a, b, c);
    }

    private static void crearOrden() {
        List<OrderLineItem> lineItems = null; // Aquí deberías obtener los datos necesarios
        Order asd = new Order(lineItems, 5.5);
        System.out.println("Orden creada con total: " + asd.calculateTotalPrice());
    }
}
