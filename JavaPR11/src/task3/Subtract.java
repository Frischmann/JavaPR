package task3;

public class Subtract extends Operation {
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left - right;
    }
}
