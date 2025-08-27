import java.util.*;
import java.time.*;
import java.time.format.*; 
// Question 1
public class Built_in_Function_Assignment1 {
//     public static void main(String[] args) {
//         // Current time in system default zone
//         ZonedDateTime current = ZonedDateTime.now();
//         System.out.println("Current System Time: " + current);

//         // GMT
//         ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
//         System.out.println("GMT Time: " + gmt);

//         // IST (Indian Standard Time)
//         ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
//         System.out.println("IST Time: " + ist);

//         // PST (Pacific Standard Time - Los Angeles)
//         ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
//         System.out.println("PST Time: " + pst);
//     }
// }
    

// // Question 2
// // public class Built_in_Function_Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Take date input from user
//         System.out.print("Enter a date (yyyy-mm-dd): ");
//         String input = sc.nextLine();

//         // Convert string to LocalDate
//         LocalDate date = LocalDate.parse(input);

//         // Add 7 days, 1 month, and 2 years
//         LocalDate added = date.plusDays(7).plusMonths(1).plusYears(2);

//         // Subtract 3 weeks
//         LocalDate finalDate = added.minusWeeks(3);

//         // Display results
//         System.out.println("\nOriginal Date: " + date);
//         System.out.println("After Adding 7 days, 1 month, 2 years: " + added);
//         System.out.println("After Subtracting 3 weeks: " + finalDate);
//     }
// }



// // Question 3
 

// // public class Built_in_Function_Assignment1 {
//     public static void main(String[] args) {
//         // Get current date
//         LocalDate currentDate = LocalDate.now();

//         // Define different formats
//         DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//         DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//         DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

//         // Display results
//         System.out.println("Current Date in dd/MM/yyyy format : " + currentDate.format(format1));
//         System.out.println("Current Date in yyyy-MM-dd format : " + currentDate.format(format2));
//         System.out.println("Current Date in EEE, MMM dd, yyyy format : " + currentDate.format(format3));
//     }
// }


// Question 4
// public class Built_in_Function_Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take two date inputs
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String date1Input = sc.next();
        System.out.print("Enter second date (yyyy-MM-dd): ");
        String date2Input = sc.next();

        // Convert input to LocalDate
        LocalDate date1 = LocalDate.parse(date1Input);
        LocalDate date2 = LocalDate.parse(date2Input);

        // Compare dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the SAME.");
        }
    }
// }