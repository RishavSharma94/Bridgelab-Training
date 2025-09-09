class Quest4 {
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked;

    Quest4(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.isBooked = false;
    }

    void bookTicket(int seatNumber) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            isBooked = true;
            System.out.println("Ticket booked successfully for seat " + seatNumber);
        } else {
            System.out.println("Seat already booked!");
        }
    }

    void displayTicket() {
        if (isBooked) {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        } else {
            System.out.println("No ticket booked yet for " + movieName);
        }
    }

    public static void main(String[] args) {
        Quest4 ticket1 = new Quest4("Avengers: Endgame", 300);
        Quest4 ticket2 = new Quest4("Spider-Man: No Way Home", 250);

        ticket1.bookTicket(5);
        ticket1.displayTicket();

        ticket2.displayTicket();
        ticket2.bookTicket(10);
        ticket2.displayTicket();
    }
}
