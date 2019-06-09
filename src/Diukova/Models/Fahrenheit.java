package Diukova.Models;

import Diukova.ScaleModelInterface.ScaleModel;

public class Fahrenheit implements ScaleModel {
    public Fahrenheit() {
    }

    @Override
    public double convertFromCelsius(double temperature) {
        return temperature * 9 / 5 + 32;
    }

    @Override
    public double convertFromKelvin(double temperature) {
        temperature = convertFromKelvinToCelsius(temperature);
        temperature = convertFromCelsius(temperature);
        return temperature;
    }

    @Override
    public double convertFromFahrenheit(double temperature) {
        return temperature;
    }

    private static double convertFromKelvinToCelsius(double temperature) {
        return temperature - 273.15;
    }

    public double convertToCelsius(double temperature) {
        temperature = convertToKelvin(temperature);
        temperature = convertFromKelvinToCelsius(temperature);
        return temperature;
    }

    public double convertToKelvin(double temperature) {
        return (temperature - 32) * 5 / 9 + 273.15;
    }
}
