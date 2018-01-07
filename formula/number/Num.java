package formula.number;

import formula.*;

//定数を表す
public class Num implements Expression {
	private int number;

	public Num(int n) {
		this.number = n; 
	}

	public String toString() {
		return String.valueOf(this.number);
	}

	@Override
	public int getValue() {
		return this.number;
	}

	@Override
	public int getPriority() {
		return 0;
	}

}
