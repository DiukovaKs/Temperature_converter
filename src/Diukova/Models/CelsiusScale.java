package Diukova.Models;

import Diukova.ScaleModelInterface.Scale;

public class CelsiusScale implements Scale {
    @Override
    public double convertToCelsius(double temperature) {
        return temperature;
    }

    @Override
    public double convertFromCelsius(double temperature) {
        return temperature;
    }
}


