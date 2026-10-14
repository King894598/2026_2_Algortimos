import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lado A: "); double a = scanner.nextDouble();
        System.out.print("Lado B: "); double b = scanner.nextDouble();
        System.out.print("Lado C: "); double c = scanner.nextDouble();

        boolean ehTriangulo = (a > 0 && b > 0 && c > 0) &&
                (a < b + c) && (b < a + c) && (c < a + b);

        if (ehTriangulo) {
            if (a == b && b == c) {
                System.out.println("Triângulo EQUILÁTERO (3 lados iguais).");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo ISÓCELES (2 lados iguais).");
            } else {
                System.out.println("Triãngulo ESCALENO (3 lados diferentes).");
            }

            } else {
                System.out.println("NÃO forma um triângulo válido.");
            }
            scanner.close();
        }
    }