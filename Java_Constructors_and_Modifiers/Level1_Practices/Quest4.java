class Quest4 {
    String guestName;
    String roomType;
    int nights;

    Quest4() {
        this("Unknown", "Standard", 1);
    }

    Quest4(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    Quest4(Quest4 other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        Quest4 booking1 = new Quest4();
        Quest4 booking2 = new Quest4("Rishav Sharma", "Deluxe", 3);
        Quest4 booking3 = new Quest4(booking2);

        booking1.display();
        booking2.display();
        booking3.display();
    }
}
