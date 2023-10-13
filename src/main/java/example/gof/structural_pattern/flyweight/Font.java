package example.gof.structural_pattern.flyweight;

public final class Font {
    private final String font;
    private final int size;

    public Font(String font, int size) {
        this.font = font;
        this.size = size;
    }
}
