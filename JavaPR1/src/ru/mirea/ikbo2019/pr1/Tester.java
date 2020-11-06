package ru.mirea.ikbo2019.pr1;

public class Tester {
    static class DogTester {
        public DogTester() {
        }

        public void test() {
            System.out.println("Testing Dog class...");
            Dog dog1 = new Dog("Jan", 2);
            Dog dog2 = new Dog(5);
            Dog dog3 = new Dog("Jerzy");

            dog3.setAge(2);
            dog2.setName("Bob");

            System.out.println(dog1);

            dog1.intoHumanAge();
            dog2.intoHumanAge();
            dog3.intoHumanAge();
        }
    }

    static class BallTester {
        public BallTester() {
        }

        public void test() {
            System.out.println("\nTesting Ball class...");

            Ball ball1 = new Ball("Champion", 100);
            Ball ball3 = new Ball("Street");
            Ball ball2 = new Ball(10);

            System.out.println(ball1);
            System.out.println(ball2);
            System.out.println(ball3);
        }
    }

    static class BookTester {
        public BookTester() {
        }

        public void test() {
            System.out.println("\nTesting Book class...");

            Book book1 = new Book("Harry Potter");
            Book book2 = new Book(1000);
            Book book3 = new Book(true);
            Book book4 = new Book("Star Trek", 1000);
            Book book5 = new Book("Republic", true);
            Book book6 = new Book(500, false);
            Book book7 = new Book("Chess", 10, true);

            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);
            System.out.println(book4);
            System.out.println(book5);
            System.out.println(book6);
            System.out.println(book7);
        }
    }
}
