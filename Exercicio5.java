import java.util.Scanner;

public class Exercicio5 {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Por gentileza, informe o numero de horas que trabalhou no mês: ");
    double horas = scanner.nextDouble();

    System.out.print("Por gentileza, dite o valor recebido por hora de trabalho: ");
    double valorh = scanner.nextDouble();

    System.out.print("Por gentileza, dite o sálario família: ");
    double familia = scanner.nextDouble();

    System.out.print("Por gentileza, digite o números de filhos: ");
    double filhos = scanner.nextDouble();

    double salarioBruto = (horas * valorh) + (familia * filhos);

    System.out.print("Sálario total a ser recebido é: " + salarioBruto);

    scanner.close();

    }
}