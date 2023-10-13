package example.gof.structural_pattern.flyweight;

public class FlyweightClient {

    private final FontFactory fontFactory;

    public FlyweightClient(FontFactory fontFactory) {
        this.fontFactory = fontFactory;
    }

    public void characterCreation_before() {
        // 반복된 패턴의 객체 생성으로 메모리를 과도하게 차지할 수 있음
        LegacyCharacter c1 = new LegacyCharacter('h', "white", "nanum", 12);
        LegacyCharacter c2 = new LegacyCharacter('e', "white", "nanum", 12);
        LegacyCharacter c3 = new LegacyCharacter('l', "white", "nanum", 12);
        LegacyCharacter c4 = new LegacyCharacter('l', "white", "nanum", 12);
        LegacyCharacter c5 = new LegacyCharacter('o', "white", "nanum", 12);
    }

    public void characterCreation_after() {
        // 반복되는 Font를 캐싱 가능한 Factory로 생성하여 재활용
        Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e', "white", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('l', "white", fontFactory.getFont("nanum:12"));
        Character c4 = new Character('l', "white", fontFactory.getFont("nanum:12"));
        Character c5 = new Character('o', "white", fontFactory.getFont("nanum:12"));
    }
}
