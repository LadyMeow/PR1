package Uebungen.Beispiele7.Bsp5;

// Klasse Rezept
public class Rezept {
    int anzahlPersonen;
    String[] zutatenName;
    double[][] zutaten;


    public boolean allergisch(String zutat) {
        for (int i = 0; i < zutatenName.length; i++) {
            if(zutatenName[i].equals(zutat)) {
                return true;
            }
        }
        return false;
    }

    public boolean laktoseFrei() {
        int count = 0;
        for (int i = 0; i < zutatenName.length; i++) {
            if(zutatenName[i].contains("Milch") || zutatenName[i].contains("käse")) {
                zutaten[i][0] = 0;
                zutaten[i][1] = 0;
                count++;
            }
        }
        if(count > 0) {
            return true;
        }
        return false;
    }

    public double kostet() {
        double sum = 0.0;

        for (int i = 0; i < zutaten.length; i++) {
            sum += zutaten[i][1];
        }

        return sum;
    }

    public double kostetProPerson() {
        return kostet() / anzahlPersonen;
    }

    public void aenderePersonen(int anzahl) {
        if (anzahl > 0) {
            for (int i = 0; i < zutaten.length; i++) {
                zutaten[i][0] = (zutaten[i][0] / anzahlPersonen) * anzahl;
                zutaten[i][1] = (zutaten[i][1] / anzahlPersonen) * anzahl;
            }
        }
    }

}

