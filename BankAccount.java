//Create a BankAccount class with data members accountName, accountHolderName, and balance. Use a constructor to initialize the account details. Create methods to display the account details, deposit money, and withdraw money.
class BankAccount {
    
    String accountName;
    String accountHolderName;
    double balance;
    BankAccount(String accountName, String accountHolderName, double balance) {
        this.accountName = accountName;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void displayDetails() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Amount: " + amount);
        System.out.println("New Balance: " + balance);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Savings Account", "Rahul", 10000);

        account.displayDetails();

        System.out.println("\nAfter Deposit:");
        account.deposit(5000);

        System.out.println("\nAfter Withdrawal:");
        account.withdraw(3000);
    }
}