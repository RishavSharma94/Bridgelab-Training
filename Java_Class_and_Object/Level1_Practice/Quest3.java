class Quest3 {
    String title;
    String author;
    double price;

    Quest3(String title, String author, double price) {
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
        Quest3 b = new Quest3("Java Programming", "James Gosling", 450.0);
        b.display();
    }
}
