package example.gof.behavioral_pattern.visitor;

public class VisitorClient {

    public static void main(String[] args) {
        Shape shape = new Rectangle();
        Device device = new Phone();
        shape.accept(device);
    }
}
