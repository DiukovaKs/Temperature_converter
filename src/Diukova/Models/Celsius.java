package Diukova.Models;

import Diukova.ScaleModelInterface.ScaleModel;

public class Celsius implements ScaleModel {
    public Celsius() {
    }

    @Override
    public double convertFromCelsius(double temperature) {
        return temperature;
    }

    @Override
    public double convertFromKelvin(double temperature) {
        return temperature - 273.15;
    }

    @Override
    public double convertFromFahrenheit(double temperature) {
        return (temperature - 32) * 5 / 9;
    }
}
