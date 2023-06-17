package org.example;

public class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, int publicationDate, double price, String genre) {
        super(title, author, publicationDate, price);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("Genre: " + genre);
    }
}