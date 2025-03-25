package map_interface;

import java.util.*;

class Account {
    String accountNumber;
    double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return accountNumber + " - Balance: $" + balance;
    }
}

public class BankingSystem {
    private Map<String, Account> accounts = new HashMap<>();
    private TreeMap<Double, Account> sortedAccounts = new TreeMap<>();
    private Queue<String> withdrawalQueue = new LinkedList<>();

    public void createAccount(String accountNumber, double balance) {
        Account account = new Account(accountNumber, balance);
        accounts.put(accountNumber, account);
        sortedAccounts.put(balance, account);
    }

    public void processWithdrawal(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
        }
    }

    public void processQueue() {
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            Account acc = accounts.get(accountNumber);
            System.out.println("Processing withdrawal for: " + acc);
        }
    }

    public void displayAccountsSorted() {
        System.out.println("Accounts Sorted by Balance: " + sortedAccounts);
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.createAccount("A123", 5000);
        bank.createAccount("B456", 2000);
        bank.createAccount("C789", 8000);

        bank.processWithdrawal("A123", 1000);
        bank.processQueue();
        bank.displayAccountsSorted();
    }
}
