package example.gof.creatinal_pattern.factorymethod;

import example.gof.creatinal_pattern.abstractfactory.Anchor;
import example.gof.creatinal_pattern.abstractfactory.Wheel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Ship {
    private String name;
    private String color;
    private String logo;
    private Anchor anchor;
    private Wheel wheel;
}
