package example.gof.behavioral_pattern.chainofresponsibilities.before;

import lombok.Data;

@Data
public class Request {
    private String body;

    public Request(String body) {
        this.body = body;
    }
}
