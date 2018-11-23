package com.sunrise.populator;

import com.sunrise.json.WeatherSummary;
import com.sunrise.viewmodel.WeatherDetailsViewModel;

/**
 * Defines the interface for the populator which is used to populate the view model
 */
public interface WeatherDetailsPopulator {
    WeatherDetailsViewModel populate(WeatherSummary weatherSummary);
}
