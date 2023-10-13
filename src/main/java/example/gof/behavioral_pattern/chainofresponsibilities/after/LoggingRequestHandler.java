package example.gof.behavioral_pattern.chainofresponsibilities.after;

import example.gof.behavioral_pattern.chainofresponsibilities.before.Request;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("요청 로깅");
        super.handle(request);
    }
}
