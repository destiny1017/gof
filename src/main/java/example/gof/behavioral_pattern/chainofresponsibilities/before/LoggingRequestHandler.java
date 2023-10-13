package example.gof.behavioral_pattern.chainofresponsibilities.before;

public class LoggingRequestHandler extends RequestHandler {
    @Override
    public void handler(Request request) {
        System.out.println("요청 로깅");
        super.handler(request);
    }
}
