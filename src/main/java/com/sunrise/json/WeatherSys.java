package com.sunrise.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.ZonedDateTime;

/**
 * Object which matches part of the json returned by the Weather API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherSys {

    private ZonedDateTime sunrise;

    private ZonedDateTime sunset;

    public WeatherSys() {
    }

    public ZonedDateTime getSunrise() {
        return sunrise;
    }

    public void setSunrise(ZonedDateTime sunrise) {
        this.sunrise = sunrise;
    }

    public ZonedDateTime getSunset() {
        return sunset;
    }

    public void setSunset(ZonedDateTime sunset) {
        this.sunset = sunset;
    }
}
