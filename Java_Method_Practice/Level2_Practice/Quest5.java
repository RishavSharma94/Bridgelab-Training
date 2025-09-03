import java.util.Scanner;

public class Quest5 {

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double yards = sc.nextDouble();
        System.out.println("Yards to Feet: " + convertYardsToFeet(yards));

        double feet = sc.nextDouble();
        System.out.println("Feet to Yards: " + convertFeetToYards(feet));

        double meters = sc.nextDouble();
        System.out.println("Meters to Inches: " + convertMetersToInches(meters));

        double inches = sc.nextDouble();
        System.out.println("Inches to Meters: " + convertInchesToMeters(inches));

        double inches2 = sc.nextDouble();
        System.out.println("Inches to Centimeters: " + convertInchesToCentimeters(inches2));
    }
}
