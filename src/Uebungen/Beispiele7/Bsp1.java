package Uebungen.Beispiele7;

public class Bsp1 {
    double laenge;
    double breite;

    public double flaeche() {
        return laenge * breite;
    }

    public void skaliere(double faktor) {
        laenge *= faktor;
        breite *= faktor;
    }

    // Demo Klasse
    public static void main(String[] args) {

        Bsp1 rechteck1 = new Bsp1();

        rechteck1.breite = 2;
        rechteck1.laenge = 4;

        System.out.println(rechteck1.flaeche());
        rechteck1.skaliere(2);
        System.out.println(rechteck1.breite);
        System.out.println(rechteck1.laenge);

    }

}

