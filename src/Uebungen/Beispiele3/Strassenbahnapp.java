package Uebungen.Beispiele3;

public class Strassenbahnapp {
    public static void main(String[] args) {
        int station1 = 1;

        zeitBisZiel(2, 2, 20);

    }

    public static void zeitBisZiel(int station, int baustelle, int zusatzZeit) {
        if (station == 1) {
            System.out.println("noch 20 Minuten");
            if (baustelle == 1) {
                System.out.println("Verzögerung wegen Baustelle: " + zusatzZeit + " Minuten");
            }
        } else if (station == 2) {
            System.out.println("noch 16 Minuten");
            if (baustelle == 2) {
                System.out.println("Verzögerung wegen Baustelle: " + zusatzZeit + " Minuten");
            }
        } else if (station == 3) {
            System.out.println("noch 15 Minuten");
        } else if (station == 4) {
            System.out.println("noch 10 Minuten");
        } else if (station == 5) {
            System.out.println("noch 3 Minuten");
        } else if (station == 6) {
            System.out.println("Achtung: jetzt aussteigen!");
        } else {
            System.out.println("Station nicht bekannt");
        }
    }
}
