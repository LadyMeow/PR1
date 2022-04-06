package Uebungen.Beispiele7.Bsp5;

// funktioniert
public class RezeptApp {
    public static void main(String[] args) {

        Rezept nudelsalat = new Rezept();

        nudelsalat.anzahlPersonen = 4;
        nudelsalat.zutatenName = new String[]{"Nudeln", "Joghurt", "Mais", "Erbsen", "Käse", "Milch"};
        nudelsalat.zutaten = new double[][]{{500, 2.0}, {250, 1.2}, {400, 2.2}, {400, 2.4}, {250, 3.2}, {200, 1.0}};

        System.out.println(nudelsalat.kostet());
        System.out.println(nudelsalat.laktoseFrei());
        System.out.println(nudelsalat.kostet());
        System.out.println(nudelsalat.kostetProPerson());
        System.out.println("********************");

        nudelsalat.aenderePersonen(6);
        System.out.println(nudelsalat.kostet());

    }
}
