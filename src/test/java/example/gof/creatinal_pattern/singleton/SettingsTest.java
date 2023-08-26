package example.gof.creatinal_pattern.singleton;

import example.gof.creatinal_pattern.singleton.Settings;
import org.junit.jupiter.api.Test;

class SettingsTest {

    @Test
    void test() {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        System.out.println(settings1 == settings2);
    }
}