package formula.number;

import formula.*;

//数式上の変数を表すクラス
public class Var implements Expression {
	private String name;		//変数名
	private int value;		//変数の内容

	public Var(String n, int v) {
		this.name = n;
		this.value = v;
	}

	public void setValue(int v) {
		this.value = v;
	}

	public int getValue() {
		return this.value;
	}

	public int getPriority() {
		return 0;
	}

	public String toString() {
		return this.name;
	}
}
