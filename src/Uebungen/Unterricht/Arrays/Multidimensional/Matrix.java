package Uebungen.Unterricht.Arrays.Multidimensional;

public class Matrix {
    public static void main(String[] args) {
        generateIdentityMatrix(5);

    }

    public static double[][] generateIdentityMatrix(int size) {
        double[][] identityMatrix = new double[size][size];

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                if (i == j) {
                    identityMatrix[i][j] = 1.0;
                }
                System.out.print(identityMatrix[i][j] + "  ");
            }

            System.out.println();

        }

        return identityMatrix;
    }
}
