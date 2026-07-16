import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println(" CALCULADORA DE ECUACION CUADRATICA ");
        System.out.println("====================================");

        System.out.print("Ingrese el valor de a: ");
        double a = teclado.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = teclado.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = teclado.nextDouble();

        if ( a == 0) {
            System.out.println();
            System.out.println("El valor de 'a' no puede ser cero.");
            System.out.println("No es una ecuacion cuadratica.");
            return;
        }

        double discriminante = (b * b) - (4 * a * c);

        System.out.println();
        System.out.println("Discriminante = " + discriminante);

        if (discriminante > 0) {

            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println();
            System.out.println("La ecuacion tiene dos soluciones reales:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {

            double x = (-b) / (2 * a);
            System.out.println();
            System.out.println("La ecuacion tiene una unica solucion real:");
            System.out.println("x = " + x);

        } else {

            double parteReal = (-b) / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);

            System.out.println();
            System.out.println("La ecuacion tiene dos soluciones complejas:");
            System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
        }

        teclado.close();
    }
}