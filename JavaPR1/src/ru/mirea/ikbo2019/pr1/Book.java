package ru.mirea.ikbo2019.pr1;

public class Book {
    private String name;
    private int numberOfPages;
    private boolean avaliableToBuy;

    public Book(String name, int numberOfPages, boolean avaliableToBuy) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.avaliableToBuy = avaliableToBuy;
    }

    public Book(String name) {
        this.name = name;
    }

    public Book(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Book(boolean avaliableToBuy) {
        this.avaliableToBuy = avaliableToBuy;
    }

    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public Book(int numberOfPages, boolean avaliableToBuy) {
        this.numberOfPages = numberOfPages;
        this.avaliableToBuy = avaliableToBuy;
    }

    public Book(String name, boolean avaliableToBuy) {
        this.name = name;
        this.avaliableToBuy = avaliableToBuy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isAvaliableToBuy() {
        return avaliableToBuy;
    }

    public void setAvaliableToBuy(boolean avaliableToBuy) {
        this.avaliableToBuy = avaliableToBuy;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", avaliableToBuy=" + avaliableToBuy +
                '}';
    }
}
