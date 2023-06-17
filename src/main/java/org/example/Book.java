package org.example;

public class Book {
    private String title;
    private String author;
    private int publicationDate;
    private double price;

    public Book(String title, String author, int publicationDate, double price) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Date: " + publicationDate);
        System.out.println("Price: " + price);
    }
}
