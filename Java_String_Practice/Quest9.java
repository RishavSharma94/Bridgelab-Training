import java.util.*;

public class Quest9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        char mostFrequent = ' ';
        int maxCount = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                mostFrequent = (char) i;
            }
        }

        System.out.println("Most frequent character: " + mostFrequent);
        System.out.println("Frequency: " + maxCount);

        sc.close();
    }
}