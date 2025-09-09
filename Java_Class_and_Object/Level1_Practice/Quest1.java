class Quest1 {
    String name;
    int id;
    double salary;

    Quest1(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Quest1 emp1 = new Quest1("Rohit", 101, 50000);
        emp1.displayDetails();
    }
}
