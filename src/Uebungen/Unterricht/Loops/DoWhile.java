package Uebungen.Unterricht.Loops;

public class DoWhile {
    //count to 100 - es gibt viele Varianten, wie man es lösen kann
    public static void main(String[] args) {
        countToHundred(1);
    }

    public static void countToHundred(int from) {
        do {
            System.out.println(from);
            from++;
        } while (from <= 100);
    }
}
