package com.sunrise.rest;

import com.sunrise.json.WeatherSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Implementation to fetch the Weather data from api.openweathermap.org
 */
@Service
public class WeatherImpl implements Weather {

    @Autowired
    private RestTemplate restTemplate;

    private static final String GET_WEATHER_BY_CITY_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&APPID=%s";
    private static final String API_KEY = "029492aeb2883c7c0f05635146f576b0";

    @Override
    public WeatherSummary getWeatherData(String city) {
        return callWeatherApi(city);
    }

    private WeatherSummary callWeatherApi(String city) {
        return restTemplate.getForObject(constructUrl(city), WeatherSummary.class);
    }

    private String constructUrl(String city) {
        return String.format(GET_WEATHER_BY_CITY_URL, city, API_KEY);
    }
}
