package Uebungen.Unterricht.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] schachtel = new int[]{3, 5, 7, 11, 13, 17};

        printArray(schachtel);
        System.out.println(containsNumber(7, schachtel));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            //für die letzte Stelle im array: array.length - 1
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static boolean containsNumber(int number, int[] array) {
        boolean isContained = false;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == number) {
                return true;
            }
        }
        return false;
    }
}

