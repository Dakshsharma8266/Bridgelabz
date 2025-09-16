import java.util.*;

class Customer {
    private String name;
    private double balance;
    public Customer(String name){ this.name = name; this.balance = 0; }
    public void deposit(double amt){ balance += amt; }
    public void viewBalance(){ System.out.println(name + " balance: " + balance); }
    public String getName(){ return name; }
}

class Bank {
    private String name;
    private List<Customer> customers = new ArrayList<>();
    public Bank(String name){ this.name = name; }
    public void openAccount(Customer c){ customers.add(c); }
    public void showCustomers(){
        System.out.println("Bank: " + name);
        for(Customer c: customers){ System.out.println(c.getName()); }
    }
}

public class BankAssociation {
    public static void main(String[] args){
        Bank b = new Bank("SBI");
        Customer c1 = new Customer("Ravi");
        Customer c2 = new Customer("Seema");
        b.openAccount(c1);
        b.openAccount(c2);
        c1.deposit(5000);
        c2.deposit(3000);
        c1.viewBalance();
        c2.viewBalance();
        b.showCustomers();
    }
}
