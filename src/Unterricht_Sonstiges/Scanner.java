package Unterricht_Sonstiges;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner reader = new java.util.Scanner(System.in);
        System.out.println("Enter a number, then press enter: ");

        int number = reader.nextInt();
        int sum = 0;

        System.out.println("You entered: " + number);

        while (number > 0) {
            if (number == 2) {
                sum = sum * 2;
                System.out.println("Double Bonus!");
                System.out.println("Enter another number: ");
                number = reader.nextInt();
            } else if (number == 3) {
                sum = sum * 3;
                System.out.println("Tripple Bonus!");
                System.out.println("Enter another number: ");
                number = reader.nextInt();
            } else if (number == 22) {
                sum = sum / 2;
                System.out.println("Sum halved :( ");
                System.out.println("Enter another number: ");
                number = reader.nextInt();
            } else {
                sum = sum + number; //oder sum += number;
                System.out.println("Enter another number: ");
                number = reader.nextInt();
            }
        }
        System.out.println("Your total sum is: " + sum);
        reader.close();
    }
}

// System.in = lesen was rein kommt
// .nextInt() = lies den nächsten int
/*
oder:
unter package:
import java.util.Scanner;

und unter public static void:
Scanner nameVonScanner;
 */