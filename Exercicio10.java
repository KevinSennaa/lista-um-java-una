import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double mediaAritmetica = (a + b + c) / 3;

        double mediaHarmonica = 3 / ((1/a) + (1/b) + (1/c));

        double mediaGeometrica = Math.pow(a * b * c, 1.0/3.0);

        System.out.printf("Média aritmética: %.2f%n", mediaAritmetica);
        System.out.printf("Média harmônica: %.2f%n", mediaHarmonica);
        System.out.printf("Média geométrica: %.2f%n", mediaGeometrica);

        scanner.close();
    }
}
