package Uebungen.Beispiele6;

// funktioniert
public class Bsp1 {

    public static void main(String[] args) {

        int[] array = new int[]{3, 5, 20, 6, 7, 1};

        System.out.println(findeKleinsteZahl(array));
    }

    public static int findeKleinsteZahl(int[] array) {
        int smallestNumberIdx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[smallestNumberIdx]) {
                smallestNumberIdx = i;
            }
        }
        return smallestNumberIdx;
    }
}
