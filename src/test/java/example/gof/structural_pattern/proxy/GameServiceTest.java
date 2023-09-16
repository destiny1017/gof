package example.gof.structural_pattern.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {

    @Test
    void test() {
        GameService gameService = new GameServiceProxy(new GameServiceImpl());
        System.out.println(gameService.getWelcomeMessage());
        System.out.println(gameService.getWelcomeMessage());
    }

}