package Diukova.Models;

import Diukova.ScaleModelInterface.ScaleModel;

public class Kelvin implements ScaleModel {
    public Kelvin() {
    }

    @Override
    public double convertFromCelsius(double temperature) {
        return temperature + 273.15;
    }

    @Override
    public double convertFromKelvin(double temperature) {
        return temperature;
    }

    @Override
    public double convertFromFahrenheit(double temperature) {
        return ((temperature - 32) * 5 / 9) + 273.15;
    }

    private static double convertFromKelvinToCelsius(double temperature) {
        return temperature - 273.15;
    }

    public double convertToCelsius(double temperature) {
        return convertFromKelvinToCelsius(temperature);
    }
}
