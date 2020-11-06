package task3;

public class Const implements Expression {
    private final int iVal;

    public Const(int value) {
        iVal = value;
    }

    public int evaluate(int x) {
        return iVal;
    }
}
