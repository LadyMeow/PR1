package Uebungen.Unterricht.Loops;

public class CountDown {
    public static void main(String[] args) {
        counter(10);
    }

    public static void counter(int number) {
        while (0 <= number) {
            System.out.println(number);
            number --;
        }
    }
}
