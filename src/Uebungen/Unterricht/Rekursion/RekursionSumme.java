package Uebungen.Unterricht.Rekursion;

public class RekursionSumme {
    public static void main(String[] args) {
        int number = 1234;

        System.out.println(getDigitSum2(number));

        System.out.println(getDigitSum(number));

    }

    public static int getDigitSum(int number) {
        int digitSum = 0;

        if (number % 10 > 0) {
            digitSum = digitSum + (number % 10);
            getDigitSum(number - (number % 10) - 10);
        }

        return digitSum;
    }

    public static int getDigitSum2(int n) {
        if (n == 0)
            return 0;
        return (n % 10 + getDigitSum2(n / 10));
    }
}
