package example.gof.behavioral_pattern.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User implements Subscriber {

    private String name;

    @Override
    public void handleMessage(String message) {
        System.out.println(name + "=" + message);
    }
}
