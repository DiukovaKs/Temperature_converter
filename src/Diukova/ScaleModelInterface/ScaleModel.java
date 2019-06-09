package Diukova.ScaleModelInterface;

public interface ScaleModel {
    double convertFromCelsius(double temperature);

    double convertFromKelvin(double temperature);

    double convertFromFahrenheit(double temperature);

    static double convertFromKelvinToCelsius(double temperature) {
        return temperature - 273.15;
    }
}
