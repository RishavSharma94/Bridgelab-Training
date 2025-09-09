class Quest5 {
    String brand;
    String model;
    double price;

    Quest5(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Quest5 phone1 = new Quest5("Samsung", "Galaxy S24", 79999);
        Quest5 phone2 = new Quest5("Apple", "iPhone 15", 129999);

        phone1.display();
        phone2.display();
    }
}
