import java.util.Scanner;

public class MediaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("O número de elementos deve ser um valor positivo.");
            scanner.close();
            return;
        }

        double[] numeros = new double[n];

        System.out.println("Digite " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }

        double media = soma / n;

        System.out.printf("A média dos números inseridos é: %.2f%n", media);
    }
}
