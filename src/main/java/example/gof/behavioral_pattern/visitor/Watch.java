package example.gof.behavioral_pattern.visitor;

public class Watch  implements Device {
    @Override
    public void printTo(Circle circle) {
        System.out.println("Print Circle to Watch");
    }

    @Override
    public void printTo(Rectangle rectangle) {
        System.out.println("Print Rectangle to Watch");
    }

    @Override
    public void printTo(Triangle triangle) {
        System.out.println("Print Triangle to Watch");
    }
}
