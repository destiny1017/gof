package example.gof.behavioral_pattern.chainofresponsibilities.after;

import example.gof.behavioral_pattern.chainofresponsibilities.before.Request;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었는가?");
        System.out.println("이 핸들러를 사용할 수 있는 유저인가?");
        super.handle(request);
    }
}
