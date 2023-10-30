package example.gof.behavioral_pattern.mediator;

import java.time.LocalDateTime;

public class MediatorClient {

    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDeskImpl();
        Guest guest = new Guest(frontDesk);
        guest.setId(12);
        // Guest는 CleanningService와 Restaurant를 이용하지만 직접 의존하지 않고 FrontDesk만 의존한다.
        // 각 서비스들도 마찬가지로 Guest를 의존하지 않고 FrontDesk만을 의존한다.
        // 결과적으로 클라이언트와 서비스간의 의존성이 완전히 분리되고, 모든 책임을 FrontDesk가 지는 구조가 된다.
        guest.getTower(3);
        guest.dinner(LocalDateTime.of(2023, 10, 30, 22, 0));
    }
}
