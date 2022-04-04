package Unterricht_Sonstiges;

public class Modulo {
    public static void main(String[] args) {
        int firstNumber = 9;
        int secondNumber = 3;

        int result = firstNumber % secondNumber;

        if (result == 0) {
            System.out.println("The number is divisible by 3");
        } else System.out.println("The number is NOT divisible by 3");
    }
}
