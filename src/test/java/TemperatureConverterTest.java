
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    private static final double TOLERANCE = 0.001;

    // Celsius to Fahrenheit tests

    @Test
    void convertsFreezingPointToFahrenheit() {
        assertEquals(32.0,
                TemperatureConverter.convertCelsiusToFahrenheit(0.0),
                TOLERANCE);
    }

    @Test
    void convertsBoilingPointToFahrenheit() {
        assertEquals(212.0,
                TemperatureConverter.convertCelsiusToFahrenheit(100.0),
                TOLERANCE);
    }

    // Fahrenheit to Celsius tests

    @Test
    void convertsFreezingPointToCelsius() {
        assertEquals(0.0,
                TemperatureConverter.convertFahrenheitToCelsius(32.0),
                TOLERANCE);
    }

    @Test
    void convertsBoilingPointToCelsius() {
        assertEquals(100.0,
                TemperatureConverter.convertFahrenheitToCelsius(212.0),
                TOLERANCE);
    }

    // Celsius to Kelvin tests

    @Test
    void convertsFreezingPointToKelvin() {
        assertEquals(273.15,
                TemperatureConverter.convertCelsiusToKelvin(0.0),
                TOLERANCE);
    }

    @Test
    void convertsNegativeCelsiusToKelvin() {
        assertEquals(263.15,
                TemperatureConverter.convertCelsiusToKelvin(-10.0),
                TOLERANCE);
    }

    // Bonus edge-case tests

    @Test
    void convertsMinusFortyToFahrenheit() {
        assertEquals(-40.0,
                TemperatureConverter.convertCelsiusToFahrenheit(-40.0),
                TOLERANCE);
    }

    @Test
    void convertsMinusFortyToCelsius() {
        assertEquals(-40.0,
                TemperatureConverter.convertFahrenheitToCelsius(-40.0),
                TOLERANCE);
    }

    @Test
    void convertsAbsoluteZeroToKelvin() {
        assertEquals(0.0,
                TemperatureConverter.convertCelsiusToKelvin(-273.15),
                TOLERANCE);
    }
}
