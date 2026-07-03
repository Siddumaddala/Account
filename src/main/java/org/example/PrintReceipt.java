package org.example;

public class PrintReceipt {

    public static void print(Transaction transaction) {

        if (transaction == null) {
            System.out.println("Transaction Failed!");
            return;
        }

        System.out.println("\n======================================");
        System.out.println("        BANK TRANSFER RECEIPT");
        System.out.println("======================================");

        System.out.println("Transaction ID : " + transaction.getTransactionId());
        System.out.println("UTR ID         : " + transaction.getUtrId());
        System.out.println("Date           : " + transaction.getDate());
        System.out.println("Time           : " + transaction.getTime());

        System.out.println("--------------------------------------");

        System.out.println("From Account   : " + transaction.getFromAccount());
        System.out.println("To Account     : " + transaction.getToAccount());

        System.out.println("Amount         : ₹" + transaction.getAmount());

        System.out.println("--------------------------------------");

        System.out.println("Status         : SUCCESS");

        System.out.println("======================================");
    }
}