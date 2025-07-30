interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) balance -= amount;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04;

    SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    public void applyForLoan() {
        System.out.println("Savings account loan applied.");
    }

    public double calculateLoanEligibility() {
        return getBalance() * 5;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.01;

    CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    public void applyForLoan() {
        System.out.println("Current account loan applied.");
    }

    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}

public class Bankingsystem {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = new SavingsAccount("SB1001", "Ravi", 50000);
        accounts[1] = new CurrentAccount("CA2001", "Anjali", 100000);

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("Interest: ₹" + acc.calculateInterest());
            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                loan.applyForLoan();
                System.out.println("Loan Eligibility: ₹" + loan.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}
