package task2;

public class VictorianChair implements Chair {
    private int age = 0;

    public VictorianChair(int age) {
        this.age = age;
    }

    public VictorianChair() {

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
