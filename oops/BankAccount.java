import java.util.*;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber(){ return accountNumber; }
    public void setAccountNumber(String a){ this.accountNumber = a; }
    public String getHolderName(){ return holderName; }
    public void setHolderName(String n){ this.holderName = n; }
    public double getBalance(){ return balance; }
    protected void setBalance(double b){ this.balance = b; }
    public void deposit(double amount){ if(amount>0) setBalance(getBalance()+amount); }
    public boolean withdraw(double amount){ if(amount>0 && getBalance()>=amount){ setBalance(getBalance()-amount); return true; } return false; }
    public abstract double calculateInterest();
}

interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;
    public SavingsAccount(String acc, String name, double bal, double interestRate){
        super(acc,name,bal);
        this.interestRate = interestRate;
    }
    public double calculateInterest(){ return getBalance() * interestRate / 100.0; }
    public boolean applyForLoan(double amount){ return calculateLoanEligibility() >= amount; }
    public double calculateLoanEligibility(){ return getBalance() * 0.5; }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;
    public CurrentAccount(String acc, String name, double bal, double overdraftLimit){
        super(acc,name,bal);
        this.overdraftLimit = overdraftLimit;
    }
    public double calculateInterest(){ return 0.0; }
    public boolean applyForLoan(double amount){ return calculateLoanEligibility() >= amount; }
    public double calculateLoanEligibility(){ return getBalance() + overdraftLimit; }
}

public class BankingSystem {
    public static void main(String[] args){
        List<BankAccount> accounts = new ArrayList<>();
        SavingsAccount s = new SavingsAccount("S001","Ravi",10000,4.0);
        CurrentAccount c = new CurrentAccount("C001","Geeta",20000,5000);
        accounts.add(s);
        accounts.add(c);
        for(BankAccount a : accounts){
            System.out.println(a.getHolderName() + " | Acc: " + a.getAccountNumber() + " | Balance: " + a.getBalance() + " | Interest: " + a.calculateInterest());
            if(a instanceof Loanable){
                Loanable l = (Loanable)a;
                System.out.println("Loan Eligibility: " + l.calculateLoanEligibility() + " | Can apply for 10000: " + l.applyForLoan(10000));
            }
        }
    }
}
