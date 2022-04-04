package Uebungen.Unterricht.Loops;

public class TeilerFinden {
    public static void main(String[] args) {
        int number = 10;

        findDivider(number);

    }

    public static void findDivider(int number) {
        int divider = number - 1;

        while (divider > 1) {
            if ((number % divider) == 0) {
                System.out.print(divider + " ");
            }
            divider--;
        }
    }
}
