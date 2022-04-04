package Unterricht_Sonstiges;

public class Rectangle {
    public static void main(String[] args) {
        int width = 5;
        int lenght = 4;

        /*
        als neue Variablen:
        int circumference = 2 * (width + lenght);
        int area = width * lenght;
        */

        System.out.println("Umfang: " + calculateCircumference(width, lenght));
        System.out.println("Fläche: " + calculateArea(width, lenght));

        // lange Methode:
        // int circumference = calculateCircumference(width, length);
        // sout(circumference);
    }
    /* als lange Methode:
    public static int calculateCircumference (int width, int lenght) {
        int circumference;
        circumference = 2 * (width + lenght);
        return circumference;
    }
    */
    //als kurze Methoden:
    public static int calculateCircumference (int width, int lenght) {
        return 2 * (width + lenght);
    }
    public static int calculateArea (int first, int second) {
        return first * second;
    }
}
