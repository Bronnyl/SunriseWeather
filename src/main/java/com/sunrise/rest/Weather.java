package com.sunrise.rest;

import com.sunrise.json.WeatherSummary;

public interface Weather {
    WeatherSummary getWeatherData(String city);
}
