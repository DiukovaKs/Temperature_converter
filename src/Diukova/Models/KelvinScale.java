package Diukova.Models;

import Diukova.ScaleModelInterface.Scale;

public class KelvinScale implements Scale {
    public KelvinScale() {
    }

    @Override
    public double convertFromCelsius(double temperature) {
        return temperature + 273.15;
    }

    @Override
    public double convertToCelsius(double temperature) {
        return temperature - 273.15;
    }

    public double convertFromKelvin(double temperature) {
        return temperature;
    }
}
