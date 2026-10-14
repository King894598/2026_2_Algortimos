import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        double maior = num1, menor = num1;

        if (num2 > maior) maior = num2;
        if (num3 > maior) maior = num3;

        if (num2 < menor) menor = num2;
        if (num3 < menor) menor = num3;

        System.out.printf("\nMaior número: %.2f\n", maior);
        System.out.printf("\nMenor número: %.2f\n", menor);
        scanner.close();

    }
}