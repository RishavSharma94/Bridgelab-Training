class Quest4 {
    int itemCode;
    String itemName;
    double price;

    Quest4(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    double totalCost(int quantity) {
        return price * quantity;
    }

    void display(int quantity) {
        System.out.println("Item Details:");
        System.out.println("Code: " + itemCode);
        System.out.println("Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost(quantity));
    }

    public static void main(String[] args) {
        Quest4 item = new Quest4(101, "Laptop", 55000);
        item.display(2);
    }
}
