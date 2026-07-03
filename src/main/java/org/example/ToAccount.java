package org.example;

public class ToAccount extends Account {

    public ToAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }
}
