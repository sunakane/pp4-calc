package formula;

//二項演算子の抽象クラス
public abstract class BinaryOperator implements Expression {
	
	protected Expression left;	//左項
	protected Expression right;	//右項

	public BinaryOperator(Expression l, Expression r) {
		this.left = l;
		this.right = r;
	}

	public abstract int getValue();		//演算の結果を取得するメソッド
	public abstract int getPriority();	//演算の優先順位を取得するメソッド

	public String toString(String opr) {
		int lPriority = this.left.getPriority();
		int rPriority = this.right.getPriority();
		String lString = this.left.toString();
		String rString = this.right.toString();

		if (lPriority == 0 && rPriority == 0) {
			return lString + opr + rString;
		}

		String temp = new String();
		switch (opr) {
		case "+":
			return lString + opr + rString;

		case "-":
			return lString + opr + rString;

		case "*":
					
			if (lPriority == 2 && rPriority == 2) {
				return lString + opr + rString;
			}
			
			if (lPriority >= 2 || lPriority == 0) {
				temp += lString;
			} else {
				temp += "(" + lString + ")";
			}
			
			temp += opr;
			
			if (rPriority >= 2 || lPriority == 0) {
				temp += rString;
			} else {
				temp += "(" + rString + ")";
			}
			
			return temp;
			
		case "/":

			if (lPriority == 2 && rPriority == 2) {
				return lString + opr + rString;
			}
			
			if (lPriority >= 2 || lPriority == 0) {
				temp += lString;
			} else {
				temp += "(" + lString + ")";
			}
			
			temp += opr;
			
			if (rPriority >= 2 || lPriority == 0) {
				temp += rString;
			} else {
				temp += "(" + rString + ")";
			}
			
			return temp;

		case "^":
			if (lPriority > 0) {
				temp += "(" + lString + ")";
			} else {
				temp += lString;
			}
			
			temp += opr;
			
			if (rPriority > 0){
				temp += "(" + rString + ")";
			} else {
				temp += rString;
			}
			
			return temp;
		default:
			return lString + opr + rString;
		}

	}

}
