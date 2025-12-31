package behavioural_design_pattern.observer_pattern;

public class Client {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Create two displays and register them as observers
        WeatherDisplay display1 = new WeatherDisplay();
        WeatherDisplay display2 = new WeatherDisplay();

        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);// Simulate changes in weather data
        weatherStation.setMeasurements(25.5f, 65.0f);
        weatherStation.setMeasurements(27.3f, 70.0f);
    }
}
