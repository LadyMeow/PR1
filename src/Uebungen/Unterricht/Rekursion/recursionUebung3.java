package Uebungen.Unterricht.Rekursion;

public class recursionUebung3 {
    public static void main(String[] args) {
//        "Was it a car or a cat I saw"
//        "Murder for a jar of red rum"
//        "Go hang a salami, I'm a lasagna hog"
//        "Otto"
//        "1122332211"

        System.out.println(isPalindrome("Was it a car or a cat I saw"));
        System.out.println(isPalindrome("Murder for a jar of red rum"));
        System.out.println(isPalindrome("Go hang a salami, I'm a lasagna hog"));

        //oder:
        boolean otto = isPalindrome("Otto");
        System.out.println(otto);

    }

    public static boolean isPalindrome(String potentialPalindrome) {
        potentialPalindrome = potentialPalindrome.toLowerCase();
        potentialPalindrome = potentialPalindrome.replace("'", "");
        potentialPalindrome = potentialPalindrome.replace(",", "");
        potentialPalindrome = potentialPalindrome.replace(" ", "");

        char firstLetter = potentialPalindrome.charAt(0);
        char lastLetter = potentialPalindrome.charAt(potentialPalindrome.length() - 1);

        if (firstLetter == lastLetter) {
            potentialPalindrome = potentialPalindrome.substring(1, potentialPalindrome.length() - 1);

            if (potentialPalindrome.length() <= 1) {
                return true;
            }
            return isPalindrome(potentialPalindrome);
        }
        return false;
    }
}
