package Uebungen.Unterricht.Objekte.LivingRoom;

public class Bookcase {
    private int shelves;
    private String genre;
    private Book[] books;

    public Bookcase(int shelves, String genre, Book[] books) {
        this.shelves = shelves;
        this.genre = genre;
        this.books = books;
    }

    public int getShelves() {
        return shelves;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    //unsere Methode
    public void store(){
        System.out.println("I store books!");
    }
}
