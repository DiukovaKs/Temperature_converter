package Diukova.Model;

public class Celsius implements Model {
    public double convert(){
        return 0;
    }

    public static double convertCelsiusToKelvin(double temperatureInCelsius) {
        return temperatureInCelsius + 273.15;
    }

    public static double convertCelsiusToFahrenheit(double temperatureInCelsius) {
        return temperatureInCelsius * 9 / 5 + 32;
    }

    public static double convertCelsiusToCelsius(double temperatureInCelsius) {
        return temperatureInCelsius;
    }
  }
