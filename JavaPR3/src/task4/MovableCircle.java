package task4;

public class MovableCircle implements Movable {
    private int x, y, xSpeed, ySpeed;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        y += 10;
        ySpeed += 10;
    }

    @Override
    public void moveDown() {
        y -= 10;
        ySpeed -= 10;
    }

    @Override
    public void moveLeft() {
        x -= 10;
        xSpeed -= 10;
    }

    @Override
    public void moveRight() {
        x += 10;
        xSpeed += 10;
    }
}
