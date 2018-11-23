package com.sunrise.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherMain {

    @JsonProperty("temp")
    private String temperatureInFahrenheit;

    public WeatherMain() {
    }

    public String getTemperatureInFahrenheit() {
        return temperatureInFahrenheit;
    }

    public void setTemperatureInFahrenheit(String temperatureInFahrenheit) {
        this.temperatureInFahrenheit = temperatureInFahrenheit;
    }
}
