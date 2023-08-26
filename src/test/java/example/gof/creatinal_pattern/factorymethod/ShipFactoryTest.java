package example.gof.creatinal_pattern.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipFactoryTest {

    @Test
    void test() {
        Ship whiteShip = new WhiteShipFactory().orderShip("WhiteShip", "customer1@email.com");
        Ship blackShip = new BlackShipFactory().orderShip("BlackShip", "customer2@email.com");
        System.out.println("whiteShip = " + whiteShip);
        System.out.println("blackShip = " + blackShip);
    }
}