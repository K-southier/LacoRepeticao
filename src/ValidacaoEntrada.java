import java.util.Scanner;
public class ValidacaoEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Crie um programa que solicite a idade do usuário ]
        // e continue solicitando até que ele forneça uma idade válida (maior que 0).
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();



            if (idade <= 0) {
                System.out.println("Idade inválida. Por favor, digite uma idade maior que 0.");
            }
    }
}
