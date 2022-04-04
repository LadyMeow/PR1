package Uebungen.Beispiele6;

import java.util.Arrays;

// funktioniert
public class Bsp4 {
    public static void main(String[] args) {

        String[] looser2 = new String[]{"Hansi", "Lisa", "Grete"};
        String[] looser1 = new String[]{"Grete", "Jasmin", "Peter", "Hansi", "Hubert", "Lisa"};

        System.out.println(Arrays.toString(luckyLooser(looser1, looser2)));

    }

    public static String[] luckyLooser(String[] looser1, String[] looser2) {
        //welches array ist größer:
        int maxLength;
        if(looser1.length >= looser2.length) {
            maxLength = looser1.length;
        } else {
            maxLength = looser2.length;
        }
        String[] trostpreisGewinner = new String[maxLength];

        //trostpreis ermitteln, vergleichen der Strings
        for (int i = 0; i < looser1.length; i++) {
            for (int j = 0; j < looser2.length; j++) {
                if (looser1[i].equals(looser2[j])) {
                    trostpreisGewinner[i] = looser1[i];
                    break;
                }
            }
        }

        return trostpreisGewinner;
    }
}
