package com.sunrise.populator;

import com.sunrise.data.SupportedCities;
import com.sunrise.json.Weather;
import com.sunrise.json.WeatherSummary;
import com.sunrise.util.Util;
import com.sunrise.viewmodel.WeatherDetailsViewModel;
import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.stream.Collectors;

import static com.sunrise.errors.WeatherErrors.CITY_NOT_SUPPORTED;

@Component
public class WeatherDetailsPopulatorImpl implements WeatherDetailsPopulator {

    @Override
    public WeatherDetailsViewModel populate(WeatherSummary weatherSummary) {

        String temperatureInFahrenheit = weatherSummary.getMain().getTemperatureInFahrenheit();
        String city = weatherSummary.getCity();
        ZoneId zoneId = ZoneId.of(getZone(city));

        WeatherDetailsViewModel viewModel = new WeatherDetailsViewModel();
        viewModel.setDate(weatherSummary.getDt().withZoneSameInstant(zoneId).format(DateTimeFormatter.ofPattern("dd/MMM/yyyy")));
        viewModel.setCity(city);
        viewModel.setDescription(Arrays.stream(weatherSummary.getWeather()).map(Weather::getDescription).collect(Collectors.joining(", ")));
        viewModel.setTemperatureInFahrenheit(temperatureInFahrenheit);
        viewModel.setTemperatureInCelsius(Util.convertFahrenheitToCelsius(temperatureInFahrenheit));
        viewModel.setSunrise(Util.getTimeIn12HourFormatInRequiredZone(weatherSummary.getSys().getSunrise(), zoneId));
        viewModel.setSunset(Util.getTimeIn12HourFormatInRequiredZone(weatherSummary.getSys().getSunset(), zoneId));

        return viewModel;
    }

    private String getZone(String city) {
        return Arrays.stream(SupportedCities.values())
                .filter(supportedCity -> supportedCity.getDisplayName().equalsIgnoreCase(city))
                .findAny()
                .orElseThrow(() -> new IllegalStateException(CITY_NOT_SUPPORTED))
                .getZone();
    }
}
