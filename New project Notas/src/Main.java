import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double NOTA_MAXIMA = 10.0;
        final double NOTA_MÍNIMA = 0.00;

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        if (nota1 > NOTA_MAXIMA) {
            nota1 = NOTA_MAXIMA;
        } else if (nota1 < NOTA_MÍNIMA) {
            nota1 = NOTA_MÍNIMA;
        }

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        if (nota2 > NOTA_MAXIMA) {
            nota2 = NOTA_MAXIMA;
        } else if (nota2 < NOTA_MÍNIMA) {
            nota2 = NOTA_MÍNIMA;
        }

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        if (nota3 > NOTA_MAXIMA) {
            nota3 = NOTA_MAXIMA;
        } else if (nota3 < NOTA_MÍNIMA) {
            nota3 = NOTA_MÍNIMA;
        }

        double media = (nota1 + nota2 + nota3) / 3.0;
        System.out.printf("\nMédia obtida: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }

        scanner.close();
    }
}