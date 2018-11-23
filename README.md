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
* You then need to download the Project zip file. To do this:
** Click the "Clone or download" button (the green colour button) and select "Download ZIP".
** Save the zip file (SunriseWeather-master.zip) somewhere on your computer (say in /Users/<yourname>/Projects)
** Extract the zip file in the same location. After extraction, you would see the folder as /Users/<yourname>/Projects/SunriseWeather-master
* Open terminal and go to the root folder of the project
** In other words, go to "cd /Users/<yourname>/Projects/SunriseWeather-master"
* Type the following in terminal and hit enter: mvn spring-boot:run
* The application will be started in a short while.
* Now you can go to the main page of the Sunrise Weather application by typing the following in your browser: http://localhost:8080/weather

Note: If you are using Windows, then the folder paths would be \ instead of a /
This application was developed on a Mac OS, and these "Getting Started" instructions were verified on Windows machine.

## Authors

* Bronnyl Dias



