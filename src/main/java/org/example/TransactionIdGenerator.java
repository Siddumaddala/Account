package org.example;

public class TransactionIdGenerator {

    private static int count = 1000;

    public static String generateTransactionId() {
        count++;
        return "TXN" + count;
    }
}