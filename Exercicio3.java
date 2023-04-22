import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);     

    System.out.print("Digete a temperatura: ");
    double n1 = scanner.nextDouble();

    double conversao = ((n1 - 32) / 1.8) ;

    System.out.println("Valor da temperatura é: " + conversao);

    scanner.close();

}
}