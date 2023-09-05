package example.gof.structural_pattern.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComponentTest {

    @Test
    void test() {
        Item item1 = new Item("itme1", 1000);
        Item item2 = new Item("itme2", 2000);
        Bag bag = new Bag();
        bag.getComponentList().add(item1);
        bag.getComponentList().add(item2);

        printPrice(item1);
        printPrice(bag);

    }

    void printPrice(Component component) {
        System.out.println(component.getPrice());
    }

}