package task1;

public class RunPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Иванов", "Иван", "Иванович");
        Person p2 = new Person("Петров", "Петр");
        Person p3 = new Person("Николаев");

        System.out.println("p1 = " + p1.getFIO());
        System.out.println("p2 = " + p2.getFIO());
        System.out.println("p3 = " + p3.getFIO());
    }
}
