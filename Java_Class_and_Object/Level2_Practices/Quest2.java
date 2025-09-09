class Quest2{
    String accountHolder;
    long accountNumber;
    double balance;

    Quest2(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current Balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Current Balance: " + balance);
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Quest2 acc = new Quest2("Rishav Sharma", 1234567890L, 50000);
        acc.displayBalance();
        acc.deposit(10000);
        acc.withdraw(20000);
        acc.withdraw(50000);
    }
}
