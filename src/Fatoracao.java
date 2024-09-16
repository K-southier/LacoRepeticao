import java.util.Scanner;
public class Fatoracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        int originalNumero = numero;
        int i = 2;
        do{
            if(numero % i == 0){
                System.out.println(i + " ");
                numero /= i;
            } else {
                i++;
            }
        }  while(numero > 1);
        System.out.println();
    }

}
