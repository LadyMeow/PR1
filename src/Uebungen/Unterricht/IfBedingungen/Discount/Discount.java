package Uebungen.Unterricht.IfBedingungen.Discount;

public class Discount {
    public static void main(String[] args) {
        //bus discount
        boolean senior = true;
        boolean dog = true;
        boolean student = true;

        System.out.println("Discount bus: " + (senior || dog || student));

        //bookshop
        int bookNonFiction = 3;
        int bookFiction = 0;

        System.out.println("Discount bookshop: " + ((bookFiction > 0) && (bookNonFiction > 2)));

        //grocery
        int nonAlcoholicDrink = 2;
        int alcoholicDrink = 1;

        System.out.println("Discount grocery shop: " + (nonAlcoholicDrink > 1 && alcoholicDrink < 1));

    }
}
