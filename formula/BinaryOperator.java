package formula;

abstract BinaryOperator implements Expression {
    private Expression left, right;

    public BinaryOperator(Expression l, Expression r) {
        this.left = l;
        this.right = r;
    }

    public abstract int getValue();
    public abstract int getPriority();

    public String toString(String opr) {
        return Integer.toString(this.left.getValue()) + opr + Integer.toString(this.right.getValue());
    }
}
