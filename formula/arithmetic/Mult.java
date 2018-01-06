import formula.*;
import number.*;

class Mult extends BinaryOperator {
    public Mult(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public int getValue() {
        return this.left.getValue() * this.right.getValue();
    }

    @Override
    public int getPriority() {
        return 1;
    }

    public String toString() {
        return super.toString("*");
    }
}
