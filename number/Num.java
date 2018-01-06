package number;

public class Num implements Expression {
    private int number;

    public Num(int n) {
        this.number = n; 
    }

    public int getValue() {
        return this.number;
    }

    public int getPrioriry() {
    	return 0;
    }

    public String toString() {
        return String.valueOf(this.number);
    }

}
