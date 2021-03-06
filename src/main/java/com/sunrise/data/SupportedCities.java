package com.sunrise.data;

/**
 * Enum to indicate which cities are currently supported by the application
 */
public enum SupportedCities {
    LONDON("London", "Europe/London"),
    HONG_KONG("Hong Kong", "Hongkong");

    private String displayName;
    private String zone;

    SupportedCities(String displayName, String zone) {
        this.displayName = displayName;
        this.zone = zone;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getZone() {
        return zone;
    }
}
