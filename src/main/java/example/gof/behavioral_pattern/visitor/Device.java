package example.gof.behavioral_pattern.visitor;

public interface Device {
    void printTo(Circle circle);
    void printTo(Rectangle rectangle);
    void printTo(Triangle triangle);
}
