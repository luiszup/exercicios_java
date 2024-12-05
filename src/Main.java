import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = input.nextInt();

        int soma = 0;

        for (int i = 0; i <= n; i++) {
            soma = soma + i;
        }

        System.out.println("Soma = " + soma);

        n = 0;

        System.out.println("Digite um número inteiro: ");
        n = input.nextInt();

        int fatorial= 1;

        while (n > 0) {
            fatorial = fatorial * n;
            n--;
        }

        System.out.println("O fatorial desse número é: " + fatorial);

        n = 0;

        int quantidadeDigitos = 1;
        System.out.println("Digite um número inteiro: ");
        n = input.nextInt();

        while(n >= 10) {
            n /= 10;
            quantidadeDigitos++;
        }

        System.out.println("A quantidade de dígitos foram: " + quantidadeDigitos);

        n = 0;

        System.out.println("Digite um número: ");
        n = input.nextInt();

        int cont = 0;

        for (int modulo = 1; modulo <= n; modulo++) {
            if (n % modulo == 0) {
                cont++;
            }
        }

        if (cont == 2) {
            System.out.println("O número digitado é primo.");
        } else {
            System.out.println("O número digitado não é primo.");
        }

        n = 0;

        System.out.println("Digite um número inteiro: ");
        n = input.nextInt();

        int numInvertido = 0;

        while(n != 0) {
            int digitoNum = n % 10;
            numInvertido = numInvertido * 10 + digitoNum;
            n = n / 10;
        }

        System.out.println("O número invertido fica: " + numInvertido);

        n = 0;

        int produto = 1;
        System.out.println("Digite um número inteiro: ");
        n = input.nextInt();
        System.out.println("Digite o exponente dele: ");
        int exponente = input.nextInt();

        int resultado = 1;

        if (exponente == 0) {
            produto = produto * 1;
        } else {
            while (exponente != 0) {
                produto = produto * n;
                exponente--;
            }
        }

        System.out.println("O cálculo da potência ficou: " + produto);

        n = 0;
        System.out.println("Digite um número inteiro: ");
        n = input.nextInt();

        int numeroDigitado = n;
        int reverso = 0;

        while(n > 0) {
            int digito = n % 10;
            reverso = reverso * 10 + digito;
            n = n / 10;
        }

        if (numeroDigitado == reverso) {
            System.out.println("É um palindromo!");
        } else {
            System.out.println("Não é um palindromo!");
        }

        n = 0;
        System.out.println("Digite um número inteiro: ");
        n = input.nextInt();
        System.out.println("Defina o limite dos múltiplos desse número: ");
        int m = input.nextInt();

        for (int i = n; i <= m; i+= n) {
            System.out.println(i);
        }

        System.out.println("Digite o número binário: ");
        String numBinario = input.next();

        int decimal = 0;
        int potencia = 0;

        for (int i = numBinario.length() - 1; i >= 0; i--) {
            char digito = numBinario.charAt(i);
            if (digito == '1') {
                decimal += Math.pow(2, potencia);
            }
            potencia++;
        }

        System.out.println("O número binário para decimal fica: " + decimal);

        n = 0;
        int a = 1;
        int b = 0;
        int guardaValor;
        System.out.println("Quantos primeiros números você deseja ver da série Fibonacci? ");
        n = input.nextInt();

        for (int i = 0; i <= n; i++){
            System.out.println(b);
            guardaValor = a;
            a = a + b;
            b = guardaValor;
        }

        input.close();

    }
}