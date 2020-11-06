package task3;

public class Variable implements Expression {
    private final char var;

    public Variable(char var) {
        this.var = var;
    }

    public int evaluate(int x) {
        return x;
    }
}
