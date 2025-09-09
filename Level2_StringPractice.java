import java.util.*;
// Question 1
public class Level2_StringPractice {
    public static int findLength(String text) {
        int count = 0;
        for (char c : text.toCharArray()) { 
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int customLength = findLength(input);

        int builtInLength = input.length();
        System.out.println("Custom Method Length: " + customLength);
        System.out.println("Built-in length() Result: " + builtInLength);

        sc.close();
    }
}
    

// Question 2
// public class Level2_StringPractice {

    public class Level2_StringPractice {

    public static String[] manualSplit(String text) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (current.length() > 0) {
                    words.add(current.toString());
                    current.setLength(0);
                }
            } else {
                current.append(ch);
            }
        }
        if (current.length() > 0) words.add(current.toString());

        return words.toArray(new String[0]);
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] builtInSplit = input.split(" ");
        String[] manualSplit = manualSplit(input);
        System.out.println(compareArrays(builtInSplit, manualSplit));
        sc.close();
    }
}


// Question 3
// public class Level2_StringPractice {

    public static String[] manualSplit(String text) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (current.length() > 0) {
                    words.add(current.toString());
                    current.setLength(0);
                }
            } else {
                current.append(ch);
            }
        }
        if (current.length() > 0) words.add(current.toString());
        return words.toArray(new String[0]);
    }

    public static int findLength(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            count++;
        }
        return count;
    }

    public static String[][] mapWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = manualSplit(input);
        String[][] wordLengths = mapWordLengths(words);

        System.out.println("Word\tLength");
        for (String[] row : wordLengths) {
            System.out.println(row[0] + "\t" + Integer.valueOf(row[1]));
        }

        sc.close();
    }
// }

// Question 4
// public class Level2_StringPractice {

    // Method to split string manually
    public static String[] manualSplit(String text) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (current.length() > 0) {
                    words.add(current.toString());
                    current.setLength(0);
                }
            } else {
                current.append(ch);
            }
        }
        if (current.length() > 0) {
            words.add(current.toString());
        }
        return words.toArray(new String[0]);
    }

    // Method to calculate length of string without using length()
    public static int findLength(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to map each word with its length
    public static String[][] mapWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest word from 2D array
    public static int[] findShortestAndLongest(String[][] wordLengths) {
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < wordLengths.length; i++) {
            int len = Integer.valueOf(wordLengths[i][1]);
            int minLen = Integer.valueOf(wordLengths[minIndex][1]);
            int maxLen = Integer.valueOf(wordLengths[maxIndex][1]);

            if (len < minLen) {
                minIndex = i;
            }
            if (len > maxLen) {
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = manualSplit(input);
        String[][] wordLengths = mapWordLengths(words);
        int[] result = findShortestAndLongest(wordLengths);

        System.out.println("Word\tLength");
        for (String[] row : wordLengths) {
            System.out.println(row[0] + "\t" + Integer.valueOf(row[1]));
        }

        System.out.println("\nShortest Word: " + wordLengths[result[0]][0]);
        System.out.println("Longest Word: " + wordLengths[result[1]][0]);

        sc.close();
    }
// }

// Question 5
// public class Level2_StringPractice {

    // Method to check whether a character is Vowel, Consonant or Not a Letter
    public static String checkCharType(char ch) {
        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = checkCharType(ch);

            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] result = countVowelsConsonants(input);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

        sc.close();
    }
// }

// Question 6
// public class Level2_StringPractice {

    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] findCharTypes(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }
        return result;
    }

    public static void display2DArray(String[][] arr) {
        System.out.println("Character\tType");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[][] result = findCharTypes(input);
        display2DArray(result);
        sc.close();
    }
// }

// Question 7
// public class Level2_StringPractice {

    public static int[] findTrimIndexes(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        int[] indexes = findTrimIndexes(input);
        String manualTrimmed = manualSubstring(input, indexes[0], indexes[1]);
        String builtInTrimmed = input.trim();

        System.out.println("Manual Trimmed: " + manualTrimmed);
        System.out.println("Built-in Trimmed: " + builtInTrimmed);
        System.out.println("Are both same? " + compareStrings(manualTrimmed, builtInTrimmed));

        sc.close();
    }
// }

// Question 8
// public class VotingEligibility {

    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // random 2-digit age (10–99)
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "False"; // invalid negative age
            } else if (ages[i] >= 18) {
                result[i][1] = "True";  // can vote
            } else {
                result[i][1] = "False"; // cannot vote
            }
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("Age\tCan Vote?");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; // fixed for 10 students
        int[] ages = generateAges(n);
        String[][] eligibility = checkVotingEligibility(ages);

        displayTable(eligibility);
        sc.close();
    }
// }


