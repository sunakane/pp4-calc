package formula.arithmetic;

import formula.*;

public class Div extends BinaryOperator {
    public Div(Expression l, Expression r) {
    	super(l, r);
    }

    @Override
    public int getValue() {
        return this.left.getValue() / this.right.getValue();
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public String toString() {
        return super.toString("/");
    }
}
