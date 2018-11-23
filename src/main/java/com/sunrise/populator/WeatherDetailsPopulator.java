package com.sunrise.populator;

import com.sunrise.json.WeatherSummary;
import com.sunrise.viewmodel.WeatherDetailsViewModel;

public interface WeatherDetailsPopulator {
    WeatherDetailsViewModel populate(WeatherSummary weatherSummary);
}
