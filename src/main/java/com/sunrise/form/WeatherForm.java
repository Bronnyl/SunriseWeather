package com.sunrise.form;

import javax.validation.constraints.NotBlank;

import static com.sunrise.errors.WeatherErrors.CITY_CANNOT_BE_BLANK;

/**
 * Captures the selected city by the user
 */
public class WeatherForm {

    @NotBlank(message = CITY_CANNOT_BE_BLANK)
    private String selectedCity;

    public String getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }
}
