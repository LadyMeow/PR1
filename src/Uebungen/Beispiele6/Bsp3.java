package Uebungen.Beispiele6;

import java.util.Arrays;

// funktioniert
public class Bsp3 {
    public static void main(String[] args) {
        float[][] array = new float[][]{{2, 2, 4, 4}, {5, 6, 1, 8}, {9, 1, 2, 3}, {1, 5, 6, 7}};

        System.out.println(Arrays.toString(mittelwerte(array)));
    }

    public static float[] mittelwerte(float[][] array) {
        float[] mittelwertArray = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            float sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            mittelwertArray[i] = sum / array[i].length;
        }


        return mittelwertArray;
    }
}
