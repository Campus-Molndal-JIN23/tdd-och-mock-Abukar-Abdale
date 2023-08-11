package org.campusmolndal.abdale;


public class WeatherData {
    private final double temperature;
    private final double windSpeed;
    private final int clouds;
    private final String city;
    private final String country;

    public WeatherData(double temperature, double windSpeed, int clouds, String city, String country) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.clouds = clouds;
        this.city = city;
        this.country = country;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public int getClouds() {
        return clouds;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
