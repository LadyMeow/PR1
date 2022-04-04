package Uebungen.Beispiele5;

public class Mitarbeiter {
    String vorname;
    String nachname;
    double gehalt;
    int alter;

    public double monatsAbrechnung() {
        double jahresGehalt = gehalt * 12;
        double gehaltAbzglSteuern = 0;
        // 20 % SV
        jahresGehalt *= 0.8;

        double nochAbzurechnen = jahresGehalt;

        if (jahresGehalt > 50000) {
            gehaltAbzglSteuern += jahresGehalt;

//
//        if (jahresGehalt > 0) {
//            gehaltAbzglSteuern += (jahresGehalt % 10000) * 0.9;
//        }
//        if (jahresGehalt > 10000) {
//            gehaltAbzglSteuern += (jahresGehalt - 10000) * 0.8;
//        }
//        if (jahresGehalt > 20000) {
//            gehaltAbzglSteuern += (jahresGehalt - 20000) * 0.68;
//        }
//        if (jahresGehalt > 30000) {
//            gehaltAbzglSteuern += (jahresGehalt - 30000) * 0.55;
//        }
//        if (jahresGehalt > 50000) {
//            gehaltAbzglSteuern += (jahresGehalt - 50000) * 0.4;
//        }

        }
        return (jahresGehalt) / 12;
    }
}
