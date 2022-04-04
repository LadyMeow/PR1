package Uebungen.Unterricht.Loops;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {
        int[] array = new int[]{12, 13, 14, 15, 16};

        System.out.println(Arrays.toString(array));

        //for each loop nehmen wir nur, wenn wir immer das gleiche machen wollen
        for(int number : array) {
            array[number-12] += 12;
        }

        System.out.println(Arrays.toString(array));
    }
}
