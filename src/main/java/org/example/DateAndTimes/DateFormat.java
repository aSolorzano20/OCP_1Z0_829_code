package org.example.DateAndTimes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormat {

    public static void main(String[] args) {
        LocalDate d = LocalDate.now();

        System.out.println("FormatStyle.SHORT: " + DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(d));
        System.out.println("FormatStyle.MEDIUM: " + DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(d));
        System.out.println("FormatStyle.LONG: " + DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(d));
        System.out.println("FormatStyle.FULL: " + DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(d));
    }
}
