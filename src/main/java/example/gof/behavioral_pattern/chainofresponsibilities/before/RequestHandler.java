package example.gof.behavioral_pattern.chainofresponsibilities.before;

public class RequestHandler {

    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}
