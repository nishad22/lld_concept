package behavioural_design_pattern.mediatorpattern;

public class ChatRoom implements ChatMediator {

    @Override
    public void sendMessage(String message, User user) {
        // Logic to send the message to all users in the chat room
        System.out.println(user.getName() + " sends message: " + message);
    }
}
