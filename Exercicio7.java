import java.util.Scanner;

public class Exercicio7 {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);   

        System.out.println("Valor fixo do salário mensal: ");
        double salario = scanner.nextDouble();

        System.out.println("Vendas realizadas no mês: ");
        double vendas = scanner.nextDouble();

        System.out.println("Porcentagens da comissão das vendas: ");
        double porcentagem = scanner.nextDouble();
        
        double valorV = (vendas * porcentagem) / 100;

        System.out.println("O salário total do vendedor é: " + (salario + valorV));
       
        scanner.close();
        

    }

}
