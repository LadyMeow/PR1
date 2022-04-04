package Uebungen.Beispiele6;

import java.util.Arrays;

// einfache Lösung funktioniert
public class Bsp5 {
    public static void main(String[] args) {
        int[][] smartphoneVerkaeufe = new int[][] {{1, 50}, {2, 40}, {1, 60}, {3, 50}, {3, 70}, {5, 300}};

        print(smartphoneSales(smartphoneVerkaeufe));

    }

    //einfache Lösung
    public static int[][] smartphoneSales(int[][] sales) {
        int[][] sums = new int[sales.length][2];

        for (int z = 0; z < sales.length; z++) {
            sums[sales[z][0]-1][0] = sales[z][0];
            sums[sales[z][0]-1][1] += sales[z][1];
        }

        return sums;
    }

    public static void print(int[][] sums) {
        for (int i = 0; i < sums.length; i++) {
            System.out.println(Arrays.toString(sums[i]));
        }
    }
}
