package example.gof.behavioral_pattern.command;

import example.gof.behavioral_pattern.command.after.AfterLight;
import example.gof.behavioral_pattern.command.after.Command;
import example.gof.behavioral_pattern.command.before.BeforeLight;

public class CommandClient {

    public static void main(String[] args) {
        /**
         * before 문제점
         * Module의 메서드가 변경되면 클라이언트에서 구현한 모든 Module 코드를 수정해야함
         * Module의 의존성이 Light가 아닌 Game 등으로 변경돼도 동일한 문제 발생
         */
        BeforeModule button1 = new BeforeModule(new BeforeLight());
        button1.press();
        button1.press();
        button1.press();
        button1.press();

        /**
         * Command 인터페이스의 execute() 메서드로 로직을 집어넣어 module 코드 변경시 클라이언트 코드를 변경하지 않아도 됨
         * module의 의존성이 변경돼도 execute() 내의 코드만 수정하면 됨
         */
        AfterModule button2 = new AfterModule(new AfterLight());
        button2.execute();
        button2.execute();
        button2.execute();
        button2.execute();

    }

    static class BeforeModule {
        BeforeLight light;

        public BeforeModule(BeforeLight light) {
            this.light = light;
        }

        public void press() {
            light.on();
        }
    }

    static class AfterModule {
        Command command;

        public AfterModule(Command command) {
            this.command = command;
        }

        public void execute() {
            command.execute();
        }
    }

}
