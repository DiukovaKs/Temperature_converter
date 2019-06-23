package Diukova.Models;

import Diukova.ScaleModelInterface.Scale;

public class FahrenheitScale implements Scale {
    @Override
    public double convertFromCelsius(double temperature) {
        return temperature * 9 / 5 + 32;
    }

    @Override
    public double convertToCelsius(double temperature) {
        return (temperature - 32) * 5 / 9;
    }
}
