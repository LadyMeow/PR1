package Uebungen.Unterricht.LivingRoom;

public class LivingRoom {
    public static void main(String[] args) {
        Book annaKarenina = new Book("Anna Karenina", "Leo Tolstoy", 1300);
        Book orwell1984 = new Book("1984", "George Owell", 320);
        //Überschreibt Name des Autors
        orwell1984.setAuthor("George Orwell");

        Bookcase bookcase1 = new Bookcase(8, "Classics", new Book[]{orwell1984, annaKarenina});

        bookcase1.store();
        System.out.println(annaKarenina.getAuthor());

    }
}
