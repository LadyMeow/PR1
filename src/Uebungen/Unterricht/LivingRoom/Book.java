package Uebungen.Unterricht.LivingRoom;

public class Book {
    private String title;
    private String author;
    private int pages;

    //Constructor:
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    //public Getter (Lesen von außerhalb möglich):
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    //public Setter (Verändern von außerhalb möglich):
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
