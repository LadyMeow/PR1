package Uebungen.Unterricht.Loops;

public class GrenzwertReihe {
    public static void main(String[] args) {

        findeGrenzwert();

    }

    public static void findeGrenzwert() {

        for (double i = 1; i <= 1; i = i / 2) {

            if (i - (i / 2) < 0.0001) {
                System.out.println(i);
                break;
            }
        }

    }
}
