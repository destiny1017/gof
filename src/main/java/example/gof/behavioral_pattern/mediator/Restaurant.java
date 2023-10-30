package example.gof.behavioral_pattern.mediator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Restaurant {

    private FrontDesk frontDesk;

    public Restaurant(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void dinner(Integer id, LocalDateTime dateTime) {
        int roomNumber = frontDesk.getRoomNumber(id);
        System.out.printf("Reserved dinner for room %d at time = %s\n",
                roomNumber, dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
    }
}
