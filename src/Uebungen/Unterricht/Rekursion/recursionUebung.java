package Uebungen.Unterricht.Rekursion;

public class recursionUebung {
    public static void main(String[] args) {

        read(0, 10);
    }

    public static void read(int from, int until) {
        System.out.println("The penguin opened the newspaper, and they read: ");
        from++;
        //10x abrufen
        if(from < until) {
            read(from, until);
        }
    }
}
