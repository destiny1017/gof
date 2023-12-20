package example.gof.behavioral_pattern.templatemethod;

public class Plus implements Operator {
    @Override
    public int getResult(int result, int number) {
        return result += number;
    }
}
