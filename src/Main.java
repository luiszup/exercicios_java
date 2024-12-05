import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = input.nextInt();

        int soma = 0;

        for (int i = 0; i <= n; i++) {
            soma = soma + i;
        }

        System.out.println("Soma = " + soma);

        input.close();
    }
}