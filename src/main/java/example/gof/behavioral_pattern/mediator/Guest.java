package example.gof.behavioral_pattern.mediator;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Guest {

    private int id;
    private FrontDesk frontDesk;

    public Guest(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void getTower(int numberOfTower) {
        frontDesk.getTower(this, numberOfTower);
    }

    public void dinner(LocalDateTime localDateTime) {
        frontDesk.dinner(this, localDateTime);
    }

}
