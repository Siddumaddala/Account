package org.example;

public class FromAccount extends Account {

    public FromAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    public boolean withdraw(double amount) {

        if (balance >= amount) {
            balance = balance - amount;
            return true;
        }

        return false;
    }
}