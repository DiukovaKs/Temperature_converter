package Diukova.Temperatures;

public class Temperatures {
    public static boolean isDigit(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.') {
                if (s.charAt(i) == '.') {
                    count++;
                }
                if (count > 1) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
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
