package Uebungen.Beispiele5;

public class fibonacci {
    public static void main(String[] args) {

        int[] array = new int[]{0, 1, 1};

        fibonacciZahlen(array);

    }

    public static void fibonacciZahlen(int[] array) {
        if (array[0] < 100) {
            System.out.println(array[0]);
            //array[0] ist Zwischenspeicher
            array[2] = array[0] + array[1];
            array[0] = array[1];
            array[1] = array[2];

            fibonacciZahlen(array);
        }
    }
}

