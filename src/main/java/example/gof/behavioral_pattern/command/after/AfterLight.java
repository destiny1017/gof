package example.gof.behavioral_pattern.command.after;

public class AfterLight implements Command {

    @Override
    public void execute() {
        on();
    }

    public void on() {
        System.out.println("light on");
    }

    public void off() {
        System.out.println("light off");
    }
}
