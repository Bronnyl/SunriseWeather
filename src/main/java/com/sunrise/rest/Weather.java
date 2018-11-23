package com.sunrise.rest;

import com.sunrise.json.WeatherSummary;

/**
 * Defines the interface for retrieving the Weather data
 */
public interface Weather {
    WeatherSummary getWeatherData(String city);
}
