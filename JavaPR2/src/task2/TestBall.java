package task2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(5.3,1.1);
        Ball b2 = new Ball();

        System.out.println(b1.getX() + " | " + b1.getY());
        System.out.println(b2.getX() + " | " + b2.getY());

        b1.setX(9.9);
        b2.setXY(1.1, 8.0);

        System.out.println(b1 + "\n" + b2);

        b1.move(2.0, 3.0);
        System.out.println("\n" + b1);
    }
}
