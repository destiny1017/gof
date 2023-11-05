package example.gof.behavioral_pattern.observer;

public class ObserverClient {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User("user1");
        User user2 = new User("user2");
        chatServer.register("subject1", user1);
        chatServer.register("subject1", user2);

        chatServer.register("subject2", user1);

        chatServer.sendMessage(user1, "subject1", "new message of subject1");
        chatServer.sendMessage(user2, "subject2", "new message of subject2");

        chatServer.unregister("subject1", user2);
        chatServer.sendMessage(user2, "subject1", "new message of subject1");
    }
}
