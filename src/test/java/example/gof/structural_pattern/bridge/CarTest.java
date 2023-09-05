package example.gof.structural_pattern.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void test() {
        Car bigBlueCar = new BigCar(new BlueColor());
        Car compactRedCar = new CompactCar(new RedColor());
        bigBlueCar.start();
        compactRedCar.start();
        bigBlueCar.run();
        compactRedCar.run();
        bigBlueCar.stop();
        compactRedCar.stop();
    }
}