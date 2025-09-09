public class Problem4 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "IT", 50000);
        e1.displayEmployeeDetails();
        e1.setSalary(60000);
        System.out.println("Updated Salary: " + e1.getSalary());
        System.out.println();

        Manager m1 = new Manager(201, "HR", 80000, 10);
        m1.displayManagerDetails();
    }
}

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Salary: " + getSalary());
    }
}
