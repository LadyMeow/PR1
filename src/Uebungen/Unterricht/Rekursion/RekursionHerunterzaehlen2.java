package Uebungen.Unterricht.Rekursion;

public class RekursionHerunterzaehlen2 {
    public static void main(String[] args) {

        herunterzaehlen(100, 55);

    }

    public static void herunterzaehlen(int start, int ende) {
        if(start >= ende) {
            System.out.println(start);
            herunterzaehlen((start - 1), ende);
        }
    }
}
