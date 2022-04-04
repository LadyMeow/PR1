package Uebungen.Beispiele3;

public class ZinsDemo {
    public static void main(String[] args) {

        int kontostand = 1000;
        double zinsen = 2.25;

        System.out.println("Zinsen = " + zinsen + " % von " + kontostand + " = " + zinsberechnung(kontostand, zinsen));
    }

    public static double zinsberechnung(int kontostand, double zinsen) {
        return (kontostand * zinsen / 100);
    }
}
