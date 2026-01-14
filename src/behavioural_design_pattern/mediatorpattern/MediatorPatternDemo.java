package behavioural_design_pattern.mediatorpattern;

public class MediatorPatternDemo {

    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();
        User user1 = new ChatUser("John", chatMediator);
        User user2 = new ChatUser("Alice", chatMediator);

        user1.sendMessage("Hello, Alice!");
        user2.sendMessage("Hi, John!");
    }
}
