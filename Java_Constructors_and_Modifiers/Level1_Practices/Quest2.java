class Quest2 {
    double radius;

    Quest2() {
        this(1.0);
    }

    Quest2(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }

    public static void main(String[] args) {
        Quest2 circle1 = new Quest2();
        Quest2 circle2 = new Quest2(5.0);

        circle1.display();
        circle2.display();
    }
}
