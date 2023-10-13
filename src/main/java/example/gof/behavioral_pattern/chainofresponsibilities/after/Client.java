package example.gof.behavioral_pattern.chainofresponsibilities.after;

import example.gof.behavioral_pattern.chainofresponsibilities.before.Request;

public class Client {

    private RequestHandler handler;

    public Client(RequestHandler handler) {
        this.handler = handler;
    }

    public void doWork() {
        Request request = new Request("로그인 요청");
        handler.handle(request);
    }

    public static void main(String[] args) {
        // handler chaining으로 추가 및 제거되는 핸들러는 파라미터만 조정하면 됨
        RequestHandler requestHandler = new AuthRequestHandler(new LoggingRequestHandler(null));
        Client client = new Client(requestHandler);
        client.doWork();
    }


}
