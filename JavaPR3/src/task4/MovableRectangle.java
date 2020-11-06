//Выполнил упражнение №5 в пакете упражнения №4

package task4;

public class MovableRectangle implements Movable {
    private int x1, x2, y1, y2, xSpeed, ySpeed;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MovablePoint topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
    MovablePoint bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        if(topLeft.getySpeed() == bottomRight.getySpeed()) {
            y1 += 5;
            y2 += 5;
            ySpeed += 1;
        }
    }

    @Override
    public void moveDown() {
        if(topLeft.getySpeed() == bottomRight.getySpeed()) {
            y1 -= 5;
            y2 -= 5;
            ySpeed -= 1;
        }
    }

    @Override
    public void moveLeft() {
        if(topLeft.getxSpeed() == bottomRight.getxSpeed()) {
            x1 -= 5;
            x2 -= 5;
            xSpeed -= 1;
        }
    }

    @Override
    public void moveRight() {
        if(topLeft.getxSpeed() == bottomRight.getxSpeed()) {
            x1 += 5;
            x2 += 5;
            xSpeed += 1;
        }
    }
}
