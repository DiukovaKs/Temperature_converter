package Diukova.Model;

public class Kelvin implements Model {

    public double convert(){
        return 0;
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
}
