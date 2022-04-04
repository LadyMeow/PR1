package Uebungen.Beispiele2;

public class CurrencyExchange {
    public static void main(String[] args) {
        System.out.println(exchangeCurrency("HUF", 100));
        System.out.println(exchangeCurrency("ulüokü", 273.18));

    }
    public static double exchangeCurrency(String currencyID, double value) {
        double targetCurrency;
        switch (currencyID) {
            case "HUF" -> targetCurrency = value * 328.61;
            case "SEK" -> targetCurrency = value * 10.76;
            case "USD" -> targetCurrency = value * 1.12;
            case "CAD" -> targetCurrency = value * 1.47;
            default -> {
                targetCurrency = 0;
                System.out.println("no valid currency");
            }
        }
        return targetCurrency;
    }
}
