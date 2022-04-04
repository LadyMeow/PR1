package Uebungen.Unterricht.Rekursion;

public class RekursionString {
    public static void main(String[] args) {
        String teil1 = "hallo";
        String teil2 = "al";

        System.out.println(substring(teil1, teil2));

    }
    public static boolean substring(String teil1, String teil2){
        if(teil1.startsWith(teil2)) {
            return true;
        }
        if(teil1.length() <= 1) {
            return false;
        }

        return substring(teil1.substring(1), teil2);
    }
}
