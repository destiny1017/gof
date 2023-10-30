package example.gof.behavioral_pattern.mediator;

import java.time.LocalDateTime;

public interface FrontDesk {
    void getTower(Guest guest, int numberOfTower);
    void dinner(Guest guest, LocalDateTime localDateTime);
    int getRoomNumber(int guestId);
}
