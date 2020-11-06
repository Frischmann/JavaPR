// В списке мой номер 20ый, а так как в заданиях всего 17 номеров,
// я начал считать по кругу и мне достались задания от 3его до 7го

package task4;

import java.util.Scanner;

public class task4 {
    public static int find(int k, int s, int l, int count) {
        if (l == k) {
            if (count == s)
                return 1;
            else
                return 0;
        }

        int c = (l == 0 ? 1 : 0);
        int answer = 0;

        for (int i = c; i < 10; i++)
            answer += find(k, s, l + 1, count + 1);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число k: ");
        int k = sc.nextInt();
        if (k == 0) {
            System.out.println("Запись натурального числа не может начинаться с цифры 0.");
            main(null);
        }

        System.out.print("Введите число s: ");
        int s = sc.nextInt();
        if (s == 0) {
            System.out.println("Запись натурального числа не может начинаться с цифры 0.");
            main(null);
        }

        sc.close();

        System.out.print(find(k, s, 0, 0));
    }
}
