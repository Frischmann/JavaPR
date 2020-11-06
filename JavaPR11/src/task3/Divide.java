package task3;

public class Divide extends Operation {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left / right;
    }
}
