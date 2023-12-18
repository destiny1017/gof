package example.gof.behavioral_pattern.strategy;

public class BLueLightRedLight {
    public void blueLight(Speed speed) {
        speed.blueLight();
    }

    public void redLight(Speed speed) {
        speed.redLight();
    }
}
