public class Quest6{
    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Rishav", "Toyota Corolla", 5);
        CarRental rental2 = new CarRental("Ankit", "Honda City", 3);

        rental1.displayDetails();
        rental2.displayDetails();
    }
}

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotalCost();
    }

    void calculateTotalCost() {
        double ratePerDay = 1000; 
        totalCost = rentalDays * ratePerDay;
    }

    void displayDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + totalCost);
        System.out.println();
    }
}
