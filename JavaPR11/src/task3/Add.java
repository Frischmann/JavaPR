package task3;

public class Add extends Operation {
    public Add(Expression left, Expression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left + right;
    }
}
