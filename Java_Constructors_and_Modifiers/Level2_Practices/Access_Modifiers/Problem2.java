public class Problem2 {
    public static void main(String[] args) {
        Book b1 = new Book(12345, "Java Basics");
        b1.setAuthor("Paulo Coelho");
        b1.displayBookDetails();
        System.out.println("Author: " + b1.getAuthor());
        System.out.println();

        EBook eb = new EBook(67890, "Advanced Java", "PDF");
        eb.displayEBookDetails();
    }
}

class Book {
    public int ISBN;
    protected String title;
    private String author;

    public Book(int ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}

class EBook extends Book {
    String format;

    public EBook(int ISBN, String title, String format) {
        super(ISBN, title);
        this.format = format;
    }

    void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Format: " + format);
    }
}
