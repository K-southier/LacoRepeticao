import java.util.Scanner;
public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Solicite ao usuário um número inicial e
        // utilize um loop while para fazer uma contagem regressiva até 0.

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        while (n >= 0) {
            System.out.println(n);
            n--;
        }
    }
}
