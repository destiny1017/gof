package example.gof.behavioral_pattern.mediator;

public class CleaningService {

    private FrontDesk frontDesk;

    public CleaningService(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void getTower(int guestId, int numberOfTower) {
        int roomNumber = frontDesk.getRoomNumber(guestId);
        System.out.printf("provided %d number of towers at room %d..\n", numberOfTower, roomNumber);
    }
}
