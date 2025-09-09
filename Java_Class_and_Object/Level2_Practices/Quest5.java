import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double totalCost() {
        return price * quantity;
    }
}

class Quest5 {
    ArrayList<CartItem> cart;

    Quest5() {
        cart = new ArrayList<>();
    }

    void addItem(String itemName, double price, int quantity) {
        cart.add(new CartItem(itemName, price, quantity));
        System.out.println(quantity + " " + itemName + "(s) added to the cart.");
    }

    void removeItem(String itemName) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(itemName)) {
                cart.remove(i);
                System.out.println(itemName + " removed from the cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in the cart.");
    }

    void displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.totalCost();
        }
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        Quest5 cartSystem = new Quest5();
        cartSystem.addItem("Laptop", 55000, 1);
        cartSystem.addItem("Mouse", 500, 2);
        cartSystem.displayTotalCost();
        cartSystem.removeItem("Mouse");
        cartSystem.displayTotalCost();
    }
}
