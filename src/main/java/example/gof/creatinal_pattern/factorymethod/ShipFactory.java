package example.gof.creatinal_pattern.factorymethod;

import org.springframework.util.StringUtils;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    private void validate(String name, String email) {
        if(!StringUtils.hasText(name)) {
            throw new IllegalArgumentException("이름을 입력해주세요.");
        }
        if(!StringUtils.hasText(email)) {
            throw new IllegalArgumentException("이메일을 입력해주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println("[" + name + "] 생산 준비중..");
    }

    Ship createShip();

    private void sendEmailTo(String email, Ship ship) {
        System.out.println("[" + ship.getName() + "] 생산 완료.");
    }

}
