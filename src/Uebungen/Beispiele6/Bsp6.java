package Uebungen.Beispiele6;

public class Bsp6 {
    public static void main(String[] args) {

        System.out.println(powerSimple(2, 10));
    }

    public static int powerSimple(int x, int n) {
        if (n > 0) {
            if (n % 2 == 0) {
                return (powerSimple(x, n/2) * powerSimple(x, n/2));
            } else {
                return (x * powerSimple(x, n/2) * powerSimple(x, n/2));
            }
        }
        return 1;
    }
}
