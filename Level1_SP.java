import java.util.*;
// Question 1
public class Level1_SP {
    public static boolean compareString(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;


            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean resultCharAt = compareString(str1, str2);
        boolean resultEquals = str1.equals(str2);
        if(resultEquals == resultCharAt){
            System.out.println(" Both methods give the SAME result");
        }
        else{
            System.out.println("Result are diffrent");
        }
    }
}
    


// Question 2
// public class Level1_SP {
    public static String createSubstring(String str1, int st, int end){
        String result = "";
        for(int i=st; i<end; i++){
            result+=str1.charAt(i);
        }
        return result;
    }
    public static boolean compareString(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;


            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int st = sc.nextInt();
        int end = sc.nextInt();
        String manualSub = createSubstring(str1, st, end);
        String builtSub = str1.substring(st,end);
        boolean compare = compareString(manualSub, builtSub);
        System.out.println(manualSub);
        System.out.println(builtSub);
        System.err.println(compare);
        }
}

// Question 3
// public class Level1_SP {
    public static char[] manualToCharArray(String str1){
        char[] result = new char[str1.length()];
        for(int i=0; i<str1.length(); i++){
           result[i]=str1.charAt(i);
        }
        return result;
    }
    public static boolean compareArray(char[] arr1, char[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]!=arr2[i]){
                return false;


            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        
        char[]  manualArray = manualToCharArray(str1);
        char[] builtArray = str1.toCharArray();
        boolean compare = compareArray(manualArray, builtArray);
        for (char c : manualArray) {
            System.out.print(c + " ");
        }

        
        for (char c : builtArray) {
            System.out.print(c + " ");
        }
        System.err.println(compare);
        }
}


// Question 4
// public class Level1_SP {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // String initialized to null
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {
        String text = null; // String initialized to null
        try {
            // Trying to access method of null object
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}

// Question 5
// public class Level1_SP{

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Trying to access index beyond length of string
        System.out.println("Character at index 10: " + text.charAt(10));
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleException(String text) {
        try {
            // Trying to access index beyond length of string
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        handleException(input);

        sc.close();
    }
}

// Question 6
// public class Level1_SP {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // Start index > End index → IllegalArgumentException
        System.out.println("Substring: " + text.substring(5, 2));
    }
    public static void handleException(String text) {
        try {
            // This will throw IllegalArgumentException
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Generic runtime exception handler
            System.out.println("Caught a RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        handleException(input);

        sc.close();
    }
}

// Question 7
// public class Level1_SP {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not a number
        int number = Integer.parseInt(text);
        System.out.println("Converted Number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Generic RuntimeException handler
            System.out.println("Caught a RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (string): ");
        String input = sc.nextLine();
        handleException(input);

        sc.close();
    }
}

// Question 8
// public class Level1_SP {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing an index larger than array length
        System.out.println("Accessing element at index 5: " + names[5]);
    }
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing element at index 5: " + names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array input from user
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[size];
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }
        handleException(names);

        sc.close();
    }
}

// Question 9
// public class Level_SP {
    public static String manualToUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); 
            }
            result.append(ch);
        }

        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String builtInUpper = input.toUpperCase();

        String manualUpper = manualToUpperCase(input);
        boolean isEqual = compareStrings(builtInUpper, manualUpper);
        System.out.println("Original Text     : " + input);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Manual Uppercase  : " + manualUpper);
        System.out.println("Comparison Result : " + isEqual);

        sc.close();
    }
}


// Question 10
// public class Level1_SP {

    public static String manualToLowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // ASCII difference
            }
            result.append(ch);
        }

        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true; // All characters match
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String builtInLower = input.toLowerCase();

        String manualLower = manualToLowerCase(input);
        boolean isEqual = compareStrings(builtInLower, manualLower);
        System.out.println("Original Text     : " + input);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Manual Lowercase  : " + manualLower);
        System.out.println("Comparison Result : " + isEqual);

        sc.close();
    }
}
