package ru.mirea.ikbo2019.pr1;

public class Main {
    public static void main(String[] args) {
        Tester.DogTester dog = new Tester.DogTester();
        Tester.BallTester ball = new Tester.BallTester();
        Tester.BookTester book = new Tester.BookTester();

        dog.test();
        ball.test();
        book.test();
    }
}
