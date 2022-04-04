package Uebungen.Beispiele6;

// funktioniert!
public class Bsp2 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3, 1}, {5, 6, 1, 8}, {9, 1, 2, 3}, {1, 5, 6, 7}};

        System.out.println(summeGegendiagonale(array));

    }

    public static int summeGegendiagonale(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i][array[i].length - 1 - i];
        }
        return sum;
    }
}
