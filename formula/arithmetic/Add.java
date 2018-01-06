import formula.*;
import number.*;

class Add extends BinaryOperator {
    public Add(Expression l, Expression r) {
        this.left = l;
        this.right = r;
    }

    @Override
    public int getValue() {
        return l.getValue() + r.getValue;
    }

    @Override
    public int getPriority() {
        return 2;
    }

    public String toString() {
        return super.toString("+");
    }
}
