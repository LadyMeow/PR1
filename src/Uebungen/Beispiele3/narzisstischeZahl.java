package Uebungen.Beispiele3;

public class narzisstischeZahl {
    public static void main(String[] args) {
        int zahl = 153;

        System.out.println(153 / 100);
        System.out.println(Math.pow(zahl % 10, 3));

        narzisstischeZahlBerechnen();

    }

    public static void narzisstischeZahlBerechnen() {
        for (int i = 1; i < 1000; i++) {
            if(i == (Math.pow(i % 10, 3)) + (Math.pow(i % 100 / 10, 3)) + (Math.pow(i / 100, 3))) {
                System.out.println(i);
            }
            // Math.pow(i, 3)
        }
    }
}
