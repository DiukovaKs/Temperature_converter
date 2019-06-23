package Diukova.Main;

import Diukova.Models.CelsiusScale;
import Diukova.Models.FahrenheitScale;
import Diukova.Models.KelvinScale;
import Diukova.ScaleModelInterface.Scale;

import java.util.HashMap;

public class Converter {
    public Converter() {
    }

    public double convertTemp(double temperature, String fromScale, String toScale) {
        HashMap<String, Scale> scalesMap = new HashMap<>();
        scalesMap.put("Celsius", new CelsiusScale());
        scalesMap.put("Kelvin", new KelvinScale());
        scalesMap.put("Fahrenheit", new FahrenheitScale());

        double temp = scalesMap.get(fromScale).convertToCelsius(temperature);
        return scalesMap.get(toScale).convertFromCelsius(temp);
    }
}


