package example.gof.behavioral_pattern.interpreter;

import java.util.Map;

public interface PostfixExpression {
    int interpret(Map<Character, Integer> context);
}
