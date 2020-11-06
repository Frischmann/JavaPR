// В списке мой номер 20ый, а так как в заданиях всего 17 номеров,
// я начал считать по кругу и мне достались задания от 3его до 7го

package task5;

import java.util.Scanner;

public class task5 {
    public static int sum(int n) {
        if (n < 10)
            return n;
        else
            return n % 10 + sum(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите натуральное число N: ");
        int n = sc.nextInt();

        sc.close();

        System.out.print(sum(n));
    }
}
