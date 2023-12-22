package example.gof.behavioral_pattern.visitor;

public class Circle implements Shape {

    @Override
    public void accept(Device device) {
        device.printTo(this);
    }
}
