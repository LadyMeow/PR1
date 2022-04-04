package Uebungen.Beispiele6;

public class findDublicate {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 8, 4, 1, 8, 4};

        System.out.println(findTheDublicates(array));

    }

    public static int findTheDublicates(int[] array) {
        int dublicates = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]) {
                    dublicates++;
                }
            }
        }

        return dublicates;
    }
}
