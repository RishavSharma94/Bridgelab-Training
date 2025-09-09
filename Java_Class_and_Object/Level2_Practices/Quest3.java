class Quest3{
    String text;

    Quest3(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Quest3 p1 = new Quest3("Madam");
        Quest3 p2 = new Quest3("Rishav");

        p1.displayResult();
        p2.displayResult();
    }
}
