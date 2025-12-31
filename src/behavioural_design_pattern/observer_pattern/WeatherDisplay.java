package behavioural_design_pattern.observer_pattern;

// This class implements the Observer interface.
// It updates itself whenever the WeatherStation notifies it of a change.
public class WeatherDisplay implements Observer{

    private float temperature;
    private float humidity;
    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    public void display() {
        System.out.println("Current conditions: " + temperature + "C degrees and " + humidity + "% humidity");
    }
}


