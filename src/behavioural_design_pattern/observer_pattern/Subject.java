package behavioural_design_pattern.observer_pattern;

public interface Subject {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
