package pl.edu.ur.oopl8;

public class Ksiazka extends Product {
    private String author;
    private String title;
    
    public Ksiazka(double price, String name, String describe, String author, String title) {
        super(price, name, describe);
        this.author = "Autor";
        this.title = "Tytul";
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public void buy() {
        System.out.println(
                "Kupuje ksiazke");
    }

    public void showInfo() {
        System.out.println(
                "Cena:" + getPrice()
                + " nazwa:" + getName()
                + " opis:" + getDescribe()
                + " autor: " + getAuthor()
                + " tytul: " + getTitle()
        );
    }
}