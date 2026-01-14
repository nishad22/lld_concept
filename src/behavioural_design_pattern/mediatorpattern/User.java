package behavioural_design_pattern.mediatorpattern;

public interface User {

    void sendMessage(String message);
    void receiveMessage(String message);
    String getName();
}
