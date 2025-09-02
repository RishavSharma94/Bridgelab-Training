import java.util.*;

public class Quest12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter the new word: ");
        String newWord = sc.next();

        String result = sentence.replace(oldWord, newWord);

        System.out.println("Modified sentence: " + result);

        sc.close();
    }
}