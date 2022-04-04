package Uebungen.Beispiele2;

public class ArraySum {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 5};

        System.out.println(calculateSum(numbers));

    }

    static public int calculateSum(int[] numbers) {
        int sum = 0;

        for (int i = 0; i <= numbers.length -1; i++) {
            sum += numbers[i];
        }

        return sum;
    }
}
