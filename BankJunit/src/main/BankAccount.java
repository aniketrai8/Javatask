package Main;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber,double initialBalance){
        this.accountNumber= accountNumber;
        this.balance = initialBalance;

    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if(amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }
}




