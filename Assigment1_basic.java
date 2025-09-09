// Question 1
// class Car {
//     String brand;       // Instance variable
//     int speed;          // Instance variable
//     static int wheels = 4; // Static variable
// }

// Question 2
// public class Assignment_basic {
//     String brand;                 // Instance variable
//     int speed;                     // Instance variable
//     static int wheels = 4;         // Static variable

    
//     Assignment_basic(String brand, int speed) {
//         this.brand = brand;
//         this.speed = speed;
//     }

    
//     void displayDetails() {
//         System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h, Wheels: " + wheels);
//     }

//     public static void main(String[] args) {
        
//         Assignment_basic car1 = new Assignment_basic("Toyota", 180);
//         Assignment_basic car2 = new Assignment_basic("BMW", 220);
//         Assignment_basic car3 = new Assignment_basic("Honda", 160);

        
//         car1.displayDetails();
//         car2.displayDetails();
//         car3.displayDetails();
//     }
// }

// Question 3
// public class Assignment_basic {
//     String brand;
//     static int wheels = 4; // static variable shared among all objects

//     Assignment_basic(String brand) {
//         this.brand = brand;
//     }

//     void display() {
//         System.out.println("Brand: " + brand + ", Wheels: " + wheels);
//     }

//     public static void main(String[] args) {
//         Assignment_basic car1 = new Assignment_basic("BMW");
//         Assignment_basic car2 = new Assignment_basic("Audi");
//         Assignment_basic car3 = new Assignment_basic("Tesla");

//         // changing wheels using one object
//         car1.wheels = 6;

//         car1.display();
//         car2.display();
//         car3.display();
//     }
// }


// Question 4
// public class Assignment_basic {
//     String name;
//     int marks;

//     Assignment_basic(String name, int marks) {
//         this.name = name;
//         this.marks = marks;
//     }

//     void checkResult() {
//         if (marks >= 40) {
//             System.out.println(name + " passed");
//         } else {
//             System.out.println(name + " failed");
//         }
//     }

//     public static void main(String[] args) {
//         Assignment_basic s1 = new Assignment_basic("Ravi", 55);
//         Assignment_basic s2 = new Assignment_basic("Anita", 38);

//         s1.checkResult();
//         s2.checkResult();
//     }
// }


// Question 5
// public class Assignment_basic {
//     String name; // Instance variable

//     Assignment_basic(String name) {
//         this.name = name; // this keyword to set instance variable
//     }

//     void showName() {
//         String name = "Local Name"; // Local variable
//         System.out.println("Local variable: " + name);
//         System.out.println("Instance variable: " + this.name);
//     }

//     public static void main(String[] args) {
//         Assignment_basic obj = new Assignment_basic("Instance Name");
//         obj.showName();
//     }
// }


// Question 6
// public class Assignment_basic {
//     void showVariable() {
//         int num; // Local variable declared but not initialized
//         System.out.println(num); // ❌ Compiler error
//     }

//     public static void main(String[] args) {
//         Assignment_basic obj = new Assignment_basic();
//         obj.showVariable();
//     }
// }


// Question 7
// public class Assignment_basic {
//     double length;
//     double width;

//     // Parameterized constructor
//     public Assignment_basic(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }

//     // Method to calculate area
//     public double calculateArea() {
//         return length * width;
//     }

//     // Method to calculate perimeter
//     public double calculatePerimeter() {
//         return 2 * (length + width);
//     }

//     // Method to display details
//     public void display() {
//         System.out.println("Length: " + length);
//         System.out.println("Width: " + width);
//         System.out.println("Area: " + calculateArea());
//         System.out.println("Perimeter: " + calculatePerimeter());
//     }

//     public static void main(String[] args) {
//         Assignment_basic rect = new Assignment_basic(5.0, 3.0);
//         rect.display();
//     }
// }



// Question 8
