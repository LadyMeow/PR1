package Unterricht_Sonstiges;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //Array erstellen inklusive aller Werte
        int[] array1 = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(array1));

        //oder
        int[] array2 = new int[3];
        array2[0] = 12;
        array2[1] = 56;
        array2[2] = 91;

        System.out.println(array2);
        System.out.println(Arrays.toString(array2)); //so zeigt er uns den Inhalt als String

        //change value at position 2
        array2[2] = 60;
        System.out.println(Arrays.toString(array2));
    }
}
