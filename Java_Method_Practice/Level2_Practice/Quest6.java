import java.util.Scanner;

public class Quest6 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double f = sc.nextDouble();
        System.out.println("Fahrenheit to Celsius: " + convertFahrenheitToCelsius(f));

        double c = sc.nextDouble();
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(c));

        double pounds = sc.nextDouble();
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(pounds));

        double kilograms = sc.nextDouble();
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(kilograms));

        double gallons = sc.nextDouble();
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(gallons));

        double liters = sc.nextDouble();
        System.out.println("Liters to Gallons: " + convertLitersToGallons(liters));
    }
}
