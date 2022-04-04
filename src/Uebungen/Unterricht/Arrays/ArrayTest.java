package Uebungen.Unterricht.Arrays;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        String[] quartale = {"Frühling", "Sommer", "Herbst", "Winter"};

        String qu1 = quartale[0];

        System.out.println(Arrays.toString(quartale));
        System.out.println(qu1);

        //array ändern
        quartale[0] = "Fruehling";

        System.out.println(Arrays.toString(quartale));
        System.out.println(qu1);
    }
}
