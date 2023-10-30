package example.gof.behavioral_pattern.mediator;

import java.time.LocalDateTime;

public class FrontDeskImpl implements FrontDesk {

    private CleaningService cleaningService;
    private Restaurant restaurant;

    public FrontDeskImpl() {
        this.cleaningService = new CleaningService(this);
        this.restaurant = new Restaurant(this);
    }

    @Override
    public void getTower(Guest guest, int numberOfTower) {
        cleaningService.getTower(guest.getId(), numberOfTower);
    }

    @Override
    public void dinner(Guest guest, LocalDateTime localDateTime) {
        restaurant.dinner(guest.getId(), localDateTime);
    }

    @Override
    public int getRoomNumber(int guestId) {
        return 702;
    }
}
