package Uebungen.Beispiele5;

public class MitarbeiterApp {
    public static void main(String[] args) {
        Mitarbeiter nr1 = new Mitarbeiter();

        nr1.vorname = "Hansi";
        nr1.nachname = "Hinterseer";
        nr1.alter = 50;
        nr1.gehalt = 2333.33;

        System.out.println(nr1.gehalt * 12);
        System.out.println(nr1.monatsAbrechnung());
    }
}
