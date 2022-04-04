package Uebungen.Beispiele3;

public class FizzBuzz {
    public static void main(String[] args) {
//        Standard Lösung:

//        for (int i = 1; i <= 100; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // fancy Lösung

//        for (int i = 1; i <= 100; i++) {
//            String output = "";
//
//            if (i % 3 == 0) {
//                output += "Fizz";
//            }
//            if (i % 5 == 0) {
//                output += "Buzz";
//            }
//
//            if (output.equals("")) {
//                output = String.valueOf(i);
//            }
//            System.out.println(output);
//        }

        arrayPrint(fizzBuzzArray());
    }

    public static String fizzBuzz(int zahl) {
        if (zahl % 3 == 0) {
            return "Fizz";
        }

        if (zahl % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(zahl);
        }
    }

    public static String[] fizzBuzzArray() {
        String[] array = new String[100];
        for (int i = 0; i < 100; i++) {
            array[i] = fizzBuzz(i + 1);
        }
        return array;
    }

    public static void arrayPrint(String[] array) {
        for (int i = 0; i < 100; i++) {
            System.out.println(array[i]);
        }

    }
}