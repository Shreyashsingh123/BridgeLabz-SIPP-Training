public class BankDetails {
    public static void main(String[] args) {
    BankAccount account1 = new BankAccount("Harsh", "43562514", 15200.0);
    account1.displayBalance();
    System.out.println();
    account1.deposit(4000);
    account1.withdraw(2000);
    account1.withdraw(12000);
    account1.displayBalance();
        }
    }
    
    class BankAccount {
        String accountHolder;
        String accountNumber;
        double balance;
    
        BankAccount(String accountHolder, String accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    
        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited amount is: " + amount);
        }
    
        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn amount : " + amount);
            } else {
                System.out.println("Insufficient balance for withdrawal of " + amount);
            }
        }
    
        void displayBalance() {
            System.out.println("The name of Account Holder is: " + accountHolder);
            System.out.println("Account Number is : " + accountNumber);
            System.out.println("Current Balance is : " + balance);
        }
    }
    

