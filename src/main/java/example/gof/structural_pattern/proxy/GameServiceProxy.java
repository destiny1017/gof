package example.gof.structural_pattern.proxy;

public class GameServiceProxy implements GameService {

    private final GameService gameService;
    private String messageCache;

    public GameServiceProxy(GameServiceImpl gameService) {
        this.gameService = gameService;
    }

    @Override
    public String getWelcomeMessage() {
        long start = System.currentTimeMillis();
        if(messageCache == null) {
            messageCache = gameService.getWelcomeMessage();
        }
        System.out.println("execute time : " + (System.currentTimeMillis() - start));
        return messageCache;
    }
}
