package Uebungen.Beispiele2;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] original = new int[] {7, 12, 18, 20};

        System.out.println(Arrays.toString(reverse(original)));

    }

    public static int[] reverse(int[] original) {
        int[] newArray = new int[original.length];

        for (int i = 0; i <= original.length - 1; i++) {
            newArray[original.length - 1 - i] = original[i];
        }

        return newArray;
    }
}
