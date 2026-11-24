
import java.util.Scanner;

public class TempConvProgram {

    private static final int CELSIUS_TO_FAHRENHEIT = 1;
    private static final int FAHRENHEIT_TO_CELSIUS = 2;
    private static final int CELSIUS_TO_KELVIN = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Welcome to Temperature Converter!");

            while (true) {

                displayMenu();

                int userChoice = readMenuChoice(scanner);

                if (userChoice == EXIT) {
                    System.out.println(
                            "Thank you for using Temperature Converter!");
                    break;
                }

                double temperature = readTemperature(scanner);

                performConversion(userChoice, temperature);
            }
        }
    }

    private static void displayMenu() {

        System.out.println("\n===== Temperature Converter =====");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Exit");
    }

    private static int readMenuChoice(Scanner scanner) {

        while (true) {

            System.out.print("Enter your choice (1-4): ");

            String input = scanner.nextLine().trim();

            try {
                int userChoice = Integer.parseInt(input);

                if (userChoice >= CELSIUS_TO_FAHRENHEIT
                        && userChoice <= EXIT) {
                    return userChoice;
                }

            } catch (NumberFormatException ignored) {
                // Invalid input is handled below.
            }

            System.out.println(
                    "Invalid choice. Please enter a number between 1 and 4.");
        }
    }

    private static double readTemperature(Scanner scanner) {

        while (true) {

            System.out.print("Enter the temperature: ");

            String input = scanner.nextLine().trim();

            try {
                double temperature = Double.parseDouble(input);

                if (Double.isFinite(temperature)) {
                    return temperature;
                }

            } catch (NumberFormatException ignored) {
                // Invalid input is handled below.
            }

            System.out.println(
                    "Invalid temperature. Please enter a valid number.");
        }
    }

    private static void performConversion(int userChoice,
                                          double temperature) {

        double result;
        String unit;

        switch (userChoice) {

            case CELSIUS_TO_FAHRENHEIT:
                result = TemperatureConverter
                        .convertCelsiusToFahrenheit(temperature);
                unit = "F";
                break;

            case FAHRENHEIT_TO_CELSIUS:
                result = TemperatureConverter
                        .convertFahrenheitToCelsius(temperature);
                unit = "C";
                break;

            case CELSIUS_TO_KELVIN:
                result = TemperatureConverter
                        .convertCelsiusToKelvin(temperature);
                unit = "K";
                break;

            default:
                System.out.println("Invalid conversion choice.");
                return;
        }

        System.out.printf("Converted temperature: %.2f %s%n",
                result, unit);
    }
}
