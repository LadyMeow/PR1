package Uebungen.Beispiele2;

public class PingPong {
    public static void main(String[] args) {
        int number = 1;

        /*
        while (number <= 100) {
            if (number % 6 == 0) {
                System.out.println("ping pong");
            } else if (number % 3 == 0) {
                System.out.println("pong");
            } else if (number % 2 == 0) {
                System.out.println("ping");
            } else {
                System.out.println("-");
            }
            number += 1;
        }
        */

        for (int i = 0; i <= 100; i++) {
            if (i % 6 == 0) {
                System.out.println("ping pong");
            } else if (i % 3 == 0) {
                System.out.println("pong");
            } else if (i % 2 == 0) {
                System.out.println("ping");
            } else {
                System.out.println("-");
            }
        }
    }
}
