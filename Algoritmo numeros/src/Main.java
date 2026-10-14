import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores você deseja informar? ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        int quantidadeDigitados = 0;
        int soma = 0;

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro positivo (ou 0 para parar): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            vetor[i] = numero;
            soma += numero;
            quantidadeDigitados++;
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Quantidade de números digitados: " + quantidadeDigitados);
        System.out.println("Soma dos números digitados: " + soma);

        if (quantidadeDigitados > 0) {
            double media = (double) soma / quantidadeDigitados;
            System.out.printf("Média dos números digitados: %.2f\n", media);
        } else {
            System.out.println("Nenhum número válido foi digitado para calcular a média.");
        }

        scanner.close();
    }
}