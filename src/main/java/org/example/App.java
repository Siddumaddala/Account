package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // From Account
        FromAccount from = new FromAccount(
                "123456789012",
                "Siddu",
                50000
        );

        // To Account
        ToAccount to = new ToAccount(
                "987654321098",
                "Ramesh",
                20000
        );

        System.out.println("========== MONEY TRANSFER ==========");

        System.out.println("From Account Balance : ₹" + from.getBalance());
        System.out.println("To Account Balance   : ₹" + to.getBalance());

        System.out.print("\nEnter Amount to Transfer : ₹");
        double amount = sc.nextDouble();

        // Money Transfer
        MoneyTransfer transfer = new MoneyTransfer();

        Transaction transaction = transfer.transfer(from, to, amount);

        // Print Receipt
        PrintReceipt.print(transaction);

        // Updated Balance
        System.out.println("\n========== UPDATED BALANCE ==========");

        System.out.println("From Account Balance : ₹" + from.getBalance());
        System.out.println("To Account Balance   : ₹" + to.getBalance());
        System.out.println("sdfghjkl");

        sc.close();
    }
}