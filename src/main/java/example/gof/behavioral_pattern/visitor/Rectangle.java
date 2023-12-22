package example.gof.behavioral_pattern.visitor;

public class Rectangle implements Shape {

    @Override
    public void accept(Device device) {
        device.printTo(this);
    }
}
