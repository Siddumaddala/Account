package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeGenerator {

    public static String getDate() {

        LocalDate date = LocalDate.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return date.format(formatter);
    }

    public static String getTime() {

        LocalTime time = LocalTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("hh:mm:ss a");

        return time.format(formatter);
    }
}