package Uebungen.Beispiele7;

import java.util.Arrays;

public class Bsp3_2 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 30, 40}, {2, 50, 20}, {3, 20, 60}};

        int[] kunden = new int[]{2, 1, 0};

        System.out.println(grundsteuerBerechnen(array));
        System.out.println(Arrays.toString(grundsteuerZuordnen(array, kunden)));

    }


    public static double grundsteuerBerechnen(int [][] array) {
        double sum = 0;
        double[] prices = {3.2, 2.1, 0.9};

        for (int i = 0; i < array.length; i++) {
            sum += array[i][1] * array[i][2] * prices[array[i][0] - 1];
        }

        return sum;
    }

    public static double[] grundsteuerZuordnen(int[][] grund, int[] kundennummer) {
        double[] erg = new double[25];
        double[] prices = {3.2, 2.1, 0.9};

        for (int i = 0; i < grund.length; i++) {
            erg[kundennummer[i]] += grund[i][1] * grund[i][2] * prices[grund[i][0] - 1];
        }

        return erg;
    }

}
