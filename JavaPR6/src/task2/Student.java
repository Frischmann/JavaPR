package task2;

public class Student implements Comparable<Student>{
    private double GPA;

    public Student(double GPA) {
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return -Double.compare(this.GPA, o.GPA);
    }
}
