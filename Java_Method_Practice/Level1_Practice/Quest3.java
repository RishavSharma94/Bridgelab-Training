import java.util.Scanner;

public class Quest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangular park in meters:");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        int rounds = calculateRounds(side1, side2, side3, 5000); // 5 km = 5000 meters
        System.out.println("The athlete must complete " + rounds + " rounds to cover 5 km.");
        sc.close();
    }

    public static int calculateRounds(double side1, double side2, double side3, double distance) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(distance / perimeter);
    }
}
