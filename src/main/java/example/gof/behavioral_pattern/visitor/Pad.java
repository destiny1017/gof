package example.gof.behavioral_pattern.visitor;

public class Pad implements Device {
    @Override
    public void printTo(Circle circle) {
        System.out.println("Print Circle to Pad");
    }

    @Override
    public void printTo(Rectangle rectangle) {
        System.out.println("Print Rectangle to Pad");
    }

    @Override
    public void printTo(Triangle triangle) {
        System.out.println("Print Triangle to Pad");
    }
}
