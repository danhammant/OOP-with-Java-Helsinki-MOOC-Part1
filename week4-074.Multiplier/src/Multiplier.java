/**
 * Created by Dan on 19/03/2017.
 */
public class Multiplier {
    private int number;

    public Multiplier (int numberToMultiply) {
        this.number = numberToMultiply;
    }

    public int multiply(int otherNumber) {
        int total = this.number * otherNumber;
        return total;
    }
}
