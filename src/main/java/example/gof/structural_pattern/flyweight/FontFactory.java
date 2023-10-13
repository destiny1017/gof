package example.gof.structural_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {

    private Map<String, Font> fonts = new HashMap<>();

    public Font getFont(String font) {
        if(fonts.containsKey(font)) {
            return fonts.get(font);
        } else {
            String[] fontValue = font.split(":");
            Font newFont = new Font(fontValue[0], Integer.parseInt(fontValue[1]));
            fonts.put(font, newFont);
            return newFont;
        }
    }
}
