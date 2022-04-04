package Uebungen.Unterricht.IfBedingungen.Discount;

public class DiscountConditions {
    public static void main(String[] args) {
        //bus discount
        boolean isDog = false;
        boolean isSenior = true;
        boolean isStudent = false;
        double discountBus;
        double ticketPrice = 2.5;

        if (isDog) {
            discountBus = ticketPrice * 0.2;
        } else if (isSenior) {
            discountBus = ticketPrice * 0.15;
        } else if (isStudent) {
            discountBus = ticketPrice * 0.1;
        } else {
            discountBus = 0;
        }

        System.out.println("I get a discount of: " + discountBus + "€ for my " + ticketPrice + "€ ticket.");

        //bookshop discount
        int bookNonFiciton = 3;
        int bookFiction = 1;
        boolean discountBook;

        if (bookFiction > 0 && bookNonFiciton > 2) {
            discountBook = true;
        } else {
            discountBook = false;
        }

        System.out.println("I get a discount for my books: " + discountBook);

        //grocery shop

        int alcoholicDrink = 1;
        int nonAlcoholicDrink = 2;
        boolean discountgrocery;

        if (alcoholicDrink > 0) {
            discountgrocery = false;
        } else if (nonAlcoholicDrink > 0) {
            discountgrocery = true;
        } else {
            discountgrocery = false;
        }

        System.out.println("I get a discount for my drinks: " + discountgrocery);
    }
}
