import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcio;
        do {
            System.out.println("1. Comparar números");
            System.out.println("2. Calcular equació de segon grau");
            System.out.println("3. Crear ordre");
            System.out.println("0. Acabar");

            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    compararNumeros(scan);
                    break;
                case 2:
                    calcularEquacioSegonGrau();
                    break;
                case 3:
                    crearOrdre();
                    break;
                case 0:
                    System.out.println("Adéu!");
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 3");
            }
        } while (opcio != 0);
    }

    private static void compararNumeros(Scanner scan) {
        System.out.println("Introdueix el primer número: ");
        int num1 = scan.nextInt();
        System.out.println("Introdueix el segon número: ");
        int num2 = scan.nextInt();
        if (Comparador.max(num1, num2)) {
            System.out.println("El primer número és més gran.");
        } else {
            System.out.println("El segon número és més gran o igual.");
        }
    }

    private static void calcularEquacioSegonGrau() {
        double a = 2;
        double b = 3;
        double c = 1;
        Calculadora.calcEquacioSegonGrau(a, b, c);
    }

    private static void crearOrdre() {
        List<OrderLineItem> lineItems = null; // Aquí hauríeu d'obtenir les dades necessàries
        Order asd = new Order(lineItems, 5.5);
        System.out.println("Ordre creada amb total: " + asd.calculateTotalPrice());
    }
}
