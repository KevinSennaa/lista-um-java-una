import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o números de carros e motos: ");
        int veiculos = scanner.nextInt();

        System.out.println("Informe o total de rodas no estacionamento");
        int rodas = scanner.nextInt();

        int n1Carros = rodas / 4;
        int n1Motos = n1Carros - veiculos;

        System.out.println("No estacionamento é: " + n1Carros + " carros e  " + n1Motos + " motos ");

        scanner.close();

    }
    
}
