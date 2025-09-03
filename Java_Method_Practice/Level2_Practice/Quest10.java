import java.util.Scanner;

public class Quest10 {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; 
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; 

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble(); 
            data[i][1] = sc.nextDouble(); 
        }

        calculateBMI(data);
        String[] status = determineBMIStatus(data);

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + 
                " -> Weight: " + data[i][0] + " kg, Height: " + data[i][1] + " cm, BMI: " 
                + String.format("%.2f", data[i][2]) + ", Status: " + status[i]);
        }
    }
}
