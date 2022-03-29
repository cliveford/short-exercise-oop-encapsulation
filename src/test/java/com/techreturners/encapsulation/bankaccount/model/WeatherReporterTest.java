package com.techreturners.encapsulation.bankaccount.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherReporterTest {

    @Test
    public void checkMessageIsCorrectForLondon() {
        WeatherReporter weatherReporter = new WeatherReporter("London", 8);
        String expected = "I am in London and it is 🌦. It's too cold 🥶!. The temperature in Fahrenheit is 46.4.";
        assertEquals(expected, weatherReporter.printMessage());
    }

    @Test
    public void checkMessageIsCorrectForCalifornia() {
        WeatherReporter weatherReporter = new WeatherReporter("California", 25);
        String expected = "I am in California and it is 🌅. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 77.";
        assertEquals(expected, weatherReporter.printMessage());
    }

    @Test
    public void checkMessageIsCorrectForCapeTown() {
        WeatherReporter weatherReporter = new WeatherReporter("Cape Town", 35);
        String expected = "I am in Cape Town and it is 🌤. It's too hot 🥵!. The temperature in Fahrenheit is 95.";
        assertEquals(expected, weatherReporter.printMessage());
    }

    @Test
    public void checkMessageIsCorrectForOlympusMons() {
        WeatherReporter weatherReporter = new WeatherReporter("Olympus Mons", -60);
        String expected = "I am in Olympus Mons and it is 🔆. It's too cold 🥶!. The temperature in Fahrenheit is -76.";
        assertEquals(expected, weatherReporter.printMessage());
    }


}