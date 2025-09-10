import java.util.*;
// public class String1{
//   public static void main(String[] args) {
// Question 1 (Check if two strings are equal (case-sensitive and case-insensitive).
  
  //   Scanner sc = new Scanner(System.in);
  //   String s1 = sc.nextLine();
  //   String s2 = sc.nextLine();
  //   if(s1.equals(s2)){
  //       System.out.println("Equal case-sensitive");
  //   }
  //   else{
  //       System.out.println("Not equal case-sensitive");
  //   }
  // }


  //Question 2 (Convert a string to uppercase without using toUpperCase() (ASCII based).
//   public class String1{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String input = sc.nextLine();
//         String result = "";

//         for (int i = 0; i < input.length(); i++) {
//             char ch = input.charAt(i);

//             // check if character is lowercase (a-z)
//             if (ch >= 'a' && ch <= 'z') {
//                 // convert to uppercase by subtracting 32
//                 result += (char)(ch - 32);
//             } else {
//                 // keep as it is (numbers, spaces, uppercase, symbols)
//                 result += ch;
//             }
//         }

//         System.out.println("Original String: " + input);
//         System.out.println("Uppercase String: " + result);
//     }
// }


// Question 3( Count the number of vowels in a string.)
// public class String1{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String input = sc.nextLine();
        
//         int count = 0;
//         String vowels = "aeiouAEIOU";

//         for (int i = 0; i < input.length(); i++) {
//             char ch = input.charAt(i);
//             if (vowels.indexOf(ch) != -1) {  // if character is in vowels
//                 count++;
//             }
//         }

//         System.out.println("Number of vowels: " + count);

//         sc.close();
//   }
// }


// Question 4 (Find the length of a string without using .length().)

// public class String1{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String str = sc.nextLine();
//     char[] arr = str.toCharArray();
//         int count = 0;

//         for (char c : arr) {
//             count++;
//         }

//         System.out.println("Length of string: " + count);
// }
// }


// Question 5(Check if a string is a palindrome.)
// public class String1{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String str = sc.nextLine();
//     boolean isPalindrome = true;

//         int i = 0, j = str.length() - 1;
//         while (i < j) {
//             if (str.charAt(i) != str.charAt(j)) {
//                 isPalindrome = false;
//                 break;
//             }
//             i++;
//             j--;
//         }

//         if (isPalindrome) {
//             System.out.println(str + " is a Palindrome.");
//         } else {
//             System.out.println(str + " is NOT a Palindrome.");
//         }

    
// }
// }

// Question 6(Find the first non-repeating character in a string.)
// public class String1{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String str = sc.nextLine();
//     boolean found = false;

//         for (int i = 0; i < str.length(); i++) {
//             boolean isRepeating = false;

//             for (int j = 0; j < str.length(); j++) {
//                 if (i != j && str.charAt(i) == str.charAt(j)) {
//                     isRepeating = true;
//                     break;
//                 }
//             }

//             if (!isRepeating) {
//                 System.out.println("First non-repeating character: " + str.charAt(i));
//                 found = true;
//                 break;
//             }
//         }

//         if (!found) {
//             System.out.println("No non-repeating character found.");
//         }
//     }    
// }


// Question 7(Count the number of words in a string (use StringTokenizer).)
// public class String1{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String str = sc.nextLine();
//     StringTokenizer st = new StringTokenizer(str);

//         int count = st.countTokens();

//         System.out.println("Number of words: " + count);

//         sc.close();
//     }
// }

// Question 8 (Replace all spaces with hyphens in a string.)
// public class String1{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String str = sc.nextLine();
//      String result = "";
        
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
            
//             if (ch == ' ') {
//                 result += '-';   // replace space with hyphen
//             } else {
//                 result += ch;
//             }
//         }
        
//         System.out.println("Modified String: " + result);
        
//         sc.close();
//     }
// }

// Question 9 (Find the ASCII value of each character in a string.)
// public class String1{
//   public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);   
//             int ascii = (int) ch;      // convert to ASCII
//             System.out.println(ch + "          " + ascii);
//         }
//       }
//     }


// Question 10(Reverse each word in a sentence (e.g., "Hello World" → "olleH dlroW")
// public class String1{
//   public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String sentence = sc.nextLine();
//         String[] words = sentence.split(" ");
//         StringBuilder result = new StringBuilder();

//         for (String word : words) {
//             char[] chars = word.toCharArray();
//             for (int i = chars.length - 1; i >= 0; i--) {
//                 result.append(chars[i]);
//             }
//             result.append(" ");
//         }

//         System.out.println("Reversed words: " + result.toString().trim());
//         sc.close();
//     }
// }


// Question 11 ()
// public class String1{
//   public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//          String result = "";

//         for (int i = 0; i < str.length(); i++) {
//             char c = str.charAt(i);

//             // check if 'c' already exists in result
//             boolean alreadyAdded = false;
//             for (int j = 0; j < result.length(); j++) {
//                 if (result.charAt(j) == c) {
//                     alreadyAdded = true;
//                     break;
//                 }
//             }

//             // if not present, add it
//             if (!alreadyAdded) {
//                 result += c;
//             }
//         }

//         System.out.println("String without duplicates: " + result);
//         
//     }
// }


// Question 12(Check if two strings are anagrams.)
// public class String1{
//   public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str1 = sc.nextLine();
//         String str2 = sc.nextLine();
//         if(str1.length()!=str2.length()){
//           System.out.println("not Anagram");
//         }
        
//         char[] s1= str1.toCharArray();
//         char[] s2= str2.toCharArray();
//         Arrays.sort(s1);
//         Arrays.sort(s2);
//         if(s1.equals(s2)){
//           System.out.println("Anagram");
//         }
//         else{
//           System.out.println("Not Anagram");
//         }
//       }
//     }


// Question 13(Remove all digits from a string.)