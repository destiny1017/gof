package example.gof.behavioral_pattern.interpreter;

import java.util.Map;

public class VariableExpression implements PostfixExpression {

    private Character character;
    public VariableExpression(char c) {
        this.character = c;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(this.character);
    }
}
