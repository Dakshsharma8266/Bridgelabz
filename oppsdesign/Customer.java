import java.util.ArrayList;

// Customer class
class Customer {
    String name;
    ArrayList<Account> accounts;

    Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account a : accounts) {
            System.out.println("Account " + a.accountNumber + ": Balance = " + a.balance);
        }
    }
}

// Account class
class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

// Bank class
class Bank {
    String name;
    ArrayList<Customer> customers;

    Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    void openAccount(Customer customer, Account account) {
        customer.accounts.add(account);
        if(!customers.contains(customer))
            customers.add(customer);
    }
}

// Demo
public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        Account a1 = new Account("001", 5000);
        Account a2 = new Account("002", 10000);

        bank.openAccount(c1, a1);
        bank.openAccount(c2, a2);

        c1.viewBalance();
        c2.viewBalance();
    }
}
Bank
---------------
- name: String
- customers: ArrayList<Customer>
---------------
+ openAccount(Customer, Account)

Customer
---------------
- name: String
- accounts: ArrayList<Account>
---------------
+ viewBalance()

Account
---------------
- accountNumber: String
- balance: double




