package example.gof.structural_pattern.proxy;

public class GameServiceImpl implements GameService {

    @Override
    public String getWelcomeMessage() {
        try {
            Thread.sleep(1000);
            return "Welcome to This World!";
        } catch (InterruptedException e) {
            throw new IllegalStateException();
        }
    }
}
