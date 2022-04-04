package Uebungen.Unterricht.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        String[] monate = new String[]{"Jänner", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};

        for (int i = 1; i <= monate.length; i++) {
            System.out.println(monate[i - 1] + "[" + i + "]");
        }
    }
}
