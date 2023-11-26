import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        // scanner de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // pede ao usuario para digitar um número inteiro
        System.out.print("Digite um número inteiro: ");

        // obtem o  número digitado pelo usuário
        int numero = scanner.nextInt();

        // verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();
    }
}