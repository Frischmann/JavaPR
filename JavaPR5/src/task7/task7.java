// В списке мой номер 20ый, а так как в заданиях всего 17 номеров,
// я начал считать по кругу и мне достались задания от 3его до 7го

package task7;

import java.util.Scanner;

public class task7 {
    public static void multi(int n, int div) {
        if (div > n / 2) {
            System.out.print(n + " | ");
            return;
        }

        if (n % div == 0) {
            System.out.print(div + " | ");
            multi(n / div, div);
        }

        else
            multi(n, ++div);
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

        multi(n, 2);
    }
}
