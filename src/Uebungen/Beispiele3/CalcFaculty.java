package Uebungen.Beispiele3;

public class CalcFaculty {
    public static void main(String[] args) {
        System.out.println(calcFaculty(3));
        System.out.println(calcFaculty(6));

    }

    public static long calcFaculty(int value) {
        long sum = 1;
        if (value == 0) {
            return 1;
        }
        for (int i = 1; i <= value; i++) {
            sum = sum * i;
        }
        return sum;
    }
}
