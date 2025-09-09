public class Problem3 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rishav", "Car");
        Vehicle v2 = new Vehicle("Ankit", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(2000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println();
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
