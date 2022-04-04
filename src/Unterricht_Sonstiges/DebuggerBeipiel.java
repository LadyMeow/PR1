package Unterricht_Sonstiges;

public class DebuggerBeipiel {

    public static void main(String[] args) {

// vor-Übung zum Pinguin Beispiel
        hansiSingt("Ski-Twist");
        int x = 5;
        System.out.println(x + " Punkte");
        hansiSingt("Nur du allein");
        hansiSingtViel("Wo bist du", 5);

    }
    public static void hansiSingt(String title){
        System.out.println("Hansi sing " + title);
    }

    public static void hansiSingtViel(String title, int wieOft){
        for (int i = 0; i < wieOft; i++) {
            System.out.println("Hansi sing " + title);
        }

    }
}
