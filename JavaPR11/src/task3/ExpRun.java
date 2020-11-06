package task3;

import java.util.Scanner;

public class ExpRun {
    public static void exp(int x) {
        System.out.println(
                new Add(
                        new Subtract(
                                new Multiply(
                                        new Variable('x'), new Variable('x')
                                ),
                                new Multiply(
                                        new Const(2), new Variable('x')
                                )
                        ),
                        new Const(1)
                ).evaluate(x)
        );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите x для выражения x^2 - 2x + 1: ");
        int num = sc.nextInt();

        exp(num);
    }
}
