package Unterricht_Sonstiges;

public class Vowels {
    public static void main(String[] args) {
        java.util.Scanner reader = new java.util.Scanner(System.in);

        System.out.println("Enter a letter: ");
        String letter = reader.next();

        while (!letter.equals("0")) {
            checkIfVowel(letter);
            System.out.println("Enter another letter: ");
            letter = reader.next();
        }
        System.out.println("Game over");
        reader.close();
    }

    public static void checkIfVowel(String letter) {
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            System.out.println("The letter " + letter + " is a vowel.");
        } else {
            System.out.println("The letter " + letter + " is NOT a vowel.");
        }
    }
}
