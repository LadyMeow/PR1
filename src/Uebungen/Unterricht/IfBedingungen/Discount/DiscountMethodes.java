package Uebungen.Unterricht.IfBedingungen.Discount;

public class DiscountMethodes {
    public static void main(String[] args) {
        //bus discount
        boolean isDog = false;
        boolean isSenior = false;
        boolean isStudent = true;
        double ticketPrice = 2.5;
        double discountBus = getDiscountBus(ticketPrice, isDog, isSenior, isStudent);

        System.out.println("I get a discount of: " + discountBus + "€ for my " + ticketPrice + "€ ticket.");
        System.out.println("My bus ticket costs: " + (ticketPrice - discountBus));

        //bookshop discount
        int bookNonFiciton = 3;
        int bookFiction = 0;

        System.out.println("I get a discount for my books: " + getDiscountBook(bookFiction, bookNonFiciton));

        //grocery shop
        int alcoholicDrink = 0;
        int nonAlcoholicDrink = 2;

        System.out.println("I get a discount for my drinks: " + getDiscountDrinks(alcoholicDrink, nonAlcoholicDrink));
    }

    //bus discount methode
    public static double getDiscountBus(double ticketPrice, boolean isDog, boolean isSenior, boolean isStudent) {
        double discountBus;
        if (isDog) {
            discountBus = ticketPrice * 0.2;
        } else if (isSenior) {
            discountBus = ticketPrice * 0.15;
        } else if (isStudent) {
            discountBus = ticketPrice * 0.1;
        } else {
            discountBus = 0;
        }
        return discountBus;
    }

    //bookshop discount methode
    public static boolean getDiscountBook(int bookFiction, int bookNonFiction) {
        boolean discountBook;
        if (bookFiction > 0 && bookNonFiction > 2) {
            discountBook = true;
        } else {
            discountBook = false;
        }
        return discountBook;
    }

    //grocery shop methode
    public static boolean getDiscountDrinks (int alcoholicDrink, int nonAlcoholicDrink) {
        boolean discountDrinks;
        if (alcoholicDrink > 0) {
            discountDrinks = false;
        } else if (nonAlcoholicDrink > 0) {
            discountDrinks = true;
        } else {
            discountDrinks = false;
        }
        return discountDrinks;
    }
}
