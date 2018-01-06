package number;

import formula.*;
import number.*;

public class Var implements Expression {
    private String name;
    private int value;

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
