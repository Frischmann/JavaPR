package task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Иван", "9frischmann@gmail.com", 'М');

        System.out.println("Имя: " + a1.getName() + " | email: " + a1.getEmail() + " | пол: " + a1.getGender());
        a1.setEmail("nikolaevaxenov@gmail.com");
        System.out.println(a1);
    }
}
