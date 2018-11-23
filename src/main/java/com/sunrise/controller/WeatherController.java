package com.sunrise.controller;

import com.sunrise.form.WeatherForm;
import com.sunrise.json.WeatherSummary;
import com.sunrise.populator.WeatherDetailsPopulator;
import com.sunrise.rest.Weather;
import com.sunrise.validator.WeatherValidator;
import com.sunrise.viewmodel.WeatherDetailsViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * Handles the weather requests
 */
@Controller
public class WeatherController {

    @Autowired
    private WeatherValidator validator;

    @Autowired
    private WeatherDetailsPopulator populator;

    @Autowired
    private Weather weatherService;

    private static final String FORM_ATTR_NAME = "form";

    @GetMapping("/weather")
    public String weather(Model model) {
        model.addAttribute(FORM_ATTR_NAME, new WeatherForm());
        return "weather";
    }

    @PostMapping("/weather")
    public String weather(Model model, @Valid @ModelAttribute(FORM_ATTR_NAME) WeatherForm form,
                          BindingResult bindingResult) {

        if (!validator.isValidWeatherForm(form, bindingResult)) {
            return "weather";
        }

        WeatherSummary weatherSummary = weatherService.getWeatherData(form.getSelectedCity());
        WeatherDetailsViewModel viewModel = populator.populate(weatherSummary);

        model.addAttribute("viewModel", viewModel);

        return "weather-result";
    }
}
