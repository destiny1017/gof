package example.gof.behavioral_pattern.strategy;

public class StrategyClient {

    public static void main(String[] args) {
        BLueLightRedLight game = new BLueLightRedLight();
        game.blueLight(new Normal());
        game.redLight(new Fastest());
        game.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("blue light");
            }

            @Override
            public void redLight() {
                System.out.println("red light");
            }
        });
    }
}
