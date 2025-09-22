class BankAccount {
    private double balance;
    private String accountNumber;

    BankAccount(String accNo, double balance) {
        this.accountNumber = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void checkBalance() {
        System.out.println("Account " + accountNumber + " Balance: " + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", 1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.checkBalance();
    }
}
