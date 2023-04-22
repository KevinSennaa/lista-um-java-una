import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);     

    System.out.print("Por gentileza, digite o valor depositado: ");
    double capital = scanner.nextDouble();

    System.out.print("Por gentileza, digite o prazo: ");
    double prazo = scanner.nextDouble();

    System.out.print("Por gentileza, digite a taxa do juros mensal: ");
    double taxa = scanner.nextDouble();

    double montante = capital * Math.pow((1 + taxa), prazo);

    System.out.println("Valor a ser recebido: " + montante);

    scanner.close();
}
}
