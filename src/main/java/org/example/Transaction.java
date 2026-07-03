package org.example;

public class Transaction {

    private String transactionId;
    private String utrId;
    private String date;
    private String time;
    private String fromAccount;
    private String toAccount;
    private double amount;

    // Constructor
    public Transaction(String transactionId, String utrId,
                       String date, String time,
                       String fromAccount, String toAccount,
                       double amount) {

        this.transactionId = transactionId;
        this.utrId = utrId;
        this.date = date;
        this.time = time;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    // Getters

    public String getTransactionId() {
        return transactionId;
    }

    public String getUtrId() {
        return utrId;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public double getAmount() {
        return amount;
    }
}