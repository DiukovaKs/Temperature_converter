package Diukova.Model;

public class Temperatures {
    public static double convertCelsiusToKelvin(double temperatureInCelsius) {
        return temperatureInCelsius + 273.15;
    }

    public static double convertCelsiusToFahrenheit(double temperatureInCelsius) {
        return temperatureInCelsius * 9 / 5 + 32;
    }

    public static double convertCelsiusToCelsius(double temperatureInCelsius) {
        return temperatureInCelsius;
    }

    public static double convertKelvinToCelsius(double temperatureInKelvin) {
        return temperatureInKelvin - 273.15;
    }

    public static double convertKelvinToFahrenheit(double temperatureInKelvin) {
        return (temperatureInKelvin - 273.5) * 9 / 5 + 32;
    }

    public static double convertKelvinToKelvin(double temperatureInKelvin) {
        return temperatureInKelvin;
    }

    public static double convertFahrenheitToCelsius(double temperatureInFahrenheit) {
        return (temperatureInFahrenheit - 32) * 5 / 9;
    }

    public static double convertFahrenheitToKelvin(double temperatureInFahrenheit) {
        return (temperatureInFahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double convertFahrenheitToFahrenheit(double temperatureInFahrenheit) {
        return temperatureInFahrenheit;
    }
}
