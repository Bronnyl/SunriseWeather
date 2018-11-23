package com.sunrise.viewmodel;

public class WeatherDetailsViewModel {

    private String date;
    private String city;
    private String description;
    private String temperatureInFahrenheit;
    private String temperatureInCelsius;
    private String sunrise;
    private String sunset;

    public WeatherDetailsViewModel() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTemperatureInFahrenheit() {
        return temperatureInFahrenheit;
    }

    public void setTemperatureInFahrenheit(String temperatureInFahrenheit) {
        this.temperatureInFahrenheit = temperatureInFahrenheit;
    }

    public String getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(String temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }
}
