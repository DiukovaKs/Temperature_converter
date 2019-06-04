package Diukova.Model;

public class Fahrenheit implements Model {

    public double convert(){
        return 0;
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
