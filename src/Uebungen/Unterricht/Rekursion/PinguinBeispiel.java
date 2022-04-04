package Uebungen.Unterricht.Rekursion;

public class PinguinBeispiel {
    public static void main(String[] args) {
        lesen();

    }

    public static void lesen() {
        System.out.println("Der Punguin schlug die Zeitung auf, da stand: ");
        lesen();
    }
}
