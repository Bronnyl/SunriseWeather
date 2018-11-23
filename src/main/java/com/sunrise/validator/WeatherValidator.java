package com.sunrise.validator;

import com.sunrise.data.SupportedCities;
import com.sunrise.form.WeatherForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.Arrays;

import static com.sunrise.errors.WeatherErrors.CITY_NOT_SUPPORTED;

/**
 * Validator to validate the input specified by the user
 */
@Component
public class WeatherValidator {

    public boolean isValidWeatherForm(WeatherForm form, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return false;
        }

        if (Arrays.stream(SupportedCities.values()).noneMatch(supportedCity -> supportedCity.getDisplayName().equalsIgnoreCase(form.getSelectedCity()))) {
            bindingResult.addError(new FieldError("form", "selectedCity", CITY_NOT_SUPPORTED));
            return false;
        }

        return true;
    }
}
