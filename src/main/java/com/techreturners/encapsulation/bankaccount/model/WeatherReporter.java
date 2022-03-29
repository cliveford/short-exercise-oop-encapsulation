package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private final String LOCATION;
    private final double TEMPERATURE;

    public WeatherReporter(String location, double temperature) {
        this.LOCATION = location;
        this.TEMPERATURE = temperature;
    }

    public String printMessage() {

        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", LOCATION, checkLocation(), checkTemperature(), convertToFahrenheit());

    }

    public double convertToFahrenheit() {
        return (9.0 / 5.0) * TEMPERATURE + 32;
    }

    public String checkLocation() {
        return switch (LOCATION) {
            case "London" -> "🌦";
            case "California" -> "🌅";
            case "Cape Town" -> "🌤";
            default -> "🔆";
        };
    }

    public String checkTemperature() {
        if (TEMPERATURE > 30) return "It's too hot 🥵!";
        else if (TEMPERATURE < 10) return "It's too cold 🥶!";
        return "Ahhh...it's just right 😊!";
    }

}
