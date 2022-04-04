package Uebungen.Beispiele3;


public class Grossbuchstaben {
    public static void main(String[] args) {
        String satz = "Wörter starten mit Großbuchstaben";
        String satz2 = "Oh mein gott, ich habe es geschafft";

        System.out.println(startMitGrossbuchstaben(satz));
        System.out.println(startMitGrossbuchstaben(satz2));

    }

    public static String startMitGrossbuchstaben(String satz) {
        String neuerSatz = "";
        for (int i = 0; i < satz.length(); i++) {
            if(satz.charAt(i) == ' '){
                neuerSatz = neuerSatz + " " + Character.toUpperCase(satz.charAt(i+1));
                i++;
            } else {
                neuerSatz = neuerSatz + satz.charAt(i);
            }
        }
        return neuerSatz;
    }
}
