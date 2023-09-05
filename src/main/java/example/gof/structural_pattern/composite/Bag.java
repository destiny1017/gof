package example.gof.structural_pattern.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Bag implements Component {

    List<Component> componentList = new ArrayList<>();

    @Override
    public int getPrice() {
        return componentList.stream().mapToInt(c -> c.getPrice()).sum();
    }
}
