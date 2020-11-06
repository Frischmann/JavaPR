package task1;

public class Person {
    String[] fio = new String[3];
    String result;

    public Person(String last, String first, String middle) {
        fio[0] = last;
        fio[1] = first;
        fio[2] = middle;

        result = fio[0] + " " + fio[1].charAt(0) + ". " + fio[2].charAt(0) + ". ";
    }

    public Person(String last, String first) {
        fio[0] = last;
        fio[1] = first;

        result = fio[0] + " " + fio[1].charAt(0) + ". ";
    }

    public Person(String last) {
        fio[0] = last;

        result = fio[0];
    }

    public String getFIO() {
        return result;
    }
}
