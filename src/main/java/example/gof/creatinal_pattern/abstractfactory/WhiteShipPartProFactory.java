package example.gof.creatinal_pattern.abstractfactory;

public class WhiteShipPartProFactory implements ShipPartsFactory {
    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }
}
