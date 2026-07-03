package org.example;

public class MoneyTransfer {

    public Transaction transfer(FromAccount from,
                                ToAccount to,
                                double amount) {

        // Balance Check
        if (!from.withdraw(amount)) {
            System.out.println("Insufficient Balance!");
            return null;
        }

        // Deposit Money
        to.deposit(amount);

        // Generate Details
        String transactionId = TransactionIdGenerator.generateTransactionId();
        String utrId = UTRGenerator.generateUTR();
        String date = DateTimeGenerator.getDate();
        String time = DateTimeGenerator.getTime();

        // Create Transaction Object
        Transaction transaction = new Transaction(
                transactionId,
                utrId,
                date,
                time,
                from.getAccountNumber(),
                to.getAccountNumber(),
                amount
        );

        return transaction;
    }
}