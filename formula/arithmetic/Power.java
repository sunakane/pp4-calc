import formula.*;
import number.*;

public class Power extends BinaryOperator {
    public Power(Expression l, Expression r) {
        this.left = l;
        this.right = r;
    }

    @Override
    public int getValue() {
        return Math.Pow(this.left.getValue(), this.right.getValue());
    }

    @Override
    public int getPriority() {
        return 0;
    }

    public int toString() {
        return super.toString("^");
    }
}
