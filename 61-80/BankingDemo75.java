// Base class Account
class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw " + amount);
        }
    }

    public void displayBalance() {
        System.out.println("Account " + accountNumber + " Balance: " + balance);
    }
}

// Derived class SavingsAccount
class SavingsAccount extends Account {
    private double interestRate; // e.g., 5% = 0.05

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest + ", New Balance: " + balance);
    }
}

// Derived class CurrentAccount
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Cannot withdraw " + amount + ". Exceeds overdraft limit.");
        }
    }
}

// Main program
public class BankingDemo75 {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("SA123", 10000, 0.05);
        Account current = new CurrentAccount("CA456", 5000, 2000);

        // Demonstrate polymorphism
        Account[] accounts = {savings, current};

        // Deposits
        for (Account acc : accounts) {
            acc.deposit(2000);
        }

        // Withdrawals
        for (Account acc : accounts) {
            acc.withdraw(6000);
        }

        // Add interest for savings account
        if (savings instanceof SavingsAccount) {
            ((SavingsAccount) savings).addInterest();
        }

        // Display final balances
        for (Account acc : accounts) {
            acc.displayBalance();
        }
    }
}
