package behavioural_design_pattern.observer_pattern;

import java.util.ArrayList;
import java.util.List;

//This class implements the Subject interface and holds the current state (temperature and humidity).
// It notifies all registered observers when the state changes.
public class WeatherStation implements Subject{

    private List<Observer> observers;
    private float temperature;
    private float humidity;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }
    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers(); // notify all observers of the change
    }
}
