package gradle;

public class MathOperations {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum2(int a, int b) {
        if (a == 1) {
            throw new IllegalArgumentException("a can't be 1");
        }
        return a + b;
    }

}
