import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;

        int palpite = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando entre 1 e 100.");

        while (palpite != numeroAleatorio) {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número.");
            }
        }

    }
}