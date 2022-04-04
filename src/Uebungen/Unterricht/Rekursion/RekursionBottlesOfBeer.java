package Uebungen.Unterricht.Rekursion;

public class RekursionBottlesOfBeer {
    public static void main(String[] args) {
        int anzahlStrophen = 99;

        bottlesOfBeerSong(anzahlStrophen);

    }

    public static void bottlesOfBeerSong(int anzahlStrophen) {
        if (anzahlStrophen > 0){
            System.out.println(anzahlStrophen + " Bottles of Beer on the wall, " + anzahlStrophen + " Bottles of Beer. Take one down, pass it around, " + (anzahlStrophen - 1) + " Bottles of Beer on the wall");
            bottlesOfBeerSong(anzahlStrophen-1);
        }
    }
}
