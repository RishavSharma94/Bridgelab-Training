public class Quest5 {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 300);
        Book book2 = new Book("1984", "George Orwell", 250, false);

        book1.borrow();
        book2.borrow();
    }
}

class Book {
    String title;
    String author;
    double price;
    boolean available;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed '" + title + "'.");
        } else {
            System.out.println("Sorry, '" + title + "' is currently not available.");
        }
    }
}
