import formula.*;
import formula.arithmetic.*;
import formula.number.*;

public class Report2 {
	public static void main(String[] args) {
		Var a = new Var("a", 3);
		Var b = new Var("b", 2);
		Var c = new Var("c", 6);

		Expression exp = new Mult( new Power(new Add(a,b), new Num(2)),
				new Sub(new Power(a,b), new Div(c,a)));
		System.out.println(a.toString() + " = " + a.getValue());
		System.out.println(b.toString() + " = " + b.getValue());
		System.out.println(c.toString() + " = " + c.getValue());
		System.out.println(exp.toString() + " = " + exp.getValue());

		a.setValue(2);
		b.setValue(0);
		c.setValue(8);
		System.out.println(a.toString() + " = " + a.getValue());
		System.out.println(b.toString() + " = " + b.getValue());
		System.out.println(c.toString() + " = " + c.getValue());
		System.out.println(exp + " = " + exp.getValue());
	}
}
