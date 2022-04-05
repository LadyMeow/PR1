package Uebungen.Beispiele7;

public class Bsp2 {
    double laenge;
    double breite;
    double hoehe;

    public double grundflaeche() {
        return laenge * breite;
    }

    public void skaliere(double faktor) {
        laenge *= faktor;
        breite *= faktor;
        hoehe *= faktor;
    }

    public double volumen() {
        return laenge * breite * hoehe;
    }

    public double oberflaeche() {
        return (2 * laenge * breite) + (2 * breite * hoehe) + (2 * laenge * hoehe);
    }


}
