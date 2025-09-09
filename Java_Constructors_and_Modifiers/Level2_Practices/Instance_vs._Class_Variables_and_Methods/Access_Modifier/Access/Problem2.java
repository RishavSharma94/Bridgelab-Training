public class Problem2 {
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", "3 months", 15000);
        Course c2 = new Course("Python Programming", "2 months", 12000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Tech Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

class Course {
    String courseName;
    String duration;
    double fee;
    static String instituteName = "Default Institute";

    public Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println();
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
