public class Problem1 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rishav", 8.5);
        s1.displayStudentDetails();
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());
        System.out.println();

        PostgraduateStudent pg = new PostgraduateStudent(201, "Ankit", 8.8, "AI");
        pg.displayPGDetails();
    }
}

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
        System.out.println();
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    void displayPGDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA());
    }
}
