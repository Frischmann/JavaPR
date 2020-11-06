package task4;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(0, 0, 0, 0);
        MovableCircle mc = new MovableCircle(0, 0, 0, 0);
        MovableRectangle mr = new MovableRectangle(0, 0, 0, 0, 0, 0);

        System.out.println("Movable Point:");
        mp.moveUp();
        mp.moveRight();
        System.out.println(mp);
        mp.moveDown();
        mp.moveLeft();
        System.out.println(mp);

        System.out.println("\nMovable Circle:");
        mc.moveUp();
        mc.moveRight();
        System.out.println(mc);
        mc.moveDown();
        mc.moveLeft();
        System.out.println(mc);

        System.out.println("\nMovable Rectangle:");
        mr.moveUp();
        mr.moveRight();
        System.out.println(mr);
        mr.moveDown();
        mr.moveLeft();
        System.out.println(mr);
    }
}
