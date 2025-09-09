class Quest1 {
    String title;
    String author;
    double price;

    Quest1() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Quest1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Quest1 book1 = new Quest1();
        Quest1 book2 = new Quest1("Java Programming", "James Gosling", 450.0);

        book1.display();
        book2.display();
    }
}
