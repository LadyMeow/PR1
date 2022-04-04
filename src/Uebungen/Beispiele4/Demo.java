package Uebungen.Beispiele4;

public class Demo {
    public static void main(String[] args) {

        Strafe person1 = new Strafe();
        person1.vorname = "Hans";
        person1.nachname = "Hubert";
        person1.kennzeichen = "094509287";
        person1.strafnummer = 10923;

        person1.strafe(50);
        person1.verbandspaket();
        person1.alkohol(0.1);
        person1.sonstiges(0);
        System.out.println(person1.strafe);
        System.out.println(person1.anzahl);
        System.out.println(person1.getStrafe());

    }
}
