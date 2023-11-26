import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSorteado = random.nextInt(101);

        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        int palpite;

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSorteado) {
                System.out.println("Seu palpite é menor. Tente novamente.");
            } else if (palpite > numeroSorteado) {
                System.out.println("Seu palpite é maior. Tente novamente.");
            }
        } while (palpite != numeroSorteado);

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
    }
}