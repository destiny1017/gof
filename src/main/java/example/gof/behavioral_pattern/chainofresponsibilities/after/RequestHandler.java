package example.gof.behavioral_pattern.chainofresponsibilities.after;

import example.gof.behavioral_pattern.chainofresponsibilities.before.Request;

public abstract class RequestHandler {

    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler requestHandler) {
        this.nextHandler = requestHandler;
    }

    public void handle(Request request) {
        if(nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
