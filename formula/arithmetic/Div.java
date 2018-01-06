import formula.*;
import number.*;

public class Div extends BinaryOperator {
    public Div(Expression l, Expression r) {
        this.left = l;
        this.right = r;
    }

    @Override
    public int getValue() {
        return this.left.getValue() / this.right.getValue();
    }

    @Override
    public int getPriority() {
        return 1;
    }

    public String toString() {
        return super.toString("/");
    }
}
