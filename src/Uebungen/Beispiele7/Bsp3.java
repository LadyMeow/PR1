package Uebungen.Beispiele7;

import java.util.Arrays;

// Klasse Grundsteuer
public class Bsp3 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 30, 40}, {2, 50, 20}, {3, 20, 60}};

        int[] kunden = new int[]{2, 1, 0};

        System.out.println(Arrays.toString(grundsteuerBerechnen(array)));
        System.out.println(Arrays.toString(grundsteuerZuordnen(array, kunden)));


    }

    public static double[] grundsteuerBerechnen(int[][] array) {
        double[] sum = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            if(array[i][0] == 1) {
                sum[i] = (array[i][1] * array[i][2] * 3.2);
            } else if (array[i][0] == 2) {
                sum[i] = (array[i][1] * array[i][2] * 2.1);
            } else if (array[i][0] == 3) {
                sum[i] = (array[i][1] * array[i][2] * 0.9);
            } else {
                System.out.println("invalid typ");
            }
        }

        return sum;
    }

    public static double[] grundsteuerZuordnen(int[][] grund, int[] kundennummer) {
        double[] erg = new double[kundennummer.length];

        for (int i = 0; i < kundennummer.length; i++) {
            for (int j = 0; j < kundennummer.length; j++) {
                if(kundennummer[j] == i) {
                    erg[i] += (grundsteuerBerechnen(grund)[i]);
                }
            }
        }
        return erg;
    }

}
