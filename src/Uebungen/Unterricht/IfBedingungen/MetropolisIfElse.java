package Uebungen.Unterricht.IfBedingungen;

public class MetropolisIfElse {
    public static void main(String[] args) {
        System.out.println(isMetropolis(false, 210000, 40.0));

        System.out.println(40*210000*12);
    }

    public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {
        if ((isCapital && (inhabitants > 100000)) || ((inhabitants > 200000) && ((taxPerPersonAndMonth * inhabitants * 12) >= 720000000))){
            return true;
        }
        return false;
    }
}
