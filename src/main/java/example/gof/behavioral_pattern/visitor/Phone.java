package example.gof.behavioral_pattern.visitor;

public class Phone  implements Device {

    @Override
    public void printTo(Circle circle) {
        System.out.println("Print Circle to Phone");
    }

    @Override
    public void printTo(Rectangle rectangle) {
        System.out.println("Print Rectangle to Phone");
    }

    @Override
    public void printTo(Triangle triangle) {
        System.out.println("Print Triangle to Phone");
    }
}
