class Quest1 {
    String name;
    int rollNumber;
    int marks;

    Quest1(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }

    void display() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Quest1 s1 = new Quest1("Riya", 101, 92);
        Quest1 s2 = new Quest1("Aman", 102, 67);
        Quest1 s3 = new Quest1("Kunal", 103, 45);

        s1.display();
        s2.display();
        s3.display();
    }
}
