package Uebungen.Unterricht.Loops;

public class ArithmeticTower {
    public static void main(String[] args) {
        long number = 2;

        System.out.println(number);

        // Methode aufrufen:
        makeTower(number);

        // oder ohne Methode:
        /*
        for (int i = 2; i < 10; i++) {
            System.out.println(number + " * " + i);
            number = number * i;
        }
        for (int j = 2; j < 10; j++) {
            System.out.println(number + " / " + j);
            number = number / j;
        }

        System.out.println(number);
        */
    }

    // als Methode:
    public static void makeTower(long number) {
        for (int i = 2; i < 10; i++) {
            System.out.println(number + " * " + i);
            number = number * i;
        }
        for (int j = 2; j < 10; j++) {
            System.out.println(number + " / " + j);
            number = number / j;
        }
    }
}
