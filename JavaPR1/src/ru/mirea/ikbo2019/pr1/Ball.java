package ru.mirea.ikbo2019.pr1;

public class Ball {
    private String name;
    private int price;

    public Ball(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Ball(String name) {
        this.name = name;
        price = 0;
    }

    public Ball(int price) {
        name = "Unknown";
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
