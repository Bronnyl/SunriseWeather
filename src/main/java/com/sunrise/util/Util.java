package com.sunrise.util;

import java.math.BigDecimal;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * A utility class to provide commonly used functions
 */
public class Util {

    public static String convertFahrenheitToCelsius(String temperatureInFahrenheit) {
        BigDecimal fahrenheit = new BigDecimal(temperatureInFahrenheit);
        return (fahrenheit.subtract(new BigDecimal(32))).multiply(new BigDecimal(5)).divide(new BigDecimal(9), 2, BigDecimal.ROUND_HALF_UP).toString();
    }

    public static String getTimeIn12HourFormatInRequiredZone(ZonedDateTime zonedDateTimeInUtc, ZoneId zoneId) {
        return zonedDateTimeInUtc.withZoneSameInstant(zoneId).format(DateTimeFormatter.ofPattern("h:mma")).toLowerCase();
    }
}
