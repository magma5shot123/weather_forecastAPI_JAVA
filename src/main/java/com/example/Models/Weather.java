package com.example.Models;

public class Weather {
    
    private double temperature;
    private int humidity;
    private String description;
    private double windSpeed;
    private double feelsLike;

    public Weather(double temperature, int humidity, String description, double windSpeed, double feelsLike) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.description = description;
        this.windSpeed = windSpeed;
        this.feelsLike = feelsLike;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public String getDescription() {
        return description;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

}
