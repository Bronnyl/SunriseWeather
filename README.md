# Project Title

A website which returns the current weather data based on a city chosen by the user.

Currently supports:
* London
* Hong Kong

### TODOs (and Known Issues)
* The temperature returned in Fahrenheit by OpenWeatherMap.org API seems a bit weird. For example, for London, it returns 279.75 Fahrenheit (which in Celsius is 137.64)
This does not seem right and needs investigation.

The Json returned by the API does not contain any other field which could be considered as the temperature in Fahrenheit.
Even the min and max temperatures appear to be wrong

* Unit tests are not written to cover this functionality. This needs to be done.

### Getting Started

* Ensure you have Java 8 and Maven 3.3.x installed on your machine.
* Clone the repo
* Open terminal and go to the root folder of the project (ie on the same level as the src subdirectory)
* Type: mvn spring-boot:run (and then hit enter)
* The application will be started
* Now you can go to the main page by typing the following in your browser: http://localhost:8080/weather

## Authors

* Bronnyl Dias



