import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double base = scanner.nextDouble();

        double resultado = Math.log(num1) / Math.log(base);

        System.out.println("logaritmo de " + num1 + " na base " + base + " = " + resultado);



        scanner.close();    


    }
    
}
