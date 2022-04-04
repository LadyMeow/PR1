package Uebungen.Unterricht.Rekursion;

public class RekursionHerunterzaehlen {
    public static void main(String[] args) {
        int endZahl = 20;
        int anfangsZahl = 99;

        herunterZaehlen2(5, 12);

    }

    public static void herunterZaehlen(int endZahl, int anfangsZahl) {
        System.out.println(anfangsZahl);
        anfangsZahl--;
        if (anfangsZahl >= endZahl) {
            herunterZaehlen(endZahl, anfangsZahl);
        }
    }

    //oder:

    public static void herunterZaehlen2(int endZahl, int anfangsZahl) {
        System.out.println(anfangsZahl);
        if (anfangsZahl > 0 && anfangsZahl > endZahl) {
            herunterZaehlen2(endZahl, anfangsZahl - 1);
        }
        System.out.println("Ende"); //kommt 8x am Ende, weil man immer wieder aus der Rekursion heraus kommt
    }
}
