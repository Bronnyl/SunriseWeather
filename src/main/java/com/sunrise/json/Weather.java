package com.sunrise.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Object which matches part of the json returned by the Weather API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    private String description;

    public Weather() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
