package Uebungen.Beispiele5;

// noch nicht fertig
public class Mitarbeiter {
    String vorname;
    String nachname;
    double gehalt;
    int alter;

    public double monatsAbrechnung() {
        return jahresAbrechnung() / 12;
    }

    public double jahresAbrechnung() {
        double neuesGehalt = gehalt * 12;
        neuesGehalt *= 0.8; // SV

        double nochAbzurechnen = neuesGehalt;

        if (nochAbzurechnen > 50000) {
            neuesGehalt -= (nochAbzurechnen - 50000) * 0.6;
            nochAbzurechnen = 50000;
        }
        if (nochAbzurechnen > 30000) {
            neuesGehalt -= (nochAbzurechnen - 30000) * 0.45;
            nochAbzurechnen = 30000;
        }
        if (nochAbzurechnen > 20000) {
            neuesGehalt -= (nochAbzurechnen - 20000) * 0.32;
            nochAbzurechnen = 20000;
        }
        if (nochAbzurechnen > 10000) {
            neuesGehalt -= (nochAbzurechnen - 10000) * 0.2;
            nochAbzurechnen = 10000;
        }
        neuesGehalt -= nochAbzurechnen * 0.1;

        return neuesGehalt;
    }

}
