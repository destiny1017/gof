package example.gof.creatinal_pattern.abstractfactory;

import example.gof.creatinal_pattern.factorymethod.Ship;
import example.gof.creatinal_pattern.factorymethod.ShipFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipPartsFactoryTest {

    @Test
    void test() {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship whiteShip = shipFactory.orderShip("WhiteShip", "whiteship@email.com");
        System.out.println(whiteShip.getAnchor().getClass());
        System.out.println(whiteShip.getWheel().getClass());

        WhiteShipFactory proShipFactory = new WhiteShipFactory(new WhiteShipPartProFactory());
        Ship whiteShipPro = proShipFactory.orderShip("WhiteShipPro", "whiteship@email.com");
        System.out.println(whiteShipPro.getAnchor().getClass());
        System.out.println(whiteShipPro.getWheel().getClass());
    }

}