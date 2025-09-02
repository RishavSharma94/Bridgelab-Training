import java.util.Scanner;

public class Quest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Logic: Reverse using loop
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Output
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}