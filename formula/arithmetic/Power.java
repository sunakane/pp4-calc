package formula.arithmetic;

import formula.*;

public class Power extends BinaryOperator {
	public Power(Expression l, Expression r) {
		super(l, r);
	}

	@Override
	public int getValue() {
		return (int)Math.pow(this.left.getValue(), this.right.getValue());
	}

	@Override
	public int getPriority() {
		return 3;
	}

	@Override
	public String toString() {
		return super.toString("^");
	}
}
