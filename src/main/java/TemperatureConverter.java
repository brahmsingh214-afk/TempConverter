
public class TemperatureConverter {

    private static final double FAHRENHEIT_OFFSET = 32.0;
    private static final double FAHRENHEIT_RATIO = 9.0 / 5.0;
    private static final double CELSIUS_RATIO = 5.0 / 9.0;
    private static final double KELVIN_OFFSET = 273.15;

    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * FAHRENHEIT_RATIO + FAHRENHEIT_OFFSET;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_OFFSET) * CELSIUS_RATIO;
    }

    public static double convertCelsiusToKelvin(double celsius) {
        return celsius + KELVIN_OFFSET;
    }
}
