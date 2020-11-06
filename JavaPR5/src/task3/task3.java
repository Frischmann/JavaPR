// В списке мой номер 20ый, а так как в заданиях всего 17 номеров,
// я начал считать по кругу и мне достались задания от 3его до 7го

package task3;

import java.util.Scanner;

public class task3 {
    public static String comp(int a, int b) {
        if (a > b)
            return a + " " + comp(a - 1, b);
        else {
            if (a == b)
                return Integer.toString(a);
            return a + " " + comp(a + 1, b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число A: ");
        int a = sc.nextInt();

        System.out.print("Введите число B: ");
        int b = sc.nextInt();

        sc.close();

        System.out.print(comp(a, b));
    }
}
