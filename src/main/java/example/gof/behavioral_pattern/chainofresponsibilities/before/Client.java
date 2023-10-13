package example.gof.behavioral_pattern.chainofresponsibilities.before;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("로그인");
        RequestHandler handler = new AuthRequestHandler();
        handler.handler(request);
        // logging 기능을 추가하기 어려움
    }
}
