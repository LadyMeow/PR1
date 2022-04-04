package Unterricht_Sonstiges;

public class Woche2Fr {
    public static void main(String[] args) {
        int a = 0, b = 4;
        String s = "Hansi";

        System.out.println(a);
        System.out.println(b);

        //suchen nach dem ersten Vorkommen (Position) vom char 'a' und speichern es als position
        int position = s.indexOf('a');
        System.out.println(position);

        //double & float ist nicht 100% genau. siehe d3 + d4
        double d = 100.0;
        double d2 = 0.1;
        double d3 = 0.000000001;
        double d4 = 10000000.0;

        System.out.println(d + d2);
        System.out.println(d + d3);
        System.out.println(d3 + d4);

        //post-increment & pre-increment Beispiel:
        a = 1;
        int c;

        ++a; //wir erwarten 2
        System.out.println(a);

        c = ++a; // wir erwarten 3
        System.out.println("a: " + a + " c: " + c);

        c = a++; // wir erwarten ??
        System.out.println("a: " + a + " c: " + c);

        //methode aufrufen
        myLittleHelper("Susi");
        myLittleHelper(s); //von oben String Hansi
        //oder neuer String
        String helper = "Batman";
        myLittleHelper(helper);

    }

    public static void myLittleHelper(String helper) {
        System.out.println("I am the little helper " + helper);
    }
}
