package com.sunrise.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherSummary {

    private ZonedDateTime dt;

    @JsonProperty("name")
    private String city;

    private Weather[] weather;

    private WeatherMain main;

    private WeatherSys sys;

    public WeatherSummary() {
    }

    public ZonedDateTime getDt() {
        return dt;
    }

    public void setDt(ZonedDateTime dt) {
        this.dt = dt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }

    public WeatherMain getMain() {
        return main;
    }

    public void setMain(WeatherMain main) {
        this.main = main;
    }

    public WeatherSys getSys() {
        return sys;
    }

    public void setSys(WeatherSys sys) {
        this.sys = sys;
    }
}
