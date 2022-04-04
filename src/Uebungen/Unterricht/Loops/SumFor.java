package Uebungen.Unterricht.Loops;

public class SumFor {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 10; i++) {
            sum += i; //= 1+2+3+4+5+6+7+8+9
        }
        System.out.println(sum);

        for (int index = 50; index <= 100; index++) {
            sum += 1;
        }
        System.out.println(sum);

        String sentence = "Finally weekend!";
        for (int j = 1; j <= 10; j++) {
            System.out.println(j + " " + sentence);
        }
    }
}
