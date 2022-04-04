package Uebungen.Unterricht.Arrays.Multidimensional;

public class multidimensionalArrays {
    public static void main(String[] args) {
        int[][] arrayOfArrays = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1},
        };

        printSquare(arrayOfArrays);
        System.out.println();

        arrayOfArrays[1][1] = 9;

        printSquare(arrayOfArrays);
        System.out.println();

        arrayOfArrays[0][0] = 3;
        arrayOfArrays[0][2] = 3;
        arrayOfArrays[2][0] = 3;
        arrayOfArrays[2][2] = 3;

        printSquare(arrayOfArrays);

    }
/*
    // als for i loop:
    public static void printSquare(int[][] arrayOfArrays) {
        for (int i = 0; i < arrayOfArrays.length; i++) {
            for (int j = 0; j < arrayOfArrays[i].length; j++) {
                System.out.print((arrayOfArrays[i][j]) + " ");
            }
            System.out.println();
        }

    }
*/

    // als for each loop:
    public static void printSquare(int[][] arrayOfArrays) {
        for (int[] array : arrayOfArrays) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
