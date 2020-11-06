// В списке мой номер 20ый, а так как в заданиях всего 17 номеров,
// я начал считать по кругу и мне достались задания от 3его до 7го

package task6;

import java.util.Scanner;

public class task6 {
    public static boolean check(int n, int div) {
        if (n < 2)
            return false;
        else if (n == 2)
            return true;
        else if (n % div == 0)
            return false;
        else if (div < n / 2)
            return check(n, div + 1);
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите натуральное число n>1: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Число n должно быть больше 1!");
            main(null);
        }

        sc.close();

        if (check(n, 2))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
