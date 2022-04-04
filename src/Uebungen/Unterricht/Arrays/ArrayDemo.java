package Uebungen.Unterricht.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array1 = {3, 4, 5};
        int[] array2 = new int[3]; //{7, 1, 3};

        array2[0] = 7;
        array2[1] = 1;
        array2[2] = 3;

        System.out.print("+: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + array2[i] + " ");
        }

        System.out.println();
        System.out.print("*: ");

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] * array2[i] + " ");
        }

    }
    /* als Methoden:

    public static void addieren(int[]array1, int[] array2){
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + array2[i] + " ");
        }
        System.out.println();
    }

    public static void multiplizieren(int[]array1, int[] array2){
            for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] * array2[i] + " ");
        }
        System.out.println();
    }

    */
}
