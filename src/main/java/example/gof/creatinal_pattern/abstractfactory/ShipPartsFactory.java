package example.gof.creatinal_pattern.abstractfactory;

public interface ShipPartsFactory {

    Wheel createWheel();
    Anchor createAnchor();

}
