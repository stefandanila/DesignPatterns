package com.sdanila.patterns.observer;

//The Observer Pattern defines a one-to-many
//dependency between objects so that when one
//object changes state, all of its dependents are
//notified and updated automatically
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
