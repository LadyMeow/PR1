package Uebungen.Beispiele2;

public class WinterTires {

    public static void main(String[] args) {
        int temperature = 9;
        boolean roadSlippery = true;

        if (needWinterTires(temperature, roadSlippery)){
            System.out.println("Please use winter tires");
        } else {
            System.out.println("Winter tires are not required");
        }

    }

    public static boolean needWinterTires(int temperature, boolean roadSlippery) {
        if (temperature < 4 || (temperature < 10 && roadSlippery)) {
            return true;
        }
        return false;
    }
}
