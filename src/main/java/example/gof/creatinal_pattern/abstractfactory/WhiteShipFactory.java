package example.gof.creatinal_pattern.abstractfactory;

import example.gof.creatinal_pattern.factorymethod.Ship;
import example.gof.creatinal_pattern.factorymethod.ShipFactory;
import example.gof.creatinal_pattern.factorymethod.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    private final ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        WhiteShip whiteShip = new WhiteShip();
        whiteShip.setAnchor(shipPartsFactory.createAnchor());
        whiteShip.setWheel(shipPartsFactory.createWheel());
        return whiteShip;
    }
}
