public class Problem1{
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Smartphone", 20000);
        Product p3 = new Product("Headphones", 1500);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        Product.displayTotalProducts();
    }
}

class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println();
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
