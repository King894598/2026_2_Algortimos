import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lado A: "); double a = scanner.nextDouble();
        System.out.print("Lado B: "); double b = scanner.nextDouble();
        System.out.print("Lado C: "); double c = scanner.nextDouble();

        boolean ehTriangulo = (a > 0 && b > 0 && c > 0) &&
                              (a < b + c) && (b < a + c) && (c < a + b);

        if (ehTriangulo) {
            System.out.println("\nOs lados FORMAM um trinângulo válido\n");
        } else {
            System.out.println("\nOs lados NÃO PODEM formar um triângulo válido");
        }
        scanner.close();
    }
}
