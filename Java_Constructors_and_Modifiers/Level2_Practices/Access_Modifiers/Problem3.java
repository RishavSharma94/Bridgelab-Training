public class Problem3 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Rishav", 50000);
        acc1.displayAccountDetails();
        acc1.deposit(10000);
        acc1.withdraw(20000);
        System.out.println("Updated Balance: " + acc1.getBalance());
        System.out.println();

        SavingsAccount savAcc = new SavingsAccount(201, "Ankit", 30000, 5.0);
        savAcc.displaySavingsDetails();
    }
}

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displaySavingsDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Balance: " + getBalance());
    }
}
