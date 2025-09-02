import java.util.*;

public class Quest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring to search: ");
        String sub = sc.nextLine();

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length();
        }

        System.out.println("The substring occurs " + count + " times.");
        sc.close();
    }
}