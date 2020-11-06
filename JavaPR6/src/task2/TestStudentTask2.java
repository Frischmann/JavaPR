package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class TestStudentTask2 {
    public static void main(String[] args) throws IOException {
        Student[] s = new Student[10];

        System.out.print("Введите 10 значений GPA: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        for (int i = 0; i < strs.length; i++) {
            s[i] = new Student(Double.parseDouble(strs[i]));
        }

        System.out.println("Before: " + Arrays.toString(s));

        new SortingStudentsByGPA(s);

        System.out.println("After: " + Arrays.toString(s));
    }
}
