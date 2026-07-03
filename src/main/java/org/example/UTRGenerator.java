package org.example;

public class UTRGenerator {

    private static int count = 5000;

    public static String generateUTR() {
        count++;
        return "UTR" + count;
    }
}