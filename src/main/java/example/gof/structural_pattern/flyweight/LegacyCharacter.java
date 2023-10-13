package example.gof.structural_pattern.flyweight;

import java.awt.*;

public class LegacyCharacter {
    private char value;

    private String color;

    private String font;

    private int size;

    public LegacyCharacter(char value, String color, String font, int size) {
        this.value = value;
        this.color = color;
        this.font = font;
        this.size = size;
    }
}
