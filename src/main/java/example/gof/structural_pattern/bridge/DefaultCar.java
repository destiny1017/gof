package example.gof.structural_pattern.bridge;

public class DefaultCar implements Car {

    private final Color color;
    private final String size;

    public DefaultCar(Color color, String size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public void start() {
        System.out.printf("Start Engine %s %s car..\n", size, color.getColor());
    }

    @Override
    public void run() {
        System.out.printf("Running %s %s car..\n", size, color.getColor());
    }

    @Override
    public void stop() {
        System.out.printf("Stopped %s %s car..\n", size, color.getColor());
    }
}
