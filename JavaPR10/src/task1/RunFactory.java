package task1;

public class RunFactory {
    public static void main(String[] args) {
        ConcreteFactory a = new ConcreteFactory();
        ConcreteFactory b = new ConcreteFactory(2, 6);

        System.out.println("Complex number a = " + a);
        System.out.println("Complex number b = " + b);
    }
}
