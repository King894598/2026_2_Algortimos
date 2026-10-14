public class Main {


    public static void main(String[] args) {
        int mat[][] = new int[2][3];

        int cont = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                cont++;
                mat[i][j] = cont;

            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print( mat[i][j] + " - ");

            }
            System.out.println("\n----------------------------------------");
        }
    }
}