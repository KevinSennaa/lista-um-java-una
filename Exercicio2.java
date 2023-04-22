import java.util.Scanner;

public class Exercicio2 {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Produto que custava 90 reais, aumentou 10% do seu valor: ");
    float n1 = scanner.nextFloat();

    float porcentagem = (n1 * 10 / 100); 

    System.out.println("Acrescimo de 10% de 90 reais é: " + (n1 + porcentagem));

    scanner.close();

}    
}

    